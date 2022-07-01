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
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (byte) 10);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, (double) 10.0f, (double) 0L);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        int[] intArray1 = new int[] {};
        int[] intArray5 = new int[] { 1, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) (short) 10, (java.lang.Object) 1.0d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        long[] longArray5 = new long[] { (byte) 10, (byte) 100, 1L, (byte) 0, (-1L) };
        long[] longArray8 = new long[] { 0L, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) 1L);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 0, (long) (short) 10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        long[] longArray4 = new long[] { 10L, 'a', 1L, 100 };
        long[] longArray9 = new long[] { (-1L), 10, (-1L), '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        double[] doubleArray3 = new double[] { 0L, (short) -1, 1.0d };
        double[] doubleArray5 = new double[] { 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (byte) 10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        long[] longArray3 = new long[] { ' ', (short) 0 };
        long[] longArray8 = new long[] { (short) -1, (short) 1, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray8);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 10, (short) 1 };
        short[] shortArray10 = new short[] { (byte) 10, (byte) -1, (byte) 100, (short) 100, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 1.0f);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("hi!");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.awaitsfix", "hi!", "random");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 1, (double) 100, (double) (short) 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum2, postingsEnum3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) -1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        char[] charArray1 = new char[] { '#' };
        char[] charArray6 = new char[] { '#', '#', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.badapples", "tests.nightly", "tests.weekly");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 0L);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        int[] intArray2 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { 10, (byte) -1, '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray2, intArray7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1.0f, (double) 1L);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        float[] floatArray6 = new float[] { '#', (short) 1, 100.0f, (-1), 0, (short) 100 };
        float[] floatArray8 = new float[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray8, (float) (byte) -1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (short) 100, 0L);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) executorServiceArray8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (short) 0, (float) ' ', (float) (short) 1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (long) 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 'a');
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', (short) -1, synonymsAnalysisTest2, 100.0f, "" };
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray11, (java.lang.Object[]) executorServiceArray12);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10L, (double) (short) 10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        float[] floatArray7 = new float[] { 1, 1L, (byte) 100, 'a', 1.0f, 1L };
        float[] floatArray10 = new float[] { (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray7, floatArray10, (float) 10L);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        char[] charArray5 = new char[] { ' ', '4', 'a', '4' };
        char[] charArray10 = new char[] { '4', '4', '4', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray5, charArray10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        short[] shortArray1 = new short[] {};
        short[] shortArray5 = new short[] { (short) 100, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 100, 0L);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (short) -1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) ' ');
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.badapples", "", "tests.monster");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        int[] intArray6 = new int[] { (-1), (byte) 1, 0, ' ', 1 };
        int[] intArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray6, intArray7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        double[] doubleArray2 = new double[] { (short) 0 };
        double[] doubleArray9 = new double[] { (byte) 1, 'a', 10, 1.0d, (-1), 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray2, doubleArray9, (double) 100.0f);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum3, postingsEnum4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        long[] longArray1 = new long[] {};
        long[] longArray8 = new long[] { 0, (short) 100, 100L, '4', ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray1, longArray8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("", true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) (short) 0, (java.lang.Object) (short) -1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, 0L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray3, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (int) (byte) 10, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        float[] floatArray6 = new float[] { '4', 0.0f, 'a', 100, 100.0f };
        float[] floatArray13 = new float[] { 100, '4', 10, 1.0f, 10.0f, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray13, (float) (byte) -1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (long) (short) 10, (long) 10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 100, (short) 100 };
        short[] shortArray8 = new short[] { (byte) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) (short) 100, obj2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        short[] shortArray9 = new short[] { (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        float[] floatArray1 = new float[] { '4' };
        float[] floatArray2 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray6, byteArray12);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100L, 3, 1L, (-1L), 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray6, (double) 10L);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        long[] longArray4 = new long[] { (byte) 10, 3, (-1) };
        long[] longArray8 = new long[] { (byte) 0, (short) 10, 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", longArray4, longArray8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        long[] longArray0 = null;
        long[] longArray1 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { ' ', 100, 0, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.monster", "tests.badapples", "europarl.lines.txt.gz");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) charSequenceArray11);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        char[] charArray2 = new char[] { 'a', '4' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "hi!", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1 };
        short[] shortArray8 = new short[] { (byte) 100, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) 100, (float) (byte) 1, (float) (short) -1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        float[] floatArray3 = new float[] { 0L, 2, 1.0f };
        float[] floatArray8 = new float[] { (short) 10, (short) -1, (-1.0f), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, (float) 0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 4, (long) (byte) 10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        int[] intArray3 = new int[] { 1, 100, 100 };
        int[] intArray8 = new int[] { '4', 0, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray1, longArray3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        long[] longArray3 = new long[] { (-1L), ' ' };
        long[] longArray7 = new long[] { 0L, 3, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray3, longArray7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (byte) -1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        int[] intArray6 = new int[] { 0, 3, 0, (byte) 10, (short) 100 };
        int[] intArray11 = new int[] { 1, (short) 0, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray6, intArray11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        int[] intArray7 = new int[] { 1, ' ', 'a', (byte) 100, 2, 'a' };
        int[] intArray8 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray7, intArray8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        long[] longArray5 = new long[] { (short) 10, (byte) 100, (-1L), '4', 'a' };
        long[] longArray7 = new long[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) 'a', (java.lang.Object) (short) 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.badapples", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16);
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest19.assertFieldsEquals("random", indexReader30, fields31, fields32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        synonymsAnalysisTest19.assertTermsEquals("tests.weekly", indexReader36, terms37, terms38, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) ruleChain18, (java.lang.Object) false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 100, (double) 100, (double) (-1L));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { 0, 'a', 2, (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        float[] floatArray1 = new float[] {};
        float[] floatArray4 = new float[] { 10L, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray1, floatArray4, 1.0f);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        int[] intArray1 = null;
        int[] intArray7 = new int[] { ' ', (short) 1, (byte) 0, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        double[] doubleArray6 = new double[] { '4', 100L, 1.0d, 10.0d, 0, 'a' };
        double[] doubleArray11 = new double[] { 10L, 10, 1, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray11, 0.0d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) (-1L), (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        float[] floatArray1 = new float[] { (short) 100 };
        float[] floatArray3 = new float[] { 1L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, (float) 1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService11);
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", obj1, (java.lang.Object) eSLogger13);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) testRule10, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        synonymsAnalysisTest13.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest13.setanalysisService(analysisService24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) analysisService24);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 10.0d, (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        short[] shortArray13 = new short[] { (byte) 10, (short) 0, (byte) 0, (byte) 0, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray13);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        double[] doubleArray3 = new double[] { 0.0f, (byte) 1 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray3, doubleArray4, (double) 3);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        long[] longArray5 = new long[] { (short) 10, (-1), 2, ' ', 1 };
        long[] longArray12 = new long[] { 0L, 100, (short) 0, (byte) 1, (-1L), 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        float[] floatArray3 = new float[] { 10, 1L, (byte) -1 };
        float[] floatArray10 = new float[] { '4', (byte) 0, ' ', 100, 10L, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray10, 100.0f);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray42);
        java.util.Collection[] collectionArray45 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray46 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray45;
        charSequenceCollectionArray46[0] = charSequenceList19;
        charSequenceCollectionArray46[1] = charSequenceList27;
        charSequenceCollectionArray46[2] = charSequenceList35;
        charSequenceCollectionArray46[3] = charSequenceList43;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) charSequenceCollectionArray46);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        synonymsAnalysisTest0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.ensureCheckIndexPassed();
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        long[] longArray7 = new long[] { 2, 10L, 10L, 2, 5, 1L };
        long[] longArray13 = new long[] { 10L, 0, (short) 1, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray7, longArray13);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) '4', (long) 10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.failfast", obj1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100L, (double) '#', 100.0d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList9 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray40);
        java.util.List[] listArray43 = new java.util.List[5];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.CharSequence>[] charSequenceListArray44 = (java.util.List<java.lang.CharSequence>[]) listArray43;
        charSequenceListArray44[0] = charSequenceList9;
        charSequenceListArray44[1] = charSequenceList17;
        charSequenceListArray44[2] = charSequenceList25;
        charSequenceListArray44[3] = charSequenceList33;
        charSequenceListArray44[4] = charSequenceList41;
        java.util.List<java.util.List<java.lang.CharSequence>> charSequenceListList55 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, charSequenceListArray44);
        java.lang.Object[] objArray56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceListArray44, objArray56);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("tests.badapples", indexReader14, (int) (short) 10, postingsEnum16, postingsEnum17);
        java.lang.String str19 = synonymsAnalysisTest2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) 10, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (-1L));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.nightly", postingsEnum4, postingsEnum5, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        java.lang.Object obj4 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, obj4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest8.assertDocsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest8.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) (-1), (java.lang.Object) synonymsAnalysisTest8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj4, (java.lang.Object) "hi!");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1.0d, (double) (short) 100, (double) 1);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 100, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        float[] floatArray7 = new float[] { (byte) 1, (-1L), 10L, 100.0f, (short) -1, 100L };
        float[] floatArray14 = new float[] { (-1), 100L, 1L, 100, (-1.0f), 0.0f };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray7, floatArray14, (float) (short) 1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 0, (double) (-1L));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray5, byteArray11);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest22.assertDocsSkippingEquals("hi!", indexReader25, 0, postingsEnum27, postingsEnum28, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest22.analysisService;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest22.assertFieldsEquals("random", indexReader33, fields34, fields35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        synonymsAnalysisTest22.assertTermsEquals("tests.weekly", indexReader39, terms40, terms41, false);
        synonymsAnalysisTest22.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest46.setUp();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest46.assertDocsSkippingEquals("hi!", indexReader49, 0, postingsEnum51, postingsEnum52, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = synonymsAnalysisTest46.analysisService;
        org.junit.rules.RuleChain ruleChain56 = synonymsAnalysisTest46.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        synonymsAnalysisTest46.assertPositionsSkippingEquals("tests.badapples", indexReader58, (int) (short) 10, postingsEnum60, postingsEnum61);
        org.junit.rules.RuleChain ruleChain63 = synonymsAnalysisTest46.failureAndSuccessEvents;
        synonymsAnalysisTest22.failureAndSuccessEvents = ruleChain63;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.weekly", (java.lang.Object) synonymsAnalysisTest22);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        char[] charArray7 = new char[] { '#', '#', 'a', 'a', ' ', 'a' };
        char[] charArray13 = new char[] { ' ', '4', ' ', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray7, charArray13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum3, postingsEnum4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray6, byteArray12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest18.assertFieldsEquals("tests.failfast", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) analysisService25);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, 0.0d, (double) (short) 10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        long[] longArray6 = new long[] { (byte) 1, 10, 4, (short) 100, (byte) -1 };
        long[] longArray13 = new long[] { 10, 'a', (short) 10, '#', (byte) 0, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 0L, (double) (short) -1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        float[] floatArray7 = new float[] { (byte) 100, 0, 1L, 100, 1, (byte) -1 };
        float[] floatArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray7, floatArray8, 1.0f);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { (short) 10, 4, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) (short) 0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        long[] longArray1 = new long[] {};
        long[] longArray4 = new long[] { 10L, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray1, longArray4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray7 = new double[] { (-1L), (short) 10, 10, 100L, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray1, doubleArray7, (double) 0L);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        short[] shortArray2 = new short[] { (short) 0, (byte) 10 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', 10L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        int[] intArray7 = new int[] { (byte) 1, '#', (short) 100, 3, (byte) 10, ' ' };
        int[] intArray8 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray7, intArray8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList24 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList40 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray39);
        java.util.List[] listArray42 = new java.util.List[5];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.CharSequence>[] charSequenceListArray43 = (java.util.List<java.lang.CharSequence>[]) listArray42;
        charSequenceListArray43[0] = charSequenceList8;
        charSequenceListArray43[1] = charSequenceList16;
        charSequenceListArray43[2] = charSequenceList24;
        charSequenceListArray43[3] = charSequenceList32;
        charSequenceListArray43[4] = charSequenceList40;
        java.util.List<java.util.List<java.lang.CharSequence>> charSequenceListList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, charSequenceListArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        int[] intArray7 = new int[] { 100, 100, (short) 0, '#', '4', (short) -1 };
        int[] intArray8 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray7, intArray8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.nightly");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 5, (double) 4, (double) 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        short[] shortArray3 = new short[] { (byte) 10, (short) 1, (short) 1 };
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        int[] intArray3 = new int[] { 10, (byte) 100, (short) 100 };
        int[] intArray7 = new int[] { '#', '#', 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray6 = new short[] { (byte) -1, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray2, shortArray6);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.maxfailures", (java.lang.Object) 100L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        char[] charArray6 = new char[] { ' ', ' ', ' ', 'a', '#', '4' };
        char[] charArray13 = new char[] { ' ', ' ', '4', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        char[] charArray7 = new char[] { 'a', 'a', ' ', 'a', ' ', '4' };
        char[] charArray11 = new char[] { ' ', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray7, charArray11);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.failfast", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) analysisService7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray20, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) executorServiceArray8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) "tests.failfast", (java.lang.Object) 1.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        double[] doubleArray7 = new double[] { (-1L), 10.0f, 100L, 1.0f, 0.0f, 100.0f };
        double[] doubleArray13 = new double[] { (byte) 1, 1.0d, '#', 0.0d, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray7, doubleArray13, (double) 10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray1, doubleArray3, 1.0d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray2, (java.lang.Object) (-1.0f));
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest8.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest8.assertDocsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest8.analysisService;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest8.assertFieldsEquals("random", indexReader19, fields20, fields21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        synonymsAnalysisTest8.assertTermsEquals("tests.weekly", indexReader25, terms26, terms27, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean7, (java.lang.Object) indexReader25);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest1.analysisService = analysisService13;
        java.lang.Object obj15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) analysisService13, obj15);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        float[] floatArray4 = new float[] { (byte) 100, 10.0f, 3 };
        float[] floatArray10 = new float[] { '4', ' ', 5, 1.0f, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray4, floatArray10, 1.0f);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, (double) 3, (double) 10.0f);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        double[] doubleArray3 = new double[] { 100.0d, (short) 100 };
        double[] doubleArray10 = new double[] { (-1.0f), 1L, (byte) 10, 100, 100L, 0.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 100, (byte) -1, (short) 100, (byte) -1 };
        short[] shortArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray6, shortArray7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) '4');
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (byte) 0, (-1.0d));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (-1.0d), (double) (short) 1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        double[] doubleArray4 = new double[] { 10.0f, 100.0d, (-1) };
        double[] doubleArray11 = new double[] { 100, 10.0d, 100.0d, (short) -1, 10, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray4, doubleArray11, (double) (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 100, (short) 10 };
        short[] shortArray9 = new short[] { (byte) 100, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (short) 1);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.weekly", indexReader18, terms19, terms20, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService23);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest25.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest25.analysisService = analysisService27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        synonymsAnalysisTest25.assertTermsEquals("enwiki.random.lines.txt", indexReader30, terms31, terms32, true);
        synonymsAnalysisTest25.tearDown();
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        double[] doubleArray7 = new double[] { 100, 100.0f, 100L, 100.0f, (byte) -1, 'a' };
        double[] doubleArray10 = new double[] { ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray7, doubleArray10, (double) 4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest0.analysisService = analysisService12;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        float[] floatArray4 = new float[] { 2, (byte) 10, (short) 10 };
        float[] floatArray9 = new float[] { 100.0f, 10, 0, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray4, floatArray9, (float) ' ');
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList24 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray31);
        java.util.Collection[] collectionArray34 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray35 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray34;
        charSequenceCollectionArray35[0] = charSequenceList8;
        charSequenceCollectionArray35[1] = charSequenceList16;
        charSequenceCollectionArray35[2] = charSequenceList24;
        charSequenceCollectionArray35[3] = charSequenceList32;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest45.assertDocsEnumEquals("tests.badapples", postingsEnum47, postingsEnum48, true);
        synonymsAnalysisTest45.ensureAllSearchContextsReleased();
        synonymsAnalysisTest45.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest55.setUp();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        synonymsAnalysisTest55.assertDocsSkippingEquals("hi!", indexReader58, 0, postingsEnum60, postingsEnum61, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService64 = null;
        synonymsAnalysisTest55.setanalysisService(analysisService64);
        org.elasticsearch.common.logging.ESLogger eSLogger66 = synonymsAnalysisTest55.logger;
        java.lang.Object obj67 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest55, obj67);
        org.junit.rules.TestRule testRule69 = synonymsAnalysisTest55.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest70 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest70.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger72 = synonymsAnalysisTest70.logger;
        synonymsAnalysisTest70.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray74 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest45, synonymsAnalysisTest55, synonymsAnalysisTest70 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet75 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) charSequenceCollectionArray35, (java.lang.Object[]) synonymsAnalysisTestArray74);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray3, byteArray5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) 0.0f, (double) 100);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        float[] floatArray3 = new float[] { 5, 1.0f, (short) -1 };
        float[] floatArray6 = new float[] { (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray6, (float) 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest8.assertDocsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest8.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest8);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest8.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger17);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray1, longArray3);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        int[] intArray4 = new int[] { 2, '4', 2 };
        int[] intArray9 = new int[] { (byte) 100, (-1), 2, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray4, intArray9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        float[] floatArray3 = new float[] { 0, 10.0f };
        float[] floatArray7 = new float[] { 10L, 10.0f, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray3, floatArray7, (float) (byte) -1);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertDocsSkippingEquals("hi!", indexReader8, 0, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest5.setanalysisService(analysisService14);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest5.logger;
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest5, obj17);
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest5.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) testRule19);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        int[] intArray4 = new int[] { (byte) 100, (short) 100, (byte) 100 };
        int[] intArray11 = new int[] { 4, (short) 0, 3, (short) -1, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        int[] intArray2 = new int[] { 100, 0 };
        int[] intArray9 = new int[] { (byte) 1, 3, '4', 'a', (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.badapples", false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 100);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        double[] doubleArray4 = new double[] { (short) -1, 10.0d, (byte) 10 };
        double[] doubleArray11 = new double[] { (-1.0d), 10, 0.0f, (short) 1, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray4, doubleArray11, (double) 1L);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.weekly", "europarl.lines.txt.gz", "tests.maxfailures");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (byte) 1, (float) ' ');
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        char[] charArray6 = new char[] { ' ', '#', '#', 'a', 'a', '4' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        short[] shortArray3 = new short[] { (short) -1, (byte) 0 };
        short[] shortArray5 = new short[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (-1), (long) 5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) (-1), (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str15 = synonymsAnalysisTest14.getTestName();
        java.lang.String str16 = synonymsAnalysisTest14.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (-1), (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0.0f, 0.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 1.0f);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        java.lang.Object obj22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, obj22);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray6 = new char[] { 'a', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray2, charArray6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain29;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain29);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray1, doubleArray2, (double) 0.0f);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService9);
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest12.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        int[] intArray5 = new int[] { (short) -1, (short) 0, (short) -1, (byte) -1, 3 };
        int[] intArray8 = new int[] { '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        synonymsAnalysisTest13.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest13.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.badapples", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33);
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain35;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) ruleChain11, (java.lang.Object) ruleChain35);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (byte) 100, (long) 1);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray9, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        int[] intArray5 = new int[] { 'a', 5, 'a', (byte) 0, 0 };
        int[] intArray8 = new int[] { 4, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        int[] intArray4 = new int[] { 0, (byte) 10, (-1), '#' };
        int[] intArray7 = new int[] { 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        char[] charArray6 = new char[] { 'a', 'a', '4', '4', 'a', '4' };
        char[] charArray8 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        long[] longArray4 = new long[] { (byte) 1, 0L, 10L };
        long[] longArray6 = new long[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray4, longArray6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 100, (double) 5, (double) (byte) 1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 'a');
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        long[] longArray1 = new long[] { 5 };
        long[] longArray5 = new long[] { 0, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) 1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17, true);
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest14.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) eSLogger13, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 2, (double) (-1.0f));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        double[] doubleArray4 = new double[] { 1L, 100.0f, 0.0f };
        double[] doubleArray6 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray4, doubleArray6, (double) 100);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, 100L);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (-1.0d));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        long[] longArray2 = new long[] { 1L };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray2, longArray3);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList23 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray30);
        java.util.Collection[] collectionArray33 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray34 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray33;
        charSequenceCollectionArray34[0] = charSequenceList7;
        charSequenceCollectionArray34[1] = charSequenceList15;
        charSequenceCollectionArray34[2] = charSequenceList23;
        charSequenceCollectionArray34[3] = charSequenceList31;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray34);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray51, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray63, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray77, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] { executorService83 };
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        java.util.concurrent.ExecutorService executorService88 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] { executorService88 };
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        boolean boolean91 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray89, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray84, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceCollectionArray34, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray5, byteArray12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("<unknown>", true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        float[] floatArray1 = null;
        float[] floatArray5 = new float[] { 1, (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray1, floatArray5, (float) 1L);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        short[] shortArray6 = new short[] { (byte) -1, (short) 1, (short) 1, (short) 100, (byte) 10 };
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray6, shortArray12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        java.lang.Object obj1 = new java.lang.Object();
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        short[][] shortArray9 = new short[][] { shortArray3, shortArray4, shortArray5, shortArray6, shortArray7, shortArray8 };
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        short[][] shortArray16 = new short[][] { shortArray10, shortArray11, shortArray12, shortArray13, shortArray14, shortArray15 };
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        short[][] shortArray23 = new short[][] { shortArray17, shortArray18, shortArray19, shortArray20, shortArray21, shortArray22 };
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        short[][] shortArray30 = new short[][] { shortArray24, shortArray25, shortArray26, shortArray27, shortArray28, shortArray29 };
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        short[][] shortArray37 = new short[][] { shortArray31, shortArray32, shortArray33, shortArray34, shortArray35, shortArray36 };
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        short[][] shortArray44 = new short[][] { shortArray38, shortArray39, shortArray40, shortArray41, shortArray42, shortArray43 };
        short[][][] shortArray45 = new short[][][] { shortArray9, shortArray16, shortArray23, shortArray30, shortArray37, shortArray44 };
        java.util.List<short[][]> shortArrayList46 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, shortArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", obj1, (java.lang.Object) shortArrayList46);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) -1, (long) 100);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 100, (double) 100.0f, (double) 1.0f);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        int[] intArray6 = new int[] { (short) 1, (byte) 1, (short) 1, 2, 0 };
        int[] intArray9 = new int[] { 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray6, intArray9);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (-1L), (long) (short) 1);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) '#');
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", 3, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.lang.Object[] objArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray2, objArray13);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.failfast", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.slow", 1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray4 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (-1.0d));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        long[] longArray5 = new long[] { 'a', 10L, '4', 100, 1L };
        long[] longArray11 = new long[] { (byte) 100, 4, 0, 1L, 4 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray11);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 0, (long) (byte) 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { (short) 10, (short) 100, 100.0d, (-1.0d), ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 10.0d, (double) (short) 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray27);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        short[][] shortArray46 = new short[][] { shortArray40, shortArray41, shortArray42, shortArray43, shortArray44, shortArray45 };
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        short[][] shortArray53 = new short[][] { shortArray47, shortArray48, shortArray49, shortArray50, shortArray51, shortArray52 };
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        short[][] shortArray60 = new short[][] { shortArray54, shortArray55, shortArray56, shortArray57, shortArray58, shortArray59 };
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        short[][] shortArray67 = new short[][] { shortArray61, shortArray62, shortArray63, shortArray64, shortArray65, shortArray66 };
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        short[][] shortArray74 = new short[][] { shortArray68, shortArray69, shortArray70, shortArray71, shortArray72, shortArray73 };
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        short[][] shortArray81 = new short[][] { shortArray75, shortArray76, shortArray77, shortArray78, shortArray79, shortArray80 };
        short[][][] shortArray82 = new short[][][] { shortArray46, shortArray53, shortArray60, shortArray67, shortArray74, shortArray81 };
        java.util.List<short[][]> shortArrayList83 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, shortArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) shortArray82);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) -1, 0L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        double[] doubleArray2 = new double[] { 5 };
        double[] doubleArray8 = new double[] { '#', 10.0d, 10, 100.0f, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray2, doubleArray8, 1.0d);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        java.lang.Object obj1 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray9, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray21, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray34, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", obj1, (java.lang.Object) executorServiceArray9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.failfast", indexReader14, fields15, fields16, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) -1, (java.lang.Object) fields16);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (-1.0f), (float) 100, (float) (byte) 1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest6.analysisService;
        synonymsAnalysisTest6.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (-1), '#', 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest2.getlogger();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, true);
        synonymsAnalysisTest2.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) 2, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.lang.Object obj13 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray2, obj13);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray18);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("hi!", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest10.assertFieldsEquals("random", indexReader21, fields22, fields23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest10.assertTermsEquals("tests.weekly", indexReader27, terms28, terms29, false);
        synonymsAnalysisTest10.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest34.setUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest34.assertDocsSkippingEquals("hi!", indexReader37, 0, postingsEnum39, postingsEnum40, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest34.analysisService;
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest34.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest34.assertPositionsSkippingEquals("tests.badapples", indexReader46, (int) (short) 10, postingsEnum48, postingsEnum49);
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain51;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain51);
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", 4, numericDocValues56, numericDocValues57);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { (short) 1, (-1L), (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) (byte) -1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        byte[] byteArray0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        int[] intArray3 = new int[] { (short) 10, '4', (byte) 100 };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) '4', (double) (short) 0, (double) 10L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        double[] doubleArray4 = new double[] { 100L, (byte) 100, 100 };
        double[] doubleArray7 = new double[] { 0, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray4, doubleArray7, (double) (short) 10);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        float[] floatArray5 = new float[] { 1L, (-1.0f), 10L, 1.0f };
        float[] floatArray9 = new float[] { 10.0f, 1L, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray5, floatArray9, (float) 3);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        int[] intArray6 = new int[] { (short) 100, (byte) -1, (byte) 1, ' ', 10 };
        int[] intArray11 = new int[] { 10, '4', 2, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray6, intArray11);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest9.assertDocsEnumEquals("tests.badapples", postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest9.ensureAllSearchContextsReleased();
        synonymsAnalysisTest9.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.badapples", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33);
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain35;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain35);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray5, (java.lang.Object) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) '#');
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService8);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.awaitsfix", indexReader11, terms12, terms13, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) (-1), 10.0d, (double) 100.0f);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        double[] doubleArray2 = new double[] { 5, 0.0f };
        double[] doubleArray8 = new double[] { 3, (byte) 0, 1L, (short) 10, 0.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray8, (double) (byte) 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        char[] charArray3 = new char[] { 'a', ' ', '#' };
        char[] charArray6 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 0L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray37, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray49, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray49);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray11);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        float[] floatArray5 = new float[] { 1, (byte) 0, 4, (byte) 10 };
        float[] floatArray10 = new float[] { 5, (short) 10, 0L, 1.0f };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray5, floatArray10, (float) (byte) -1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray6);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray6, objArray8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        float[] floatArray6 = new float[] { (short) 100, 100, (short) 1, (-1.0f), 5 };
        float[] floatArray8 = new float[] { (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray6, floatArray8, (float) (byte) 1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 100L, (float) 0L, (float) (byte) 10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        float[] floatArray1 = new float[] {};
        float[] floatArray6 = new float[] { (byte) 1, 10, 10L, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray1, floatArray6, 0.0f);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 1L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        org.junit.Assert.assertArrayEquals("random", shortArray6, shortArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray31, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray20, (java.lang.Object) executorServiceArray31);
        short[] shortArray38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray38);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray20, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        synonymsAnalysisTest40.ensureCheckIndexPassed();
        synonymsAnalysisTest40.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest40.analysisService;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        synonymsAnalysisTest40.assertFieldsEquals("tests.weekly", indexReader46, fields47, fields48, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = synonymsAnalysisTest40.analysisService;
        synonymsAnalysisTest40.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) executorServiceArray8, (java.lang.Object) synonymsAnalysisTest40);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100, (double) 1, (double) 2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest8.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest8.assertDocsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest8.analysisService;
        synonymsAnalysisTest8.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest8.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest8.analysisService = analysisService20;
        synonymsAnalysisTest8.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        double[] doubleArray7 = new double[] { (byte) 0, 10.0f, 100.0d, 10, 10.0d, 'a' };
        double[] doubleArray11 = new double[] { (byte) 100, 10, 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray7, doubleArray11, (double) 5);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray3);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService4);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        double[] doubleArray2 = new double[] { (short) 1, 10.0d };
        double[] doubleArray8 = new double[] { (-1.0d), (-1.0f), (short) 10, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray15, (java.lang.Object) (-1.0f));
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray15);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList46 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray45);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList62 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray61);
        java.util.List[] listArray64 = new java.util.List[5];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.CharSequence>[] charSequenceListArray65 = (java.util.List<java.lang.CharSequence>[]) listArray64;
        charSequenceListArray65[0] = charSequenceList30;
        charSequenceListArray65[1] = charSequenceList38;
        charSequenceListArray65[2] = charSequenceList46;
        charSequenceListArray65[3] = charSequenceList54;
        charSequenceListArray65[4] = charSequenceList62;
        java.util.List<java.util.List<java.lang.CharSequence>> charSequenceListList76 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, charSequenceListArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) charSequenceListArray65);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 0, (double) (byte) 100);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 10.0f);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray14, (java.lang.Object) (-1.0f));
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray14);
        short[] shortArray25 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray29 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray33 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray34 = new short[][] { shortArray25, shortArray29, shortArray33 };
        java.util.List<short[]> shortArrayList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) shortArray34);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 0, 100L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 100, 0, 100, (short) 100, (-1L), '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray7, (double) 2);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        int[] intArray2 = new int[] { 0, ' ' };
        int[] intArray9 = new int[] { 'a', (short) 10, 0, 4, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        long[] longArray4 = new long[] { 3, (byte) 1, (byte) 100, '4' };
        long[] longArray11 = new long[] { (byte) 100, (short) 1, (byte) 0, (byte) 100, '4', (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 1.0d, (double) (-1.0f));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest2.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest2.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest11.analysisService;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest11.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        synonymsAnalysisTest23.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest23, (java.lang.Object) (short) 1);
        synonymsAnalysisTest23.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest29.analysisService;
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest23.failureAndSuccessEvents = ruleChain39;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest41.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest44.setUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest44.assertDocsSkippingEquals("hi!", indexReader47, 0, postingsEnum49, postingsEnum50, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest44.analysisService;
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest44.failureAndSuccessEvents;
        synonymsAnalysisTest41.failureAndSuccessEvents = ruleChain54;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest56.setUp();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        synonymsAnalysisTest56.assertDocsSkippingEquals("hi!", indexReader59, 0, postingsEnum61, postingsEnum62, true);
        org.junit.rules.TestRule testRule65 = synonymsAnalysisTest56.ruleChain;
        org.junit.rules.TestRule[] testRuleArray66 = new org.junit.rules.TestRule[] { testRule10, ruleChain21, ruleChain39, ruleChain54, testRule65 };
        java.util.List<org.junit.rules.TestRule> testRuleList67 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, testRuleArray66);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray74, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray74);
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) testRuleArray66, (java.lang.Object[]) executorServiceArray74);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        char[] charArray5 = new char[] { '4', '4', '#', ' ' };
        char[] charArray10 = new char[] { '#', '4', '#', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray5, charArray10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        double[] doubleArray4 = new double[] { 0.0f, 10.0d, 0.0f };
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray4, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest17.assertDocsEnumEquals("tests.badapples", postingsEnum19, postingsEnum20, true);
        synonymsAnalysisTest17.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        double[] doubleArray7 = new double[] { (-1), (-1.0f), (-1), 100.0d, (short) -1, (short) 100 };
        double[] doubleArray12 = new double[] { (byte) -1, 100, 'a', 100.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, (double) 1.0f);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        double[] doubleArray6 = new double[] { 100.0d, (short) 100, 100.0d, (byte) 1, 1.0d };
        double[] doubleArray13 = new double[] { (short) 0, (byte) 1, (short) -1, 0.0d, 0.0f, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray6, doubleArray13, (double) (short) 100);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0L, (double) '#', (double) (-1));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray12);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        int[] intArray0 = null;
        int[] intArray6 = new int[] { (short) 100, (byte) 10, (short) 10, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService14);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest0.getanalysisService();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", 3, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        byte[] byteArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 10L, 0.0d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray20, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray20);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray2, (java.lang.Object) 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList9 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray40);
        java.util.List[] listArray43 = new java.util.List[5];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.CharSequence>[] charSequenceListArray44 = (java.util.List<java.lang.CharSequence>[]) listArray43;
        charSequenceListArray44[0] = charSequenceList9;
        charSequenceListArray44[1] = charSequenceList17;
        charSequenceListArray44[2] = charSequenceList25;
        charSequenceListArray44[3] = charSequenceList33;
        charSequenceListArray44[4] = charSequenceList41;
        java.util.List<java.util.List<java.lang.CharSequence>> charSequenceListList55 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, charSequenceListArray44);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray62, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) charSequenceListArray44, (java.lang.Object[]) executorServiceArray57);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (short) -1);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        double[] doubleArray4 = new double[] { (byte) 0, 4, 1.0f, 0.0d };
        double[] doubleArray7 = new double[] { 1.0f, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        float[] floatArray0 = new float[] {};
        float[] floatArray7 = new float[] { 3, '#', ' ', (short) 0, 100.0f, (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray7, (float) 3);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) '#', (double) 10L, (double) 100.0f);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray16);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray35);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) shortArray40, (java.lang.Object) (-1L));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 1.0f, (double) (byte) 1);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        float[] floatArray3 = new float[] { (byte) 10, 5, (-1) };
        float[] floatArray7 = new float[] { 100L, 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) 1L);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray4);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest4.setanalysisService(analysisService13);
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) executorServiceArray2, (java.lang.Object) synonymsAnalysisTest4);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray35, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray23);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray15, (java.lang.Object) (-1.0f));
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray15, (java.lang.Object) (byte) 0);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) strArray27);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) '4', 10L);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService8);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.awaitsfix", indexReader11, terms12, terms13, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest16.assertDocsEnumEquals("tests.badapples", postingsEnum18, postingsEnum19, true);
        synonymsAnalysisTest16.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest16);
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest16.logger;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest16.assertFieldsEquals("hi!", indexReader27, fields28, fields29, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((java.lang.Object) terms12, (java.lang.Object) fields29);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray2 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, (byte) 100, 5, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "random", (java.lang.Object) analysisService8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0f, (float) 1L, (float) (byte) 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        java.lang.Object obj4 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, obj4);
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest0.analysisService = analysisService7;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest9.assertDocsEnumEquals("tests.badapples", postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest9.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("tests.weekly", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21);
        synonymsAnalysisTest9.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray14, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) executorServiceArray9);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.analysisService = analysisService3;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        float[] floatArray1 = null;
        float[] floatArray8 = new float[] { (byte) 1, 4, '#', 'a', (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray1, floatArray8, 10.0f);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        long[] longArray0 = new long[] {};
        long[] longArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        long[] longArray4 = new long[] { (byte) 100, 1L, 4 };
        long[] longArray9 = new long[] { 100L, ' ', (short) 0, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray4, longArray9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest2.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest2.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest11.analysisService;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest11.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        synonymsAnalysisTest23.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest23, (java.lang.Object) (short) 1);
        synonymsAnalysisTest23.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest29.analysisService;
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest23.failureAndSuccessEvents = ruleChain39;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest41.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest44.setUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest44.assertDocsSkippingEquals("hi!", indexReader47, 0, postingsEnum49, postingsEnum50, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest44.analysisService;
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest44.failureAndSuccessEvents;
        synonymsAnalysisTest41.failureAndSuccessEvents = ruleChain54;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest56.setUp();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        synonymsAnalysisTest56.assertDocsSkippingEquals("hi!", indexReader59, 0, postingsEnum61, postingsEnum62, true);
        org.junit.rules.TestRule testRule65 = synonymsAnalysisTest56.ruleChain;
        org.junit.rules.TestRule[] testRuleArray66 = new org.junit.rules.TestRule[] { testRule10, ruleChain21, ruleChain39, ruleChain54, testRule65 };
        java.util.List<org.junit.rules.TestRule> testRuleList67 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, testRuleArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) testRuleArray66);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray5, (java.lang.Object) (-1.0f));
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray17, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray29, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) 0.0f, (java.lang.Object) executorServiceArray17);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        char[] charArray2 = new char[] { '4' };
        char[] charArray6 = new char[] { 'a', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "hi!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest8.assertDocsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest8.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest8.assertPositionsSkippingEquals("tests.weekly", indexReader17, (int) (short) 100, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest8.setanalysisService(analysisService22);
        synonymsAnalysisTest8.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest8.getanalysisService();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        float[] floatArray2 = new float[] { (byte) 10, 1L };
        float[] floatArray8 = new float[] { 0, (byte) 1, 0, (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) (short) 10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        float[] floatArray5 = new float[] { (-1), '4', (byte) 100, 1.0f };
        float[] floatArray10 = new float[] { (byte) 0, 4, 2, '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray5, floatArray10, 10.0f);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest12.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest12.ensureAllSearchContextsReleased();
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest22.assertDocsSkippingEquals("hi!", indexReader25, 0, postingsEnum27, postingsEnum28, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = null;
        synonymsAnalysisTest22.setanalysisService(analysisService31);
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest22.logger;
        java.lang.Object obj34 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest22, obj34);
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest22.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest37.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest37.logger;
        synonymsAnalysisTest37.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest12, synonymsAnalysisTest22, synonymsAnalysisTest37 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet42 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray41);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet43 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) synonymsAnalysisTestArray41);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        int[] intArray4 = new int[] { ' ', (-1), 0 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        float[] floatArray5 = new float[] { (byte) 100, 1, 1, (byte) 1 };
        float[] floatArray9 = new float[] { 0, 100L, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray5, floatArray9, (float) 10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray5, byteArray12);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        int[] intArray5 = new int[] { 0, (-1), 1, 2, (byte) 10 };
        int[] intArray8 = new int[] { 3, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', 0.0d, (double) 3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        synonymsAnalysisTest13.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest13.assertPositionsSkippingEquals("tests.weekly", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest13.setanalysisService(analysisService27);
        synonymsAnalysisTest13.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 1.0f, 0.0f, 0.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, 0.0f);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.weekly", indexReader14, (int) (short) 100, postingsEnum16, postingsEnum17, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 100, (java.lang.Object) 2);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        double[] doubleArray2 = new double[] { (-1.0d) };
        double[] doubleArray4 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray2, doubleArray4, (double) (byte) 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (byte) 1, (float) (short) 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        double[] doubleArray2 = new double[] { ' ', 0.0f };
        double[] doubleArray4 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, 1.0d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        synonymsAnalysisTest13.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest13);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest13.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger22);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        float[] floatArray0 = new float[] {};
        float[] floatArray7 = new float[] { (byte) 1, (-1L), (-1.0f), (byte) 0, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray7, (float) 1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray9 = new int[] { 3, (byte) -1, (short) -1, 'a', 2, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        char[] charArray5 = new char[] { '4', ' ', '4', '#' };
        char[] charArray8 = new char[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray5, charArray8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, 0, postingsEnum19, postingsEnum20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum19);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) (byte) -1, (float) (-1L));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11, true);
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", 1, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray28, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray28);
        java.lang.Object[] objArray34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray7, objArray34);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader7, fields8, fields9, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("hi!", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0L, (long) (short) 10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray4);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 100, (double) (short) 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest7.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) 2, (java.lang.Object) synonymsAnalysisTest7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray21);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray26, shortArray27);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray30);
        org.junit.Assert.assertArrayEquals("random", shortArray16, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest36.setUp();
        synonymsAnalysisTest36.ensureCheckIndexPassed();
        synonymsAnalysisTest36.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest36.analysisService;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.weekly", indexReader42, fields43, fields44, false);
        synonymsAnalysisTest36.overrideTestDefaultQueryCache();
        java.lang.String str48 = synonymsAnalysisTest36.getTestName();
        synonymsAnalysisTest36.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) shortArray6, (java.lang.Object) synonymsAnalysisTest36);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", 3, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray2, (double) 4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray6);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        float[] floatArray2 = new float[] { 2 };
        float[] floatArray4 = new float[] { 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray2, floatArray4, (float) 1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        char[] charArray6 = new char[] { ' ', '4', '#', ' ', '#' };
        char[] charArray11 = new char[] { '4', '#', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray6, charArray11);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.weekly", "hi!", "random");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
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
        long[] longArray4 = new long[] { (byte) -1, (byte) 1, 100 };
        long[] longArray9 = new long[] { (short) 1, (-1), (byte) 0, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 100, (double) 0.0f);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("hi!", indexReader6, 0, postingsEnum8, postingsEnum9, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest3.analysisService;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain13;
        java.lang.Object obj15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, obj15);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray2, byteArray7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        synonymsAnalysisTest0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest11.getanalysisService();
        synonymsAnalysisTest11.overrideTestDefaultQueryCache();
        synonymsAnalysisTest11.tearDown();
        java.lang.Object obj15 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest11, obj15);
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest11.ruleChain;
        synonymsAnalysisTest11.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) '4');
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) 2);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        double[] doubleArray4 = new double[] { 'a', 10, (-1L) };
        double[] doubleArray8 = new double[] { 2, (-1L), 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", doubleArray4, doubleArray8, (double) 1.0f);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 1.0f, (double) (short) 1, 0.0d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        char[] charArray0 = null;
        char[] charArray4 = new char[] { '4', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) ' ', (double) 10L);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray1, byteArray4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        char[] charArray0 = new char[] {};
        char[] charArray5 = new char[] { '4', ' ', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        float[] floatArray3 = new float[] { (byte) 100, (byte) 0, '4' };
        float[] floatArray8 = new float[] { 10, (-1L), (short) 1, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, (float) (short) -1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        int[] intArray5 = new int[] { '4', (short) 1, (byte) 10, 3, (short) 0 };
        int[] intArray11 = new int[] { '#', 4, (-1), ' ', (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray10, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.lang.Object obj16 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray5, obj16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        short[] shortArray23 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray27 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray31 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray32 = new short[][] { shortArray23, shortArray27, shortArray31 };
        java.util.List<short[]> shortArrayList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) shortArray32);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        synonymsAnalysisTest9.ensureCheckIndexPassed();
        synonymsAnalysisTest9.ensureCleanedUp();
        synonymsAnalysisTest9.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        double[] doubleArray6 = new double[] { 10L, 0.0f, 1.0d, 100.0f, 1.0d, 1.0d };
        double[] doubleArray9 = new double[] { 10L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray9, (double) 10L);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { 4, (short) -1, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        int[] intArray3 = new int[] { 5, (byte) 0, (short) -1 };
        int[] intArray6 = new int[] { (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) '4');
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 2, (-1.0d), '#', (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray6, (double) 100);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest1.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) eSLogger8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 1, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        double[] doubleArray2 = new double[] { 100.0f };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray2, doubleArray3, (double) 4);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        short[] shortArray18 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray22 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray26 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray27 = new short[][] { shortArray18, shortArray22, shortArray26 };
        java.util.List<short[]> shortArrayList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray27);
        org.junit.Assert.assertNotSame("", (java.lang.Object) shortArray27, (java.lang.Object) "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) shortArray27);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService17);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest20.assertDocsEnumEquals("tests.badapples", postingsEnum22, postingsEnum23, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) postingsEnum23);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) ' ', 10L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        double[] doubleArray4 = new double[] { (byte) -1, 1L, 0.0f };
        double[] doubleArray9 = new double[] { (byte) 100, 1L, (-1.0d), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray4, doubleArray9, (double) (-1L));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        int[] intArray3 = new int[] { 100, 0 };
        int[] intArray7 = new int[] { 100, '4', 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray3, intArray7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0.0d, (double) 0L);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = null;
        synonymsAnalysisTest12.setanalysisService(analysisService21);
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest12.logger;
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest12, obj24);
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest12.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger29 = synonymsAnalysisTest27.logger;
        synonymsAnalysisTest27.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest2, synonymsAnalysisTest12, synonymsAnalysisTest27 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet32 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray1, (java.lang.Object[]) synonymsAnalysisTestArray31);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.logger;
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest0.ruleChain;
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray24);
        java.lang.Class<?> wildcardClass26 = charSequenceArray24.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) wildcardClass26);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        float[] floatArray5 = new float[] { 100.0f, 1, (short) 0, (short) 1, 1L };
        float[] floatArray12 = new float[] { 1, 10.0f, (-1L), (short) 10, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray12, 0.0f);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        float[] floatArray5 = new float[] { (short) 0, 0.0f, (-1L), (byte) 100, ' ' };
        float[] floatArray6 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, 1.0f);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        int[] intArray4 = new int[] { (byte) -1, 10, (byte) -1, (byte) 1 };
        int[] intArray6 = new int[] { 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        float[] floatArray1 = new float[] { 4 };
        float[] floatArray5 = new float[] { (byte) 1, 2, 0.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, (-1.0f));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        double[] doubleArray2 = new double[] { 0.0f };
        double[] doubleArray4 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray2, doubleArray4, (double) 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        float[] floatArray6 = new float[] { 5, '#', 100.0f, 0.0f, 'a', (-1L) };
        float[] floatArray11 = new float[] { (byte) 10, (-1.0f), (-1.0f), 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, 100.0f);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader10, (int) '4', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (byte) 1, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        long[] longArray3 = new long[] { (-1L), 10L };
        long[] longArray9 = new long[] { (short) 100, (-1L), (short) -1, (byte) 10, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray3, longArray9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray1, byteArray7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) '#');
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray6, obj17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray26, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray38, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray38);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray26);
        java.lang.Object[] objArray47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, objArray47);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 10, (long) 2);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        char[] charArray1 = null;
        char[] charArray6 = new char[] { '#', 'a', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray6);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 1L, (long) (short) 100);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        long[] longArray1 = new long[] {};
        long[] longArray4 = new long[] { 10L, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray1, longArray4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.badapples");
        java.lang.Object obj3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) locale2, obj3);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        int[] intArray2 = new int[] { (byte) 100, (-1) };
        int[] intArray5 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) 0, (long) 100);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) 5, 10.0f);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("hi!", indexReader6, 0, postingsEnum8, postingsEnum9, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest3.setanalysisService(analysisService12);
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest3.logger;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) executorServiceArray1, (java.lang.Object) synonymsAnalysisTest3);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest3.assertDocValuesEquals("europarl.lines.txt.gz", (-1), numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray28, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) executorServiceArray28);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        long[] longArray5 = new long[] { (short) 10, (byte) 1, (byte) 10, 0, 1L };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        long[] longArray5 = new long[] { 100, 0L, 3, (-1L) };
        long[] longArray9 = new long[] { 3, 0, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray44, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        short[] shortArray5 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray9 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray13 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray14 = new short[][] { shortArray5, shortArray9, shortArray13 };
        java.util.List<short[]> shortArrayList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray14);
        org.junit.Assert.assertNotSame("", (java.lang.Object) shortArray14, (java.lang.Object) "random");
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray25, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray37, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray50, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) shortArray14, (java.lang.Object[]) executorServiceArray45);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (byte) 1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray45, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest12.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest12.ensureAllSearchContextsReleased();
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest21.analysisService;
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest21.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest21.assertPositionsSkippingEquals("tests.badapples", indexReader33, (int) (short) 10, postingsEnum35, postingsEnum36);
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest21.failureAndSuccessEvents;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain38;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.nightly", indexReader41, fields42, fields43, false);
        synonymsAnalysisTest12.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest13.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("tests.weekly", indexReader27, (int) (short) 100, postingsEnum29, postingsEnum30, false);
        synonymsAnalysisTest13.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) executorServiceArray2, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { 4, (byte) 10, 2, 100, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10, 2, 100, (byte) 0, 3 };
        int[] intArray10 = new int[] { 2, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        double[] doubleArray4 = new double[] { (short) 100, 100.0f, 100.0f, 'a' };
        double[] doubleArray6 = new double[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray6, (double) (byte) -1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray1, intArray4);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        char[] charArray2 = new char[] { '#' };
        char[] charArray6 = new char[] { 'a', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray2, charArray6);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.getlogger();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17, true);
        synonymsAnalysisTest14.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest14.assertPositionsSkippingEquals("tests.weekly", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest14.setanalysisService(analysisService28);
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule13, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest7.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("hi!", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest7.failureAndSuccessEvents = ruleChain20;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest22.assertDocsSkippingEquals("hi!", indexReader25, 0, postingsEnum27, postingsEnum28, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest22.analysisService;
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest22.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest22.assertPositionsSkippingEquals("tests.badapples", indexReader34, (int) (short) 10, postingsEnum36, postingsEnum37);
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest22.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest7, (java.lang.Object) synonymsAnalysisTest22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest22);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray21, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray50, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray62, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) terms12, (java.lang.Object) executorServiceArray50);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.weekly", "tests.failfast", "tests.monster");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (short) -1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        long[] longArray1 = new long[] { 0 };
        long[] longArray6 = new long[] { (short) -1, (byte) 0, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 2, (float) 100, (float) 4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        char[] charArray6 = new char[] { 'a', '#', '4', 'a', 'a', ' ' };
        char[] charArray13 = new char[] { '#', '#', '#', 'a', '4', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        int[] intArray4 = new int[] { 4, '#', 5 };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray6);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        long[] longArray3 = new long[] { (byte) 1, '#', 10L };
        long[] longArray6 = new long[] { (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) '4', 10.0d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (byte) 10, (double) 10.0f, (double) 0L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray14, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray14);
        java.lang.Object obj20 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray9, obj20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray45, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) locale2, (java.lang.Object) executorServiceArray9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("hi!", indexReader20, 0, postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest17.analysisService;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest17.assertFieldsEquals("random", indexReader28, fields29, fields30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        synonymsAnalysisTest17.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, false);
        synonymsAnalysisTest17.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest41.assertDocsSkippingEquals("hi!", indexReader44, 0, postingsEnum46, postingsEnum47, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest41.analysisService;
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest41.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        synonymsAnalysisTest41.assertPositionsSkippingEquals("tests.badapples", indexReader53, (int) (short) 10, postingsEnum55, postingsEnum56);
        org.junit.rules.RuleChain ruleChain58 = synonymsAnalysisTest41.failureAndSuccessEvents;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain58;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain58;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain58;
        java.lang.Object obj62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain58, obj62);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) (short) 1, (float) (byte) -1);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("hi!", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest16.assertPositionsSkippingEquals("tests.badapples", indexReader28, (int) (short) 10, postingsEnum30, postingsEnum31);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.slow");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 1, (long) (short) 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1, (byte) 10 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray4, byteArray8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 0, (-1L));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray9, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray22, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray34, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray22);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray50, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray62, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray75, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray70);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest84 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest84.setUp();
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        synonymsAnalysisTest84.assertDocsSkippingEquals("hi!", indexReader87, 0, postingsEnum89, postingsEnum90, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService93 = null;
        synonymsAnalysisTest84.setanalysisService(analysisService93);
        org.elasticsearch.common.logging.ESLogger eSLogger95 = synonymsAnalysisTest84.logger;
        java.lang.Object obj96 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest84, obj96);
        synonymsAnalysisTest84.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray70, (java.lang.Object) synonymsAnalysisTest84);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray14);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 4, (double) '#', (double) (short) 1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.nightly", 1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest23.getlogger();
        java.lang.String str31 = synonymsAnalysisTest23.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertPathHasBeenCleared("");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0L, 1L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        short[] shortArray5 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray9 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray13 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray14 = new short[][] { shortArray5, shortArray9, shortArray13 };
        java.util.List<short[]> shortArrayList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray14);
        org.junit.Assert.assertNotSame("", (java.lang.Object) shortArray14, (java.lang.Object) "random");
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray29, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray29);
        java.lang.Object obj35 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray24, obj35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray14, (java.lang.Object[]) executorServiceArray19);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        int[] intArray3 = new int[] { 5, 2 };
        int[] intArray9 = new int[] { (byte) 0, 2, '#', (byte) 100, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray3, intArray9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray6 = new char[] { ' ', 'a', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        char[] charArray6 = new char[] { 'a', '#', 'a', 'a', '#' };
        char[] charArray9 = new char[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray6, charArray9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        int[] intArray2 = new int[] { '4' };
        int[] intArray7 = new int[] { 'a', (short) 100, 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray2, intArray7);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        int[] intArray6 = new int[] { 0, (byte) 0, 2, '4', (byte) 10 };
        int[] intArray11 = new int[] { (short) 0, ' ', 3, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray6, intArray11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray6, obj17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray30, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray42, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray61, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray61);
        java.lang.Object obj67 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray56, obj67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray56);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        char[] charArray1 = new char[] {};
        char[] charArray6 = new char[] { 'a', 'a', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray1, charArray6);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray4);
    }
}

