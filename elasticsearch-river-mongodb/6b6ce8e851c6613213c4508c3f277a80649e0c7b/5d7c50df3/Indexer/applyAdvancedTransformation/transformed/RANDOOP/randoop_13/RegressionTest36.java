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
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test18002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18002");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 1, 0, 100]");
    }

    @Test
    public void test18003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18003");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 10, 0, 10]");
    }

    @Test
    public void test18004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18004");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 100, 10, 100]");
    }

    @Test
    public void test18005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18005");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 10, 0, 1, 0]");
    }

    @Test
    public void test18006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18006");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, 10, 1, 0]");
    }

    @Test
    public void test18007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18007");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, -1, 100, 0]");
    }

    @Test
    public void test18008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18008");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 0, 0, 1]");
    }

    @Test
    public void test18009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18009");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 1, 1, 100]");
    }

    @Test
    public void test18010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18010");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, 0, 100, 100]");
    }

    @Test
    public void test18011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18011");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, -1, 10, -1]");
    }

    @Test
    public void test18012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18012");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 10, -1, -1]");
    }

    @Test
    public void test18013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18013");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 100, 100, 1, 100]");
    }

    @Test
    public void test18014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18014");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, 0, -1, 100]");
    }

    @Test
    public void test18015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18015");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 100, 100]");
    }

    @Test
    public void test18016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18016");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 100, 0, 0, -1]");
    }

    @Test
    public void test18017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18017");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 1, 1, -1, -1]");
    }

    @Test
    public void test18018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18018");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 10, 1, 10, -1]");
    }

    @Test
    public void test18019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18019");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 10, 100, -1]");
    }

    @Test
    public void test18020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18020");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 1, 1, 100]");
    }

    @Test
    public void test18021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18021");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 10, 100, 0]");
    }

    @Test
    public void test18022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18022");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 100, 0, 0]");
    }

    @Test
    public void test18023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18023");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 0, 100, -1]");
    }

    @Test
    public void test18024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18024");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 1, 0, 10]");
    }

    @Test
    public void test18025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18025");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, 1, 1]");
    }

    @Test
    public void test18026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18026");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, 10, 1, 10]");
    }

    @Test
    public void test18027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18027");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 10, 10, 1]");
    }

    @Test
    public void test18028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18028");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 1, 1, 10]");
    }

    @Test
    public void test18029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18029");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 100, 1, -1]");
    }

    @Test
    public void test18030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18030");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 100, 10, 100]");
    }

    @Test
    public void test18031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18031");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 100, 100, 0]");
    }

    @Test
    public void test18032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18032");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 1, 10, 0, 100]");
    }

    @Test
    public void test18033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18033");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 100, -1, 0]");
    }

    @Test
    public void test18034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18034");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, -1, -1, -1]");
    }

    @Test
    public void test18035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18035");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 10, 100, 0]");
    }

    @Test
    public void test18036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18036");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, 0, 0, 0]");
    }

    @Test
    public void test18037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18037");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 1, 100, 10]");
    }

    @Test
    public void test18038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18038");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 10, 100, -1, 1]");
    }

    @Test
    public void test18039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18039");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 0, 100, 100]");
    }

    @Test
    public void test18040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18040");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 100, 0, 100]");
    }

    @Test
    public void test18041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18041");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 1, 100, 100]");
    }

    @Test
    public void test18042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18042");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, 1, 1, 100]");
    }

    @Test
    public void test18043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18043");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 10, -1, 1]");
    }

    @Test
    public void test18044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18044");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, -1, -1]");
    }

    @Test
    public void test18045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18045");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 0, -1, 1]");
    }

    @Test
    public void test18046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18046");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 100, 0, -1, -1]");
    }

    @Test
    public void test18047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18047");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 1, 1, -1]");
    }

    @Test
    public void test18048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18048");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, -1, -1, 10]");
    }

    @Test
    public void test18049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18049");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 0, 1, -1]");
    }

    @Test
    public void test18050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18050");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, -1, 1, 0]");
    }

    @Test
    public void test18051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18051");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, -1, 100, 100]");
    }

    @Test
    public void test18052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18052");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 1, 10, 1]");
    }

    @Test
    public void test18053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18053");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, -1, 100, 0]");
    }

    @Test
    public void test18054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18054");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 1, -1, 1]");
    }

    @Test
    public void test18055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18055");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 100, -1, 1]");
    }

    @Test
    public void test18056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18056");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, 10, 1, 100]");
    }

    @Test
    public void test18057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18057");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 10, 100, 10]");
    }

    @Test
    public void test18058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18058");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, -1, 0, 1]");
    }

    @Test
    public void test18059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18059");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 1, 0, 10]");
    }

    @Test
    public void test18060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18060");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, 1, 0, 0]");
    }

    @Test
    public void test18061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18061");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 100, 1]");
    }

    @Test
    public void test18062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18062");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 100, 0, 100]");
    }

    @Test
    public void test18063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18063");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100, -1, -1, 0]");
    }

    @Test
    public void test18064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18064");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 0, 1, 1]");
    }

    @Test
    public void test18065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18065");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100, -1, -1, 100]");
    }

    @Test
    public void test18066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18066");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, 0, 10, 10]");
    }

    @Test
    public void test18067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18067");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, -1, 1]");
    }

    @Test
    public void test18068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18068");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, 10, 100, 0]");
    }

    @Test
    public void test18069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18069");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 1, -1, 0]");
    }

    @Test
    public void test18070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18070");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 10, -1, 1]");
    }

    @Test
    public void test18071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18071");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 100, 100, 100, 100]");
    }

    @Test
    public void test18072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18072");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, -1, 10, 0]");
    }

    @Test
    public void test18073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18073");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, 10, 0, 10]");
    }

    @Test
    public void test18074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18074");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 10, 1, 0, 100]");
    }

    @Test
    public void test18075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18075");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, 100, -1, 0]");
    }

    @Test
    public void test18076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18076");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 0, 0, 1]");
    }

    @Test
    public void test18077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18077");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 10, 0, 1]");
    }

    @Test
    public void test18078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18078");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, -1, 10, 10, 0]");
    }

    @Test
    public void test18079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18079");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 10, -1, -1, -1]");
    }

    @Test
    public void test18080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18080");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, 100, 100, 100]");
    }

    @Test
    public void test18081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18081");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, -1, 10, 0]");
    }

    @Test
    public void test18082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18082");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, 10, 0, 100]");
    }

    @Test
    public void test18083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18083");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, 10, 0, -1]");
    }

    @Test
    public void test18084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18084");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 0, 10, 10]");
    }

    @Test
    public void test18085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18085");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, -1, -1, 10]");
    }

    @Test
    public void test18086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18086");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 1, 1, -1]");
    }

    @Test
    public void test18087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18087");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, -1, 1, 0]");
    }

    @Test
    public void test18088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18088");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 1, -1, 10]");
    }

    @Test
    public void test18089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18089");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 1, -1, 100]");
    }

    @Test
    public void test18090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18090");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 10, 100, 10]");
    }

    @Test
    public void test18091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18091");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 0, 100, 0]");
    }

    @Test
    public void test18092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18092");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, 100, -1, 0]");
    }

    @Test
    public void test18093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18093");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 10, 1, 0]");
    }

    @Test
    public void test18094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18094");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, -1, 10, 10, 10]");
    }

    @Test
    public void test18095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18095");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, -1, 1, -1]");
    }

    @Test
    public void test18096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18096");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, 0, -1, 10]");
    }

    @Test
    public void test18097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18097");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 1, 1, 10, 1]");
    }

    @Test
    public void test18098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18098");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 100, -1, 0]");
    }

    @Test
    public void test18099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18099");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 0, -1, 1]");
    }

    @Test
    public void test18100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18100");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, 1, 100, 1]");
    }

    @Test
    public void test18101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18101");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, 1, -1, 0]");
    }

    @Test
    public void test18102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18102");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, -1, 1, 10]");
    }

    @Test
    public void test18103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18103");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, 1, 0, 0]");
    }

    @Test
    public void test18104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18104");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 10, 1, 1]");
    }

    @Test
    public void test18105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18105");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 1, 0, 100, 100]");
    }

    @Test
    public void test18106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18106");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, -1, -1, -1]");
    }

    @Test
    public void test18107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18107");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 10, 0, 100]");
    }

    @Test
    public void test18108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18108");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 1, 100, -1]");
    }

    @Test
    public void test18109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18109");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 10, 10, -1]");
    }

    @Test
    public void test18110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18110");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, 0, 1, 100]");
    }

    @Test
    public void test18111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18111");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 100, 100, 1]");
    }

    @Test
    public void test18112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18112");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 0, 10, -1]");
    }

    @Test
    public void test18113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18113");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, -1, 1, 1]");
    }

    @Test
    public void test18114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18114");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, -1, 10, 1]");
    }

    @Test
    public void test18115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18115");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 100, 100, 10]");
    }

    @Test
    public void test18116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18116");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 100, 0, 1, 0]");
    }

    @Test
    public void test18117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18117");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, -1, 100, 0]");
    }

    @Test
    public void test18118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18118");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, 1, 10, 10]");
    }

    @Test
    public void test18119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18119");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 100, 1, 10]");
    }

    @Test
    public void test18120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18120");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 10, 100, 0, 10]");
    }

    @Test
    public void test18121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18121");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 100, 0, 100]");
    }

    @Test
    public void test18122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18122");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 0, -1, 100]");
    }

    @Test
    public void test18123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18123");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 100, 0, 0]");
    }

    @Test
    public void test18124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18124");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 10, 100, -1]");
    }

    @Test
    public void test18125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18125");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 1, 0, -1, 1]");
    }

    @Test
    public void test18126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18126");
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
    public void test18127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18127");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, 10, 1, 10]");
    }

    @Test
    public void test18128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18128");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 10, 100, 10]");
    }

    @Test
    public void test18129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18129");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, 1, 100, 0]");
    }

    @Test
    public void test18130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18130");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 0, 1, 1]");
    }

    @Test
    public void test18131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18131");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 100, 10, 100]");
    }

    @Test
    public void test18132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18132");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 1, 10, 100]");
    }

    @Test
    public void test18133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18133");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 1, 0, 0]");
    }

    @Test
    public void test18134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18134");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, 1, 100, 100]");
    }

    @Test
    public void test18135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18135");
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
    public void test18136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18136");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 10, -1, 0]");
    }

    @Test
    public void test18137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18137");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, 0, 0, 1]");
    }

    @Test
    public void test18138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18138");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, -1, 10, 1]");
    }

    @Test
    public void test18139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18139");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, 100, 100, -1]");
    }

    @Test
    public void test18140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18140");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 0, 10, -1, 10]");
    }

    @Test
    public void test18141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18141");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 0, 1, 10]");
    }

    @Test
    public void test18142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18142");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1, 100, 100]");
    }

    @Test
    public void test18143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18143");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, 10, 10, -1]");
    }

    @Test
    public void test18144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18144");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 0, 10, 1]");
    }

    @Test
    public void test18145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18145");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, -1, 10, 10]");
    }

    @Test
    public void test18146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18146");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, 10, 1, 0]");
    }

    @Test
    public void test18147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18147");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 10, 10, 10]");
    }

    @Test
    public void test18148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18148");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, -1, 1, 100]");
    }

    @Test
    public void test18149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18149");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, -1, 100, 100]");
    }

    @Test
    public void test18150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18150");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, 0, 10, 100]");
    }

    @Test
    public void test18151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18151");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, -1, -1, 0, 0]");
    }

    @Test
    public void test18152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18152");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 10, 0, 1]");
    }

    @Test
    public void test18153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18153");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 1, 1, 1]");
    }

    @Test
    public void test18154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18154");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 100, 10, 10]");
    }

    @Test
    public void test18155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18155");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, -1, 1, 0]");
    }

    @Test
    public void test18156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18156");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 100, 10, -1]");
    }

    @Test
    public void test18157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18157");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 10, 100, -1]");
    }

    @Test
    public void test18158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18158");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 1, -1, -1]");
    }

    @Test
    public void test18159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18159");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 1, 100, -1]");
    }

    @Test
    public void test18160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18160");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 10, -1, -1]");
    }

    @Test
    public void test18161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18161");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, 1, 1, 10]");
    }

    @Test
    public void test18162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18162");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 0, 100, -1]");
    }

    @Test
    public void test18163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18163");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, -1, -1, 10]");
    }

    @Test
    public void test18164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18164");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, 1, 10, 0]");
    }

    @Test
    public void test18165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18165");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 0, 0, 0]");
    }

    @Test
    public void test18166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18166");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, -1, 100, 1]");
    }

    @Test
    public void test18167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18167");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, -1, 1, 10]");
    }

    @Test
    public void test18168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18168");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 0, -1, 100]");
    }

    @Test
    public void test18169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18169");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 10, 100, -1]");
    }

    @Test
    public void test18170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18170");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 0, 100, 100]");
    }

    @Test
    public void test18171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18171");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, -1, 10, 0]");
    }

    @Test
    public void test18172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18172");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 10, 1, -1]");
    }

    @Test
    public void test18173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18173");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, 100, -1, -1]");
    }

    @Test
    public void test18174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18174");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 0, 10, 100]");
    }

    @Test
    public void test18175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18175");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, -1, 1, 100]");
    }

    @Test
    public void test18176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18176");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 100, -1, 10]");
    }

    @Test
    public void test18177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18177");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 10, -1, -1]");
    }

    @Test
    public void test18178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18178");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, 100, 1, 10]");
    }

    @Test
    public void test18179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18179");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10, 1, 100, 0]");
    }

    @Test
    public void test18180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18180");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, 0, -1, 100]");
    }

    @Test
    public void test18181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18181");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 100, 1, 0]");
    }

    @Test
    public void test18182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18182");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100, -1, 100, 1]");
    }

    @Test
    public void test18183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18183");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 10, 0, -1, -1]");
    }

    @Test
    public void test18184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18184");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, 100, 10, 100]");
    }

    @Test
    public void test18185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18185");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 100, 1, 10]");
    }

    @Test
    public void test18186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18186");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 100, -1, 10]");
    }

    @Test
    public void test18187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18187");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, -1, -1, -1]");
    }

    @Test
    public void test18188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18188");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, -1, 0, 10]");
    }

    @Test
    public void test18189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18189");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, -1, -1, -1]");
    }

    @Test
    public void test18190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18190");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 0, 1, 100]");
    }

    @Test
    public void test18191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18191");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, -1, 0, -1]");
    }

    @Test
    public void test18192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18192");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, -1, 10, 10]");
    }

    @Test
    public void test18193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18193");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, -1, 10, -1]");
    }

    @Test
    public void test18194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18194");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 1, 100, 100, -1]");
    }

    @Test
    public void test18195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18195");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 100, -1, 10]");
    }

    @Test
    public void test18196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18196");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, 0, 10, 10]");
    }

    @Test
    public void test18197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18197");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, 100, 1, 10]");
    }

    @Test
    public void test18198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18198");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 1, 100, -1]");
    }

    @Test
    public void test18199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18199");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 1, 100]");
    }

    @Test
    public void test18200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18200");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 1, 100, 10]");
    }

    @Test
    public void test18201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18201");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, 100, 100, -1]");
    }

    @Test
    public void test18202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18202");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 100, 0]");
    }

    @Test
    public void test18203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18203");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 1, 10, 100]");
    }

    @Test
    public void test18204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18204");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 100, 0, -1]");
    }

    @Test
    public void test18205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18205");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 100, -1, 100]");
    }

    @Test
    public void test18206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18206");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, 10, -1, 0]");
    }

    @Test
    public void test18207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18207");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 10, 10, -1, 10]");
    }

    @Test
    public void test18208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18208");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 10, 0, 100]");
    }

    @Test
    public void test18209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18209");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 0, 100, 100]");
    }

    @Test
    public void test18210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18210");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 10, 100, 0]");
    }

    @Test
    public void test18211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18211");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 1, 1, -1]");
    }

    @Test
    public void test18212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18212");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, -1, 10, 10]");
    }

    @Test
    public void test18213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18213");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, 10, 0, 1]");
    }

    @Test
    public void test18214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18214");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, 1, 1, 0]");
    }

    @Test
    public void test18215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18215");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 10, 1, 100]");
    }

    @Test
    public void test18216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18216");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, 10, 100, 100]");
    }

    @Test
    public void test18217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18217");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, -1, 0, 100]");
    }

    @Test
    public void test18218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18218");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, 10, 100, 0]");
    }

    @Test
    public void test18219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18219");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 10, 0, 0, 1]");
    }

    @Test
    public void test18220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18220");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 100, 0, 0]");
    }

    @Test
    public void test18221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18221");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 1, 0, 10, 100]");
    }

    @Test
    public void test18222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18222");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, -1, 10, 10, -1]");
    }

    @Test
    public void test18223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18223");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 1, -1, 100]");
    }

    @Test
    public void test18224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18224");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, 1, -1, 100]");
    }

    @Test
    public void test18225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18225");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 1, 10, 1, 0]");
    }

    @Test
    public void test18226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18226");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 10, 10, -1]");
    }

    @Test
    public void test18227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18227");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 100, 1, 1, 100]");
    }

    @Test
    public void test18228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18228");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, 1, 1, 10]");
    }

    @Test
    public void test18229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18229");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, 1, 0, 1]");
    }

    @Test
    public void test18230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18230");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 10, -1, -1]");
    }

    @Test
    public void test18231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18231");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, 100, 10, 0]");
    }

    @Test
    public void test18232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18232");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, -1, 1, 0]");
    }

    @Test
    public void test18233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18233");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, 100, 1, -1]");
    }

    @Test
    public void test18234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18234");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 100, -1, 100]");
    }

    @Test
    public void test18235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18235");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, 100, -1, 100]");
    }

    @Test
    public void test18236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18236");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, -1, 10, -1]");
    }

    @Test
    public void test18237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18237");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, 0, 1, 100]");
    }

    @Test
    public void test18238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18238");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, -1, 10, 0]");
    }

    @Test
    public void test18239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18239");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 10, -1, 100]");
    }

    @Test
    public void test18240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18240");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, 1, 0, 100]");
    }

    @Test
    public void test18241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18241");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, -1, -1, 1]");
    }

    @Test
    public void test18242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18242");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 100, 100, 1, -1]");
    }

    @Test
    public void test18243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18243");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, 0, 0, 1]");
    }

    @Test
    public void test18244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18244");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, -1, 0, 1]");
    }

    @Test
    public void test18245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18245");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, -1, 100, 100]");
    }

    @Test
    public void test18246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18246");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 100, 1, -1]");
    }

    @Test
    public void test18247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18247");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, -1, 1, 1]");
    }

    @Test
    public void test18248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18248");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 10, 10, -1, 10]");
    }

    @Test
    public void test18249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18249");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 10, 100, 100]");
    }

    @Test
    public void test18250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18250");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 10, 10, -1]");
    }

    @Test
    public void test18251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18251");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 100, 10, 1]");
    }

    @Test
    public void test18252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18252");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, 1, 100, 1]");
    }

    @Test
    public void test18253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18253");
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
    public void test18254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18254");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 1, 10, -1]");
    }

    @Test
    public void test18255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18255");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, 1, 0, -1]");
    }

    @Test
    public void test18256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18256");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, 1, 100, 1]");
    }

    @Test
    public void test18257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18257");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 10, -1, 0]");
    }

    @Test
    public void test18258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18258");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 100, 100, 0]");
    }

    @Test
    public void test18259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18259");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 1, 0, -1]");
    }

    @Test
    public void test18260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18260");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, -1, 10, 0]");
    }

    @Test
    public void test18261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18261");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 1, 10, 100, 100]");
    }

    @Test
    public void test18262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18262");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 10, 10, 0]");
    }

    @Test
    public void test18263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18263");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 1, 0, 100]");
    }

    @Test
    public void test18264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18264");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, -1, 1, 0]");
    }

    @Test
    public void test18265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18265");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, 10, -1, 0]");
    }

    @Test
    public void test18266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18266");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 10, 0, 0]");
    }

    @Test
    public void test18267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18267");
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
    public void test18268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18268");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 1, -1, 1]");
    }

    @Test
    public void test18269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18269");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, 0, 1, 100]");
    }

    @Test
    public void test18270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18270");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 10, -1]");
    }

    @Test
    public void test18271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18271");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 10, -1, 100]");
    }

    @Test
    public void test18272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18272");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 100, 0, 100]");
    }

    @Test
    public void test18273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18273");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 10, 0, 0]");
    }

    @Test
    public void test18274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18274");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, -1, 10, 10]");
    }

    @Test
    public void test18275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18275");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 10, 100, 0]");
    }

    @Test
    public void test18276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18276");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, -1, -1, -1]");
    }

    @Test
    public void test18277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18277");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10, 0, -1, 0]");
    }

    @Test
    public void test18278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18278");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 10, 10, 0]");
    }

    @Test
    public void test18279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18279");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 1, -1, -1]");
    }

    @Test
    public void test18280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18280");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 100, 100, 0]");
    }

    @Test
    public void test18281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18281");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 0, -1, 100]");
    }

    @Test
    public void test18282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18282");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 1, 100, 0]");
    }

    @Test
    public void test18283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18283");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, 0, 0, 10]");
    }

    @Test
    public void test18284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18284");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 1, 100, 1, 0]");
    }

    @Test
    public void test18285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18285");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 1, 0, -1]");
    }

    @Test
    public void test18286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18286");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 100, 10, 1]");
    }

    @Test
    public void test18287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18287");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 10, 10, -1]");
    }

    @Test
    public void test18288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18288");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, 100, 100, 100]");
    }

    @Test
    public void test18289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18289");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 10, 10, 100]");
    }

    @Test
    public void test18290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18290");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 1, 0, -1]");
    }

    @Test
    public void test18291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18291");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, 10, 0, 0]");
    }

    @Test
    public void test18292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18292");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100, 100, -1, 1]");
    }

    @Test
    public void test18293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18293");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 1, 1, 1]");
    }

    @Test
    public void test18294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18294");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, -1, 10, 1]");
    }

    @Test
    public void test18295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18295");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 100, 0, 100, 10]");
    }

    @Test
    public void test18296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18296");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 0, 0, -1]");
    }

    @Test
    public void test18297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18297");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 100, 1, 10]");
    }

    @Test
    public void test18298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18298");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 100, 10, 0]");
    }
}

