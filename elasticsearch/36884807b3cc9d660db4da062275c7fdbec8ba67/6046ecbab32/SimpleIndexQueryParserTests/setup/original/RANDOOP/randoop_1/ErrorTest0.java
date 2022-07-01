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
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", "hi!", false, '#' };
        java.lang.Object[] objArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray5, objArray6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        int[] intArray4 = new int[] { (-1), (byte) 0, 10, (short) 10 };
        int[] intArray7 = new int[] { (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100L, (double) 100.0f);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, (byte) 0, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d, '4', 10.0f };
        org.junit.rules.TestRule testRule4 = org.apache.lucene.util.LuceneTestCase.classRules;
        java.lang.Object[] objArray8 = new java.lang.Object[] { testRule4, 10.0d, "tests.nightly", 100.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray3, objArray8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (-1.0d), (double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        long[] longArray6 = new long[] { '#', (-1L), (byte) 100, 1L, (byte) 10 };
        long[] longArray9 = new long[] { '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray6, longArray9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        double[] doubleArray3 = new double[] { 1L, 10L, 10.0f };
        double[] doubleArray6 = new double[] { (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) (-1));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.rules.TestRule testRule4 = org.apache.lucene.util.LuceneTestCase.classRules;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "tests.nightly", testRule4, (-1.0f), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray1, objArray7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        long[] longArray1 = new long[] {};
        long[] longArray7 = new long[] { '#', (byte) -1, (short) 100, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray1, longArray7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        int[] intArray6 = new int[] { (short) 100, (byte) 10, '#', 100, '#' };
        int[] intArray9 = new int[] { (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray6, intArray9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) ' ', (java.lang.Object) (byte) 100);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        char[] charArray2 = new char[] { '4' };
        char[] charArray9 = new char[] { '4', '4', '#', '4', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.junit.rules.TestRule testRule1 = org.apache.lucene.util.LuceneTestCase.classRules;
        java.lang.Object[] objArray3 = new java.lang.Object[] { testRule1, '#' };
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", objArray3, (java.lang.Object[]) executorServiceArray4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        int[] intArray6 = new int[] { (byte) 100, 10, (short) 1, (byte) 100, (short) 10, (byte) 100 };
        int[] intArray12 = new int[] { (short) 100, 1, (short) 1, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray12);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        float[] floatArray6 = new float[] { 10L, 0, 1L, 100L, (byte) 100 };
        float[] floatArray8 = new float[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray6, floatArray8, (float) 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) (-1L));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', 100.0d, (byte) 1, 0 };
        java.lang.Object[] objArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", objArray5, objArray6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        long[] longArray4 = new long[] { ' ', (short) 10, '#' };
        long[] longArray11 = new long[] { 'a', 10L, 10L, (byte) 100, 0L, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray4, longArray11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) (short) -1, (java.lang.Object) ' ');
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = new float[] { 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray1, floatArray3, (float) 10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues4 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", (int) (byte) 10, numericDocValues4, numericDocValues5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) ' ');
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        java.lang.Object[] objArray2 = new java.lang.Object[] { 10.0f, "random" };
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray2, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        short[] shortArray6 = new short[] { (short) 10, (short) 1, (short) 100, (byte) 1, (byte) -1 };
        short[] shortArray12 = new short[] { (byte) 1, (byte) 10, (short) 1, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray6, shortArray12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", (int) (byte) 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        float[] floatArray6 = new float[] { (byte) -1, 100.0f, 1.0f, 100L, '#', (byte) -1 };
        float[] floatArray8 = new float[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray8, (float) (byte) 10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        int[] intArray3 = new int[] { 10, 0 };
        int[] intArray10 = new int[] { (short) 1, (byte) 10, '#', (byte) 1, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray3, intArray10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        double[] doubleArray3 = new double[] { (-1L), 0.0f, 100 };
        double[] doubleArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (byte) 10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.Object[] objArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, objArray3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 0, 100L, 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray4, (double) (short) -1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, 10.0d);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) (byte) 1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        char[] charArray1 = null;
        char[] charArray3 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray1, charArray3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) -1 };
        byte[] byteArray4 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1L) };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray9, strArray15 };
        java.util.Set<java.lang.String[]> strArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.ensureCleanedUp();
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, 100.0f, strArraySet17, fields23, 10.0f, simpleIndexQueryParserTests27 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray1, objArray30);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) '#', 0L);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1), 10.0d, (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray5, 100.0d);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 100, (long) '4');
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.nightly", "<unknown>", "random", "europarl.lines.txt.gz", "node_s_0", "tests.awaitsfix" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus10 = simpleIndexQueryParserTests0.ensureGreen(strArray9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) -1, (long) 'a');
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.Object[] objArray4 = new java.lang.Object[] { simpleIndexQueryParserTests2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, objArray4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("tests.failfast", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.awaitsfix", indexReader14, (int) 'a', postingsEnum16, postingsEnum17);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 1L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) -1, 1.0d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("node_s_0", indexReader6, 1, postingsEnum8, postingsEnum9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", obj1, (java.lang.Object) 1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        long[] longArray3 = new long[] { 100, (byte) -1, 1 };
        long[] longArray8 = new long[] { 0L, 100L, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (-1));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        short[] shortArray3 = new short[] { (byte) -1, (short) 10 };
        short[] shortArray8 = new short[] { (byte) 0, (short) 10, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray3, shortArray8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        long[] longArray2 = new long[] { 1 };
        long[] longArray9 = new long[] { (short) 100, 10L, 0L, 'a', (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray2, longArray9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus6 = simpleIndexQueryParserTests0.ensureGreen(strArray4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        char[] charArray0 = new char[] {};
        char[] charArray5 = new char[] { '4', 'a', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests2.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum13, postingsEnum14, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) (byte) -1, (java.lang.Object) postingsEnum13);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues4 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", 10, numericDocValues4, numericDocValues5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray2);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray9, strArray15 };
        java.util.Set<java.lang.String[]> strArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 'a', (java.lang.Object) (short) 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        int[] intArray1 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, (byte) 100, (short) 1, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 10.0f, (double) (short) 1);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray15 = new java.lang.String[][] { strArray8, strArray14 };
        java.util.Set<java.lang.String[]> strArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray1, byteArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        char[] charArray4 = new char[] { ' ', '#', '#', ' ' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) 1, (long) (short) 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", (int) (byte) 0, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        long[] longArray0 = new long[] {};
        long[] longArray3 = new long[] { (byte) -1, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) 0L, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        short[] shortArray5 = new short[] { (byte) 100, (byte) 1, (short) 0, (short) 0, (short) 1 };
        short[] shortArray12 = new short[] { (byte) 1, (short) 0, (short) 100, (short) -1, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 10.0f);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        float[] floatArray3 = new float[] { (short) 1, 100 };
        float[] floatArray6 = new float[] { 0, 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray3, floatArray6, (float) (byte) 1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        long[] longArray7 = new long[] { (byte) 100, 100L, 0L, (byte) -1, ' ', 0L };
        long[] longArray10 = new long[] { 1L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray7, longArray10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("tests.failfast", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) (byte) 1, postingsEnum16, postingsEnum17);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests20.assertFieldsEquals("tests.failfast", indexReader23, fields24, fields25, false);
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests20.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (byte) 1, postingsEnum33, postingsEnum34);
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        java.lang.Object[] objArray38 = new java.lang.Object[] { ruleChain19, simpleIndexQueryParserTests20 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", objArray2, objArray38);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.client.Client client0 = org.elasticsearch.test.ElasticsearchSingleNodeTest.client();
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray2, doubleArray3, (double) (short) 100);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "tests.maxfailures", boolean3, simpleIndexQueryParserTests4, "tests.nightly" };
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj8 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", objArray7, objArray9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        float[] floatArray2 = new float[] { 0.0f, 100 };
        float[] floatArray4 = new float[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) 0L);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        long[] longArray5 = new long[] { (byte) 0, 10, '4', (byte) -1, 1L };
        long[] longArray12 = new long[] { '4', (-1), 1L, 100, 0L, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        long[] longArray1 = new long[] { 1L };
        long[] longArray6 = new long[] { '#', (byte) -1, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray6, strArray12 };
        java.util.Set<java.lang.String[]> strArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray17);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray17);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader5, 1, postingsEnum7, postingsEnum8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0L, (java.lang.Object) postingsEnum8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        short[] shortArray5 = new short[] { (byte) 100, (short) -1, (short) 100, (byte) -1, (short) -1 };
        short[] shortArray10 = new short[] { (byte) -1, (byte) 0, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) (short) 1);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (short) 100, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1L, obj1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        java.util.Set<java.lang.String[]> strArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.Object[] objArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, objArray14);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 10.0f, (double) (short) 100, 0.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) '#', 10L);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "tests.nightly", "tests.monster", "random", "hi!", "tests.failfast" };
        java.util.List<java.lang.CharSequence> charSequenceList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, charSequenceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) charSequenceList18);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (short) 1);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray2, objArray4);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        char[] charArray6 = new char[] { '4', ' ', '#', '4', 'a' };
        char[] charArray13 = new char[] { '#', '4', '4', 'a', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray6, charArray13);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray3 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) (short) 100);
        double[] doubleArray7 = new double[] { 0.0d };
        double[] doubleArray9 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray9, (double) (short) 100);
        double[] doubleArray13 = new double[] { 0.0d };
        double[] doubleArray15 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray15, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray15, (double) '#');
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) (-1));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) 10, (long) 0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 0.0d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        int[] intArray7 = new int[] { (byte) 10, 10, '4', (short) 1, (short) 10, '#' };
        int[] intArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray7, intArray8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray3 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) (short) 100);
        double[] doubleArray9 = new double[] { (byte) 10, (-1.0d), 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray9, 100.0d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 1L, (double) (-1.0f));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (-1));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        char[] charArray1 = new char[] {};
        char[] charArray4 = new char[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) locale1, (java.lang.Object) "node_s_0");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        char[] charArray5 = new char[] { ' ', '4', ' ', 'a' };
        char[] charArray6 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray5, charArray6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        short[] shortArray5 = new short[] { (short) 0, (short) -1, (byte) -1, (short) 0, (short) 0 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 100, (short) 0, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) 100, (-1L));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray3 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) (short) 100);
        double[] doubleArray7 = new double[] { 0.0d };
        double[] doubleArray9 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray9, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray9, (double) '#');
        double[] doubleArray17 = new double[] { 1, 0.0f, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray17, (double) 100L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 'a');
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        int[] intArray3 = new int[] { '#', (short) 0 };
        int[] intArray10 = new int[] { 1, (short) 0, 100, (short) -1, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray3, intArray10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 0, 10L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray1, intArray3);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (byte) 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        java.util.Set<java.lang.String[]> strArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests14.assertFieldsEquals("tests.failfast", indexReader17, fields18, fields19, false);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        java.lang.String str23 = simpleIndexQueryParserTests14.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum25, postingsEnum26, true);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray30 = new org.junit.rules.RuleChain[] { ruleChain29 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet31 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) ruleChainArray30);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", (int) (short) 100, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        char[] charArray4 = new char[] { 'a', '#', 'a', 'a' };
        char[] charArray10 = new char[] { '4', ' ', '4', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray10);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        long[] longArray3 = new long[] { (-1L), (-1L) };
        long[] longArray7 = new long[] { (-1L), 1L, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray3, longArray7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        short[] shortArray6 = new short[] { (short) 10, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray3 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) (short) 100);
        double[] doubleArray7 = new double[] { 0.0d };
        double[] doubleArray9 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray9, (double) (short) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) (-1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests10.assertDocValuesEquals("tests.maxfailures", (int) (byte) -1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100L, (long) 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100.0f);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        java.lang.Iterable[] iterableArray11 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray12 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray11;
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) strComparableIterableSet13);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.setUp();
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain22);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests17.setIndexWriterMaxDocs((int) '4');
        java.lang.String str22 = simpleIndexQueryParserTests17.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) str22);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray16 = new org.junit.rules.RuleChain[] { ruleChain15 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet17 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray16, (java.lang.Object[]) executorServiceArray18);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests19.assertFieldsEquals("tests.failfast", indexReader22, fields23, fields24, false);
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        java.lang.String str28 = simpleIndexQueryParserTests19.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum30, postingsEnum31, true);
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain17, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader6, terms7, terms8, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) ' ');
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray26 = new java.lang.String[][] { strArray19, strArray25 };
        java.util.Set<java.lang.String[]> strArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ' ', (java.lang.Object) strArray26);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        float[] floatArray5 = new float[] { '4', 100, (byte) 10, 0.0f };
        float[] floatArray12 = new float[] { (byte) -1, (short) 10, (short) 100, (-1L), '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray5, floatArray12, (float) '4');
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", (int) '4', numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 100.0f, (double) 1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests7.assertFieldsEquals("tests.failfast", indexReader10, fields11, fields12, false);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) 1, postingsEnum20, postingsEnum21);
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.ensureCleanedUp();
        simpleIndexQueryParserTests24.ensureCleanedUp();
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests24.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.setUp();
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        simpleIndexQueryParserTests34.assertFieldsEquals("tests.failfast", indexReader37, fields38, fields39, false);
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests34.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader45, (int) (byte) 1, postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests34.setUp();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray52 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests0, simpleIndexQueryParserTests7, simpleIndexQueryParserTests24, simpleIndexQueryParserTests29, simpleIndexQueryParserTests34 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet53 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray52);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) elasticsearchSingleNodeTestArray52, (java.lang.Object[]) executorServiceArray55);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        char[] charArray2 = new char[] { '4', '4' };
        char[] charArray5 = new char[] { '#', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1), (double) 10L, (double) 10.0f);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 10L, (double) 1L);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.Object obj9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, obj9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { 10L, (-1), 1L, (byte) 1, (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 100, 0.0d, (double) ' ');
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        float[] floatArray5 = new float[] { 1, (short) 10, 0.0f, 0.0f, (byte) 100 };
        float[] floatArray10 = new float[] { (-1), (byte) 1, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) 100L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        int[] intArray6 = new int[] { (short) -1, 'a', 'a', 'a', (short) 1 };
        int[] intArray9 = new int[] { (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray6, intArray9);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (short) 100);
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) '#');
        double[] doubleArray17 = new double[] { 0.0d };
        double[] doubleArray19 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray19, (double) (short) 100);
        double[] doubleArray23 = new double[] { 0.0d };
        double[] doubleArray25 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray25, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray11, doubleArray25, 0.0d);
        double[] doubleArray33 = new double[] { 0.0d };
        double[] doubleArray35 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray35, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray33, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 1, (java.lang.Object) doubleArray33);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        char[] charArray7 = new char[] { ' ', 'a', ' ', '4', 'a', 'a' };
        char[] charArray10 = new char[] { 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", charArray7, charArray10);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) 1, postingsEnum15, postingsEnum16);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        short[] shortArray3 = new short[] { (short) 1, (short) 1 };
        short[] shortArray9 = new short[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray3, shortArray9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray3 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) (short) 100);
        double[] doubleArray7 = new double[] { 0.0d };
        double[] doubleArray9 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray9, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray9, (double) '#');
        double[] doubleArray16 = new double[] { 0.0d };
        double[] doubleArray18 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray18, (double) (short) 100);
        double[] doubleArray22 = new double[] { 0.0d };
        double[] doubleArray24 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray24, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray24, (double) '#');
        double[] doubleArray31 = new double[] { 0.0d };
        double[] doubleArray33 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray33, (double) (short) 100);
        double[] doubleArray37 = new double[] { 0.0d };
        double[] doubleArray39 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray39, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray39, (double) '#');
        double[] doubleArray45 = new double[] { 0.0d };
        double[] doubleArray47 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray47, (double) (short) 100);
        double[] doubleArray51 = new double[] { 0.0d };
        double[] doubleArray53 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray53, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray53, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray39, doubleArray53, 0.0d);
        double[] doubleArray61 = new double[] { 0.0d };
        double[] doubleArray63 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray63, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray61, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray16, doubleArray39, 100.0d);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray39, (double) 1L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.nightly", "tests.monster", "random", "hi!", "tests.failfast" };
        java.util.List<java.lang.CharSequence> charSequenceList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, charSequenceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) executorServiceArray9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (short) 10, (double) (short) 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        long[] longArray2 = new long[] { 4, (byte) -1 };
        long[] longArray9 = new long[] { (-1), (byte) 100, 100, 3, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        short[] shortArray2 = new short[] { (short) -1, (short) 100 };
        short[] shortArray5 = new short[] { (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (short) 100);
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) '#');
        double[] doubleArray18 = new double[] { 0.0d };
        double[] doubleArray20 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray20, (double) (short) 100);
        double[] doubleArray24 = new double[] { 0.0d };
        double[] doubleArray26 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray26, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray26, (double) '#');
        double[] doubleArray32 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray26, doubleArray40, 0.0d);
        double[] doubleArray48 = new double[] { 0.0d };
        double[] doubleArray50 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray50, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray48, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray26, 100.0d);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests57.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        simpleIndexQueryParserTests57.assertFieldsEquals("tests.failfast", indexReader60, fields61, fields62, false);
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests57.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) doubleArray26, (java.lang.Object) simpleIndexQueryParserTests57);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        byte[] byteArray1 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray1, byteArray7);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        short[] shortArray0 = new short[] {};
        short[] shortArray7 = new short[] { (short) -1, (byte) 100, (short) 0, (short) 100, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray7);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        short[] shortArray8 = new short[] { (short) -1, (short) 1, (short) 0, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        char[] charArray4 = new char[] { '#', '#', 'a', ' ' };
        char[] charArray11 = new char[] { ' ', 'a', ' ', 'a', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray5 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray2, charArray5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("hi!");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        long[] longArray2 = new long[] { (short) 100, (short) -1 };
        long[] longArray4 = new long[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (short) 100);
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) '#');
        double[] doubleArray18 = new double[] { 0.0d };
        double[] doubleArray20 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray20, (double) (short) 100);
        double[] doubleArray24 = new double[] { 0.0d };
        double[] doubleArray26 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray26, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray26, (double) '#');
        double[] doubleArray32 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray26, doubleArray40, 0.0d);
        double[] doubleArray48 = new double[] { 0.0d };
        double[] doubleArray50 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray50, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray48, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray26, 100.0d);
        double[] doubleArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray3, doubleArray57, (double) 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str19);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", (-1), numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 1L, (double) 1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("tests.failfast", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        java.lang.String str12 = simpleIndexQueryParserTests3.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum14, postingsEnum15, true);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("node_s_0", indexReader20, fields21, fields22, false);
        java.lang.Object[] objArray25 = new java.lang.Object[] { false };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray1, objArray25);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, 10.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) ' ');
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        int[] intArray2 = new int[] { (short) -1 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray2, intArray4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        short[] shortArray5 = new short[] { (short) 0, (byte) 100, (byte) 0, (short) 100 };
        short[] shortArray10 = new short[] { (byte) 1, (short) 1, (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        float[] floatArray6 = new float[] { '#', (byte) -1, (short) -1, 0, (short) 10 };
        float[] floatArray10 = new float[] { (byte) 10, 10L, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray6, floatArray10, (float) 1L);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        char[] charArray7 = new char[] { ' ', ' ', '#', 'a', '#', '4' };
        char[] charArray14 = new char[] { '#', '#', '#', ' ', ' ', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", charArray7, charArray14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) 100);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        double[] doubleArray3 = new double[] { (byte) 1, 0.0f };
        double[] doubleArray6 = new double[] { 0.0d };
        double[] doubleArray8 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray8, (double) (short) 100);
        double[] doubleArray12 = new double[] { 0.0d };
        double[] doubleArray14 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray14, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray14, (double) '#');
        double[] doubleArray21 = new double[] { 0.0d };
        double[] doubleArray23 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray23, (double) (short) 100);
        double[] doubleArray27 = new double[] { 0.0d };
        double[] doubleArray29 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray29, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray29, (double) '#');
        double[] doubleArray35 = new double[] { 0.0d };
        double[] doubleArray37 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray37, (double) (short) 100);
        double[] doubleArray41 = new double[] { 0.0d };
        double[] doubleArray43 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray43, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray43, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray29, doubleArray43, 0.0d);
        double[] doubleArray51 = new double[] { 0.0d };
        double[] doubleArray53 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray53, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray51, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray29, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray3, doubleArray6, (double) 10L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "tests.slow", "node_s_0", "random", "tests.failfast" };
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) strSet7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        long[] longArray1 = new long[] {};
        long[] longArray8 = new long[] { (short) 100, (short) -1, (short) 100, (byte) -1, 0L, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray1, longArray8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        char[] charArray2 = new char[] { '#' };
        char[] charArray8 = new char[] { 'a', 'a', '#', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray2, charArray8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) (byte) 1, postingsEnum24, postingsEnum25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("", indexReader28, fields29, fields30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests11.assertDocsSkippingEquals("tests.slow", indexReader34, (int) '#', postingsEnum36, postingsEnum37, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum36);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 3, (-1.0d));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        float[] floatArray1 = null;
        float[] floatArray2 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray2, (float) 10L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        long[] longArray4 = new long[] { 0L, 3, 2, (short) 10 };
        long[] longArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", (int) ' ', numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        long[] longArray5 = new long[] { (short) 0, (short) 10, 100, 0L, '4' };
        long[] longArray12 = new long[] { 4, (short) 1, 0L, 4, 4, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        short[] shortArray7 = new short[] { (byte) 0, (byte) 100, (short) -1, (short) 10, (short) 10, (byte) 1 };
        short[] shortArray8 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray7, shortArray8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        java.lang.Iterable[] iterableArray2 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray3 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray2;
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests5.assertFieldsEquals("tests.failfast", indexReader8, fields9, fields10, false);
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (byte) 1, postingsEnum18, postingsEnum19);
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests5.ruleChain;
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray27);
        java.lang.Object obj31 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray27, obj31);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.ensureCleanedUp();
        simpleIndexQueryParserTests33.ensureCleanedUp();
        simpleIndexQueryParserTests33.setUp();
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.resetCheckIndexStatus();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        simpleIndexQueryParserTests38.assertTermsEquals("tests.nightly", indexReader43, terms44, terms45, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests48.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        simpleIndexQueryParserTests48.assertFieldsEquals("tests.failfast", indexReader51, fields52, fields53, false);
        simpleIndexQueryParserTests48.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests48);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        simpleIndexQueryParserTests48.assertFieldsEquals("", indexReader59, fields60, fields61, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.ensureCleanedUp();
        simpleIndexQueryParserTests64.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests64.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests64.assertDocsSkippingEquals("node_s_0", indexReader70, (int) (short) -1, postingsEnum72, postingsEnum73, true);
        java.lang.Object[] objArray76 = new java.lang.Object[] { simpleIndexQueryParserTests5, "tests.monster", ruleChain37, true, indexReader70 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) strComparableIterableArray3, objArray76);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        java.lang.Object obj0 = new java.lang.Object();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum19, postingsEnum20, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { (short) -1, 0L, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) '4');
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests7.assertFieldsEquals("tests.failfast", indexReader10, fields11, fields12, false);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) 1, postingsEnum20, postingsEnum21);
        simpleIndexQueryParserTests7.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests7.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain25 = null;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain25;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.ensureCleanedUp();
        simpleIndexQueryParserTests27.ensureCleanedUp();
        simpleIndexQueryParserTests27.setUp();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain31;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 10, (byte) -1 };
        short[] shortArray7 = new short[] { (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 1, (double) 2);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.Object[] objArray10 = new java.lang.Object[] { simpleIndexQueryParserTests0 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests11.assertDocsSkippingEquals("node_s_0", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20, true);
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        simpleIndexQueryParserTests24.assertFieldsEquals("tests.failfast", indexReader27, fields28, fields29, false);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests24.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain32;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        simpleIndexQueryParserTests34.assertFieldsEquals("tests.failfast", indexReader37, fields38, fields39, false);
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule43 = simpleIndexQueryParserTests34.ruleChain;
        org.junit.rules.TestRule[] testRuleArray44 = new org.junit.rules.TestRule[] { ruleChain23, ruleChain32, testRule43 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet45 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray10, (java.lang.Object[]) testRuleArray44);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("node_s_0", indexReader7, (int) (short) -1, postingsEnum9, postingsEnum10, true);
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests14.assertFieldsEquals("tests.failfast", indexReader17, fields18, fields19, false);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        simpleIndexQueryParserTests24.assertFieldsEquals("tests.failfast", indexReader27, fields28, fields29, false);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests24.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule33 = simpleIndexQueryParserTests24.ruleChain;
        org.junit.rules.TestRule[] testRuleArray34 = new org.junit.rules.TestRule[] { ruleChain13, ruleChain22, testRule33 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet35 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray34);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) testRuleArray34, (java.lang.Object[]) executorServiceArray41);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, objArray10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (byte) 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (-1), numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        char[] charArray3 = new char[] { 'a', ' ', '#' };
        char[] charArray5 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        float[] floatArray6 = new float[] { (-1L), 2, 2, 10, 1.0f, (byte) 10 };
        float[] floatArray9 = new float[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray9, (float) (byte) 10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray1, charArray3);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (short) -1, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        long[] longArray1 = new long[] { '4' };
        long[] longArray4 = new long[] { 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        int[] intArray3 = new int[] { (short) 1, (-1), '4' };
        int[] intArray10 = new int[] { 3, (short) 100, (byte) 100, '#', (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray10);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) ' ');
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0.0f);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        long[] longArray3 = new long[] { (byte) 0, 0 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray3, longArray4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("tests.failfast", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        java.lang.String str12 = simpleIndexQueryParserTests3.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum14, postingsEnum15, true);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray19 = new org.junit.rules.RuleChain[] { ruleChain18 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet20 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) ruleChainArray19);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        java.util.concurrent.ExecutorService[][] executorServiceArray6 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray3, executorServiceArray5 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests8.assertTermsEquals("tests.nightly", indexReader13, terms14, terms15, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests18);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("", indexReader29, fields30, fields31, true);
        simpleIndexQueryParserTests18.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.ensureCleanedUp();
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests35.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str41 = simpleIndexQueryParserTests35.getTestName();
        java.lang.Object[] objArray44 = new java.lang.Object[] { simpleIndexQueryParserTests18, simpleIndexQueryParserTests35, 10.0d, "random" };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, objArray44);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        short[] shortArray3 = new short[] { (short) 100, (byte) 1 };
        short[] shortArray4 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray3, shortArray4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        double[] doubleArray14 = new double[] { 0.0d };
        double[] doubleArray16 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray16, (double) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray16);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        float[] floatArray6 = new float[] { (-1.0f), (-1), ' ', (byte) 100, 1L, 100 };
        float[] floatArray9 = new float[] { 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray9, (float) (-1));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        short[] shortArray5 = new short[] { (byte) 0, (short) 0, (short) -1, (short) 100, (byte) -1 };
        short[] shortArray9 = new short[] { (byte) 100, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray9);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray16 = new org.junit.rules.RuleChain[] { ruleChain15 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet17 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray16, (java.lang.Object[]) executorServiceArray23);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', 10L);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests4.assertFieldsEquals("tests.failfast", indexReader7, fields8, fields9, false);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, (int) (byte) 1, postingsEnum17, postingsEnum18);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) boolean3, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) '4');
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests21.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, false);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.awaitsfix", indexReader32, (int) 'a', postingsEnum34, postingsEnum35);
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests21.assertDocsEnumEquals("tests.failfast", postingsEnum39, postingsEnum40, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (short) 100);
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) '#');
        double[] doubleArray17 = new double[] { 0.0d };
        double[] doubleArray19 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray19, (double) (short) 100);
        double[] doubleArray23 = new double[] { 0.0d };
        double[] doubleArray25 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray25, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray11, doubleArray25, 0.0d);
        double[] doubleArray34 = new double[] { 0.0d };
        double[] doubleArray36 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray36, (double) (short) 100);
        double[] doubleArray41 = new double[] { 0.0d };
        double[] doubleArray43 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray43, (double) (short) 100);
        double[] doubleArray47 = new double[] { 0.0d };
        double[] doubleArray49 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray49, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray49, (double) '#');
        double[] doubleArray56 = new double[] { 0.0d };
        double[] doubleArray58 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray58, (double) (short) 100);
        double[] doubleArray62 = new double[] { 0.0d };
        double[] doubleArray64 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray64, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray64, (double) '#');
        double[] doubleArray70 = new double[] { 0.0d };
        double[] doubleArray72 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray72, (double) (short) 100);
        double[] doubleArray76 = new double[] { 0.0d };
        double[] doubleArray78 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray76, doubleArray78, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray78, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray64, doubleArray78, 0.0d);
        double[] doubleArray86 = new double[] { 0.0d };
        double[] doubleArray88 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray86, doubleArray88, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray86, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray41, doubleArray64, 100.0d);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray34, doubleArray64, 10.0d);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray25, doubleArray34, 1.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        short[] shortArray1 = new short[] { (byte) 10 };
        short[] shortArray8 = new short[] { (short) 100, (byte) 100, (short) 1, (byte) 1, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray8);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader35, terms36, terms37, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms36);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) ' ');
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        short[] shortArray1 = null;
        short[] shortArray6 = new short[] { (byte) 10, (byte) 10, (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.overrideTestDefaultQueryCache();
        java.lang.Object[] objArray7 = new java.lang.Object[] { byteArray3, simpleIndexQueryParserTests5 };
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        java.util.concurrent.ExecutorService[][] executorServiceArray14 = new java.util.concurrent.ExecutorService[][] { executorServiceArray9, executorServiceArray11, executorServiceArray13 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", objArray7, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.awaitsfix", indexReader13, (int) 'a', postingsEnum15, postingsEnum16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray0, (java.lang.Object) 'a');
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        java.util.Set<java.lang.String[]> strArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) executorServiceArray15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus8 = simpleIndexQueryParserTests0.ensureGreen(strArray6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 4, (double) 10L, (double) 1.0f);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray22, byteArray23);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray27, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) byteArray23);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', 100L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        char[] charArray7 = new char[] { '#', '4', '4', 'a', ' ', 'a' };
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray7, charArray8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) -1, (double) ' ', (double) 10L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray3, byteArray8);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray13, byteArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray8, byteArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (short) -1);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain12);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testInQuery();
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("", indexReader23, (int) (byte) 100, postingsEnum25, postingsEnum26);
        simpleIndexQueryParserTests20.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests20);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        float[] floatArray3 = new float[] { 1L, 1.0f, 4 };
        float[] floatArray7 = new float[] { (short) 0, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests8.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests8.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain34);
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain34;
        double[] doubleArray40 = new double[] { 0.0d };
        double[] doubleArray42 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray42, (double) (short) 100);
        double[] doubleArray46 = new double[] { 0.0d };
        double[] doubleArray48 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray48, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray48, (double) '#');
        double[] doubleArray54 = new double[] { 0.0d };
        double[] doubleArray56 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray56, (double) (short) 100);
        double[] doubleArray60 = new double[] { 0.0d };
        double[] doubleArray62 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray62, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray62, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray48, doubleArray62, 0.0d);
        double[] doubleArray70 = new double[] { 0.0d };
        double[] doubleArray72 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray72, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray70, (double) 10.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests77.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Fields fields81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        simpleIndexQueryParserTests77.assertFieldsEquals("tests.failfast", indexReader80, fields81, fields82, false);
        org.junit.rules.RuleChain ruleChain85 = simpleIndexQueryParserTests77.failureAndSuccessEvents;
        java.lang.String str86 = simpleIndexQueryParserTests77.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        simpleIndexQueryParserTests77.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum88, postingsEnum89, true);
        org.junit.rules.RuleChain ruleChain92 = simpleIndexQueryParserTests77.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0f, (java.lang.Object) ruleChain92);
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain92;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain92;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain92);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (-1.0d), (double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1.0f, (double) (short) 10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader17);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray6 = new char[] { '4', '#', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        short[] shortArray4 = new short[] { (byte) 10, (short) -1, (short) 1, (byte) 100 };
        short[] shortArray7 = new short[] { (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 100.0d, (double) (byte) 1, (double) '4');
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray6 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.nightly", "tests.monster", "random", "hi!", "tests.failfast" };
        java.util.List<java.lang.CharSequence> charSequenceList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, charSequenceArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "tests.slow", "node_s_0", "random", "tests.failfast" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) strArray13);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (-1.0f));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        float[] floatArray5 = new float[] { (-1), 10.0f, (byte) 10, (short) 1, 10.0f };
        float[] floatArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) ' ');
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        short[] shortArray4 = new short[] { (short) 1, (short) -1, (short) 1 };
        short[] shortArray11 = new short[] { (byte) 10, (byte) -1, (short) 0, (byte) -1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray4, shortArray11);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (byte) 10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (-1L), 0.0d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (short) 1, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        short[] shortArray3 = new short[] { (byte) 0, (short) 0, (short) 1 };
        short[] shortArray9 = new short[] { (short) 1, (short) 10, (byte) 0, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass10 = simpleIndexQueryParserTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray2 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray1;
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray2);
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.failfast", indexReader11, fields12, fields13, false);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        java.lang.String str17 = simpleIndexQueryParserTests8.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum19, postingsEnum20, true);
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray24 = new org.junit.rules.RuleChain[] { ruleChain23 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet25 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray24);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) ruleChainArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strComparableIterableArray2, (java.lang.Object[]) ruleChainArray24);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) ' ', (double) (short) 1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 1.0f, (double) 1);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        java.lang.Class<?> wildcardClass20 = simpleIndexQueryParserTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) wildcardClass20);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 1.0f, (double) 10.0f);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("", indexReader4, (int) (byte) 100, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        java.util.Set<java.lang.String[]> strArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests14.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("node_s_0", indexReader20, (int) (short) -1, postingsEnum22, postingsEnum23, true);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        simpleIndexQueryParserTests27.assertFieldsEquals("tests.failfast", indexReader30, fields31, fields32, false);
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain35;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        simpleIndexQueryParserTests37.assertFieldsEquals("tests.failfast", indexReader40, fields41, fields42, false);
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule46 = simpleIndexQueryParserTests37.ruleChain;
        org.junit.rules.TestRule[] testRuleArray47 = new org.junit.rules.TestRule[] { ruleChain26, ruleChain35, testRule46 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet48 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) testRuleArray47);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) ' ', postingsEnum10, postingsEnum11, false);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "random");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "tests.slow", "node_s_0", "random", "tests.failfast" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) 1.0f, (java.lang.Object) strArray7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        int[] intArray1 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray6);
        org.junit.Assert.assertArrayEquals(intArray1, intArray6);
        int[] intArray11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray6, intArray11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray10 = new char[] { '#', '#', 'a', 'a', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (short) 1, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 0.0f, (double) (short) -1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray2, charArray4);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        java.util.Set<java.lang.String[]> strArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray12);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArray12, (java.lang.Object) testRuleIgnoreAfterMaxFailures15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (-1L));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        float[] floatArray3 = new float[] { (byte) 1, 100.0f };
        float[] floatArray5 = new float[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray3, floatArray5, (float) 1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray3);
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray3, obj7);
        java.lang.Iterable[] iterableArray10 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray11 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray10;
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strComparableIterableArray11);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.lang.Iterable[] iterableArray11 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray12 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray11;
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray12);
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) strComparableIterableArray12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        long[] longArray3 = new long[] { 0L, 10, 0L };
        long[] longArray5 = new long[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        short[] shortArray4 = new short[] { (byte) 1, (short) 100, (short) 1 };
        short[] shortArray8 = new short[] { (byte) -1, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        float[] floatArray6 = new float[] { 1, (short) -1, 0L, (byte) 0, (byte) -1, (-1L) };
        float[] floatArray9 = new float[] { (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray9, (float) 100L);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) '4');
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests21.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, false);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (byte) 1, postingsEnum34, postingsEnum35);
        java.lang.String str37 = simpleIndexQueryParserTests21.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests21, (java.lang.Object) 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "tests.nightly", "tests.monster", "random", "hi!", "tests.failfast" };
        java.util.List<java.lang.CharSequence> charSequenceList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, charSequenceArray7);
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) charSequenceArray7, objArray9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 10, (long) 3);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        short[] shortArray6 = new short[] { (short) 100, (byte) 1, (short) 1, (short) 1, (byte) -1, (short) 1 };
        short[] shortArray7 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray21 = new java.lang.String[][] { strArray14, strArray20 };
        java.util.Set<java.lang.String[]> strArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) strArray21);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (-1.0d), 1.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        short[] shortArray6 = new short[] { (byte) -1, (short) -1, (short) 0, (short) 10, (short) 0 };
        short[] shortArray7 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray6, shortArray7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.junit.rules.TestRule testRule1 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule1;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) testRule1);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (byte) 10);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        float[] floatArray1 = null;
        float[] floatArray4 = new float[] { (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray4, (float) 10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0, (double) 10.0f, (-1.0d));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "tests.slow", "node_s_0", "random", "tests.failfast" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray3);
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray3, obj7);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        float[] floatArray2 = new float[] { 10.0f };
        float[] floatArray8 = new float[] { (-1L), 2, (byte) -1, (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray8, (float) 4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader10, 3, postingsEnum12, postingsEnum13);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        short[] shortArray2 = new short[] { (byte) 100 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray2, shortArray3);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        java.lang.Iterable[] iterableArray2 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray3 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray2;
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) strComparableIterableArray3, (java.lang.Object[]) executorServiceArray6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 1, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.lang.Iterable[] iterableArray15 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray16 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray15;
        strComparableIterableArray16[0] = strComparableSet5;
        strComparableIterableArray16[1] = strComparableSet9;
        strComparableIterableArray16[2] = strComparableSet13;
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray33);
        java.lang.Iterable[] iterableArray36 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray37 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray36;
        strComparableIterableArray37[0] = strComparableSet26;
        strComparableIterableArray37[1] = strComparableSet30;
        strComparableIterableArray37[2] = strComparableSet34;
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray50);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray54);
        java.lang.Iterable[] iterableArray57 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray58 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray57;
        strComparableIterableArray58[0] = strComparableSet47;
        strComparableIterableArray58[1] = strComparableSet51;
        strComparableIterableArray58[2] = strComparableSet55;
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray71);
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet76 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray75);
        java.lang.Iterable[] iterableArray78 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray79 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray78;
        strComparableIterableArray79[0] = strComparableSet68;
        strComparableIterableArray79[1] = strComparableSet72;
        strComparableIterableArray79[2] = strComparableSet76;
        java.lang.Iterable[][] iterableArray87 = new java.lang.Iterable[4][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray88 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray87;
        strComparableIterableArray88[0] = strComparableIterableArray16;
        strComparableIterableArray88[1] = strComparableIterableArray37;
        strComparableIterableArray88[2] = strComparableIterableArray58;
        strComparableIterableArray88[3] = strComparableIterableArray79;
        java.util.List<java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]> comparableIterableArrayList97 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, strComparableIterableArray88);
        java.lang.Object[] objArray98 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) strComparableIterableArray88, objArray98);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray2);
        java.lang.Object obj6 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray2, obj6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray13, strArray19 };
        java.util.Set<java.lang.String[]> strArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray20);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray1, charArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray5);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        float[] floatArray3 = new float[] { (byte) 1, 100, 3 };
        float[] floatArray7 = new float[] { 10L, (byte) -1, 1L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, 0.0f);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        long[] longArray6 = new long[] { 3, '#', (short) 10, 4, 4 };
        long[] longArray8 = new long[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray6, longArray8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4, executorServiceArray6 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray11);
        java.lang.Object obj15 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray11, obj15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (byte) 1);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray4);
        java.lang.Object obj8 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray4, obj8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray4);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) 1, postingsEnum15, postingsEnum16);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests20.assertFieldsEquals("tests.failfast", indexReader23, fields24, fields25, false);
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests20.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (byte) 1, postingsEnum33, postingsEnum34);
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("", indexReader38, 10, postingsEnum40, postingsEnum41);
        java.lang.String str43 = simpleIndexQueryParserTests20.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests20.assertDocsEnumEquals("node_s_0", postingsEnum45, postingsEnum46, true);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests20.assertTermsEquals("node_s_0", indexReader50, terms51, terms52, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) ruleChain18, (java.lang.Object) simpleIndexQueryParserTests20);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 1L, (long) (byte) 10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (short) 100);
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) '#');
        double[] doubleArray17 = new double[] { 0.0d };
        double[] doubleArray19 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray19, (double) (short) 100);
        double[] doubleArray23 = new double[] { 0.0d };
        double[] doubleArray25 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray25, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray11, doubleArray25, 0.0d);
        double[] doubleArray33 = new double[] { 0.0d };
        double[] doubleArray35 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray35, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray33, (double) 10.0f);
        double[] doubleArray42 = new double[] { 0.0d };
        double[] doubleArray44 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray44, (double) (short) 100);
        double[] doubleArray48 = new double[] { 0.0d };
        double[] doubleArray50 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray50, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray50, (double) '#');
        double[] doubleArray56 = new double[] { 0.0d };
        double[] doubleArray58 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray58, (double) (short) 100);
        double[] doubleArray62 = new double[] { 0.0d };
        double[] doubleArray64 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray64, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray64, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray50, doubleArray64, 0.0d);
        double[] doubleArray72 = new double[] { 0.0d };
        double[] doubleArray74 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray74, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray72, (double) 10.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", doubleArray11, doubleArray72, (double) (short) 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray38 = new java.lang.String[][] { strArray31, strArray37 };
        java.util.Set<java.lang.String[]> strArraySet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) strArraySet39);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttling0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 0, (double) ' ', (double) (-1.0f));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        short[] shortArray2 = new short[] { (short) 0, (byte) 10 };
        short[] shortArray6 = new short[] { (short) 10, (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 100, (long) (byte) -1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        long[] longArray4 = new long[] { 10L, 10, (short) 100, 0 };
        long[] longArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests20.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests20);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        short[] shortArray2 = new short[] { (byte) 1, (byte) 1 };
        short[] shortArray7 = new short[] { (short) 10, (byte) 1, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, (double) (-1L));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        short[] shortArray1 = new short[] { (byte) 1 };
        short[] shortArray8 = new short[] { (byte) 0, (byte) 10, (short) 1, (short) 10, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        short[] shortArray1 = new short[] { (byte) -1 };
        short[] shortArray8 = new short[] { (short) 1, (byte) 1, (byte) -1, (byte) -1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        long[] longArray7 = new long[] { (byte) 100, (byte) 0, 10L, (short) 100, 100, 2 };
        long[] longArray10 = new long[] { 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray7, longArray10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        float[] floatArray1 = new float[] {};
        float[] floatArray5 = new float[] { 1.0f, (short) 1, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray5, (float) (byte) 10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("", indexReader6, (int) (byte) 100, postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests3.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", (int) (short) 1, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 4);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        long[] longArray4 = new long[] { (short) 100, 100L, (short) -1 };
        long[] longArray6 = new long[] { 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray6);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray0 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] {};
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray1 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] {};
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray2 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] {};
        org.elasticsearch.test.ElasticsearchSingleNodeTest[][] elasticsearchSingleNodeTestArray3 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[][] { elasticsearchSingleNodeTestArray0, elasticsearchSingleNodeTestArray1, elasticsearchSingleNodeTestArray2 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest[]> elasticsearchSingleNodeTestArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests5.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str11 = simpleIndexQueryParserTests5.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests12.assertFieldsEquals("tests.failfast", indexReader15, fields16, fields17, false);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader23, (int) (byte) 1, postingsEnum25, postingsEnum26);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests29.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.ensureCleanedUp();
        simpleIndexQueryParserTests34.ensureCleanedUp();
        simpleIndexQueryParserTests34.setUp();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests39.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        simpleIndexQueryParserTests39.assertFieldsEquals("tests.failfast", indexReader42, fields43, fields44, false);
        org.junit.rules.RuleChain ruleChain47 = simpleIndexQueryParserTests39.failureAndSuccessEvents;
        simpleIndexQueryParserTests39.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests39.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader50, (int) (byte) 1, postingsEnum52, postingsEnum53);
        simpleIndexQueryParserTests39.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests39.setUp();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray57 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests5, simpleIndexQueryParserTests12, simpleIndexQueryParserTests29, simpleIndexQueryParserTests34, simpleIndexQueryParserTests39 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet58 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) elasticsearchSingleNodeTestArray3, (java.lang.Object[]) elasticsearchSingleNodeTestArray57);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        short[] shortArray1 = new short[] { (byte) -1 };
        short[] shortArray7 = new short[] { (byte) 100, (short) -1, (byte) 100, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        long[] longArray3 = new long[] { 10, (byte) -1, (-1) };
        long[] longArray6 = new long[] { (byte) 1, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        short[] shortArray3 = new short[] { (byte) 10, (short) 1, (byte) 100 };
        short[] shortArray8 = new short[] { (short) -1, (byte) 0, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.awaitsfix", indexReader29, (int) 'a', postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests18.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.monster", indexReader40, fields41, fields42, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) indexReader40);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 1, (byte) 10, (short) 0, (byte) 10, (byte) 0 };
        short[] shortArray12 = new short[] { (byte) -1, (short) 10, (short) 100, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray12);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("hi!", charArray2, charArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) charArray2);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        float[] floatArray5 = new float[] { 1L, '#', (byte) 100, 3 };
        float[] floatArray11 = new float[] { 100.0f, (byte) 1, (byte) 100, '4', 0.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray5, floatArray11, 0.0f);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) '4');
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader20, (int) (short) 1, postingsEnum22, postingsEnum23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader27, (-1), postingsEnum29, postingsEnum30, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        simpleIndexQueryParserTests33.assertFieldsEquals("tests.failfast", indexReader36, fields37, fields38, false);
        simpleIndexQueryParserTests33.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests33.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        simpleIndexQueryParserTests43.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests33, (java.lang.Object) simpleIndexQueryParserTests43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests33);
    }
}

