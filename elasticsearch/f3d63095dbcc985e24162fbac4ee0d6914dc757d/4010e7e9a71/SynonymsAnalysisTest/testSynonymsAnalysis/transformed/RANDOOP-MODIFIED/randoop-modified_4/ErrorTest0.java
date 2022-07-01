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
        org.junit.Assert.assertEquals("", (double) 0, (double) ' ');
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) "random", (java.lang.Object) (short) 10);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.NumericDocValues numericDocValues3 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (int) (short) 10, numericDocValues3, numericDocValues4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) 10L, (java.lang.Object) 'a');
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 10L, 100.0d };
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray4, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        long[] longArray6 = new long[] { 100L, ' ', 1L, 100, (byte) 1 };
        long[] longArray10 = new long[] { 1L, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray6, longArray10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (byte) -1, (double) (short) 1, (double) (short) 100);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 'a');
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", 0L, (long) (short) 0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        long[] longArray2 = new long[] { 100 };
        long[] longArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4', (short) 10 };
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals(objArray4, (java.lang.Object[]) executorServiceArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", objArray3, objArray4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) 10, (java.lang.Object) 10L);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { (byte) 100, (byte) 1, (short) 100, 10, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 'a');
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        double[] doubleArray4 = new double[] { 100, (byte) 100, '#', 0.0f };
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) 100L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        double[] doubleArray3 = new double[] { ' ', (short) 0, '#' };
        double[] doubleArray6 = new double[] { 0, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) (byte) -1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 1.0f, (float) (byte) 100, 1.0f);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) (short) 1, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", obj1, (java.lang.Object) false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.weekly", false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        short[] shortArray2 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray2, shortArray5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        long[] longArray3 = new long[] { ' ', '4' };
        long[] longArray8 = new long[] { ' ', (-1), (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        double[] doubleArray4 = new double[] { (-1.0d), 10L, (-1), 10.0f };
        double[] doubleArray8 = new double[] { 0.0d, (short) 1, (-1.0d) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) -1, (double) 100, 10.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        int[] intArray3 = new int[] { (byte) 0, (byte) 100, ' ' };
        int[] intArray10 = new int[] { 0, (byte) 1, (short) 100, (byte) 0, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 10.0d, (java.lang.Object) boolean2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        java.lang.Object[] objArray2 = new java.lang.Object[] { "tests.nightly" };
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray2, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1 };
        int[] intArray7 = new int[] { 1, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) 10.0d, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        long[] longArray6 = new long[] { 1, 1L, (byte) 10, (short) -1, (byte) 0, (byte) -1 };
        long[] longArray9 = new long[] { (-1L), ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 100, (byte) -1, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        int[] intArray5 = new int[] { '4', 100, 0, (byte) 10, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        double[] doubleArray3 = new double[] { (-1L), (byte) -1 };
        double[] doubleArray7 = new double[] { 'a', 10.0f, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray3, doubleArray7, (double) (byte) -1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        int[] intArray3 = new int[] { '4', 100, 'a' };
        int[] intArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) 1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (byte) 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        short[] shortArray3 = new short[] { (short) -1, (byte) 0 };
        short[] shortArray5 = new short[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray3, shortArray5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) '#', 100L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.junit.rules.TestRule testRule1 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) testRule1, (java.lang.Object) testRuleIgnoreAfterMaxFailures2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        java.lang.Object obj1 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) (short) 100);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        long[] longArray5 = new long[] { (byte) -1, (short) 0, 10, (byte) 10 };
        long[] longArray10 = new long[] { '4', (byte) 0, (short) 1, (-1) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray5, longArray10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray1);
        java.lang.Object[] objArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, objArray4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (byte) 0, 0.0d, (double) (short) 100);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("", true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray1, longArray3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        float[] floatArray4 = new float[] { 10.0f, '#', 1L };
        float[] floatArray10 = new float[] { (short) -1, (-1), (short) -1, 1L, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray4, floatArray10, (float) (-1));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 10.0f, (float) '#', (float) (-1L));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.junit.rules.RuleChain ruleChain13 = null;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain13;
        synonymsAnalysisTest11.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) eSLogger3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) (-1), 1.0f);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 'a', (long) (short) 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray13);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        char[] charArray0 = new char[] {};
        char[] charArray2 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        int[] intArray1 = null;
        int[] intArray8 = new int[] { (byte) 0, 1, (-1), 100, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray1, intArray8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        java.lang.Object[] objArray3 = new java.lang.Object[] { "tests.badapples", testRuleIgnoreAfterMaxFailures1 };
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 10.0f, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray3, objArray7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 1.0f, (double) (byte) -1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        int[] intArray4 = new int[] { '#', ' ', (short) -1, (short) 100 };
        int[] intArray9 = new int[] { (byte) 10, (short) 1, 1, 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest8.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger10 = synonymsAnalysisTest8.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray11);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        java.lang.Object[] objArray2 = new java.lang.Object[] { "<unknown>" };
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray8 = new java.util.concurrent.ExecutorService[][] { executorServiceArray5, executorServiceArray6, executorServiceArray7 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList9 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray14 = new java.util.concurrent.ExecutorService[][] { executorServiceArray11, executorServiceArray12, executorServiceArray13 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray14);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", objArray2, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray6 = new double[] { (byte) 1, (short) 1, (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray6, (double) (byte) 1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray6 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray4, executorServiceArray5 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][] { executorServiceArray9, executorServiceArray10, executorServiceArray11 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray12);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray12);
        java.lang.Object[] objArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray6, objArray15);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        char[] charArray2 = new char[] { '#' };
        char[] charArray6 = new char[] { 'a', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray11 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9, executorServiceArray10 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray17 = new java.util.concurrent.ExecutorService[][] { executorServiceArray14, executorServiceArray15, executorServiceArray16 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray17);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        double[] doubleArray6 = new double[] { 100, (byte) -1, 100.0d, 0.0f, 0L, (-1.0f) };
        double[] doubleArray11 = new double[] { (byte) 10, 1.0d, (short) 0, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray11, (double) (byte) 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1, (double) (byte) -1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray4, executorServiceArray5, executorServiceArray6 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray13 = new java.util.concurrent.ExecutorService[][] { executorServiceArray10, executorServiceArray11, executorServiceArray12 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray13);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        long[] longArray5 = new long[] { (byte) 10, 10, (byte) 1, '4' };
        long[] longArray8 = new long[] { (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray5, longArray8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 1, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) -1, (double) (byte) 10, (double) 10.0f);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 0L, (double) (byte) 1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray11 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9, executorServiceArray10 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum12, (java.lang.Object) 10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) '#', 100L);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        short[] shortArray5 = new short[] { (short) 1, (short) 0, (short) -1, (short) 10, (byte) 1 };
        short[] shortArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 100, (double) (-1L));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", 0.0d, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.assertPathHasBeenCleared("tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) 10.0d, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 100, 1.0d, (double) (-1.0f));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0.0f, (double) (short) 100, (-1.0d));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 1.0f, 0.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        char[] charArray4 = new char[] { '4', '#', ' ' };
        char[] charArray6 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray4, charArray6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        short[] shortArray7 = new short[] { (byte) 100, (short) -1, (byte) 100, (byte) -1, (short) 10, (short) 0 };
        short[] shortArray14 = new short[] { (short) 0, (byte) 100, (byte) 0, (byte) 0, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray7, shortArray14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        char[] charArray6 = new char[] { '4', '4', '4', 'a', ' ', ' ' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.monster", indexReader17, (int) (byte) 0, postingsEnum19, postingsEnum20, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader17, (java.lang.Object) (short) -1);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) -1, (double) (short) 100);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 0, (long) 'a');
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.weekly", true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService10);
        java.lang.Object obj12 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, obj12);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", (int) (short) 100, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        char[] charArray7 = new char[] { ' ', '4', '#', '4', ' ', ' ' };
        char[] charArray14 = new char[] { '#', ' ', ' ', ' ', ' ', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray7, charArray14);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        char[] charArray4 = new char[] { 'a', '#', ' ' };
        char[] charArray11 = new char[] { 'a', ' ', ' ', '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray4, charArray11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) analysisService8, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        double[] doubleArray6 = new double[] { 0L, 100, 1, 10.0f, 1.0d, 10.0f };
        double[] doubleArray12 = new double[] { 0.0d, (short) -1, (short) 100, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray12, (double) (short) 100);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        float[] floatArray7 = new float[] { 10.0f, 'a', (byte) 1, 100L, 10L, 0.0f };
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest12.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest12.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray8, (java.lang.Object) synonymsAnalysisTest12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray7, floatArray8, (float) 10L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        long[] longArray1 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { ' ', 0L, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        short[] shortArray2 = new short[] { (byte) -1 };
        short[] shortArray4 = new short[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray2, shortArray4);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (-1L));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        char[] charArray3 = new char[] { '4', ' ' };
        char[] charArray6 = new char[] { ' ', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", charArray3, charArray6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 10, (short) 0, (byte) 0, (byte) 0, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray2, shortArray9);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        char[] charArray3 = new char[] { '4', ' ' };
        char[] charArray7 = new char[] { '4', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray3, charArray7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, false);
        java.lang.String str19 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest12.analysisService;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) '#', postingsEnum24, postingsEnum25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("tests.monster", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest35.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger37 = synonymsAnalysisTest35.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = null;
        synonymsAnalysisTest35.analysisService = analysisService38;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest35.assertDocsEnumEquals("", postingsEnum41, postingsEnum42, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest45.assertFieldsEquals("tests.nightly", indexReader47, fields48, fields49, false);
        java.lang.String str52 = synonymsAnalysisTest45.getTestName();
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest45.failureAndSuccessEvents;
        java.lang.Object[] objArray55 = new java.lang.Object[] { synonymsAnalysisTest0, indexReader29, postingsEnum41, synonymsAnalysisTest45, "enwiki.random.lines.txt" };
        java.lang.Object[] objArray56 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals(objArray56, (java.lang.Object[]) executorServiceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray55, objArray56);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) (-1), (double) ' ');
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass1 = throttling0.getClass();
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) '4');
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) 100);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals(objArray13, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray3, (java.lang.Object) executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttling0, (java.lang.Object) "");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 1L);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray3);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1, 1.0d, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray4, (double) 100);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        short[] shortArray5 = new short[] { (byte) 0, (byte) 1, (short) 10, (byte) 1, (byte) 1 };
        short[] shortArray12 = new short[] { (short) 10, (short) 1, (byte) -1, (byte) 1, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) -1 };
        byte[] byteArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) executorServiceArray2, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray10 = new java.util.concurrent.ExecutorService[][] { executorServiceArray7, executorServiceArray8, executorServiceArray9 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList11 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray16 = new java.util.concurrent.ExecutorService[][] { executorServiceArray13, executorServiceArray14, executorServiceArray15 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray16);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", objArray1, (java.lang.Object[]) executorServiceArray16);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 10.0f);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert[] assertArray12 = new org.junit.Assert[] { synonymsAnalysisTest1 };
        java.util.Set<org.junit.Assert> assertSet13 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray12);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) '4');
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray19, (float) 100);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals(objArray25, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray15, (java.lang.Object) executorServiceArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) assertArray12, (java.lang.Object[]) executorServiceArray26);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) executorServiceArray14);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (byte) -1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (byte) 0, (double) (short) 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 10, (long) '4');
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert[] assertArray12 = new org.junit.Assert[] { synonymsAnalysisTest1 };
        java.util.Set<org.junit.Assert> assertSet13 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray18 = new java.util.concurrent.ExecutorService[][] { executorServiceArray15, executorServiceArray16, executorServiceArray17 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) assertArray12, (java.lang.Object[]) executorServiceArray18);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        long[] longArray1 = new long[] { 100L };
        long[] longArray8 = new long[] { '#', '4', (-1L), 1, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        char[] charArray1 = new char[] {};
        char[] charArray6 = new char[] { 'a', '#', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray6);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) 0, (double) (-1L), (double) 100);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum2, postingsEnum3);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 10 };
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, 0.0d, (double) 1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        int[] intArray7 = new int[] { '4', (short) -1, 'a', (short) 100, (-1), (-1) };
        int[] intArray13 = new int[] { '4', 1, 0, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray7, intArray13);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest6.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray2, (java.lang.Object) synonymsAnalysisTest6);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain10);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest17.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest17.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray13, (java.lang.Object) synonymsAnalysisTest17);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest23.assertFieldsEquals("tests.nightly", indexReader25, fields26, fields27, false);
        java.lang.String str30 = synonymsAnalysisTest23.getTestName();
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest23.failureAndSuccessEvents;
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest37.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray33, (java.lang.Object) synonymsAnalysisTest37);
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain41);
        org.junit.rules.RuleChain[] ruleChainArray44 = new org.junit.rules.RuleChain[] { ruleChain10, ruleChain21, ruleChain31, ruleChain41 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet45 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray51 = new java.util.concurrent.ExecutorService[][] { executorServiceArray48, executorServiceArray49, executorServiceArray50 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList52 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray57 = new java.util.concurrent.ExecutorService[][] { executorServiceArray54, executorServiceArray55, executorServiceArray56 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList58 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray57);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) ruleChainArray44, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100, 1.0d, (double) (short) 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        char[] charArray0 = null;
        char[] charArray5 = new char[] { '4', '4', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        char[] charArray4 = new char[] { ' ', ' ', ' ' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 100, (double) 1L);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 0, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        char[] charArray5 = new char[] { '#', '4', 'a', ' ' };
        char[] charArray12 = new char[] { '#', '#', 'a', '#', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray12);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) 1, (double) 0.0f);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.Object obj3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) boolean2, obj3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 100, (double) 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) '4');
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        long[] longArray5 = new long[] { '4', (byte) 1, (short) -1, '4' };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray5, longArray6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest1.failureAndSuccessEvents;
        java.lang.Object obj10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) ruleChain9, obj10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        char[] charArray5 = new char[] { 'a', '#', 'a', '4', ' ' };
        char[] charArray6 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (int) (short) 100, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        byte[] byteArray0 = null;
        byte[] byteArray1 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        short[] shortArray3 = new short[] { (short) 100, (byte) -1 };
        short[] shortArray10 = new short[] { (byte) 1, (short) -1, (byte) -1, (byte) 100, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) "tests.badapples", (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader13, (int) (byte) 0, postingsEnum15, postingsEnum16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) 10, (java.lang.Object) postingsEnum15);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService12);
        synonymsAnalysisTest10.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.awaitsfix", indexReader16, fields17, fields18, false);
        java.lang.Class<?> wildcardClass21 = synonymsAnalysisTest10.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest22.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest22.setanalysisService(analysisService24);
        synonymsAnalysisTest22.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.awaitsfix", indexReader28, fields29, fields30, false);
        java.lang.Class<?> wildcardClass33 = synonymsAnalysisTest22.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest34.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest34.setanalysisService(analysisService36);
        synonymsAnalysisTest34.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        synonymsAnalysisTest34.assertFieldsEquals("tests.awaitsfix", indexReader40, fields41, fields42, false);
        java.lang.Class<?> wildcardClass45 = synonymsAnalysisTest34.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest46.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = null;
        synonymsAnalysisTest46.setanalysisService(analysisService48);
        synonymsAnalysisTest46.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        synonymsAnalysisTest46.assertFieldsEquals("tests.awaitsfix", indexReader52, fields53, fields54, false);
        java.lang.Class<?> wildcardClass57 = synonymsAnalysisTest46.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass59 = throttling58.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass61 = throttling60.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray62 = new java.lang.reflect.AnnotatedElement[] { wildcardClass21, wildcardClass33, wildcardClass45, wildcardClass57, wildcardClass59, wildcardClass61 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet63 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) annotatedElementArray62);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        short[] shortArray1 = new short[] { (byte) 0 };
        short[] shortArray2 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) '4', (long) (short) -1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) -1);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("<unknown>", "random", "tests.slow");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        char[] charArray1 = new char[] {};
        char[] charArray4 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray4);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (byte) 100, 10, 10, (short) 10, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, (float) 100);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals(objArray11, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray1, (java.lang.Object) executorServiceArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.nightly", indexReader19, fields20, fields21, false);
        java.lang.String str24 = synonymsAnalysisTest17.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest17.analysisService;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("tests.nightly", indexReader27, (int) '#', postingsEnum29, postingsEnum30, true);
        synonymsAnalysisTest17.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest17.resetCheckIndexStatus();
        synonymsAnalysisTest17.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule38 = synonymsAnalysisTest17.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray44 = new java.util.concurrent.ExecutorService[][] { executorServiceArray41, executorServiceArray42, executorServiceArray43 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray50 = new java.util.concurrent.ExecutorService[][] { executorServiceArray47, executorServiceArray48, executorServiceArray49 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList51 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray50);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule38, (java.lang.Object) executorServiceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray44);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        char[] charArray3 = new char[] { '4', '#', ' ' };
        char[] charArray6 = new char[] { 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest7.assertFieldsEquals("tests.nightly", indexReader9, fields10, fields11, false);
        java.lang.String str14 = synonymsAnalysisTest7.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest7.analysisService;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("tests.nightly", indexReader17, (int) '#', postingsEnum19, postingsEnum20, true);
        synonymsAnalysisTest7.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest7.resetCheckIndexStatus();
        synonymsAnalysisTest7.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest7.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray34 = new java.util.concurrent.ExecutorService[][] { executorServiceArray31, executorServiceArray32, executorServiceArray33 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray40 = new java.util.concurrent.ExecutorService[][] { executorServiceArray37, executorServiceArray38, executorServiceArray39 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray40);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule28, (java.lang.Object) executorServiceArray34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest45.assertFieldsEquals("tests.nightly", indexReader47, fields48, fields49, false);
        java.lang.String str52 = synonymsAnalysisTest45.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest45.analysisService;
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        synonymsAnalysisTest45.assertDocsSkippingEquals("tests.nightly", indexReader55, (int) '#', postingsEnum57, postingsEnum58, true);
        synonymsAnalysisTest45.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest45.resetCheckIndexStatus();
        synonymsAnalysisTest45.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule66 = synonymsAnalysisTest45.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray72 = new java.util.concurrent.ExecutorService[][] { executorServiceArray69, executorServiceArray70, executorServiceArray71 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList73 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray72);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray78 = new java.util.concurrent.ExecutorService[][] { executorServiceArray75, executorServiceArray76, executorServiceArray77 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList79 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray78);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray78);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule66, (java.lang.Object) executorServiceArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray34);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        float[] floatArray1 = null;
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest6.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray2, (java.lang.Object) synonymsAnalysisTest6);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray11, (-1.0f));
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) '4');
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) '4');
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray25, (float) 100);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals(objArray31, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray21, (java.lang.Object) executorServiceArray32);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray21, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray17, (float) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray1, floatArray11, (float) (-1L));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("random", "random", "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray3, byteArray5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 100, (double) (short) 100, (double) '#');
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray3, executorServiceArray4 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray11 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9, executorServiceArray10 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray11);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.monster", postingsEnum14, postingsEnum15, true);
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest1.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest1.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) ruleChain9, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        char[] charArray3 = new char[] { ' ', ' ', '#' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        int[] intArray4 = new int[] { 100, 'a', '#' };
        int[] intArray9 = new int[] { (short) 0, (short) -1, 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray4, intArray9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.monster", postingsEnum15, postingsEnum16, true);
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest2.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        int[] intArray3 = new int[] { (short) 10, ' ', 1 };
        int[] intArray8 = new int[] { 1, (short) 0, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 10L, 0L);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("hi!");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.nightly");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        int[] intArray3 = new int[] { (byte) 10, 10, 10 };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1), (double) 100);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray8 = new double[] { (-1.0f), (-1.0f), (short) 1, 10L, (byte) 1, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray8, 0.0d);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        java.lang.Object obj0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray6 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray4, executorServiceArray5 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][] { executorServiceArray9, executorServiceArray10, executorServiceArray11 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray12);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray12);
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) executorServiceArray6);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 10, (double) (short) 1, (double) (short) -1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.nightly", indexReader12, fields13, fields14, false);
        java.lang.String str17 = synonymsAnalysisTest10.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("", indexReader21, (int) (byte) 0, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest10.assertTermsEquals("tests.badapples", indexReader27, terms28, terms29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        synonymsAnalysisTest10.assertTermsEquals("tests.weekly", indexReader33, terms34, terms35, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = null;
        synonymsAnalysisTest38.analysisService = analysisService39;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest38.assertFieldsEquals("tests.weekly", indexReader42, fields43, fields44, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest38.analysisService;
        synonymsAnalysisTest38.setUp();
        synonymsAnalysisTest38.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest38.assertDocsEnumEquals("tests.monster", postingsEnum51, postingsEnum52, true);
        java.lang.Object[] objArray55 = new java.lang.Object[] { terms35, synonymsAnalysisTest38 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, objArray55);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10L, 100.0d, (double) 10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain9);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest16.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest16.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray12, (java.lang.Object) synonymsAnalysisTest16);
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        java.lang.String str29 = synonymsAnalysisTest22.getTestName();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest22.failureAndSuccessEvents;
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest36.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest36.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray32, (java.lang.Object) synonymsAnalysisTest36);
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest36.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain40);
        org.junit.rules.RuleChain[] ruleChainArray43 = new org.junit.rules.RuleChain[] { ruleChain9, ruleChain20, ruleChain30, ruleChain40 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet44 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray43);
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals(objArray45, (java.lang.Object[]) executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) ruleChainArray43, objArray45);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (-1.0d), (double) 10, (double) 1);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 1.0f);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        short[] shortArray5 = new short[] { (short) -1, (short) 1, (byte) -1, (short) -1, (short) -1 };
        short[] shortArray7 = new short[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest0.assertTermsEquals("random", indexReader12, terms13, terms14, true);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum18, postingsEnum19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService23);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray29 = new java.util.concurrent.ExecutorService[][] { executorServiceArray26, executorServiceArray27, executorServiceArray28 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) analysisService23, (java.lang.Object) (short) 1);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        int[] intArray5 = new int[] { (-1), 'a', 1, 'a', (byte) 100 };
        int[] intArray8 = new int[] { (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 10.0f);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest4);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsEnumEquals("tests.slow", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest4.assertDocsAndPositionsEnumEquals("random", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 100, (double) (byte) 100);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        int[] intArray4 = new int[] { 0, (short) 0, (byte) 1, ' ' };
        int[] intArray7 = new int[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        long[] longArray4 = new long[] { 10L, (byte) -1, (-1) };
        long[] longArray6 = new long[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray4, longArray6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100, (double) (-1), (double) (byte) 1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        java.lang.Class<?> wildcardClass11 = synonymsAnalysisTest0.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest12.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest12.setanalysisService(analysisService14);
        synonymsAnalysisTest12.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.awaitsfix", indexReader18, fields19, fields20, false);
        java.lang.Class<?> wildcardClass23 = synonymsAnalysisTest12.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest24.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest24.setanalysisService(analysisService26);
        synonymsAnalysisTest24.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest24.assertFieldsEquals("tests.awaitsfix", indexReader30, fields31, fields32, false);
        java.lang.Class<?> wildcardClass35 = synonymsAnalysisTest24.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest36.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = null;
        synonymsAnalysisTest36.setanalysisService(analysisService38);
        synonymsAnalysisTest36.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.awaitsfix", indexReader42, fields43, fields44, false);
        java.lang.Class<?> wildcardClass47 = synonymsAnalysisTest36.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass49 = throttling48.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass51 = throttling50.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray52 = new java.lang.reflect.AnnotatedElement[] { wildcardClass11, wildcardClass23, wildcardClass35, wildcardClass47, wildcardClass49, wildcardClass51 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet53 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray59 = new java.util.concurrent.ExecutorService[][] { executorServiceArray56, executorServiceArray57, executorServiceArray58 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList60 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray65 = new java.util.concurrent.ExecutorService[][] { executorServiceArray62, executorServiceArray63, executorServiceArray64 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList66 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray65);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray52, (java.lang.Object[]) executorServiceArray59);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (short) 1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        long[] longArray1 = new long[] { '4' };
        long[] longArray5 = new long[] { (short) 1, (-1L), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, (double) 1, 0.0d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) ruleChain9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        double[] doubleArray4 = new double[] { 1.0d, 10L, 1, (short) -1 };
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) '#');
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        double[] doubleArray4 = new double[] { 10.0f, (short) 0, (short) 1 };
        double[] doubleArray6 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray4, doubleArray6, (double) '#');
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        short[] shortArray5 = new short[] { (byte) 100, (short) 0, (byte) 100, (byte) 100, (short) 1 };
        short[] shortArray9 = new short[] { (short) 100, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray9);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        long[] longArray7 = new long[] { 1, 'a', (byte) 10, 100L, 'a', 10 };
        long[] longArray14 = new long[] { '4', 100L, (short) 1, (-1), ' ', 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray14);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) '#', (float) 0L, (float) (-1L));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) 100);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, 100L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) 0.0f);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (-1.0f), (float) (byte) -1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray5, byteArray12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest2.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray29 = new java.util.concurrent.ExecutorService[][] { executorServiceArray26, executorServiceArray27, executorServiceArray28 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray35 = new java.util.concurrent.ExecutorService[][] { executorServiceArray32, executorServiceArray33, executorServiceArray34 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray35);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule23, (java.lang.Object) executorServiceArray29);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals(objArray40, (java.lang.Object[]) executorServiceArray41);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest44.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = null;
        synonymsAnalysisTest44.setanalysisService(analysisService46);
        synonymsAnalysisTest44.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        synonymsAnalysisTest44.assertFieldsEquals("tests.awaitsfix", indexReader50, fields51, fields52, false);
        synonymsAnalysisTest44.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) objArray40, (java.lang.Object) synonymsAnalysisTest44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray29, objArray40);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        char[] charArray1 = null;
        char[] charArray8 = new char[] { '#', ' ', '4', '4', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray1, charArray8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (short) 10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        char[] charArray0 = null;
        char[] charArray5 = new char[] { '#', ' ', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        char[] charArray0 = new char[] {};
        char[] charArray6 = new char[] { 'a', '#', '#', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        double[] doubleArray3 = new double[] { (-1L), (short) 100, 10L };
        double[] doubleArray6 = new double[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        long[] longArray3 = new long[] { (short) 10, (-1), (-1) };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 'a');
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.badapples");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.junit.rules.TestRule testRule1 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService4);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.awaitsfix", indexReader8, fields9, fields10, false);
        java.lang.Class<?> wildcardClass13 = synonymsAnalysisTest2.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest14.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest14.setanalysisService(analysisService16);
        synonymsAnalysisTest14.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.awaitsfix", indexReader20, fields21, fields22, false);
        java.lang.Class<?> wildcardClass25 = synonymsAnalysisTest14.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest26.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest26.setanalysisService(analysisService28);
        synonymsAnalysisTest26.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        synonymsAnalysisTest26.assertFieldsEquals("tests.awaitsfix", indexReader32, fields33, fields34, false);
        java.lang.Class<?> wildcardClass37 = synonymsAnalysisTest26.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest38.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = null;
        synonymsAnalysisTest38.setanalysisService(analysisService40);
        synonymsAnalysisTest38.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest38.assertFieldsEquals("tests.awaitsfix", indexReader44, fields45, fields46, false);
        java.lang.Class<?> wildcardClass49 = synonymsAnalysisTest38.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass51 = throttling50.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass53 = throttling52.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray54 = new java.lang.reflect.AnnotatedElement[] { wildcardClass13, wildcardClass25, wildcardClass37, wildcardClass49, wildcardClass51, wildcardClass53 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet55 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) testRule1, (java.lang.Object) annotatedElementArray54);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        char[] charArray6 = new char[] { '4', ' ', '4', ' ', '4', ' ' };
        char[] charArray13 = new char[] { ' ', ' ', 'a', '4', 'a', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        short[] shortArray1 = new short[] { (byte) 1 };
        short[] shortArray7 = new short[] { (byte) 1, (short) -1, (byte) 100, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest3.analysisService = analysisService4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.weekly", indexReader7, fields8, fields9, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest3.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest3.analysisService;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.lang.Object[] objArray24 = new java.lang.Object[] { synonymsAnalysisTest3, executorServiceArray17, "hi!" };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, objArray24);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 10, 0L);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 'a');
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        short[] shortArray4 = new short[] { (short) 0, (short) 1, (short) 100, (short) 10 };
        short[] shortArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 10.0d, 0.0d, (double) (short) 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (short) 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        double[] doubleArray2 = new double[] { 0L };
        double[] doubleArray8 = new double[] { (-1.0f), 10L, (byte) 10, (-1.0f), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray2, doubleArray8, (-1.0d));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest12.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest12.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray8, (java.lang.Object) synonymsAnalysisTest12);
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", obj1, (java.lang.Object) ruleChain16);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.logger;
        java.lang.String str17 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.nightly", indexReader21, fields22, fields23, false);
        java.lang.String str26 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest19.analysisService;
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.assertPathHasBeenCleared("hi!");
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest19.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) testRule31);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 100L, (float) ' ', (-1.0f));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, (float) 100);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) '4');
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) '4');
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray20, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray16, 0.0f);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest32.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest32.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray28, (java.lang.Object) synonymsAnalysisTest32);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray37, (-1.0f));
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray12, floatArray37, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray12, (float) (short) 10);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) '4');
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) '4');
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray55, (float) 100);
        java.lang.Object[] objArray61 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals(objArray61, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray51, (java.lang.Object) executorServiceArray62);
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray51, (float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) floatArray1, (java.lang.Object) floatArray47);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) analysisService10, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest4.analysisService = analysisService5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest4.assertFieldsEquals("tests.weekly", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest4.assertDocsEnumEquals("tests.maxfailures", postingsEnum14, postingsEnum15, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest4.setanalysisService(analysisService19);
        synonymsAnalysisTest4.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest4.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, true);
        java.lang.Object[] objArray28 = new java.lang.Object[] { "tests.monster", true };
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray33 = new java.util.concurrent.ExecutorService[][] { executorServiceArray30, executorServiceArray31, executorServiceArray32 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray28, (java.lang.Object[]) executorServiceArray33);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", 1, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService15);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", 0, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.monster", indexReader18, (int) (byte) 0, postingsEnum20, postingsEnum21, true);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) postingsEnum21, (java.lang.Object) "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) (short) 10, (float) 1L);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) 10L, 10.0d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        double[] doubleArray4 = new double[] { (short) -1, '4', 100 };
        double[] doubleArray7 = new double[] { 1L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray4, doubleArray7, (double) (short) 10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) 100.0f, (double) 100.0f, (double) '4');
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, (double) 1.0f, (double) (short) 100);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        short[] shortArray5 = new short[] { (short) 1, (byte) -1, (byte) 0, (byte) 0, (short) 100 };
        short[] shortArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, 1.0d, (double) (-1.0f));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 100, (double) 100, (double) 10L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        double[] doubleArray6 = new double[] { 100L, 1L, ' ', (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray9, (double) (short) 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.nightly", indexReader5, fields6, fields7, false);
        java.lang.String str10 = synonymsAnalysisTest3.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest3.analysisService;
        synonymsAnalysisTest3.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest3.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest3.setanalysisService(analysisService14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) eSLogger2, (java.lang.Object) analysisService14);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertEquals(objArray2, (java.lang.Object[]) executorServiceArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest6.setanalysisService(analysisService8);
        synonymsAnalysisTest6.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest6.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) objArray2, (java.lang.Object) synonymsAnalysisTest6);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray24 = new java.util.concurrent.ExecutorService[][] { executorServiceArray21, executorServiceArray22, executorServiceArray23 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray30 = new java.util.concurrent.ExecutorService[][] { executorServiceArray27, executorServiceArray28, executorServiceArray29 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray30);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", objArray2, (java.lang.Object[]) executorServiceArray30);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 10.0d, (double) ' ');
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest2.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray29 = new java.util.concurrent.ExecutorService[][] { executorServiceArray26, executorServiceArray27, executorServiceArray28 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray35 = new java.util.concurrent.ExecutorService[][] { executorServiceArray32, executorServiceArray33, executorServiceArray34 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray35);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule23, (java.lang.Object) executorServiceArray29);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest40.assertFieldsEquals("tests.nightly", indexReader42, fields43, fields44, false);
        java.lang.String str47 = synonymsAnalysisTest40.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest40.analysisService;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("tests.nightly", indexReader50, (int) '#', postingsEnum52, postingsEnum53, true);
        synonymsAnalysisTest40.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest40.resetCheckIndexStatus();
        synonymsAnalysisTest40.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule61 = synonymsAnalysisTest40.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray67 = new java.util.concurrent.ExecutorService[][] { executorServiceArray64, executorServiceArray65, executorServiceArray66 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray73 = new java.util.concurrent.ExecutorService[][] { executorServiceArray70, executorServiceArray71, executorServiceArray72 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList74 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray73);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule61, (java.lang.Object) executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray67);
        java.lang.Class<?> wildcardClass78 = executorServiceArray67.getClass();
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray67, (java.lang.Object) locale80);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService1);
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (float) (short) 0, 0.0f);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain3;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("", indexReader7, fields8, fields9, true);
        synonymsAnalysisTest1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.slow", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray6, (float) 100);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals(objArray12, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray2, (java.lang.Object) executorServiceArray13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest17.analysisService = analysisService18;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.weekly", indexReader21, fields22, fields23, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest17.analysisService;
        synonymsAnalysisTest17.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest17.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        synonymsAnalysisTest29.assertFieldsEquals("tests.nightly", indexReader31, fields32, fields33, false);
        java.lang.String str36 = synonymsAnalysisTest29.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest29.analysisService;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("tests.nightly", indexReader39, (int) '#', postingsEnum41, postingsEnum42, true);
        synonymsAnalysisTest29.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest29.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest17, (java.lang.Object) synonymsAnalysisTest29);
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = null;
        synonymsAnalysisTest29.setanalysisService(analysisService49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) "", (java.lang.Object) analysisService49);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.monster", indexReader17, (int) (byte) 0, postingsEnum19, postingsEnum20, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest23.getlogger();
        java.lang.String str26 = synonymsAnalysisTest23.getTestName();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest23.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) true, (java.lang.Object) ruleChain27);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        char[] charArray5 = new char[] { '4', '4', 'a', 'a' };
        char[] charArray10 = new char[] { '4', ' ', '4', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", charArray5, charArray10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 100, (double) '#', 0.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain2;
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureCleanedUp();
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) '4');
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray14, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray10, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 0.0f);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain9);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest16.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest16.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray12, (java.lang.Object) synonymsAnalysisTest16);
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        java.lang.String str29 = synonymsAnalysisTest22.getTestName();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest22.failureAndSuccessEvents;
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest36.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest36.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray32, (java.lang.Object) synonymsAnalysisTest36);
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest36.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain40);
        org.junit.rules.RuleChain[] ruleChainArray43 = new org.junit.rules.RuleChain[] { ruleChain9, ruleChain20, ruleChain30, ruleChain40 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet44 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray43);
        java.lang.Object[] objArray45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray43, objArray45);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        double[] doubleArray7 = new double[] { (short) -1, 100L, 100L, (short) 100, 0.0d, 0 };
        double[] doubleArray11 = new double[] { 1, (byte) 0, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray7, doubleArray11, (double) (short) 10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert[] assertArray12 = new org.junit.Assert[] { synonymsAnalysisTest1 };
        java.util.Set<org.junit.Assert> assertSet13 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray12);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals(objArray14, (java.lang.Object[]) executorServiceArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) assertArray12, (java.lang.Object[]) executorServiceArray15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        double[] doubleArray2 = new double[] { 1L, 1 };
        double[] doubleArray8 = new double[] { 'a', (-1), 100, (short) 10, 0.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray10, (-1.0f));
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) '4');
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray19, (float) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray19, 0.0f);
        float[] floatArray29 = new float[] { '4', 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray29, (-1.0f));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.getlogger();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.slow");
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 10, 100.0f, (float) 0L);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", (int) (byte) 1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (-1), (short) 10, (byte) 1 };
        double[] doubleArray7 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray7, (double) 1L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        double[] doubleArray3 = new double[] { ' ', 'a' };
        double[] doubleArray9 = new double[] { 10L, 100.0d, (byte) 0, (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray9, (double) 10);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        int[] intArray2 = new int[] { 1, (short) 10 };
        int[] intArray9 = new int[] { (short) 0, (short) -1, (short) 0, (byte) -1, (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        short[] shortArray5 = new short[] { (byte) 10, (short) 10, (short) -1, (byte) 100, (short) 1 };
        short[] shortArray8 = new short[] { (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        long[] longArray3 = new long[] { 100, 100L };
        long[] longArray10 = new long[] { (byte) 1, (byte) 1, (-1), '#', (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray3, longArray10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        long[] longArray4 = new long[] { 1L, '4', '#', (byte) 1 };
        long[] longArray11 = new long[] { '#', 100L, (short) -1, (byte) -1, (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) -1, (double) '4');
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        short[] shortArray7 = new short[] { (byte) 100, (short) 100, (short) 100, (byte) 0, (byte) 0, (byte) 10 };
        short[] shortArray12 = new short[] { (byte) 100, (short) 0, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray7, shortArray12);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        char[] charArray5 = new char[] { '4', '4', '#', ' ' };
        char[] charArray10 = new char[] { '#', '4', '#', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray5, charArray10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest4.match("tests.weekly", "tests.weekly", "tests.nightly");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        java.lang.Object[] objArray0 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertEquals(objArray2, (java.lang.Object[]) executorServiceArray3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals(objArray6, (java.lang.Object[]) executorServiceArray7);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray3, executorServiceArray4 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest7.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) executorServiceArrayList6, (java.lang.Object) synonymsAnalysisTest7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("", indexReader5, (int) (short) 10, postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", (int) (short) 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (-1.0f));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10L, (long) (short) 10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest2.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray29 = new java.util.concurrent.ExecutorService[][] { executorServiceArray26, executorServiceArray27, executorServiceArray28 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray35 = new java.util.concurrent.ExecutorService[][] { executorServiceArray32, executorServiceArray33, executorServiceArray34 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray35);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule23, (java.lang.Object) executorServiceArray29);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest40.assertFieldsEquals("tests.nightly", indexReader42, fields43, fields44, false);
        java.lang.String str47 = synonymsAnalysisTest40.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest40.analysisService;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("tests.nightly", indexReader50, (int) '#', postingsEnum52, postingsEnum53, true);
        synonymsAnalysisTest40.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest40.resetCheckIndexStatus();
        synonymsAnalysisTest40.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule61 = synonymsAnalysisTest40.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray67 = new java.util.concurrent.ExecutorService[][] { executorServiceArray64, executorServiceArray65, executorServiceArray66 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray73 = new java.util.concurrent.ExecutorService[][] { executorServiceArray70, executorServiceArray71, executorServiceArray72 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList74 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray73);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule61, (java.lang.Object) executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray67);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest78 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService79 = synonymsAnalysisTest78.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService80 = null;
        synonymsAnalysisTest78.setanalysisService(analysisService80);
        synonymsAnalysisTest78.ensureCleanedUp();
        synonymsAnalysisTest78.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger84 = synonymsAnalysisTest78.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest85 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest85.setUp();
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        synonymsAnalysisTest85.assertPositionsSkippingEquals("tests.nightly", indexReader88, (int) (byte) 1, postingsEnum90, postingsEnum91);
        org.elasticsearch.common.logging.ESLogger eSLogger93 = synonymsAnalysisTest85.getlogger();
        org.junit.Assert.assertNotSame((java.lang.Object) eSLogger93, (java.lang.Object) 0.0f);
        org.elasticsearch.common.logging.ESLogger[] eSLoggerArray96 = new org.elasticsearch.common.logging.ESLogger[] { eSLogger84, eSLogger93 };
        org.elasticsearch.common.logging.ESLogger[][] eSLoggerArray97 = new org.elasticsearch.common.logging.ESLogger[][] { eSLoggerArray96 };
        java.util.Set<org.elasticsearch.common.logging.ESLogger[]> eSLoggerArraySet98 = org.apache.lucene.util.LuceneTestCase.asSet(eSLoggerArray97);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) executorServiceArray29, (java.lang.Object) eSLoggerArray97);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 10.0f, (double) (byte) 10, (double) 10L);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) '4', (double) (short) 0, 0.0d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.getlogger();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain9);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest16.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest16.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray12, (java.lang.Object) synonymsAnalysisTest16);
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        java.lang.String str29 = synonymsAnalysisTest22.getTestName();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest22.failureAndSuccessEvents;
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest36.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest36.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray32, (java.lang.Object) synonymsAnalysisTest36);
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest36.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain40);
        org.junit.rules.RuleChain[] ruleChainArray43 = new org.junit.rules.RuleChain[] { ruleChain9, ruleChain20, ruleChain30, ruleChain40 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet44 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray43);
        java.lang.Object obj45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChainSet44, obj45);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (byte) 1, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.maxfailures", (int) (byte) -1, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        byte[] byteArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 0, 0.0d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "random", (java.lang.Object) eSLogger3);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray2, (java.lang.Object) 0L);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray18);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertPositionsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 1, postingsEnum12, postingsEnum13);
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest7.getlogger();
        org.junit.Assert.assertNotSame((java.lang.Object) eSLogger15, (java.lang.Object) 0.0f);
        org.elasticsearch.common.logging.ESLogger[] eSLoggerArray18 = new org.elasticsearch.common.logging.ESLogger[] { eSLogger6, eSLogger15 };
        org.elasticsearch.common.logging.ESLogger[][] eSLoggerArray19 = new org.elasticsearch.common.logging.ESLogger[][] { eSLoggerArray18 };
        java.util.Set<org.elasticsearch.common.logging.ESLogger[]> eSLoggerArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(eSLoggerArray19);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals(objArray21, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) eSLoggerArray19, (java.lang.Object[]) executorServiceArray28);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        short[] shortArray7 = new short[] { (short) 10, (short) -1, (short) -1, (byte) -1, (short) 100, (byte) 100 };
        short[] shortArray10 = new short[] { (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray7, shortArray10);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        short[] shortArray3 = new short[] { (byte) 10, (byte) 100 };
        short[] shortArray5 = new short[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray3, shortArray5);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest18.analysisService = analysisService19;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest18.assertFieldsEquals("tests.weekly", indexReader22, fields23, fields24, false);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest18.assertDocsEnumEquals("tests.nightly", postingsEnum28, postingsEnum29, false);
        synonymsAnalysisTest18.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        synonymsAnalysisTest33.assertFieldsEquals("tests.nightly", indexReader35, fields36, fields37, false);
        java.lang.String str40 = synonymsAnalysisTest33.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest33.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest42.assertFieldsEquals("tests.nightly", indexReader44, fields45, fields46, false);
        java.lang.String str49 = synonymsAnalysisTest42.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest42.analysisService;
        synonymsAnalysisTest42.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = synonymsAnalysisTest42.getanalysisService();
        synonymsAnalysisTest42.setIndexWriterMaxDocs(1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest55.setUp();
        synonymsAnalysisTest55.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest55.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest55.overrideTestDefaultQueryCache();
        float[] floatArray61 = new float[] {};
        float[] floatArray62 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray62, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest65 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService66 = synonymsAnalysisTest65.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger67 = synonymsAnalysisTest65.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray61, (java.lang.Object) synonymsAnalysisTest65);
        org.junit.rules.RuleChain ruleChain69 = synonymsAnalysisTest65.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain69;
        synonymsAnalysisTest55.failureAndSuccessEvents = ruleChain69;
        java.lang.Object[] objArray72 = new java.lang.Object[] { synonymsAnalysisTest0, synonymsAnalysisTest18, analysisService41, 1, ruleChain69 };
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray72, (java.lang.Object[]) executorServiceArray73);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        int[] intArray5 = new int[] { (byte) 10, 10, 0, 100 };
        int[] intArray12 = new int[] { (short) 1, 100, 100, (byte) 100, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray5, intArray12);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert[] assertArray12 = new org.junit.Assert[] { synonymsAnalysisTest1 };
        java.util.Set<org.junit.Assert> assertSet13 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray12);
        java.lang.Class<?> wildcardClass14 = assertArray12.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        synonymsAnalysisTest15.overrideTestDefaultQueryCache();
        synonymsAnalysisTest15.assertPathHasBeenCleared("hi!");
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest15.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) assertArray12, (java.lang.Object) eSLogger27);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (byte) -1, (double) 100);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) -1, (double) 100L, (double) 10L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray8);
        java.lang.Object[] objArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, objArray15);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        char[] charArray7 = new char[] { '#', 'a', '4', 'a', '4', '4' };
        char[] charArray14 = new char[] { '4', '4', '4', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray14);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        long[] longArray1 = new long[] { 10L };
        long[] longArray4 = new long[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 1, (double) 10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean7, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray3);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray4);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray18 = new java.util.concurrent.ExecutorService[][] { executorServiceArray15, executorServiceArray16, executorServiceArray17 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray24 = new java.util.concurrent.ExecutorService[][] { executorServiceArray21, executorServiceArray22, executorServiceArray23 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray24);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray18);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals(objArray8, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) executorServiceArray15);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest7.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest7.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray3, (java.lang.Object) synonymsAnalysisTest7);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray12, (-1.0f));
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) '4');
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) '4');
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray26, (float) 100);
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals(objArray32, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray22, (java.lang.Object) executorServiceArray33);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray22, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray18, (float) ' ');
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest45.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger47 = synonymsAnalysisTest45.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray41, (java.lang.Object) synonymsAnalysisTest45);
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray50, (-1.0f));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray12, floatArray41, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray1, floatArray41, (float) 1);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        short[] shortArray6 = new short[] { (byte) -1, (short) 1, (byte) 10, (byte) 10, (short) 1, (short) -1 };
        short[] shortArray9 = new short[] { (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest25.assertFieldsEquals("tests.nightly", indexReader27, fields28, fields29, false);
        java.lang.String str32 = synonymsAnalysisTest25.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest25.analysisService;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("tests.nightly", indexReader35, (int) '#', postingsEnum37, postingsEnum38, true);
        synonymsAnalysisTest25.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest25.analysisService = analysisService43;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        synonymsAnalysisTest25.assertTermsEquals("", indexReader46, terms47, terms48, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = null;
        synonymsAnalysisTest25.setanalysisService(analysisService51);
        java.lang.Object[] objArray54 = new java.lang.Object[] { executorServiceArray4, 0L, executorServiceArray17, synonymsAnalysisTest25, 1.0f };
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray58);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.lang.Object[] objArray62 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals(objArray62, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray54, (java.lang.Object[]) executorServiceArray69);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        long[] longArray4 = new long[] { '#', 1L, 'a' };
        long[] longArray9 = new long[] { 'a', 1L, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray4, longArray9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest2.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray29 = new java.util.concurrent.ExecutorService[][] { executorServiceArray26, executorServiceArray27, executorServiceArray28 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray35 = new java.util.concurrent.ExecutorService[][] { executorServiceArray32, executorServiceArray33, executorServiceArray34 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray35);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule23, (java.lang.Object) executorServiceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray29);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 0L);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) eSLogger2);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray4);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain9);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest16.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest16.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray12, (java.lang.Object) synonymsAnalysisTest16);
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        java.lang.String str29 = synonymsAnalysisTest22.getTestName();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest22.failureAndSuccessEvents;
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest36.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest36.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray32, (java.lang.Object) synonymsAnalysisTest36);
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest36.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain40);
        org.junit.rules.RuleChain[] ruleChainArray43 = new org.junit.rules.RuleChain[] { ruleChain9, ruleChain20, ruleChain30, ruleChain40 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet44 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) ruleChainArray43, (java.lang.Object[]) executorServiceArray46);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest6.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray2, (java.lang.Object) synonymsAnalysisTest6);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray11, (-1.0f));
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) '4');
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) '4');
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray25, (float) 100);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals(objArray31, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray21, (java.lang.Object) executorServiceArray32);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray21, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray17, (float) ' ');
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest44.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger46 = synonymsAnalysisTest44.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray40, (java.lang.Object) synonymsAnalysisTest44);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray49, (-1.0f));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray11, floatArray40, 0.0f);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest57 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest57.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger59 = synonymsAnalysisTest57.getlogger();
        java.lang.String str60 = synonymsAnalysisTest57.getTestName();
        synonymsAnalysisTest57.assertPathHasBeenCleared("tests.slow");
        synonymsAnalysisTest57.assertPathHasBeenCleared("<unknown>");
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray70 = new java.util.concurrent.ExecutorService[][] { executorServiceArray67, executorServiceArray68, executorServiceArray69 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList71 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray76 = new java.util.concurrent.ExecutorService[][] { executorServiceArray73, executorServiceArray74, executorServiceArray75 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList77 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray76);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray76);
        java.util.Set<java.lang.Object> objSet79 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest57, (java.lang.Object) objSet79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest57);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray14 = new java.util.concurrent.ExecutorService[][] { executorServiceArray11, executorServiceArray12, executorServiceArray13 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray20 = new java.util.concurrent.ExecutorService[][] { executorServiceArray17, executorServiceArray18, executorServiceArray19 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray20);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray5, byteArray12);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        int[] intArray5 = new int[] { '#', (short) 1, (byte) 1, (byte) -1, (byte) 10 };
        int[] intArray8 = new int[] { (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", 0.0d, 10.0d, (double) 100L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest2.getanalysisService();
        org.junit.Assert[] assertArray13 = new org.junit.Assert[] { synonymsAnalysisTest2 };
        java.util.Set<org.junit.Assert> assertSet14 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (short) 100, (java.lang.Object) assertSet14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 1.0f, (double) 10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.getlogger();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.slow");
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray14 = new java.util.concurrent.ExecutorService[][] { executorServiceArray11, executorServiceArray12, executorServiceArray13 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray20 = new java.util.concurrent.ExecutorService[][] { executorServiceArray17, executorServiceArray18, executorServiceArray19 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray20);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray20);
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) objSet23);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest25.setanalysisService(analysisService27);
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        double[] doubleArray2 = new double[] { 100.0d };
        double[] doubleArray4 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray2, doubleArray4, (double) (-1L));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (byte) -1, (float) (-1));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        double[] doubleArray2 = new double[] { 100.0d, 10.0f };
        double[] doubleArray4 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) (short) 100);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest4);
        synonymsAnalysisTest4.overrideTestDefaultQueryCache();
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest4.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest4.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest13.analysisService = analysisService14;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.weekly", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        synonymsAnalysisTest13.setUp();
        synonymsAnalysisTest13.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest4, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int[] intArray9 = new int[] { '#', 100, 'a', (short) -1, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray19 = new java.util.concurrent.ExecutorService[][] { executorServiceArray16, executorServiceArray17, executorServiceArray18 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList20 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray25 = new java.util.concurrent.ExecutorService[][] { executorServiceArray22, executorServiceArray23, executorServiceArray24 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray25);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray25);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        long[] longArray1 = new long[] {};
        long[] longArray6 = new long[] { 1, (short) 0, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest0.assertTermsEquals("random", indexReader12, terms13, terms14, true);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (byte) 10, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        short[] shortArray4 = new short[] { (byte) 0, (short) 0, (byte) 100 };
        short[] shortArray6 = new short[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray6 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray4, executorServiceArray5 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][] { executorServiceArray9, executorServiceArray10, executorServiceArray11 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray12);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals(objArray25, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray26, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 1, (long) (byte) -1);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray4);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray6 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray4, executorServiceArray5 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][] { executorServiceArray9, executorServiceArray10, executorServiceArray11 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray12);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals(objArray22, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray16);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) (-1L), (float) 1L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, false);
        java.lang.String str20 = synonymsAnalysisTest13.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest13.analysisService;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("tests.nightly", indexReader23, (int) '#', postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest13.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest13);
        synonymsAnalysisTest13.setUp();
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) synonymsAnalysisTest13, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        short[] shortArray4 = new short[] { (byte) 100, (short) 1, (byte) 1, (short) 100 };
        short[] shortArray11 = new short[] { (short) 10, (short) 0, (short) 1, (byte) 0, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray2, (double) (short) -1);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray6);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) ruleChain9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        char[] charArray6 = new char[] { ' ', '4', '#', ' ', '#' };
        char[] charArray11 = new char[] { '4', '#', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray6, charArray11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        long[] longArray3 = new long[] { (byte) 10, 10L };
        long[] longArray6 = new long[] { (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray3, longArray6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        char[] charArray4 = new char[] { '4', 'a', '4' };
        char[] charArray7 = new char[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray4, charArray7);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        long[] longArray4 = new long[] { (short) 10, 100, 10L };
        long[] longArray9 = new long[] { (-1L), (short) 0, (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray9);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) '#');
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        double[] doubleArray4 = new double[] { 'a', (byte) 10, 0 };
        double[] doubleArray8 = new double[] { (byte) 100, ' ', 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray4, doubleArray8, (double) (-1));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) 100.0f, (double) ' ', (double) (byte) 100);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        char[] charArray0 = null;
        char[] charArray4 = new char[] { '4', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 100, (double) 100.0f);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray1, byteArray4);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        char[] charArray0 = new char[] {};
        char[] charArray5 = new char[] { '4', ' ', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.monster", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest18.analysisService = analysisService19;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest18.assertFieldsEquals("tests.weekly", indexReader22, fields23, fields24, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        synonymsAnalysisTest18.setUp();
        synonymsAnalysisTest18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest18.assertDocsEnumEquals("tests.monster", postingsEnum31, postingsEnum32, true);
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest18.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest36.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest36.assertPositionsSkippingEquals("tests.nightly", indexReader39, (int) (byte) 1, postingsEnum41, postingsEnum42);
        org.elasticsearch.common.logging.ESLogger eSLogger44 = synonymsAnalysisTest36.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger47 = synonymsAnalysisTest45.getlogger();
        org.elasticsearch.common.logging.ESLogger[] eSLoggerArray48 = new org.elasticsearch.common.logging.ESLogger[] { eSLogger17, eSLogger35, eSLogger44, eSLogger47 };
        java.util.Set<org.elasticsearch.common.logging.ESLogger> eSLoggerSet49 = org.apache.lucene.util.LuceneTestCase.asSet(eSLoggerArray48);
        float[] floatArray54 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray59 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray64 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray69 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray74 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray75 = new float[][] { floatArray54, floatArray59, floatArray64, floatArray69, floatArray74 };
        java.util.Set<float[]> floatArraySet76 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) eSLoggerArray48, (java.lang.Object[]) floatArray75);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        double[] doubleArray6 = new double[] { 10.0d, 0, ' ', 10L, (byte) 10, ' ' };
        double[] doubleArray9 = new double[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray9, (double) (byte) -1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest6.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray2, (java.lang.Object) synonymsAnalysisTest6);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain10);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest17.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest17.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray13, (java.lang.Object) synonymsAnalysisTest17);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest23.assertFieldsEquals("tests.nightly", indexReader25, fields26, fields27, false);
        java.lang.String str30 = synonymsAnalysisTest23.getTestName();
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest23.failureAndSuccessEvents;
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest37.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray33, (java.lang.Object) synonymsAnalysisTest37);
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain41);
        org.junit.rules.RuleChain[] ruleChainArray44 = new org.junit.rules.RuleChain[] { ruleChain10, ruleChain21, ruleChain31, ruleChain41 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet45 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) ruleChainArray44, (java.lang.Object[]) executorServiceArray46);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", (int) (byte) 10, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { 100, (byte) 1, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        int[] intArray3 = new int[] { (byte) 1, (-1), '4' };
        int[] intArray6 = new int[] { (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        short[] shortArray1 = new short[] { (short) 0 };
        short[] shortArray3 = new short[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 10, 1.0d, (double) 1.0f);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1.0f);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1), 'a', '#', 100.0d, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray6, (double) 10L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.weekly");
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest1.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) eSLogger16);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) ruleChain14, (java.lang.Object) 0L);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        double[] doubleArray2 = new double[] { '4' };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray2, doubleArray3, (double) (short) 100);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", (int) '4', numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray2, byteArray3);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) -1, (long) (byte) 1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        long[] longArray0 = null;
        long[] longArray7 = new long[] { (short) 0, (byte) 0, (byte) 10, (short) 1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.getanalysisService();
        org.junit.Assert[] assertArray11 = new org.junit.Assert[] { synonymsAnalysisTest0 };
        java.util.Set<org.junit.Assert> assertSet12 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) assertArray11, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.getlogger();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest12.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest12.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray8, (java.lang.Object) synonymsAnalysisTest12);
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 0);
        synonymsAnalysisTest12.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest2.getanalysisService();
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest16.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest16.setanalysisService(analysisService18);
        synonymsAnalysisTest16.resetCheckIndexStatus();
        java.lang.String str21 = synonymsAnalysisTest16.getTestName();
        org.junit.rules.TestRule testRule22 = synonymsAnalysisTest16.ruleChain;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 100, (short) 0, testRule22 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray1, objArray23);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader13, (-1), postingsEnum15, postingsEnum16);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) '4');
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray22, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum15, (java.lang.Object) floatArray18);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        short[] shortArray5 = new short[] { (byte) 100, (short) 100, (byte) 1, (byte) 0 };
        short[] shortArray7 = new short[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", 0.0d, (double) 0L, (double) 'a');
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        double[] doubleArray2 = new double[] { 10.0f };
        double[] doubleArray4 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray2, doubleArray4, (double) 1L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        long[] longArray3 = new long[] { (-1L), '4' };
        long[] longArray9 = new long[] { (short) 100, 100L, (short) 100, (-1L), 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray3, longArray9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        long[] longArray5 = new long[] { ' ', (byte) 10, 100, (byte) 1, 1 };
        long[] longArray10 = new long[] { (short) 100, (short) 1, (byte) -1, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (short) 100, (double) 1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) 0, (long) (byte) -1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        char[] charArray1 = null;
        char[] charArray6 = new char[] { '#', 'a', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray1, charArray6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 1L, (long) (byte) 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        short[] shortArray4 = new short[] { (short) 1, (short) 100, (short) 1 };
        short[] shortArray5 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray5);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        long[] longArray1 = new long[] {};
        long[] longArray4 = new long[] { '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray1, longArray4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, 0, 0, (byte) 10 };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray6, intArray8);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) '4');
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) '4');
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray19, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray15, 0.0f);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest31.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest31.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray27, (java.lang.Object) synonymsAnalysisTest31);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray36, (-1.0f));
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray11, floatArray36, (float) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest5, (java.lang.Object) floatArray11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        int[] intArray2 = new int[] { 1, '#' };
        int[] intArray5 = new int[] { 'a', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) -1, (long) (byte) 1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray2, byteArray7);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (long) 10, (long) (byte) 10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (short) 10, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.monster", postingsEnum14, postingsEnum15, true);
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest19.analysisService = analysisService20;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        synonymsAnalysisTest19.setUp();
        synonymsAnalysisTest19.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest19.assertDocsEnumEquals("tests.monster", postingsEnum32, postingsEnum33, true);
        org.elasticsearch.common.logging.ESLogger eSLogger36 = synonymsAnalysisTest19.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest37.setUp();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest37.assertPositionsSkippingEquals("tests.nightly", indexReader40, (int) (byte) 1, postingsEnum42, postingsEnum43);
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest37.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest46.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger48 = synonymsAnalysisTest46.getlogger();
        org.elasticsearch.common.logging.ESLogger[] eSLoggerArray49 = new org.elasticsearch.common.logging.ESLogger[] { eSLogger18, eSLogger36, eSLogger45, eSLogger48 };
        java.util.Set<org.elasticsearch.common.logging.ESLogger> eSLoggerSet50 = org.apache.lucene.util.LuceneTestCase.asSet(eSLoggerArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray76);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray74);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) eSLoggerArray49, (java.lang.Object[]) executorServiceArray60);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        char[] charArray6 = new char[] { '4', '#', ' ', 'a', '4' };
        char[] charArray13 = new char[] { '#', 'a', '4', ' ', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray6, charArray13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        short[] shortArray5 = new short[] { (short) 1, (byte) 100, (short) 100, (byte) -1 };
        short[] shortArray10 = new short[] { (short) 100, (short) 0, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", shortArray5, shortArray10);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray26);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray40 = new java.util.concurrent.ExecutorService[][] { executorServiceArray37, executorServiceArray38, executorServiceArray39 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray46 = new java.util.concurrent.ExecutorService[][] { executorServiceArray43, executorServiceArray44, executorServiceArray45 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList47 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray46);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray46);
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray40);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest10.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray6, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain14;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest0.analysisService = analysisService18;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest20.assertFieldsEquals("tests.nightly", indexReader22, fields23, fields24, false);
        java.lang.String str27 = synonymsAnalysisTest20.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest20.analysisService;
        synonymsAnalysisTest20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("", indexReader31, (int) (byte) 0, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        synonymsAnalysisTest20.assertTermsEquals("tests.badapples", indexReader37, terms38, terms39, true);
        synonymsAnalysisTest20.setUp();
        org.junit.rules.TestRule testRule43 = synonymsAnalysisTest20.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) analysisService18, (java.lang.Object) testRule43);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0L, (long) (-1));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (byte) -1);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        int[] intArray1 = new int[] {};
        int[] intArray3 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray3);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        long[] longArray1 = new long[] { 0 };
        long[] longArray8 = new long[] { 0, 'a', (byte) 100, (short) 0, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        synonymsAnalysisTest5.setIndexWriterMaxDocs((int) (short) 0);
        synonymsAnalysisTest5.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        int[] intArray6 = new int[] { (short) -1, (byte) 100, (byte) 1, ' ', ' ', 0 };
        int[] intArray10 = new int[] { ' ', (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        double[] doubleArray4 = new double[] { 10, 10L, (-1), (short) 100 };
        double[] doubleArray6 = new double[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray6, 0.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.junit.rules.RuleChain[] ruleChainArray0 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray2 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray3 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray4 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray5 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray6 = new org.junit.rules.RuleChain[][] { ruleChainArray0, ruleChainArray1, ruleChainArray2, ruleChainArray3, ruleChainArray4, ruleChainArray5 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        synonymsAnalysisTest8.assertFieldsEquals("tests.nightly", indexReader10, fields11, fields12, false);
        java.lang.String str15 = synonymsAnalysisTest8.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest8.analysisService;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest8.assertDocsSkippingEquals("tests.nightly", indexReader18, (int) '#', postingsEnum20, postingsEnum21, true);
        synonymsAnalysisTest8.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest8.analysisService = analysisService26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest8.assertTermsEquals("", indexReader29, terms30, terms31, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = null;
        synonymsAnalysisTest8.setanalysisService(analysisService34);
        org.junit.rules.RuleChain ruleChain36 = synonymsAnalysisTest8.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass37 = synonymsAnalysisTest8.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChainArraySet7, (java.lang.Object) wildcardClass37);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain3;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest10.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray6, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain14;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader17, fields18, fields19, false);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest24.setUp();
        org.junit.rules.RuleChain ruleChain26 = null;
        synonymsAnalysisTest24.failureAndSuccessEvents = ruleChain26;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) ruleChain26);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray3, executorServiceArray4 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest7.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest7.setanalysisService(analysisService9);
        synonymsAnalysisTest7.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest7.assertFieldsEquals("tests.awaitsfix", indexReader13, fields14, fields15, false);
        synonymsAnalysisTest7.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest7.assertPositionsSkippingEquals("tests.badapples", indexReader20, (-1), postingsEnum22, postingsEnum23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (short) 1, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        long[] longArray1 = new long[] { 100L };
        long[] longArray6 = new long[] { (short) -1, (short) -1, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (short) -1, (float) (byte) 100, (float) (byte) 10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        char[] charArray6 = new char[] { 'a', '#', '4', 'a', 'a', ' ' };
        char[] charArray13 = new char[] { '#', '#', '#', 'a', '4', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (short) 100, (double) 0L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        int[] intArray4 = new int[] { (byte) 100, ' ', (byte) 100 };
        int[] intArray6 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray4, intArray6);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        long[] longArray5 = new long[] { (short) 0, 1, (byte) 0, 10 };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray5, longArray6);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        double[] doubleArray6 = new double[] { 100, 100.0d, (-1.0f), (short) 100, (byte) 100, ' ' };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.awaitsfix", indexReader7, (int) (short) 1, postingsEnum9, postingsEnum10, false);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) '4');
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals(objArray24, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray14, (java.lang.Object) executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) indexReader7, (java.lang.Object) "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest0.analysisService;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray28);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) analysisService21, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        char[] charArray3 = new char[] { '4', '#' };
        char[] charArray9 = new char[] { '#', '#', '4', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray9);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 100, (long) '4');
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals(objArray5, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) 0L);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray27 = new java.util.concurrent.ExecutorService[][] { executorServiceArray24, executorServiceArray25, executorServiceArray26 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray33 = new java.util.concurrent.ExecutorService[][] { executorServiceArray30, executorServiceArray31, executorServiceArray32 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray33);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray27);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 0.0f, (double) 0L, (double) '#');
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest15);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray43 = new java.util.concurrent.ExecutorService[][] { executorServiceArray40, executorServiceArray41, executorServiceArray42 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList44 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray43);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray4 = new double[] { 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray4, 100.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) floatArray12);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 100.0d, 0.0d, 1.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        short[] shortArray7 = new short[] { (short) 0, (byte) -1, (short) 1, (byte) 1, (byte) 1, (byte) 1 };
        short[] shortArray13 = new short[] { (byte) -1, (short) 1, (byte) 0, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray7, shortArray13);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        java.lang.Class<?> wildcardClass12 = synonymsAnalysisTest1.getClass();
        org.junit.rules.TestRule testRule13 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) testRule13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest15.analysisService = analysisService16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.weekly", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        synonymsAnalysisTest15.setUp();
        synonymsAnalysisTest15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest15.assertDocsEnumEquals("tests.monster", postingsEnum28, postingsEnum29, true);
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest15.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = null;
        synonymsAnalysisTest33.analysisService = analysisService34;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        synonymsAnalysisTest33.assertFieldsEquals("tests.weekly", indexReader37, fields38, fields39, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest33.analysisService;
        synonymsAnalysisTest33.setUp();
        synonymsAnalysisTest33.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest33.assertDocsEnumEquals("tests.monster", postingsEnum46, postingsEnum47, true);
        org.elasticsearch.common.logging.ESLogger eSLogger50 = synonymsAnalysisTest33.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest51.setUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        synonymsAnalysisTest51.assertPositionsSkippingEquals("tests.nightly", indexReader54, (int) (byte) 1, postingsEnum56, postingsEnum57);
        org.elasticsearch.common.logging.ESLogger eSLogger59 = synonymsAnalysisTest51.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest60.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger62 = synonymsAnalysisTest60.getlogger();
        org.elasticsearch.common.logging.ESLogger[] eSLoggerArray63 = new org.elasticsearch.common.logging.ESLogger[] { eSLogger32, eSLogger50, eSLogger59, eSLogger62 };
        java.util.Set<org.elasticsearch.common.logging.ESLogger> eSLoggerSet64 = org.apache.lucene.util.LuceneTestCase.asSet(eSLoggerArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule13, (java.lang.Object) eSLoggerArray63);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", (int) (short) 100, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0L, (long) (short) -1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray9);
        float[] floatArray23 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray28 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray33 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray38 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray43 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray44 = new float[][] { floatArray23, floatArray28, floatArray33, floatArray38, floatArray43 };
        java.util.Set<float[]> floatArraySet45 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray44);
        java.util.Set<java.lang.Cloneable> cloneableSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) floatArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) floatArray44);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { '#', 1, (-1), 100L, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        int[] intArray2 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) 1, (short) 0, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray2, intArray7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) ' ', (double) (byte) 1);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100L, (long) 100);
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

