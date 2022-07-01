import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 100, 100, 100, 0]");
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, 1, 10, 1]");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 0, 1, -1]");
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 1, 10, 100]");
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, 100, 100, 100]");
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, -1, -1, 10]");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 0, -1, 1]");
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 1, 0, 100]");
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
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
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 1, 1, -1, 100]");
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 1, 0, -1]");
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 10, -1, -1]");
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, -1, 100, 10]");
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 100, 100, 1, 100]");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 0, 1, 10]");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 1, -1, 100]");
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
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
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 10, 0, 100]");
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, -1, 1, 10]");
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
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
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, -1, 100, 100]");
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 1, 1, 10]");
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, -1, 1, 1]");
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, -1, 1, 10]");
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, -1, 100, 0]");
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, -1, 0, 10]");
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, 10, 10, -1]");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, 0, 10, -1]");
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 100, 100, 10]");
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 0, 100, 0]");
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, -1, 10, 0]");
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, 10, 100, 100]");
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 0, 10]");
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, -1, 0, 1]");
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 100, 1, 0, -1]");
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 10, 1, 0]");
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, -1, -1, 10]");
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 1, 0, 10]");
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 10, -1, 0]");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 0, -1, -1]");
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, 10, 10, 1]");
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, -1, 1, -1]");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 0, -1, 10, 0]");
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, 1, 10, 10]");
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 10, 10, 1]");
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 0, -1, -1]");
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, 10, 100, 1]");
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, 100, -1, 100]");
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, -1, 1, 0]");
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
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
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1, 1, -1]");
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, 100, -1, 10]");
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 10, 0, -1, 0]");
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, -1, 10, 100]");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 0, 100, 10, 10]");
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 1, 10, -1]");
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 1, 1, 10]");
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
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
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 1, 0, 100, 100]");
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, 10, -1, 1]");
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 0, 0, 100]");
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 0, 100, 1]");
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 0, 100, 0]");
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 100, 10, 1]");
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, -1, 10, 10]");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, 1, 100, 1]");
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 0, 10, -1]");
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 1, 0, 100]");
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, 10, 1, 10]");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
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
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, -1, -1, 100]");
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 100, 1, 1]");
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 100, 1, 10]");
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 0, -1, 10]");
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 10, 0, -1]");
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 100, 0, 1]");
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, 100, -1, 0]");
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 10, 0, 0]");
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 100, 1, 100]");
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, -1, 100, 0]");
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, 0, 100, 10]");
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, 100, 0, -1]");
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 0, 100, 0]");
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 0, -1, -1]");
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 0, 1, -1]");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, 1, 1, 0]");
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 100, -1, 0]");
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 0, 10, 0, 0]");
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, -1, 10, -1]");
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 1, 100, 10]");
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, 0, 100, -1]");
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 1, -1, 10, 1]");
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, 100, 100, 0]");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 100, 100, 0]");
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 100, 0, 100]");
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100, 10, -1, 1]");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, 1, 10, -1]");
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 0, 100, 0]");
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, 1, 10, 100]");
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, 10, 10, 0]");
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
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
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 1, 0, 1]");
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, 1, -1, -1]");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 10, 100, 0]");
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 100, 100, -1]");
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 1, 10, 100]");
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 1, 0, -1, -1]");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, 10, 100, 10]");
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 1, -1, -1]");
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 100, 0, -1]");
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 0, -1, 1]");
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 10, 10, 1]");
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100, -1, 1, 100]");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 100, 1, 1]");
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, 0, 1, 10]");
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 1, 1, 10]");
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, 100, 1, 10]");
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, 0, 1, 100]");
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 100, 0, 1]");
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, -1, 10, 10]");
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 100, 0, 1]");
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 10, -1, 1]");
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, -1, 10, 10]");
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 100, 0, 0]");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 1, 0, 1]");
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, 10, 1, 1]");
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, -1, -1, 1]");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 100, 1, 10]");
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 1, 100, 1]");
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 100, -1]");
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, -1, 0, 10]");
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 1, 0, 100]");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
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
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, 1, 0, 0]");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, -1, -1, 0]");
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 10, -1, 1]");
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 1, 1, 10]");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 100, -1, -1]");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, -1, 100, 10]");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 100, 1, 0]");
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
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
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, -1, 0, -1]");
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 100, 1, 100]");
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 10, 1, 100, -1]");
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 100, 0, -1, 1]");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, 100, 1, -1]");
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 100, 1, -1]");
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, -1, 1, 100]");
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, -1, 10, 100]");
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10, 10, -1, -1]");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 0, 0, 1, 100]");
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, 1, 1, 0]");
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, 0, 10, 10]");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 100, 1, 100]");
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 100, 100, 10]");
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, 1, 0, 1]");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, 1, 10, 100]");
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, 100, 10, -1]");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 100, 100, 1]");
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
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
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 1, 10, 10]");
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, -1, 100, 0]");
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
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
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 10, 10, 1, 100]");
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 1, 10, 1]");
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 10, 10, 0]");
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 1, 100, 1, 1]");
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, 10, -1, 100]");
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
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
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, 0, 100, 100]");
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 10, 1, -1, 0]");
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 100, 100]");
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 1, 1, 10]");
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 10, -1, 100, 0]");
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
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
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, 10, 0, -1]");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 1, 100, -1]");
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
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
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, 1, 100, 1]");
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, 10, -1, -1]");
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 1, -1, 1]");
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 100, 1, 1]");
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, 100, -1, 1]");
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 100, -1, 0]");
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 1, 100, 0]");
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 100, 100, 10]");
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 0, 0, 100]");
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 100, 10, 10]");
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 0, -1, 1]");
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, 100, 1, -1]");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 0, -1, 100]");
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, 10, 1]");
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, -1, -1, 10]");
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, 1, 10, -1]");
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 0, 10, 0]");
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 100, 10, 1, 10]");
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, 1, 0, 1]");
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 0, -1, 1]");
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 1, 10, -1]");
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, -1, 100, 10]");
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 10, -1, -1]");
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100, 0, -1, 10]");
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, 100, -1, 10]");
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 100, 10, -1]");
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 10, 1, 0]");
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, -1, 0, 100]");
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 100, 1, 0]");
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 1, 10, -1]");
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, 0, 0, 10]");
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, 0, 1, 100]");
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, -1, 100, 1]");
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 100, -1, -1]");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 0, 1, 10]");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, -1, 100, 10]");
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 10, 0, 0]");
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 1, 0, -1]");
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 100, 100, 0]");
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
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
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 10]");
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, -1, 10, 10]");
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 100, 10, 10]");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 100, 100, 10, 10]");
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 1, -1, -1, 1]");
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 10, 10, 100]");
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, 10, -1, -1]");
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
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
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, -1, 0, -1]");
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, 1, 10]");
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 0, -1, 1]");
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -1, 100, 0]");
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, -1, 1, 0]");
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, -1, 0, 1]");
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 1, -1, -1]");
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
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
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, -1, -1, 1]");
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, 1, 100, 0]");
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, -1, 0, -1]");
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 10, 100, 100]");
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, -1, 100, -1]");
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 10, 1, -1]");
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
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
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 1, 100, 100]");
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 1, -1]");
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 1, -1, 10, -1]");
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, -1, 1, 10]");
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 10, 0, 0]");
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 100, 10, 10]");
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 100, 1, 0, -1]");
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
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
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 0, -1, 10, 100]");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 10, 100, 10]");
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, 10, 100, 10]");
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, 10, 1, 10]");
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 1, -1, 1]");
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, -1, 10, 1]");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, -1, -1, 1]");
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 1, -1, 10]");
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 1, 0, 1]");
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 100, 100, 1]");
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
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
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 0, 1, -1]");
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, -1, 10, 0]");
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 10, 100, 10, 10]");
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 0, 0, 1]");
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 1, 0, 0]");
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, 1, -1, 10]");
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 10, 0, 100]");
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, -1, 1, 1]");
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
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
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 100, 100, -1, 100]");
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 0, -1, 0, 1]");
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10, 10, 1, 10]");
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 10, 100, -1]");
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, 10, 10, 10]");
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, -1, 10, 0]");
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, -1, 0, 100]");
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, -1, 1, 10]");
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, 1, 10, 100]");
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, 10, 0, 100]");
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 100, 100, -1]");
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 100, 100, 0]");
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 100, 1, -1]");
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, -1, 1]");
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 10, 1, 100]");
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, 100, 10, -1]");
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, -1, 0, 0]");
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 1, 0, 10]");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 10, 0, 1, 1]");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 1, 10, 0]");
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 0, 10, -1]");
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 100, -1, 10, -1]");
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 0, 1, 100, 10]");
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 0, 0, 1]");
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, 0, 100, 10]");
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 100, 100, 100]");
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, -1, -1, 1]");
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 0, 10, 100]");
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, -1, 0, 100]");
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
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
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 10, 10, 10, 0]");
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, 1, -1, 100]");
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 10, 1, 1]");
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 100, 100, 10]");
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 0, 0, 1]");
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 10, -1, 10]");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 1, 0, 100]");
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1, 100]");
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
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
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 0, 0, 10, 0]");
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 0, 10, 10, -1]");
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 10, 100, 100]");
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 10, 10, 1]");
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 10, 10]");
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, -1, 1, -1]");
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 0, 1]");
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100, 0, -1, 100]");
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 0, 10, -1]");
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 10, 1, 0]");
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 0, 100, 100]");
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, 1, 100, 1]");
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 0, 100, 0]");
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, -1, 10, 0]");
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 100, 0, 100]");
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 10, -1, -1]");
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, 100, 1, 0]");
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, 1, 1, -1]");
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 0, 0, 0]");
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 100, 10, -1, 1]");
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 100, 100, 1]");
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 10, -1, 100]");
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 0, 100, 10]");
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 1, 0, 1]");
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 10, 1, 0]");
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 1, 0, -1]");
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 10, 1, -1]");
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, 1, 1, 100]");
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 1, 100, 0]");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 0, 1]");
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, 10, -1, 100]");
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 1, 1, 10]");
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, -1, 100, -1, 1]");
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 10, 1, 0]");
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 10, 0, 100]");
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 10, 10, 100]");
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, 1, 100, 0]");
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, -1, 0, 100]");
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 1, 10, -1, 0]");
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, 1, -1, 1]");
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 0, 100, 0]");
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 1, 100, -1, 100]");
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 100, 1, 100]");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 10, -1, 0, 1]");
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 100, -1, -1]");
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 100, 0, 10]");
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 1, 10, -1, 0]");
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, -1, -1, 100]");
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 100, -1, 10]");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 10, 1]");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 0, 1, 100]");
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, 1, 0, -1]");
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, -1, 1, 1]");
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 10, 100, 100]");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 100, 100, 10]");
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 100, -1, 0]");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, -1, -1, 1]");
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 1, -1, 100, 1]");
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 1, 1, 10]");
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, -1, 10, 100]");
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 10, 1, 1, 1]");
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 1, 10, 100]");
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, -1, 100]");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 0, 1, -1]");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 100, -1, 0]");
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 1, 100, -1]");
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 0, 10, 0]");
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 0, 10, 100]");
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 100, 100, 1, 1]");
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 10, 0]");
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 0, 10, 1]");
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 100, -1, -1, -1]");
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 10, 100, -1, -1]");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 100, 100, 1]");
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 1, 100, 10, -1]");
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 1, -1, 0]");
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, 0, -1, 10]");
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, 100, 0, 1]");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, -1, 1, 10]");
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, -1, 100, 0]");
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 1, 0, 100]");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, -1, 0, 10]");
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10, -1, 0, -1]");
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, 100, 0, -1]");
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, -1, 1, 1]");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 10, 100, 0]");
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, 1, -1, -1]");
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 0, 100, 0]");
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 10, 100, 10]");
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
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
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100, -1, -1, -1]");
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, 100, 10, 10]");
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, 0, 10, 0]");
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 10, 100, 10]");
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, -1, 10, 10]");
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 0, 100, 100]");
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, 1, -1, -1]");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 10, 100, 1]");
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, 100, 0, -1]");
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, -1, 100, -1]");
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 10, 1, -1, 100]");
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, 0, 0, -1]");
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 10, 1, -1, -1]");
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, 10, -1, 100]");
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 10, 1, 100]");
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 10, -1, 10]");
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, 100, -1, -1]");
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, -1, 10, 100]");
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, 1, 1, 100]");
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, 1, 10, 100]");
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, -1, 10, 0]");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, -1, 1, 0, 100]");
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 10, 10, -1]");
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 10, 0, 1]");
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 100, 10, -1]");
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 0, -1, 10, -1]");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 100, 0, 10]");
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 10, 0, -1]");
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 0, -1, 1]");
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, 1, 0, 100]");
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
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
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 10, 100, 0]");
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 10, 0, 100]");
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 10, -1, 100]");
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, -1, 100, 0]");
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, 100, -1, 0]");
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 100, 1, 10]");
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
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
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 100, 100, -1]");
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, 100, 1, 1]");
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 10, 0, 1]");
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 10, -1, 100]");
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 10, 10, 10, 100]");
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 100, 100, 10, 10]");
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, 0, 10, 100]");
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 100, 10, 10]");
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, -1, 100, 1]");
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 100, 10, 10]");
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 1, 100, 1]");
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 10, 10, 0, -1]");
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 0, 1, 1]");
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 10, 0, 0, 100]");
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, -1, 10, 10, 1]");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 1, -1, 0]");
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 10, -1, 100]");
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 0, -1, 100, -1]");
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, 1, 0, 1]");
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 100, 10, 1]");
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 10, 0, -1]");
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, -1, -1, 1]");
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, 10, 10, 100]");
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, 100, -1, -1]");
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 10, -1, 1]");
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 1, 0, 10]");
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, 10, 100, 0]");
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, 0, 0, 0]");
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 100, 10, 1]");
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, -1, 0, 1]");
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 0, 100, 0]");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 0, 0]");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 10, 100, 100]");
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 0, -1, 100]");
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 1, 10, 10]");
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 0, 10, 100]");
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 0, 10, -1]");
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, -1, 0, 10]");
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, -1, 1, 0]");
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, -1, 0, 100, 1]");
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, -1, 100, -1]");
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, -1, 10]");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, 10, 0, 10]");
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, -1, 0, 1]");
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 100, 100, 10]");
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, 1, 10, 1]");
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, 100, 1, -1]");
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 100, 1, 0]");
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, -1, 100, 10]");
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 10, 0, 0]");
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 0, -1, 10]");
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, 100, 10, 10]");
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10, 1, -1, 10]");
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 10, 0, 1]");
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 1, 100, 0]");
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 0, 0, -1]");
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 10, 10, 10]");
    }
}

