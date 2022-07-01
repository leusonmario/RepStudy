import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, -1, -1, -1]");
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("i", "type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, -1, 10, 10]");
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$natural", "$natural");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$natural?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("admin.$cmd", "admin.$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, 100, 10, 1]");
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("bulk_size", "$and", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("filter", "create");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?create?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("servers", "include_fields", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, 0, 10]");
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 10, 10, 100]");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 10, 0, 1]");
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, 0, 10, -1]");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 100, 10, 1]");
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("_last_ts", "bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("name", "mongodb", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("flush_interval", "o", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 0, 0, 10]");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, 0, 10, 100]");
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("port", "local", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?local?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 1, 100, 100]");
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, -1, 1, 10]");
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk_size", "_id");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_id?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("servers", "secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 10, 100, 100]");
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 0, -1]");
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, 10, 10, 10]");
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 100, -1, 1]");
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("fromMigrate", "ops");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ops?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("admin", "_riverstatus");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("filter", "bulk_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, -1, -1, -1, 1]");
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("options", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("o", "connect_timeout", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ref", "actions");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?actions?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("oplog.refs", "ts");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ts? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, 10, 0, 0]");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$cmd", "secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("skip_initial_import", "user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 10, 1, -1]");
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "dropDatabase", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?dropDatabase?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 100, 10, -1]");
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, 1, 1, -1]");
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("exclude_fields", "d", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl_verify_certificate", "parent_types");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 1, -1, 1]");
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("dropDatabase", "status", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100, 1, -1, 100]");
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 0, 100, 10]");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("concurrent_bulk_requests", "drop");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("bulk_timeout", "ops", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("socket_timeout", "ns", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, 100, 10, -1]");
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("port", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("create", "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 1, 10, 0]");
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 1, 0, 10]");
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, -1, 0, 0]");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("fromMigrate", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("fromMigrate", "localhost", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("local", "disable_index_refresh", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 100, 10, 100, 100]");
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("password", "", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 0, 0, 0]");
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 10, 100]");
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 100, 0, -1]");
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 10, 10, 10]");
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("o", "ur");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ur?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("local", "_last_ts", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_ts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("secondary_read_preference", "collection", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ref", "c");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?c?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("o2", "db", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "host", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("admin.$cmd", "include_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 100, 1, 10, 100]");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("config", "oplog.refs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.refs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("filter", "admin", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 0, 10, -1]");
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, 100, 1]");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("import_all_collections", "fromMigrate", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 1, 10, 1]");
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 100]");
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script", "type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, 0, 1, 0]");
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 10, 100, 0, 1]");
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 10, 0, 1]");
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("drop_collection", "o", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("filter", "oplog.rs", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 1, 0, 10]");
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, -1, 10, 1]");
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 100, 100, -1, -1]");
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$in", "actions", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("exclude_fields", "_last_gtid", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("index", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 100, 10, 0]");
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 1, 1, -1, 10]");
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 100, -1, 0]");
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("advanced_transformation", "ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass11 = basicDBObject1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("c", ".files");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass19 = basicDBObject1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 0, -1, 1]");
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$or", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, -1, 0, -1]");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("include_collection", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, -1, 1, 10]");
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, -1, -1, 100]");
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "drop", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 1, 10, 0]");
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("initial_timestamp", "admin", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("localhost", "admin.$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop", "mongodb", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, -1]");
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, 0, 10, 10]");
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("actions", "u");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 10, 1, 10]");
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("gridfs", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 10, -1, -1]");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 0]");
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("size", "mongodb-river", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("oplog.rs", "include_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 100, 10, -1]");
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("password", "n", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("secondary_read_preference", "index", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, 0, -1, 10]");
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 1, 1, 100]");
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("connect_timeout", "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "i");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?i?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 0, -1, -1]");
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("type", "store_statistics", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("name", "oplog.rs", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 1, 1, -1]");
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("password", "create");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?create?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$and", "fromMigrate", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 100, 100, -1]");
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("to", "to");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?to? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("i", "$and", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$and?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
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
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("o", "filter");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script", "host");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 1, 10, 0]");
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 10, 10, 10, 1]");
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 100, -1, 1]");
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass20 = basicDBObject1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 0, -1]");
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("localhost", "ts");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ts? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
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
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("include_collection", "ns");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ns? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 10, 10, 10]");
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 100, -1, 100]");
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, -1, 1, 10]");
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("name", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_last_gtid", ".files", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("d", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 10, 10, -1]");
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "disable_index_refresh", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("include_fields", "$and");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$and?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 1, 0, 100]");
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 0, 10, 1]");
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk", "socket_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, -1, 100, 0]");
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, 100, 1, 0]");
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("connect_timeout", "oid", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oid?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("o", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("dropDatabase", "servers");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 100, -1, 100]");
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix(".chunks", "o2");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o2?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("n", "ssl_verify_certificate", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ops", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("dropDatabase", "flush_interval", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("n", "gridfs", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "connect_timeout", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("connect_timeout", "script", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("name", "drop");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
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
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 100, 10]");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
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
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("admin.$cmd", "disable_index_refresh", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("status", "$natural", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, -1, 100, 1]");
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 0, 10, 100]");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("include_collection", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 10, 0, 100]");
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 10, 10, 100, -1]");
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("db", "hi!", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("credentials", "o2");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o2?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".files", "_riverstatus", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk_size", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix(".files", "include_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 10, 1, 0]");
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 1]");
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("config", "admin.$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("import_all_collections", "advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 10, 100, 100]");
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("socket_timeout", "renameCollection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?renameCollection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("drop_collection", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, -1, 100, -1]");
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("o2", "mongodb-river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("renameCollection", "fromMigrate", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk_timeout", ".chunks");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("to", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 1, 1, 0]");
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 10, -1, 0, 0]");
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 0, 100, 10]");
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("db", "$and");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$and?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("type", "skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 0, 100, 1, 1]");
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("u", "parent_types");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("password", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("name", "localhost", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "ref");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ref?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ts", "bulk_size", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 10, -1, 10]");
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 100, 1, -1]");
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".files", "create", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_last_gtid", "drop_collection", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 1, 10]");
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("user", "create");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?create?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, 10, 0, -1]");
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("hi!", "secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("connect_timeout", "bulk", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 1, -1, 100]");
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("admin.$cmd", "fromMigrate", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ns", "host");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, 0, 1]");
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("MongoDB River Plugin", "index", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 100, 0, -1]");
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("collection", "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("parent_types", "d", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("secondary_read_preference", "import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("renameCollection", "n");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?n? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 0, 0, 100, 1]");
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ssl_verify_certificate", "bulk", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, 1, 0, 1]");
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("exclude_fields", "$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, -1, 0, 10]");
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, 1, -1]");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("include_fields", "u", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("fromMigrate", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk", "drop");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 100, 0, 1, 1]");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("d", "to");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?to? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("store_statistics", "name", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("status", "port");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 100, 100, -1]");
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("collection", "concurrent_requests", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ts", "seq", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("gridfs", "u");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("exclude_fields", "status", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("o2", "script_type", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ops", "filter", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, 0, -1]");
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("d", "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("options", "ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("initial_timestamp", "secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl", "bulk", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script_type", "servers", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("MongoDB River Plugin", "op", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("type", "dropDatabase");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?dropDatabase?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, 0, 0, 0]");
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ns", "index", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 1, 0, 10]");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("hi!", "dropDatabase", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?dropDatabase?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("socket_timeout", "drop", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("db", "o");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, -1, 0, -1]");
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("bulk_timeout", "ur", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("oid", ".chunks", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("renameCollection", "", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("fromMigrate", "renameCollection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?renameCollection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("import_all_collections", "ts", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ts? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("disable_index_refresh", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("exclude_fields", "db");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb", "$natural");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$natural?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("user", "ops");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ops?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("n", "$in");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$in?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 10, 10, -1]");
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, 0, 0, 10]");
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 100, 100, 10]");
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ops", "filter");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 10, 0]");
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("d", ".chunks", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl", "store_statistics", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("name", "_id", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("to", "admin", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, -1, 100]");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 1, 10, 100]");
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 100, 0, -1]");
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("servers", "ur", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ref", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 1, 10, -1]");
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("initial_timestamp", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("flush_interval", "to", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?to? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, -1, 10, 100]");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("oplog.rs", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_requests", "localhost", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "u");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 1, 100, 10]");
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix(".chunks", "c");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?c?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("oplog.refs", "gridfs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, -1, 10, 100]");
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_last_gtid", "o", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_riverstatus", "mongodb");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("hi!", "advanced_transformation", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("mongodb", "localhost", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 100, 10]");
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
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
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("type", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 100, 1, 10]");
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("gridfs", "actions");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?actions?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$in", "oplog.refs", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.refs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, -1, 10, 1]");
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_last_gtid", "i", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("oplog.rs", "bulk_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 10, -1, -1, 100]");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_riverstatus", "concurrent_bulk_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("to", "collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
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
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_last_ts", "mongodb-river", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("initial_timestamp", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ts", "MongoDB River Plugin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?MongoDB River Plugin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 100, 1, -1]");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 10, 10, 0]");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 1, -1, 10]");
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("i", "hi!", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 1, -1, -1, 0]");
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 10, 1]");
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "type", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, -1, 0, 100]");
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("c", "renameCollection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?renameCollection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ns", "script", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("flush_interval", "local");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?local?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, 1, 1]");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_last_gtid", "concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 100, 1, 0]");
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
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
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 10, -1, 100]");
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("socket_timeout", "drop");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_riverstatus", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ns", "exclude_fields", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("hi!", "bulk_size", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("fromMigrate", "ns");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ns? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("hi!", "include_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, -1, -1, 0]");
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("status", "_riverstatus");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "connect_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("connect_timeout", "admin", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("initial_timestamp", "$or", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("throttle_size", "drop", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".chunks", "name", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
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
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix(".chunks", "initial_timestamp", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("socket_timeout", "script", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, -1, -1, -1]");
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("import_all_collections", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, -1, 100, 100]");
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 100, 100, 100, 10]");
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, -1, 10, 0]");
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("servers", "i");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?i?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ssl_verify_certificate", "actions");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?actions?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("disable_index_refresh", "ns", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ns? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 100, 1, 0]");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_last_ts", "u", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("user", "i");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?i?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 0, 10, 0]");
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("oid", "port", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("o", "secondary_read_preference", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 10, 0, 100]");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("options", "store_statistics", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 0, 1, -1]");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
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
        java.lang.Class<?> wildcardClass11 = basicDBObject1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("parent_types", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 1, -1, 10]");
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("renameCollection", "initial_timestamp", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 10, 0, 0, 10]");
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 1, -1]");
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script", "ssl_verify_certificate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("socket_timeout", "collection", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ops", ".chunks", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("config", "drop_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl_verify_certificate", "gridfs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("flush_interval", "$natural");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$natural?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 0, 0]");
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("socket_timeout", "u");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("o2", "disable_index_refresh", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix(".files", "mongodb-river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("MongoDB River Plugin", "throttle_size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("collection", "oplog.rs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.rs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$cmd", "gridfs", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 1, 0, 100]");
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 0, 0]");
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 0, 0, 1]");
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 0, 10, -1]");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("store_statistics", "config", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("type", "user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "servers", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_requests", "secondary_read_preference", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("store_statistics", "d", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 0, 1, 10, 10]");
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("localhost", "admin.$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, -1, 100, -1]");
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("drop", "exclude_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("MongoDB River Plugin", "filter");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("options", "d", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 100, -1, 100]");
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 100, 100, 10]");
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$or", "concurrent_requests", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("port", "bulk_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("d", "renameCollection", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 1, 10]");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 0, 1, -1]");
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("credentials", "o2", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 0, 100, 0]");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 100, -1, 100]");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, 1, 100, 0]");
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl", "host", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix(".files", "oplog.rs", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.rs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("oplog.refs", "ops", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ops?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("oplog.rs", "collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_last_ts", "drop_collection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100, 0, 10, 10]");
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("advanced_transformation", "bulk");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_last_ts", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("seq", "fromMigrate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, 10, 0, 100]");
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("create", "advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 10]");
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "ur");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ur?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("renameCollection", "size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 0, 10, -1]");
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 1, 1, -1]");
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 0, 1, 1]");
    }
}

