import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) '4', (java.lang.Object) 10);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 1, (double) 10.0f, (double) 1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        char[] charArray4 = new char[] { '#', '#', 'a' };
        char[] charArray9 = new char[] { '4', '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray4, charArray9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) 0L, (java.lang.Object) (short) 100);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) (short) 0, (java.lang.Object) 100.0d);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (byte) 100, (double) (-1));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        double[] doubleArray3 = new double[] { 10.0d, 100L, 100.0f };
        double[] doubleArray6 = new double[] { (byte) -1, 10.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        float[] floatArray1 = new float[] {};
        float[] floatArray5 = new float[] { '#', 10.0f, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray5, (float) (-1));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        int[] intArray4 = new int[] { 10, (short) -1, ' ' };
        int[] intArray7 = new int[] { (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray4, intArray7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        float[] floatArray2 = new float[] { 0L, 0L };
        float[] floatArray5 = new float[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray5, (float) (short) 10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        short[] shortArray3 = new short[] { (byte) -1, (byte) 10 };
        short[] shortArray10 = new short[] { (byte) -1, (byte) 10, (byte) 100, (short) 100, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray3, shortArray10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableSet2, (java.lang.Object) 10.0d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) "", (java.lang.Object) 'a');
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.client.Client client0 = org.elasticsearch.test.ElasticsearchSingleNodeTest.client();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        int[] intArray6 = new int[] { (-1), '#', 1, (byte) 0, 'a' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("node_s_0", false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        short[] shortArray2 = new short[] { (byte) 100 };
        short[] shortArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray2, shortArray3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        long[] longArray5 = new long[] { 100, (short) 100, (short) 1, (short) 0 };
        long[] longArray12 = new long[] { '4', 100, (short) 100, 100, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray5, longArray12);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        int[] intArray1 = new int[] {};
        int[] intArray7 = new int[] { '#', (-1), (short) 100, (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray1, intArray7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        long[] longArray2 = new long[] { (short) 1, ' ' };
        long[] longArray8 = new long[] { (short) -1, (short) 10, (short) 100, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) executorServiceArray4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        byte[] byteArray0 = null;
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        double[] doubleArray2 = new double[] { (-1L), (short) -1 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (-1L));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray13);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        short[] shortArray6 = new short[] { (byte) 0, (short) 1, (byte) 100, (short) 10, (byte) 0 };
        short[] shortArray10 = new short[] { (byte) 100, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray6, shortArray10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("node_s_0");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 10);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (-1.0f));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 10.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        double[] doubleArray5 = new double[] { 1.0f, 100.0d, 'a', (byte) 100 };
        double[] doubleArray11 = new double[] { 0.0f, (short) 10, 10.0d, (short) -1, 10.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray5, doubleArray11, (double) ' ');
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        float[] floatArray3 = new float[] { (byte) 0, 1, 0L };
        float[] floatArray6 = new float[] { 100.0f, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray6, (float) 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        long[] longArray1 = new long[] {};
        long[] longArray4 = new long[] { 0L, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        long[] longArray0 = new long[] {};
        long[] longArray3 = new long[] { 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = null;
        org.junit.Assert.assertNotSame("tests.monster", obj6, obj7);
        java.lang.Object[] objArray12 = new java.lang.Object[] { 10, obj7, false, (-1), "tests.failfast" };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray2, objArray12);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        byte[] byteArray6 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray5, byteArray6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 100, "node_s_0", (short) 1, "", 0 };
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray6, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1, (java.lang.Object) serializableSet3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        float[] floatArray4 = new float[] { 10L, '4', 0L };
        float[] floatArray6 = new float[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray4, floatArray6, (float) (short) 1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.apache.lucene.search.Query query0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery1 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        short[] shortArray1 = new short[] {};
        short[] shortArray7 = new short[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (-1), (long) 1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        char[] charArray3 = new char[] { 'a', ' ', 'a' };
        char[] charArray5 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 0, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) 10, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        short[] shortArray1 = new short[] { (byte) 0 };
        short[] shortArray6 = new short[] { (byte) 1, (byte) 100, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (byte) 0, (java.lang.Object) 1.0f);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { (-1), (short) -1, (byte) 100, (short) 10, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (byte) 1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        int[] intArray6 = new int[] { (byte) 1, 100, (byte) 10, (short) -1, (short) 100, '#' };
        int[] intArray12 = new int[] { (short) 1, (byte) 0, (byte) 100, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray12);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 1, (java.lang.Object) 100L);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray2 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray5, byteArray11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 0, "enwiki.random.lines.txt", mockMoreLikeThisFetchService5, 10, "tests.awaitsfix", ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray1, objArray9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) -1, (double) 1, 0.0d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        long[] longArray2 = new long[] { 1L, (byte) -1 };
        long[] longArray9 = new long[] { 1L, 100, (short) -1, 'a', (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray1, byteArray7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        double[] doubleArray4 = new double[] { 100, (-1L), (byte) 0, (-1L) };
        double[] doubleArray11 = new double[] { (byte) 1, (byte) 1, 10.0f, (-1.0d), (-1.0d), ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray11, 0.0d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "random", (java.lang.Object) ' ');
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) '4', (java.lang.Object) (short) 0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) '#');
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, 0L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("hi!");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 10.0f, serializableArray4 };
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) executorServiceArray8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        short[] shortArray5 = new short[] { (byte) 1, (short) 0, (byte) 0, (byte) -1, (byte) -1 };
        short[] shortArray10 = new short[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        float[] floatArray5 = new float[] { ' ', 0L, 0, (-1.0f) };
        float[] floatArray6 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray5, floatArray6, (float) (byte) 10);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        long[] longArray6 = new long[] { (short) 10, (short) 1, (byte) 1, '4', 100L, (short) 10 };
        long[] longArray13 = new long[] { 'a', (short) 0, 0, (short) 1, 'a', 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, "tests.failfast", 100.0d, (-1.0d) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, objArray8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        long[] longArray6 = new long[] { 100, (short) -1, '4', (-1L), '#' };
        long[] longArray9 = new long[] { (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray6, longArray9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttling0, (java.lang.Object) serializableArray2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) (byte) 1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (-1), (-1.0d));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (-1.0d), (double) (byte) 1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        long[] longArray6 = new long[] { ' ', 1L, (byte) 0, (byte) -1, '4' };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray6, longArray7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, throttling2, false, (short) 10 };
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, "tests.nightly", "", 100.0f, serializableSet12 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", objArray5, objArray13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 0, (double) 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, (byte) 10, (-1.0d), (byte) 1, "" };
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray5, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        short[] shortArray2 = new short[] { (short) 100, (short) 1 };
        short[] shortArray6 = new short[] { (short) -1, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "tests.awaitsfix", obj2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        int[] intArray2 = new int[] { (byte) 10, 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str2 = mockMoreLikeThisFetchService1.nodeName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) str2, (java.lang.Object) true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, (short) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) -1, (long) 100);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str6 = mockMoreLikeThisFetchService5.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str9 = mockMoreLikeThisFetchService8.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str11 = mockMoreLikeThisFetchService10.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray13 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService5, mockMoreLikeThisFetchService7, mockMoreLikeThisFetchService8, mockMoreLikeThisFetchService10, mockMoreLikeThisFetchService12 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet14 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) abstractComponentArray13);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (-1L));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) throttling1, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        double[] doubleArray2 = new double[] { 'a' };
        double[] doubleArray8 = new double[] { (-1), (short) 10, 10L, (-1.0d), 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray2, doubleArray8, (double) (-1.0f));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str2 = mockMoreLikeThisFetchService1.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str5 = mockMoreLikeThisFetchService4.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str7 = mockMoreLikeThisFetchService6.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray9 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService0, mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService3, mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService6, mockMoreLikeThisFetchService8 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet10 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100.0f, 1L, 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) abstractComponentArray9, objArray14);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 100, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        long[] longArray0 = null;
        long[] longArray7 = new long[] { 1, (-1L), (byte) -1, ' ', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) -1, (double) (-1L));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) 100);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 10L);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray4 = new double[] { 0.0f, 0.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray1, doubleArray4, (double) 10L);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        double[] doubleArray6 = new double[] { 10L, 100, '#', (-1.0d), 100.0d };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray6, doubleArray7, (double) 100L);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) locale2);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        double[] doubleArray3 = new double[] { 10.0f, 1.0d, 10.0f };
        double[] doubleArray9 = new double[] { 0.0d, (short) -1, (short) 100, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray9, (double) (short) 100);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (-1.0f));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) -1, (double) (byte) -1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        double[] doubleArray5 = new double[] { 10, '#', '#', (byte) -1, (-1.0f) };
        double[] doubleArray8 = new double[] { 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, 10.0d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        long[] longArray5 = new long[] { ' ', (byte) 100, (short) 100, 100, 1 };
        long[] longArray10 = new long[] { 0, 'a', 10, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) 100);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray4, byteArray9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 1, (double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10, (double) 100, (double) (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) serializableSet3, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        char[] charArray4 = new char[] { '4', '4', ' ' };
        char[] charArray10 = new char[] { ' ', '#', '4', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray4, charArray10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray1, charArray3);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        char[] charArray1 = new char[] { '4' };
        char[] charArray6 = new char[] { ' ', '#', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        float[] floatArray4 = new float[] { 0.0f, (byte) 10, 100.0f, (byte) -1 };
        float[] floatArray10 = new float[] { 10L, (byte) 1, 10.0f, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray10, (float) 0L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) 10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1), 0.0d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray11);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        java.util.concurrent.ExecutorService[][] executorServiceArray13 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4, executorServiceArray6, executorServiceArray8, executorServiceArray10, executorServiceArray12 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) executorServiceArraySet14, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) -1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) (short) 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "tests.weekly", (java.lang.Object) fields4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) strArray1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray8);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        char[] charArray5 = new char[] { 'a', 'a', 'a', ' ' };
        char[] charArray8 = new char[] { ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray5, charArray8);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) locale2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        short[] shortArray5 = new short[] { (short) 10, (byte) 1, (short) 100, (byte) 0, (byte) 0 };
        short[] shortArray8 = new short[] { (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1L, (double) 100.0f);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        double[] doubleArray3 = new double[] { 10.0d, 10L, 100.0f };
        double[] doubleArray8 = new double[] { (byte) 100, 0L, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling3, throttling4, throttling6, throttling9, throttling12 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray14, (java.lang.Object[]) executorServiceArray18);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.lang.Class<?> wildcardClass4 = serializableArray2.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) wildcardClass4, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray8 = new char[] { '#', '4', '#', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray2, charArray8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        char[] charArray4 = new char[] { '4', 'a', 'a', '#' };
        char[] charArray8 = new char[] { '#', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 0, (double) (short) 10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) 10L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str1 = mockMoreLikeThisFetchService0.nodeName();
        java.lang.String str2 = mockMoreLikeThisFetchService0.nodeName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str2);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, 10.0d, (double) 1L);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        short[] shortArray2 = new short[] { (byte) 0, (short) 1 };
        short[] shortArray5 = new short[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0, (short) 0, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray5, (double) 10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        float[] floatArray6 = new float[] { 0.0f, (byte) 1, 100.0f, 1, (byte) -1, '#' };
        float[] floatArray9 = new float[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray9, (float) 1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        float[] floatArray4 = new float[] { '4', 10, (short) 100, 10L };
        float[] floatArray8 = new float[] { (short) 100, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, 100.0f);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        java.util.concurrent.ExecutorService[][] executorServiceArray21 = new java.util.concurrent.ExecutorService[][] { executorServiceArray10, executorServiceArray12, executorServiceArray14, executorServiceArray16, executorServiceArray18, executorServiceArray20 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray21);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        float[] floatArray3 = new float[] { 100L, 100.0f, 1 };
        float[] floatArray7 = new float[] { 100, (-1), '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) ' ');
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        int[] intArray6 = new int[] { 10, (byte) 100, (short) 1, (short) 0, 'a', '4' };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (byte) 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 'a', 0.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray4);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling4, throttling5, throttling7, throttling10, throttling13 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 1, (java.lang.Object) throttlingArray15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { (-1), ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) (-1));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 1, (long) (byte) -1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray4 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray2, byteArray4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        char[] charArray3 = new char[] { '4', ' ' };
        char[] charArray9 = new char[] { '4', 'a', ' ', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray3, charArray9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray3);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.monster", false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) '#');
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 0, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        short[] shortArray1 = new short[] {};
        short[] shortArray7 = new short[] { (short) 10, (short) 1, (byte) 0, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray1, shortArray7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray7 = new char[] { ' ', '4', 'a', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        long[] longArray5 = new long[] { 100, '4', 10, '#', 100 };
        long[] longArray8 = new long[] { (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        int[] intArray2 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray2, intArray5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 0, (double) (-1L));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) '#', (double) (short) 100);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        int[] intArray4 = new int[] { (byte) 0, (short) 0, (-1) };
        int[] intArray11 = new int[] { (byte) 10, '#', ' ', ' ', (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray4, intArray11);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) 10L, (java.lang.Object) (short) 100);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 10, (long) (byte) 1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        int[] intArray5 = new int[] { (short) 100, (short) 10, 'a', 10, 'a' };
        int[] intArray12 = new int[] { (byte) 1, 0, ' ', (byte) 1, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        int[] intArray6 = new int[] { ' ', '#', 'a', (short) 10, (byte) 10, 'a' };
        int[] intArray11 = new int[] { ' ', (short) 100, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        int[] intArray3 = new int[] { (short) 10, '#', (short) 0 };
        int[] intArray8 = new int[] { (short) -1, '#', (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        double[] doubleArray5 = new double[] { 0.0d, (-1.0f), (-1L), 10.0d };
        double[] doubleArray9 = new double[] { '4', 0.0f, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray5, doubleArray9, (double) 1.0f);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        int[] intArray2 = new int[] { 10, (byte) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.nightly");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 1.0f, (double) ' ', (double) 10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) locale2, (java.lang.Object) 0L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1.0d, (double) 10L, (-1.0d));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields2 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray0, (java.lang.Object[]) executorServiceArray8);
        java.lang.Object[] objArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, objArray13);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (-1.0f), (double) (short) -1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        float[] floatArray4 = new float[] { 100L, 100.0f, 1L, (short) -1 };
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), (short) 1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray10, (float) (-1));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        char[] charArray1 = new char[] { '#' };
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 10, (double) (byte) 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        int[] intArray2 = new int[] { 10 };
        int[] intArray6 = new int[] { (byte) 1, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray6);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.badapples");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray11, (java.lang.Object) strArray20);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "hi!", (java.lang.Object) throttling1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        char[] charArray3 = new char[] { 'a', 'a', '#' };
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "hi!");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader2, fields5, fields15, false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        char[] charArray5 = new char[] { 'a', '4', '4', ' ' };
        char[] charArray9 = new char[] { 'a', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray5, charArray9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        double[] doubleArray2 = new double[] { 1.0f };
        double[] doubleArray7 = new double[] { (short) 0, 0, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray2, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray3);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) serializableArray2, (java.lang.Object) true);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) executorServiceArray11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService18;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) indexQueryParserService18);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        double[] doubleArray6 = new double[] { (byte) 0, 10, 100.0f, (short) 0, (short) 1, (-1.0f) };
        double[] doubleArray10 = new double[] { (-1.0d), (byte) 1, 0.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray10, (double) 1L);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        java.util.concurrent.ExecutorService[][] executorServiceArray13 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4, executorServiceArray6, executorServiceArray8, executorServiceArray10, executorServiceArray12 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray13);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray13, (java.lang.Object) 10.0f);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.badapples");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) strArray17);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', 1L);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", objArray1, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        double[] doubleArray5 = new double[] { 100.0f, (byte) 10, 10, 1.0f };
        double[] doubleArray12 = new double[] { (short) 1, (-1.0d), 0L, 100.0f, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray5, doubleArray12, (double) 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        short[] shortArray4 = new short[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5, throttling7, throttling8, throttling10, throttling13, throttling16 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray1, (java.lang.Object[]) throttlingArray18);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "hi!");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (-1), postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.maxfailures", indexReader32, (int) (short) 1, postingsEnum34, postingsEnum35);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = null;
        simpleIndexQueryParserTests24.queryParser = indexQueryParserService37;
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests24.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader42 = null;
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields46, (java.lang.Object) locale48);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.badapples");
        simpleIndexQueryParserTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader42, fields46, fields54, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.nightly", fields23, fields46);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        int[] intArray3 = new int[] { (short) 100, (short) 100 };
        int[] intArray7 = new int[] { (-1), (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray3, intArray7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        double[] doubleArray5 = new double[] { (-1L), 1.0f, 1, 100, 'a' };
        double[] doubleArray8 = new double[] { (-1.0f), 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) 1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.badapples");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        short[] shortArray5 = new short[] { (short) -1, (short) 10, (byte) 100, (byte) 1, (byte) 10 };
        short[] shortArray11 = new short[] { (short) -1, (short) 100, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 1.0d, (double) (byte) -1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        long[] longArray4 = new long[] { (short) 1, (-1L), (short) 1 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray4, longArray5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        char[] charArray1 = null;
        char[] charArray3 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) executorServiceArray34, (java.lang.Object) boolean52);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 1 };
        byte[] byteArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray4, byteArray5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 100);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        float[] floatArray5 = new float[] { '4', (byte) 100, (short) 10, (byte) 100 };
        float[] floatArray8 = new float[] { 10L, 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray5, floatArray8, (float) 1L);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields22, (java.lang.Object) locale24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields22, fields30, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        long[] longArray6 = new long[] { (short) 100, (short) -1, ' ', 1L, (short) -1 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray6, longArray7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        char[] charArray4 = new char[] { 'a', '4', '#', '4' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        short[] shortArray2 = new short[] { (short) 0, (byte) 10 };
        short[] shortArray4 = new short[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 10.0f, (double) (-1), (double) (byte) 1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) ' ');
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) ' ', numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        double[] doubleArray3 = new double[] { 1.0d, (-1.0f) };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray4, (double) (short) 100);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        short[] shortArray3 = new short[] { (short) 100, (byte) -1 };
        short[] shortArray6 = new short[] { (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray6);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        float[] floatArray6 = new float[] { ' ', 10.0f, 100, 1, (byte) -1 };
        float[] floatArray8 = new float[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray8, (float) (short) 100);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields22, (java.lang.Object) locale24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields22, fields30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (short) 1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        long[] longArray1 = new long[] {};
        long[] longArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray1, longArray2);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 10.0f);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) (-1));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', 0L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.badapples");
        java.lang.Object obj10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray5, obj10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        float[] floatArray5 = new float[] { (byte) 10, '#', (byte) 10, (byte) 100 };
        float[] floatArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray5, floatArray6, (float) (short) -1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        int[] intArray1 = null;
        int[] intArray8 = new int[] { (short) -1, (byte) 100, 0, (byte) -1, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray1, intArray8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 100, 10, '4', (-1), (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader11, terms12, terms13, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "node_s_0");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        long[] longArray2 = new long[] { (byte) 10, (byte) 0 };
        long[] longArray7 = new long[] { 0, (byte) 100, (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray9);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) serializableArray16, (java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) serializableArray16);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 'a', (double) 10L);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        int[] intArray5 = new int[] { '#', (byte) 100, (byte) -1, '4', (-1) };
        int[] intArray11 = new int[] { 'a', (byte) 100, 100, 0, 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader20, fields21, fields29, true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 10, (double) (byte) 1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        long[] longArray3 = new long[] { (byte) 1, (short) -1, 100L };
        long[] longArray8 = new long[] { '4', (byte) 0, (byte) 1, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, 10, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        long[] longArray4 = new long[] { (short) 1, 0L, (short) 100, 10 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 1.0f, (double) (byte) 10, (double) 1);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        char[] charArray0 = new char[] {};
        char[] charArray6 = new char[] { '#', ' ', ' ', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        org.junit.Assert.assertNotSame("tests.monster", obj2, obj3);
        java.lang.Object obj5 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj3, obj5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.lang.Class<?> wildcardClass9 = executorServiceArray7.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj5, (java.lang.Object) wildcardClass9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray1, byteArray7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) (byte) 1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10, (double) '4');
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        int[] intArray7 = new int[] { 1, (byte) 1, 1, (byte) 10, (byte) 100, '#' };
        int[] intArray11 = new int[] { ' ', 1, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray7, intArray11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader10, (int) (short) 1, postingsEnum12, postingsEnum13);
        org.junit.rules.RuleChain ruleChain15 = null;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain15;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests2.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) mockMoreLikeThisFetchService1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", 0, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        long[] longArray5 = new long[] { 0L, (byte) 100, (byte) 1, 1, (byte) 10 };
        long[] longArray8 = new long[] { (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 100.0d, (double) (byte) 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        int[] intArray3 = new int[] { (byte) 10, 1 };
        int[] intArray6 = new int[] { ' ', (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray6);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService16);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (-1), numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests1.indexedValueForSearch(1L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader15, (-1), postingsEnum17, postingsEnum18);
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests13.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        double[] doubleArray1 = new double[] { 0.0f };
        double[] doubleArray5 = new double[] { 0.0f, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray5, (double) 10L);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (-1.0d), (double) 100.0f, (double) (byte) 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, true);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService8;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { (short) 100, '#', 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray1, intArray6);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.junit.rules.RuleChain ruleChain13 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain13;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.failfast", true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (byte) 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.slow", false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, 0.0d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0.0d, (double) 0.0f);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (short) 100);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        int[] intArray5 = new int[] { 1, (byte) 10, 100, (short) -1 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray7);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray50);
        java.util.Set<java.lang.Object> objSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) executorServiceArray8, (java.lang.Object) objSet59);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray12);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 0, (long) ' ');
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling1, (java.lang.Object) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests4.assertPositionsSkippingEquals("tests.maxfailures", indexReader6, (-1), postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests4.queryParser();
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) throttling1, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService8;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray6);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) -1);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        java.lang.Class<?> wildcardClass16 = executorServiceArray9.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) 100, (java.lang.Object) wildcardClass16);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) -1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        byte[] byteArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray5, byteArray6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        float[] floatArray0 = new float[] {};
        float[] floatArray5 = new float[] { (-1), 0.0f, ' ', 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (float) (byte) 10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader11, 10, postingsEnum13, postingsEnum14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        java.lang.Class<?> wildcardClass24 = executorServiceArray18.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) indexReader11, (java.lang.Object) executorServiceArray18);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        double[] doubleArray5 = new double[] { ' ', 1, 'a', 'a' };
        double[] doubleArray11 = new double[] { 10, '#', 100L, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray5, doubleArray11, (double) '#');
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (-1.0f), (double) 'a', (double) (short) 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10.0f);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        float[] floatArray2 = new float[] { (byte) 100, (byte) 0 };
        float[] floatArray5 = new float[] { 1L, 0L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray5, (float) 10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray23);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str33 = mockMoreLikeThisFetchService32.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str36 = mockMoreLikeThisFetchService35.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str38 = mockMoreLikeThisFetchService37.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray40 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService31, mockMoreLikeThisFetchService32, mockMoreLikeThisFetchService34, mockMoreLikeThisFetchService35, mockMoreLikeThisFetchService37, mockMoreLikeThisFetchService39 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet41 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) abstractComponentArray40);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        long[] longArray2 = new long[] { 0, '#' };
        long[] longArray7 = new long[] { (short) 100, (-1), (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        double[] doubleArray2 = new double[] { 1 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray2, doubleArray3, (double) 0L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService18;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.monster", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, 0.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.apache.lucene.util.BytesRef[] bytesRefArray0 = new org.apache.lucene.util.BytesRef[] {};
        java.util.Set<org.apache.lucene.util.BytesRef> bytesRefSet1 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray0);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) bytesRefArray0, (java.lang.Object) throttling2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        long[] longArray0 = new long[] {};
        long[] longArray7 = new long[] { (byte) -1, 0, 1L, (byte) 1, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        double[] doubleArray1 = null;
        double[] doubleArray3 = new double[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray1, doubleArray3, (double) 100.0f);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        float[] floatArray6 = new float[] { 0L, '#', 0, (byte) 100, 100, 1 };
        float[] floatArray8 = new float[] { 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray8, (float) (-1L));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        char[] charArray3 = new char[] { '#', ' ', '4' };
        char[] charArray7 = new char[] { 'a', ' ', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        double[] doubleArray5 = new double[] { 1.0d, (-1L), 10, 100L, '#' };
        double[] doubleArray11 = new double[] { '#', 1, '4', (short) -1, 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray11, (double) 'a');
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale[] localeArray6 = new java.util.Locale[] { locale3, locale5 };
        java.util.List<java.util.Locale> localeList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, localeArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) strArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray6, (java.lang.Object[]) executorServiceArray19);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.monster");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, 100L);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) '#', (long) 'a');
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] { 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray3, (float) 2);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService8;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        double[] doubleArray6 = new double[] { 2, (byte) -1, 1.0f, 100.0d, ' ' };
        double[] doubleArray9 = new double[] { 100.0f, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray6, doubleArray9, (double) (short) 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.monster");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields4, (java.lang.Object) locale6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (-1.0d), (java.lang.Object) "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.junit.rules.RuleChain ruleChain17 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService34;
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests21.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService38;
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 1L, 0.0d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        char[] charArray6 = new char[] { '4', ' ', '4', ' ', ' ', ' ' };
        char[] charArray8 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 1, 100.0d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray34);
        java.lang.Object[] objArray43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray4, objArray43);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields22, (java.lang.Object) locale24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields22, fields30, false);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale[] localeArray6 = new java.util.Locale[] { locale3, locale5 };
        java.util.List<java.util.Locale> localeList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, localeArray6);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) localeArray6, (java.lang.Object[]) strArray8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 100, 0.0d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", 100L, (long) 'a');
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        int[] intArray5 = new int[] { 1, (byte) 0, (byte) -1, (short) 1, 10 };
        int[] intArray9 = new int[] { '#', (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.lang.Class<?> wildcardClass4 = serializableArray2.getClass();
        java.lang.Object obj5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) serializableArray2, obj5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) strArray16);
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "node_s_0");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "hi!");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader10, fields21, fields31, true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) ruleChain17);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) 2);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        float[] floatArray6 = new float[] { 100.0f, 0.0f, 1.0f, 10, 100L };
        float[] floatArray10 = new float[] { ' ', '#', 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray6, floatArray10, (float) (short) -1);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader11, terms12, terms13, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests1.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) indexQueryParserService16);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader12, (int) (short) 0, postingsEnum14, postingsEnum15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray2, charArray3);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        float[] floatArray2 = new float[] { '#' };
        float[] floatArray6 = new float[] { (short) 10, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray2, floatArray6, (float) 100L);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests19.ruleChain;
        simpleIndexQueryParserTests19.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray5, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) bytesRef17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        char[] charArray5 = new char[] { '4', '4', ' ', ' ', '#' };
        char[] charArray12 = new char[] { 'a', ' ', '4', 'a', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray12);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.badapples");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.nightly");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str10 = mockMoreLikeThisFetchService9.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str13 = mockMoreLikeThisFetchService12.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str15 = mockMoreLikeThisFetchService14.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray17 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService8, mockMoreLikeThisFetchService9, mockMoreLikeThisFetchService11, mockMoreLikeThisFetchService12, mockMoreLikeThisFetchService14, mockMoreLikeThisFetchService16 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet18 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) abstractComponentArray17);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        long[] longArray1 = null;
        long[] longArray3 = new long[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray1, longArray3);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        double[] doubleArray4 = new double[] { 1.0d, (byte) 10, 10L };
        double[] doubleArray11 = new double[] { (-1.0d), '#', (short) 1, (byte) 0, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray4, doubleArray11, (double) 10.0f);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.weekly", true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray5, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        long[] longArray2 = new long[] { '#', 1L };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        short[] shortArray12 = new short[] { (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        short[] shortArray18 = new short[] { (byte) 1 };
        short[] shortArray20 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) shortArray7);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.lang.Class<?> wildcardClass19 = executorServiceArray5.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (-1), postingsEnum24, postingsEnum25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (int) (short) 1, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests20.queryParser = indexQueryParserService33;
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests20.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader38 = null;
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields42, (java.lang.Object) locale44);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.badapples");
        simpleIndexQueryParserTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields42, fields50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests20.assertTermsEquals("tests.weekly", indexReader54, terms55, terms56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass60 = ruleChain59.getClass();
        java.lang.Class[] classArray62 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        wildcardClassArray63[0] = wildcardClass19;
        wildcardClassArray63[1] = wildcardClass60;
        java.util.Set<java.lang.Class<?>> wildcardClassSet68 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray63);
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClassArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray72);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray75);
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray63, (java.lang.Object[]) executorServiceArray72);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader2, terms3, terms4, true);
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch(0L);
        short[] shortArray10 = new short[] { (byte) 1 };
        short[] shortArray12 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) shortArray12);
        short[] shortArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray15);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        int[] intArray7 = new int[] { (short) 0, (byte) 10, (byte) -1, (byte) 10, 10, '#' };
        int[] intArray9 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray7, intArray9);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests10.queryParser();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) testRule8, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray1, byteArray7);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.maxfailures", indexReader25, (-1), postingsEnum27, postingsEnum28);
        simpleIndexQueryParserTests23.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = simpleIndexQueryParserTests23.queryParser();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexQueryParserService22, (java.lang.Object) simpleIndexQueryParserTests23);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 10 };
        byte[] byteArray4 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        float[] floatArray5 = new float[] { '#', 100, 100, (-1.0f) };
        float[] floatArray11 = new float[] { '4', 100L, (byte) -1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray5, floatArray11, (float) (byte) 10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        long[] longArray1 = null;
        long[] longArray6 = new long[] { 100, (short) -1, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray1, longArray6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        float[] floatArray1 = new float[] { (byte) -1 };
        float[] floatArray6 = new float[] { (-1L), 100.0f, (byte) 1, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) (byte) -1);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        double[] doubleArray7 = new double[] { 2, 10L, ' ', (byte) 0, 10.0d, 1 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray7, doubleArray8, 0.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        long[] longArray3 = new long[] { (byte) 0, (short) 1 };
        long[] longArray7 = new long[] { 'a', (-1L), '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (-1L), (long) 2);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.lang.Class<?> wildcardClass19 = executorServiceArray5.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (-1), postingsEnum24, postingsEnum25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (int) (short) 1, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests20.queryParser = indexQueryParserService33;
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests20.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader38 = null;
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields42, (java.lang.Object) locale44);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.badapples");
        simpleIndexQueryParserTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields42, fields50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests20.assertTermsEquals("tests.weekly", indexReader54, terms55, terms56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass60 = ruleChain59.getClass();
        java.lang.Class[] classArray62 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        wildcardClassArray63[0] = wildcardClass19;
        wildcardClassArray63[1] = wildcardClass60;
        java.util.Set<java.lang.Class<?>> wildcardClassSet68 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray63);
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClassArray63);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray70, (java.lang.Object[]) executorServiceArray78);
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray63, (java.lang.Object[]) strArray70);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 10L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        long[] longArray4 = new long[] { (byte) 0, (short) 100, '#', 100 };
        long[] longArray11 = new long[] { (short) 10, (short) 10, (short) 10, 2, (byte) -1, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        char[] charArray0 = new char[] {};
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray6 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        long[] longArray6 = new long[] { (byte) 1, (short) 1, 10, 10, (short) 100 };
        long[] longArray13 = new long[] { (short) 1, ' ', 0, (byte) 1, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray3, byteArray8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 1, (-1L));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        char[] charArray7 = new char[] { 'a', '4', '#', 'a', '#', ' ' };
        char[] charArray13 = new char[] { ' ', '4', '#', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray13);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, true);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (short) 1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.Class<?> wildcardClass20 = executorServiceArray6.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService34;
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests21.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader39 = null;
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields43, (java.lang.Object) locale45);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.badapples");
        simpleIndexQueryParserTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields43, fields51, false);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        simpleIndexQueryParserTests21.assertTermsEquals("tests.weekly", indexReader55, terms56, terms57, true);
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass61 = ruleChain60.getClass();
        java.lang.Class[] classArray63 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        wildcardClassArray64[0] = wildcardClass20;
        wildcardClassArray64[1] = wildcardClass61;
        java.util.Set<java.lang.Class<?>> wildcardClassSet69 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray64);
        java.lang.Object[] objArray70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) wildcardClassArray64, objArray70);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        float[] floatArray1 = new float[] { (byte) 1 };
        float[] floatArray8 = new float[] { 0L, (byte) 100, (byte) 100, '#', (-1.0f), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray8, (float) '4');
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, true);
        java.lang.String str25 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.TestRule testRule27 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.maxfailures");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        long[] longArray7 = new long[] { 10L, (short) 1, (short) 10, (short) 0, '#', (byte) 100 };
        long[] longArray13 = new long[] { 'a', 1, 100, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray7, longArray13);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) -1, 0L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, true);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", (int) (short) 1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        long[] longArray1 = new long[] { (short) 1 };
        long[] longArray5 = new long[] { (byte) -1, (short) 0, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 100);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", 0, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        int[] intArray2 = new int[] { (short) 1, 100 };
        int[] intArray8 = new int[] { (short) 100, (byte) 100, (byte) 10, (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        char[] charArray5 = new char[] { ' ', 'a', '4', '#', 'a' };
        char[] charArray8 = new char[] { 'a', '#' };
        char[] charArray11 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArray5, (java.lang.Object) 100);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 0);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (-1L));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) '#');
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader13, terms14, terms15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms14);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        int[] intArray6 = new int[] { (short) 100, 100, 100, (byte) -1, '4', (byte) -1 };
        int[] intArray8 = new int[] { 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, 0.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.junit.Assert.assertNotNull((java.lang.Object) mockMoreLikeThisFetchService1);
        java.lang.String str3 = mockMoreLikeThisFetchService1.nodeName();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) mockMoreLikeThisFetchService1, (java.lang.Object) fields6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (-1), postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (int) (short) 1, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests18.queryParser = indexQueryParserService31;
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests18.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests18.queryParser = indexQueryParserService35;
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain38;
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale42, locale44 };
        java.util.List<java.util.Locale> localeList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, localeArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain38, (java.lang.Object) 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (-1L));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        short[] shortArray12 = new short[] { (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray2, shortArray14);
        short[] shortArray19 = new short[] { (byte) 1 };
        short[] shortArray21 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        short[] shortArray24 = new short[] { (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray24);
        short[] shortArray30 = new short[] { (byte) 1 };
        short[] shortArray32 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray19);
        short[] shortArray36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray36);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        int[] intArray5 = new int[] { (short) 10, (byte) 1, 2, 10 };
        int[] intArray8 = new int[] { 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5, throttling7, throttling8, throttling10, throttling13, throttling16 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) throttlingArray18);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray18 = new double[] { (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray7, doubleArray18, (double) (byte) 1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        java.util.concurrent.ExecutorService[][] executorServiceArray13 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4, executorServiceArray6, executorServiceArray8, executorServiceArray10, executorServiceArray12 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray13);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray13, (java.lang.Object) 10.0f);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray39);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray8, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { (short) 0, (short) 10, 10, (short) 10, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray8);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.monster");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields4, (java.lang.Object) locale6);
        java.lang.Class<?> wildcardClass8 = fields4.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) wildcardClass8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        long[] longArray1 = new long[] { (byte) 10 };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.junit.rules.RuleChain ruleChain13 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain13;
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        long[] longArray3 = new long[] { (short) -1, (short) -1, (short) 1 };
        long[] longArray6 = new long[] { (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray22 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray28 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray22, doubleArray28, (double) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray7, doubleArray28, (double) (byte) 10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray21 = new double[] { (byte) 0, 0.0f, 100.0d, '#', (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("node_s_0", doubleArray13, doubleArray21, (double) (short) 1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService16;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, (-1), postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (int) (short) 1, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests19.queryParser = indexQueryParserService32;
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests19.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader37 = null;
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields41, (java.lang.Object) locale43);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.badapples");
        simpleIndexQueryParserTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields41, fields49, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService18;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray1, longArray3);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) 10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields22, (java.lang.Object) locale24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields22, fields30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        simpleIndexQueryParserTests42.assertPositionsSkippingEquals("tests.maxfailures", indexReader44, (-1), postingsEnum46, postingsEnum47);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests42.assertPositionsSkippingEquals("tests.maxfailures", indexReader50, (int) (short) 1, postingsEnum52, postingsEnum53);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = null;
        simpleIndexQueryParserTests42.queryParser = indexQueryParserService55;
        org.apache.lucene.util.BytesRef bytesRef58 = simpleIndexQueryParserTests42.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = null;
        simpleIndexQueryParserTests42.queryParser = indexQueryParserService59;
        simpleIndexQueryParserTests42.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests42.failureAndSuccessEvents;
        simpleIndexQueryParserTests42.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService64 = simpleIndexQueryParserTests42.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests42);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        long[] longArray1 = new long[] { (byte) -1 };
        long[] longArray6 = new long[] { 'a', (byte) 10, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        long[] longArray2 = new long[] { '#', 0L };
        long[] longArray9 = new long[] { 0, (byte) 100, 'a', (-1L), '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch(1L);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 100, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        float[] floatArray4 = new float[] { (short) 1, (short) 10, 0.0f };
        float[] floatArray9 = new float[] { (byte) 100, (short) 100, 0, 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray4, floatArray9, (float) (byte) -1);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        float[] floatArray2 = new float[] { 0.0f, (short) -1 };
        float[] floatArray3 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (-1.0f));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (-1.0d), (double) 1, (double) (-1L));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        long[] longArray4 = new long[] { (-1L), (short) 10, 1L, (byte) -1 };
        long[] longArray10 = new long[] { ' ', (short) 100, (short) 0, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        float[] floatArray6 = new float[] { (byte) 1, 0.0f, 1, 10.0f, 100.0f, (short) 0 };
        float[] floatArray13 = new float[] { 100, (-1), (short) 100, ' ', 100, (short) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray13, (float) 10L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        double[] doubleArray2 = new double[] { 1L };
        double[] doubleArray5 = new double[] { (byte) -1, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray2, doubleArray5, (double) (short) 100);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (byte) 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (short) 10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, objArray10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        long[] longArray1 = new long[] { 10 };
        long[] longArray8 = new long[] { 100, 10, (byte) 1, (short) 100, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        float[] floatArray4 = new float[] { (byte) -1, '#', '4' };
        float[] floatArray10 = new float[] { '4', 0.0f, (short) 100, 0L, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray4, floatArray10, (float) 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        long[] longArray3 = new long[] { 0, (short) 0, '#' };
        long[] longArray8 = new long[] { (short) 1, (short) 1, (short) 10, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch(1L);
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader14, (-1), postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray16, (java.lang.Object[]) executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 100L, (java.lang.Object) strArray16);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        short[] shortArray12 = new short[] { (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        short[] shortArray18 = new short[] { (byte) 1 };
        short[] shortArray20 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray24 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray24);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        char[] charArray4 = new char[] { 'a', '#' };
        char[] charArray7 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray11 = new char[] { 'a', '#' };
        char[] charArray14 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals(charArray4, charArray14);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray22);
        char[] charArray27 = new char[] { 'a', '#' };
        char[] charArray30 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray30);
        char[] charArray34 = new char[] { 'a', '#' };
        char[] charArray37 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        org.junit.Assert.assertArrayEquals(charArray27, charArray37);
        org.junit.Assert.assertArrayEquals(charArray22, charArray27);
        char[] charArray46 = new char[] { 'a', '4', ' ', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", charArray27, charArray46);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) serializableArray5);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        long[] longArray6 = new long[] { (short) 100, (-1), (byte) 100, (byte) 100, (short) 1, '4' };
        long[] longArray11 = new long[] { 100L, (-1), (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray1, longArray3);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests1.indexedValueForSearch(1L);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests1.ruleChain;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = null;
        org.junit.Assert.assertNotSame("tests.monster", obj15, obj16);
        java.lang.Class<?> wildcardClass18 = obj15.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) testRule13, (java.lang.Object) wildcardClass18);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray50);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        java.util.concurrent.ExecutorService[][] executorServiceArray78 = new java.util.concurrent.ExecutorService[][] { executorServiceArray67, executorServiceArray69, executorServiceArray71, executorServiceArray73, executorServiceArray75, executorServiceArray77 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet79 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray78);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray78, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray78);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 2, (long) ' ');
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) 1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) strArray21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        java.util.concurrent.ExecutorService[][] executorServiceArray38 = new java.util.concurrent.ExecutorService[][] { executorServiceArray27, executorServiceArray29, executorServiceArray31, executorServiceArray33, executorServiceArray35, executorServiceArray37 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet39 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray38);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray38, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (byte) 10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        long[] longArray4 = new long[] { 0, (byte) 1, 0, '#' };
        long[] longArray7 = new long[] { (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        long[] longArray2 = new long[] { 2, (short) -1 };
        long[] longArray9 = new long[] { (byte) 1, (short) 100, 0, 10, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100, (short) -1, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray5, (double) 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 'a', (double) (short) -1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        char[] charArray4 = new char[] { 'a', '#' };
        char[] charArray7 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray11 = new char[] { 'a', '#' };
        char[] charArray14 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals(charArray4, charArray14);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray22);
        char[] charArray28 = new char[] { 'a', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray22, charArray28);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 0, (long) 1);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 10, (-1.0d), 1.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        long[] longArray3 = new long[] { (byte) 1, 100, (short) 10 };
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 100, 0.0d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 10 };
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray3, byteArray6);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        int[] intArray3 = new int[] { 2, (short) -1, 0 };
        int[] intArray10 = new int[] { 2, 100, (short) 1, (byte) 0, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray10);
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.nightly");
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) executorServiceArray25);
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.nightly");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.badapples");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "random");
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray72);
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray72);
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray81, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray33, (java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) "random", (java.lang.Object) "hi!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (-1), 0.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) locale12);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("node_s_0", (int) (short) -1, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray15);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray15, (java.lang.Object) "tests.monster");
    }
}

