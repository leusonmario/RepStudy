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
        float[] floatArray6 = new float[] { (-1.0f), '4', (short) 0, 1, (byte) 0, (byte) 1 };
        float[] floatArray10 = new float[] { 100, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray10, (float) (byte) 1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) 1, (long) 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        long[] longArray4 = new long[] { '#', 1, 0L };
        long[] longArray9 = new long[] { (short) -1, (byte) 10, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray4, longArray9);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) 100L, (float) (byte) -1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) ' ', 10L);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (short) 10);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) (-1), (double) (-1));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (short) -1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 100L, 0.0d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        java.lang.Class<?> wildcardClass9 = commonGramsTokenFilterFactoryTests2.getClass();
        java.lang.Object[] objArray14 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests2, '4', (-1L), "random", (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", objArray1, objArray14);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        float[] floatArray3 = new float[] { 0L, 0, (-1L) };
        float[] floatArray7 = new float[] { (short) 100, (byte) 0, 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, 0.0f);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray17 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests9, commonGramsTokenFilterFactoryTests16 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", objArray1, (java.lang.Object[]) baseTokenStreamTestCaseArray17);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 'a', (java.lang.Object) ' ');
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 0, (long) 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 100);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.NumericDocValues numericDocValues3 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", (int) (byte) 100, numericDocValues3, numericDocValues4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        long[] longArray6 = new long[] { (byte) 1, (byte) 0, (byte) 1, (short) 100, (short) 100, (-1) };
        long[] longArray8 = new long[] { 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.junit.rules.TestRule testRule0 = org.apache.lucene.util.LuceneTestCase.classRules;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray32 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests17, commonGramsTokenFilterFactoryTests24, commonGramsTokenFilterFactoryTests31 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet33 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray32);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) baseTokenStreamTestCaseArray15, (java.lang.Object[]) baseTokenStreamTestCaseArray32);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("hi!", obj1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 100, (short) 0 };
        short[] shortArray11 = new short[] { (short) 100, (short) 1, (short) 10, (short) 10, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray11);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) baseTokenStreamTestCaseArray16, objArray18);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.slow", true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) (short) 10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader10, 1, postingsEnum12, postingsEnum13, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.slow", (java.lang.Object) false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (-1.0d));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        double[] doubleArray4 = new double[] { 100, (-1L), (byte) 0, (-1L) };
        double[] doubleArray11 = new double[] { (byte) 1, (byte) 1, 10.0f, (-1.0d), (-1.0d), ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray11, 0.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) "hi!", (java.lang.Object) intArray3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (short) -1, (double) (byte) 1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        char[] charArray4 = new char[] { '#', 'a', 'a' };
        char[] charArray10 = new char[] { ' ', ' ', 'a', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object) str7, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) (short) 100, (java.lang.Object) '#');
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        double[] doubleArray4 = new double[] { (byte) -1, 1.0d, (byte) 10 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray4, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) 100, (long) (short) 10);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { (-1), (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray17 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests9, commonGramsTokenFilterFactoryTests16 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray17);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0.0f, (java.lang.Object) baseTokenStreamTestCaseArray17);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (-1), (long) (short) 1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) baseTokenStreamTestCaseArray16, (java.lang.Object[]) baseTokenStreamTestCaseArray33);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        int[] intArray4 = new int[] { 1, (short) -1, (byte) 1, 0 };
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        java.lang.Class<?> wildcardClass18 = baseTokenStreamTestCaseSet17.getClass();
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray20, intArray21);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests23.assertFieldsEquals("random", indexReader25, fields26, fields27, false);
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.junit.rules.TestRule testRule33 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { baseTokenStreamTestCaseSet17, intArray21, commonGramsTokenFilterFactoryTests23, "tests.maxfailures", testRule33 };
        java.lang.Object[] objArray36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray35, objArray36);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        double[] doubleArray5 = new double[] { (-1), (byte) -1, (-1), 0.0f, ' ' };
        double[] doubleArray11 = new double[] { (byte) -1, (byte) 100, 0, 1.0f, 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray11, (double) 100.0f);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (short) 0, (double) 10.0f);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) 100.0f);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        char[] charArray3 = new char[] { 'a', 'a' };
        char[] charArray9 = new char[] { ' ', '4', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray3, charArray9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) 10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        int[] intArray0 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) (short) 0, (float) 'a', (-1.0f));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        long[] longArray5 = new long[] { (byte) 100, '#', ' ', 1 };
        long[] longArray10 = new long[] { (-1), (byte) 0, 1L, (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray25 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests10, commonGramsTokenFilterFactoryTests17, commonGramsTokenFilterFactoryTests24 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet26 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray25);
        java.lang.Class<?> wildcardClass27 = baseTokenStreamTestCaseSet26.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        commonGramsTokenFilterFactoryTests28.tearDown();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("tests.slow", indexReader37, (int) '4', postingsEnum39, postingsEnum40);
        java.lang.String str42 = commonGramsTokenFilterFactoryTests28.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        commonGramsTokenFilterFactoryTests43.assertFieldsEquals("random", indexReader45, fields46, fields47, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        commonGramsTokenFilterFactoryTests50.assertFieldsEquals("random", indexReader52, fields53, fields54, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray58 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests43, commonGramsTokenFilterFactoryTests50, commonGramsTokenFilterFactoryTests57 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet59 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray58);
        java.lang.Object[] objArray60 = new java.lang.Object[] { "tests.weekly", commonGramsTokenFilterFactoryTests2, baseTokenStreamTestCaseSet26, commonGramsTokenFilterFactoryTests28, baseTokenStreamTestCaseArray58 };
        java.lang.Object[] objArray65 = new java.lang.Object[] { (byte) 0, (short) 100, "tests.maxfailures", 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray60, objArray65);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        char[] charArray3 = new char[] { '#', '4' };
        char[] charArray10 = new char[] { 'a', '#', ' ', '4', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray10);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        float[] floatArray5 = new float[] { (short) 0, (short) 100, (short) 100, (-1) };
        float[] floatArray7 = new float[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray5, floatArray7, (-1.0f));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests16.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests16.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("random", indexReader24, fields25, fields26, false);
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests22.ruleChain;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "tests.nightly", (java.lang.Object) testRule30);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        java.lang.Object[] objArray34 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests0, false, "", commonGramsTokenFilterFactoryTests16, testRule30, '#' };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("random", indexReader37, fields38, fields39, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests42.assertFieldsEquals("random", indexReader44, fields45, fields46, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray50 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests35, commonGramsTokenFilterFactoryTests42, commonGramsTokenFilterFactoryTests49 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet51 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray50);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        commonGramsTokenFilterFactoryTests52.assertFieldsEquals("random", indexReader54, fields55, fields56, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        commonGramsTokenFilterFactoryTests59.assertFieldsEquals("random", indexReader61, fields62, fields63, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray67 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests52, commonGramsTokenFilterFactoryTests59, commonGramsTokenFilterFactoryTests66 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet68 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray67);
        java.util.Collection[] collectionArray70 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray71 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray70;
        baseTokenStreamTestCaseCollectionArray71[0] = baseTokenStreamTestCaseSet51;
        baseTokenStreamTestCaseCollectionArray71[1] = baseTokenStreamTestCaseSet68;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet76 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray34, (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray71);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.junit.rules.TestRule testRule1 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.slow", indexReader11, (int) '4', postingsEnum13, postingsEnum14);
        java.lang.String str16 = commonGramsTokenFilterFactoryTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) testRule1, (java.lang.Object) str16);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", 1.0d, (double) (-1L), (double) 10.0f);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        java.lang.Object obj1 = new java.lang.Object();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.awaitsfix", postingsEnum5, postingsEnum6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        commonGramsTokenFilterFactoryTests18.tearDown();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder17, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("random", indexReader37, fields38, fields39, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray43 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests28, commonGramsTokenFilterFactoryTests35, commonGramsTokenFilterFactoryTests42 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet44 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray43);
        java.lang.Object[] objArray46 = new java.lang.Object[] { obj1, commonGramsTokenFilterFactoryTests2, (-1.0d), builder17, baseTokenStreamTestCaseSet44, "tests.maxfailures" };
        java.lang.Object[] objArray47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", objArray46, objArray47);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray17 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests9, commonGramsTokenFilterFactoryTests16 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray17);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("random", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray36 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests21, commonGramsTokenFilterFactoryTests28, commonGramsTokenFilterFactoryTests35 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet37 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray36);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray36);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) baseTokenStreamTestCaseArray17, (java.lang.Object[]) baseTokenStreamTestCaseArray36);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        float[] floatArray2 = new float[] { 10.0f, (-1) };
        float[] floatArray8 = new float[] { (byte) -1, '#', (byte) 0, (short) -1, (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) (short) -1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray7, byteArray12);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        long[] longArray5 = new long[] { ' ', 0, (short) 10, 2, (byte) 100 };
        long[] longArray12 = new long[] { (-1), (short) 1, (byte) 1, 2, (short) 1, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 1L, (double) '#');
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        long[] longArray2 = new long[] { '#', (short) 1 };
        long[] longArray4 = new long[] { 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        long[] longArray7 = new long[] { 'a', ' ', 10, '4', (short) -1, 100 };
        long[] longArray12 = new long[] { 1L, (short) 100, '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray7, longArray12);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        char[] charArray7 = new char[] { '#', ' ', '4', 'a', 'a', ' ' };
        char[] charArray12 = new char[] { '4', ' ', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray12);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader8, (int) '#', postingsEnum10, postingsEnum11);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 2, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (-1.0f), obj1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        int[] intArray2 = new int[] { (byte) 10 };
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray2, intArray5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Collection[] collectionArray36 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray37 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray36;
        baseTokenStreamTestCaseCollectionArray37[0] = baseTokenStreamTestCaseSet17;
        baseTokenStreamTestCaseCollectionArray37[1] = baseTokenStreamTestCaseSet34;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        commonGramsTokenFilterFactoryTests44.assertFieldsEquals("random", indexReader46, fields47, fields48, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        commonGramsTokenFilterFactoryTests51.assertFieldsEquals("random", indexReader53, fields54, fields55, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray59 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests44, commonGramsTokenFilterFactoryTests51, commonGramsTokenFilterFactoryTests58 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet60 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray59);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray37, (java.lang.Object[]) baseTokenStreamTestCaseArray59);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray17 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests9, commonGramsTokenFilterFactoryTests16 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray17);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("random", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray36 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests21, commonGramsTokenFilterFactoryTests28, commonGramsTokenFilterFactoryTests35 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet37 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray36);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray36);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) baseTokenStreamTestCaseArray17, (java.lang.Object[]) baseTokenStreamTestCaseArray36);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray2);
        int[] intArray5 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (short) 10, "hi!" };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray18 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests3, commonGramsTokenFilterFactoryTests10, commonGramsTokenFilterFactoryTests17 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet19 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray2, (java.lang.Object[]) baseTokenStreamTestCaseArray18);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) ' ');
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray16);
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray16, objArray19);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray17 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests9, commonGramsTokenFilterFactoryTests16 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray17);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        long[] longArray2 = new long[] { (short) 100, 1L };
        long[] longArray5 = new long[] { (byte) 1, 2 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 100L, (float) (byte) 1, 0.0f);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        java.lang.Object obj1 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", obj1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder2, (java.lang.Object) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) 100.0f, (java.lang.Object) (short) 1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        int[] intArray5 = new int[] { (short) 100, (short) 10, (byte) 1, '4', (short) 1 };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 0.0d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0.0f, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) baseTokenStreamTestCaseArray16);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        short[] shortArray1 = null;
        short[] shortArray8 = new short[] { (byte) 10, (short) 1, (byte) 1, (byte) -1, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray1, shortArray8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 100, (-1.0f), 0.0f);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Collection[] collectionArray36 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray37 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray36;
        baseTokenStreamTestCaseCollectionArray37[0] = baseTokenStreamTestCaseSet17;
        baseTokenStreamTestCaseCollectionArray37[1] = baseTokenStreamTestCaseSet34;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        commonGramsTokenFilterFactoryTests43.assertFieldsEquals("random", indexReader45, fields46, fields47, false);
        commonGramsTokenFilterFactoryTests43.tearDown();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests43.assertDocsSkippingEquals("tests.weekly", indexReader52, (int) (short) 1, postingsEnum54, postingsEnum55, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) baseTokenStreamTestCaseCollectionSet42, (java.lang.Object) indexReader52);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) (byte) 1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (short) -1);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.slow", indexReader10, (int) '4', postingsEnum12, postingsEnum13);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests17.getTestName();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("<unknown>", indexReader27, (int) (byte) 10, postingsEnum29, postingsEnum30);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures33);
        java.lang.Object[] objArray35 = new java.lang.Object[] { 0, commonGramsTokenFilterFactoryTests17, testRuleIgnoreAfterMaxFailures33 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests37.assertFieldsEquals("random", indexReader39, fields40, fields41, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        commonGramsTokenFilterFactoryTests44.assertFieldsEquals("random", indexReader46, fields47, fields48, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray52 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests37, commonGramsTokenFilterFactoryTests44, commonGramsTokenFilterFactoryTests51 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet53 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray52);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray52);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", objArray35, (java.lang.Object[]) baseTokenStreamTestCaseArray52);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) 'a');
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (short) 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsEnumEquals("tests.awaitsfix", postingsEnum14, postingsEnum15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) 'a', (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        short[] shortArray7 = new short[] { (short) -1, (short) -1, (byte) -1, (byte) 10, (byte) 10, (short) 100 };
        short[] shortArray11 = new short[] { (short) 1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray11);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) "hi!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0.0d, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        java.lang.String str13 = commonGramsTokenFilterFactoryTests6.getTestName();
        commonGramsTokenFilterFactoryTests6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("<unknown>", indexReader16, (int) (byte) 10, postingsEnum18, postingsEnum19);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray4, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray25);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray24, intArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.nightly" };
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray35, intArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray28, strArray33, intArray35);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 100, (float) 0L, (float) '4');
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) (byte) 0, (double) 100);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("random", indexReader18, (int) '#', postingsEnum20, postingsEnum21);
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests10.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) testRule9, (java.lang.Object) testRule23);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, 100.0d, (double) 1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray7 = new double[] { (short) 0, 0.0d, 1.0d, 1L, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray7, (double) 1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        short[] shortArray1 = new short[] { (short) 0 };
        short[] shortArray5 = new short[] { (short) -1, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray2);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray2 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        double[] doubleArray7 = new double[] { 100.0d, 'a', '#', 0.0d, (byte) 10, (byte) 100 };
        double[] doubleArray13 = new double[] { (short) 1, (-1), 2, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) '4');
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        long[] longArray5 = new long[] { 100, 0, 10, (byte) -1, (byte) 100 };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        char[] charArray4 = new char[] { '#', '4', ' ', 'a' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (short) -1, 1.0f, 0.0d, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray5, (double) 1L);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray5, intArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        java.lang.String str15 = commonGramsTokenFilterFactoryTests8.getTestName();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("<unknown>", indexReader18, (int) (byte) 10, postingsEnum20, postingsEnum21);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray6, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray6);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray27, intArray28);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray27, intArray31);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray36, intArray37);
        int[] intArray45 = new int[] { 100, (short) 10, ' ', 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6, intArray27, intArray37, intArray45, (java.lang.Integer) 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        java.util.Set<org.junit.Assert> assertSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("random", indexReader28, fields29, fields30, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray34 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests19, commonGramsTokenFilterFactoryTests26, commonGramsTokenFilterFactoryTests33 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet35 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray34);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray34);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray15, (java.lang.Object[]) baseTokenStreamTestCaseArray34);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        short[] shortArray4 = new short[] { (byte) -1, (short) 10, (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1, (short) 0, (short) 0, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray10);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray6);
        int[] intArray13 = new int[] { '4', (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        short[] shortArray0 = null;
        short[] shortArray1 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 1.0f);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "tests.nightly", (java.lang.Object) testRule11);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule11;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18, false);
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests14.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) testRule11, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray3);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Collection[] collectionArray36 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray37 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray36;
        baseTokenStreamTestCaseCollectionArray37[0] = baseTokenStreamTestCaseSet17;
        baseTokenStreamTestCaseCollectionArray37[1] = baseTokenStreamTestCaseSet34;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        commonGramsTokenFilterFactoryTests44.assertFieldsEquals("random", indexReader46, fields47, fields48, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        commonGramsTokenFilterFactoryTests51.assertFieldsEquals("random", indexReader53, fields54, fields55, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray59 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests44, commonGramsTokenFilterFactoryTests51, commonGramsTokenFilterFactoryTests58 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet60 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray59);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray37, (java.lang.Object[]) baseTokenStreamTestCaseArray59);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) 100.0f, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) (byte) -1, (float) (-1L));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (byte) 0, postingsEnum20, postingsEnum21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        char[] charArray3 = new char[] { '4', '#', '#' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", 100, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) -1, (double) 100L, (double) (-1.0f));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) locale2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) baseTokenStreamTestCaseSet16);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (short) 1, (double) 10, (double) 100L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        int[] intArray5 = new int[] { (-1), (short) 100, 2, 100 };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray5, intArray8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        long[] longArray1 = new long[] {};
        long[] longArray4 = new long[] { (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.awaitsfix", (int) (short) -1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        java.util.Set<org.junit.Assert> assertSet18 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling19, throttling20, throttling21, throttling22 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) baseTokenStreamTestCaseArray16, (java.lang.Object[]) throttlingArray23);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10, (double) (-1L), (double) 10.0f);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", obj1);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) '#', 1.0f, (float) 10L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        float[] floatArray6 = new float[] { 2, ' ', (byte) 1, 10L, 10L };
        float[] floatArray12 = new float[] { (short) -1, 100L, '#', 10.0f, (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray6, floatArray12, 10.0f);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        float[] floatArray3 = new float[] { 1.0f, 1 };
        float[] floatArray7 = new float[] { 100.0f, 0.0f, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray3, floatArray7, (float) (byte) 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (-1), (long) 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) -1);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling2, throttling3 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("random", indexReader15, fields16, fields17, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray21 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests6, commonGramsTokenFilterFactoryTests13, commonGramsTokenFilterFactoryTests20 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet22 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray21);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests23.assertFieldsEquals("random", indexReader25, fields26, fields27, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("random", indexReader32, fields33, fields34, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray38 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests23, commonGramsTokenFilterFactoryTests30, commonGramsTokenFilterFactoryTests37 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet39 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray38);
        java.util.Collection[] collectionArray41 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray42 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray41;
        baseTokenStreamTestCaseCollectionArray42[0] = baseTokenStreamTestCaseSet22;
        baseTokenStreamTestCaseCollectionArray42[1] = baseTokenStreamTestCaseSet39;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet47 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray42);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray33);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray15, (java.lang.Object[]) baseTokenStreamTestCaseArray33);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray2);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        long[] longArray5 = new long[] { 10, 10L, 100, (byte) 10 };
        long[] longArray12 = new long[] { (byte) 100, (short) 1, 1, (-1L), 100L, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 1L, 0.0d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray6 = new double[] { 2, 0, 0L, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray6, (double) (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader8, fields9, fields10, false);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        org.junit.Assert.assertNotSame((java.lang.Object) fields9, (java.lang.Object) locale14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) locale14, (java.lang.Object) 2);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        byte[] byteArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray7);
        int[] intArray11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray7, intArray11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader8, (int) '#', postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader16, (int) (byte) 10, postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.failfast", (int) '4', numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        long[] longArray4 = new long[] { '4', 'a', ' ', '4' };
        long[] longArray11 = new long[] { 2, 'a', 0, (short) 100, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray17 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests9, commonGramsTokenFilterFactoryTests16 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", objArray1, (java.lang.Object[]) baseTokenStreamTestCaseArray17);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "tests.nightly", (java.lang.Object) testRule12);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule12;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("tests.awaitsfix", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (int) (byte) 0, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("<unknown>", postingsEnum29, postingsEnum30, false);
        java.lang.Object[] objArray33 = new java.lang.Object[] { 0L, testRule12, postingsEnum30 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling34, throttling35, throttling36, throttling37 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", objArray33, (java.lang.Object[]) throttlingArray38);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.nightly");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        float[] floatArray6 = new float[] { 10L, 100, 0L, (byte) 10, (byte) 100 };
        float[] floatArray11 = new float[] { 1, ' ', (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray6, floatArray11, 0.0f);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray4 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        java.util.Set<org.junit.Assert> assertSet18 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests29.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) "tests.slow");
        java.lang.Object[] objArray35 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests19, "tests.awaitsfix" };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) baseTokenStreamTestCaseArray16, objArray35);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader8, fields9, fields10, false);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        org.junit.Assert.assertNotSame((java.lang.Object) fields9, (java.lang.Object) locale14);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("tests.badapples", indexReader18, terms19, terms20, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) locale14, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling19, throttling20, throttling21, throttling22 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray16, (java.lang.Object[]) throttlingArray23);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        java.lang.Object[] objArray0 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) throttlingArray5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum14, postingsEnum15, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests18.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum15, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (byte) 1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0f) };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray18 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests3, commonGramsTokenFilterFactoryTests10, commonGramsTokenFilterFactoryTests17 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet19 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray18);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray1, (java.lang.Object[]) baseTokenStreamTestCaseArray18);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        float[] floatArray4 = new float[] { (-1), (byte) 10, '#' };
        float[] floatArray5 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray4, floatArray5, 100.0f);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 1L, (long) (byte) 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) 100);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        java.util.Set<org.junit.Assert> assertSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("random", indexReader37, fields38, fields39, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests42.assertFieldsEquals("random", indexReader44, fields45, fields46, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray50 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests35, commonGramsTokenFilterFactoryTests42, commonGramsTokenFilterFactoryTests49 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet51 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray50);
        java.util.Collection[] collectionArray53 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray54 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray53;
        baseTokenStreamTestCaseCollectionArray54[0] = baseTokenStreamTestCaseSet34;
        baseTokenStreamTestCaseCollectionArray54[1] = baseTokenStreamTestCaseSet51;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet59 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray15, (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray54);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) (byte) 0, (float) 10L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        short[] shortArray5 = new short[] { (byte) 10, (short) 1, (short) 10, (byte) 0 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        java.lang.Class<?> wildcardClass17 = baseTokenStreamTestCaseSet16.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) baseTokenStreamTestCaseSet16, (java.lang.Object) queryCachingPolicy18);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray1, doubleArray3, (double) (short) -1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (int) (byte) 1, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray2, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        float[] floatArray3 = new float[] { (-1L), 0L };
        float[] floatArray10 = new float[] { (short) 1, 1, (byte) 100, (byte) 0, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray3, floatArray10, (float) 100L);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 0, (long) 'a');
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray32 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests17, commonGramsTokenFilterFactoryTests24, commonGramsTokenFilterFactoryTests31 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet33 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray32);
        java.util.Collection[] collectionArray35 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray36 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray35;
        baseTokenStreamTestCaseCollectionArray36[0] = baseTokenStreamTestCaseSet16;
        baseTokenStreamTestCaseCollectionArray36[1] = baseTokenStreamTestCaseSet33;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet41 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray36);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests42.assertFieldsEquals("random", indexReader44, fields45, fields46, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        commonGramsTokenFilterFactoryTests49.assertFieldsEquals("random", indexReader51, fields52, fields53, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray57 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests42, commonGramsTokenFilterFactoryTests49, commonGramsTokenFilterFactoryTests56 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet58 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray57);
        java.util.Set<org.junit.Assert> assertSet59 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseCollectionArray36, (java.lang.Object[]) baseTokenStreamTestCaseArray57);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        java.util.Set<org.junit.Assert> assertSet18 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests19.getTestName();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("<unknown>", indexReader29, (int) (byte) 10, postingsEnum31, postingsEnum32);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule34;
        org.junit.rules.TestRule testRule37 = org.apache.lucene.util.LuceneTestCase.classRules;
        java.lang.Object[] objArray38 = new java.lang.Object[] { testRule34, 1.0d, testRule37 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) baseTokenStreamTestCaseArray16, objArray38);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (byte) 1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        long[] longArray1 = new long[] {};
        long[] longArray7 = new long[] { '#', (short) 0, 10L, 100, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray7);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        float[] floatArray5 = new float[] { 0.0f, 10, (short) 1, 100L };
        float[] floatArray7 = new float[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray5, floatArray7, (float) (byte) 100);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder3, (java.lang.Object) 100.0f);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests10.getTestName();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("<unknown>", indexReader20, (int) (byte) 10, postingsEnum22, postingsEnum23);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray8, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) builder3, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) 100, (long) 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Collection[] collectionArray36 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray37 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray36;
        baseTokenStreamTestCaseCollectionArray37[0] = baseTokenStreamTestCaseSet17;
        baseTokenStreamTestCaseCollectionArray37[1] = baseTokenStreamTestCaseSet34;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling44, throttling45, throttling46, throttling47 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray48);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray37, (java.lang.Object[]) throttlingArray48);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        double[] doubleArray3 = new double[] { (byte) 1, (short) 100 };
        double[] doubleArray6 = new double[] { '4', (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", doubleArray3, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 1, 1.0d, (double) (short) 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        double[] doubleArray5 = new double[] { (short) 100, 1L, 0, 10.0f };
        double[] doubleArray12 = new double[] { (short) 100, '4', 10.0d, (-1), (byte) 1, 0.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray5, doubleArray12, (double) (short) 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 0, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule11;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) testRule11, (java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) testRule11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        char[] charArray5 = new char[] { 'a', '#', 'a', '4' };
        char[] charArray8 = new char[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray5, charArray8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        double[] doubleArray1 = new double[] { 2 };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, 10.0d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) 10L, (float) 2);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] { (byte) 0, 'a', (short) 10 };
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray13, intArray14);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray8, intArray17);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.weekly", "europarl.lines.txt.gz", "tests.badapples", "tests.monster", "hi!", "tests.nightly" };
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray32, intArray33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("random", indexReader37, fields38, fields39, false);
        java.lang.String str42 = commonGramsTokenFilterFactoryTests35.getTestName();
        commonGramsTokenFilterFactoryTests35.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("<unknown>", indexReader45, (int) (byte) 10, postingsEnum47, postingsEnum48);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray33, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray33);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray54, intArray55);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray58, intArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray54, intArray58);
        org.junit.Assert.assertArrayEquals(intArray33, intArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray5, intArray8, strArray28, intArray58);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (byte) -1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) ' ');
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        int[] intArray6 = new int[] { 'a', (byte) 100, '#', (byte) -1, (byte) 0 };
        int[] intArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray6, intArray7);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray7, intArray12, (java.lang.Integer) 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray6, byteArray8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("<unknown>", postingsEnum15, postingsEnum16, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        double[] doubleArray6 = new double[] { (short) 1, 1.0f, 100.0d, 1.0f, (-1.0d) };
        double[] doubleArray12 = new double[] { (byte) -1, (byte) -1, 100.0f, (-1), (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray6, doubleArray12, (double) (-1L));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling4, throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("random", indexReader18, fields19, fields20, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray24 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests9, commonGramsTokenFilterFactoryTests16, commonGramsTokenFilterFactoryTests23 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet25 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray24);
        java.util.Set<org.junit.Assert> assertSet26 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) baseTokenStreamTestCaseArray24);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        byte[] byteArray7 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (int) (byte) 0, postingsEnum24, postingsEnum25);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("<unknown>", postingsEnum28, postingsEnum29, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        long[] longArray5 = new long[] { (short) 100, 1, 0, 10, (byte) 0 };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", (int) (byte) 100, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("tests.awaitsfix", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests15.assertTermsEquals("tests.nightly", indexReader23, terms24, terms25, false);
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray34, intArray35);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests37.assertFieldsEquals("random", indexReader39, fields40, fields41, false);
        java.lang.String str44 = commonGramsTokenFilterFactoryTests37.getTestName();
        commonGramsTokenFilterFactoryTests37.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("<unknown>", indexReader47, (int) (byte) 10, postingsEnum49, postingsEnum50);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray35, (java.lang.Object) commonGramsTokenFilterFactoryTests37);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray35);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray56, intArray57);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray60, intArray61);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray56, intArray60);
        org.junit.Assert.assertArrayEquals(intArray35, intArray60);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray68);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray72, intArray73);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray76, intArray77);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray72, intArray76);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray67, intArray76);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray35, intArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) intArray35);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        long[] longArray2 = new long[] { '#' };
        long[] longArray8 = new long[] { (byte) 1, (short) 100, 10L, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray2, longArray8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray7 = new short[] { (short) 1, (byte) 0, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray2, shortArray7);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        char[] charArray4 = new char[] { '4', '#', '#' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray4, charArray5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        long[] longArray6 = new long[] { 'a', 2, 1L, (short) 1, (byte) 0 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 1L, (-1.0d), 1.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.weekly", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("tests.awaitsfix", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests15.assertTermsEquals("tests.nightly", indexReader23, terms24, terms25, false);
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests15);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        float[] floatArray0 = null;
        float[] floatArray7 = new float[] { ' ', 10, (short) 1, (byte) 0, 1.0f, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray7, (float) ' ');
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        double[] doubleArray4 = new double[] { (short) -1, 0.0f, 100.0f, 1.0d };
        double[] doubleArray11 = new double[] { '#', (byte) 0, '#', 100, 1.0f, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray11, 100.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        double[] doubleArray2 = new double[] { 0L, 2 };
        double[] doubleArray8 = new double[] { 1, (short) 100, 100.0f, (byte) 1, 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray8, (double) '#');
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100.0f, (double) (byte) 1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests10.getTestName();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("<unknown>", indexReader20, (int) (byte) 10, postingsEnum22, postingsEnum23);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31, throttling32, throttling33, throttling34 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray35);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("random", indexReader41, fields42, fields43, false);
        org.elasticsearch.common.settings.Settings.Builder builder46 = commonGramsTokenFilterFactoryTests39.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests39.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule51 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests52.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsEnumEquals("tests.awaitsfix", postingsEnum55, postingsEnum56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        commonGramsTokenFilterFactoryTests52.assertTermsEquals("tests.nightly", indexReader60, terms61, terms62, false);
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) "tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        commonGramsTokenFilterFactoryTests69.assertFieldsEquals("random", indexReader71, fields72, fields73, false);
        org.elasticsearch.common.settings.Settings.Builder builder76 = commonGramsTokenFilterFactoryTests69.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule77 = commonGramsTokenFilterFactoryTests69.ruleChain;
        commonGramsTokenFilterFactoryTests69.tearDown();
        java.lang.Object[] objArray79 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests10, commonGramsTokenFilterFactoryTests27, "tests.weekly", commonGramsTokenFilterFactoryTests69 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling81 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling82 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling83 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling84 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray85 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling81, throttling82, throttling83, throttling84 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray85);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray85);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("<unknown>", objArray79, (java.lang.Object[]) throttlingArray85);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.nightly", indexReader9, terms10, terms11, false);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 0, (java.lang.Object) testRule14);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, (double) (byte) 0, (-1.0d));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", (int) (byte) 1, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder2, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "tests.nightly", (java.lang.Object) testRule15);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule15;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) 100.0f, (java.lang.Object) testRule15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) '4');
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 0, (double) (short) 1);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder15, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 100.0d, 0.0d);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("random", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) builder17);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        long[] longArray1 = new long[] {};
        long[] longArray6 = new long[] { (-1L), (short) 100, 100L, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray1, longArray6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader8, (int) '#', postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (-1.0d));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        float[] floatArray1 = new float[] {};
        float[] floatArray5 = new float[] { (short) 100, 2, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray5, (float) (byte) 100);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", (int) ' ', numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) (short) 0, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 10L, (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray4, (double) 'a');
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 100, 1.0f, (float) 10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) (byte) -1, (float) (byte) 10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule13);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        short[] shortArray4 = new short[] { (short) 1, (byte) 0, (byte) 100 };
        short[] shortArray10 = new short[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("<unknown>", indexReader10, (int) '#', postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (-1L), (long) 100);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) "", (java.lang.Object) '4');
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = new float[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, (float) 0L);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str14 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((-1));
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "tests.nightly", (java.lang.Object) testRule17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule17);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) 0, 100L);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        short[] shortArray1 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        long[] longArray4 = new long[] { ' ', 0, (byte) 10 };
        long[] longArray6 = new long[] { 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray4, longArray6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10.0f, (double) (byte) 1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        java.util.Set<org.junit.Assert> assertSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray15);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray15, (java.lang.Object[]) charSequenceArray24);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        java.lang.String str12 = commonGramsTokenFilterFactoryTests5.getTestName();
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("<unknown>", indexReader15, (int) (byte) 10, postingsEnum17, postingsEnum18);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray3, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23, true);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests5.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0.0f, (java.lang.Object) str26);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) (byte) -1, (float) 2);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray32 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests17, commonGramsTokenFilterFactoryTests24, commonGramsTokenFilterFactoryTests31 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet33 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray32);
        java.util.Collection[] collectionArray35 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray36 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray35;
        baseTokenStreamTestCaseCollectionArray36[0] = baseTokenStreamTestCaseSet16;
        baseTokenStreamTestCaseCollectionArray36[1] = baseTokenStreamTestCaseSet33;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet41 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray36);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray47, (java.lang.Object[]) charSequenceArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseCollectionArray36, (java.lang.Object[]) charSequenceArray47);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        long[] longArray2 = new long[] { ' ' };
        long[] longArray8 = new long[] { ' ', 'a', (short) 10, 1, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray2, longArray8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) '4', (long) (byte) 100);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        short[] shortArray6 = new short[] { (byte) 100, (short) 10, (byte) 10, (byte) 1, (byte) 1, (short) 100 };
        short[] shortArray12 = new short[] { (short) 1, (byte) -1, (byte) 100, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (byte) 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        char[] charArray6 = new char[] { ' ', '4', ' ', ' ', 'a', 'a' };
        char[] charArray11 = new char[] { ' ', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray4, byteArray10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        float[] floatArray2 = new float[] { 10 };
        float[] floatArray6 = new float[] { 100L, 10L, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray2, floatArray6, (float) 2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray3 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray2, floatArray3, (float) (byte) 1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        float[] floatArray4 = new float[] { 1.0f, (-1.0f), (-1L) };
        float[] floatArray6 = new float[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray4, floatArray6, (float) (-1L));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "tests.nightly", (java.lang.Object) testRule10);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule10;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule10;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule10;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16, throttling17, throttling18, throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) throttlingArray20);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("tests.nightly", indexReader22, terms23, terms24, false);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str14 = commonGramsTokenFilterFactoryTests0.getTestName();
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) charSequenceArray27);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0L, (long) 2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("random", indexReader13, fields14, fields15, false);
        java.lang.String str18 = commonGramsTokenFilterFactoryTests11.getTestName();
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests11.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("tests.nightly", indexReader22, terms23, terms24, false);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        short[] shortArray4 = new short[] { (byte) 0, (byte) 0, (short) 1, (short) 1 };
        short[] shortArray6 = new short[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        float[] floatArray1 = new float[] {};
        float[] floatArray6 = new float[] { 1.0f, (short) 1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray1, floatArray6, (float) 1L);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) '#', (float) (-1));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) 1L, (double) (short) 100, (double) 100L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests7.getTestName();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("<unknown>", indexReader17, (int) (byte) 10, postingsEnum19, postingsEnum20);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray5, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray5);
        int[] intArray25 = new int[] { 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray25);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0f, (float) (short) 100, (float) (short) -1);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0, queryCachingPolicy1 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass5 = queryCachingPolicy4.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass7 = queryCachingPolicy6.getClass();
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { wildcardClass5, wildcardClass7 };
        java.util.Set<java.lang.reflect.Type> typeSet9 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray8);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) typeArray8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder1, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder12);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray14 = new org.elasticsearch.common.settings.Settings.Builder[] { builder1, builder12 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet15 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray14);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy16 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy17 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray18 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy16, queryCachingPolicy17 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet19 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray18);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) builderArray14, (java.lang.Object[]) queryCachingPolicyArray18);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", obj1, (java.lang.Object) (short) -1);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        float[] floatArray1 = new float[] {};
        float[] floatArray8 = new float[] { 100, 1, 1.0f, (short) 0, (-1L), 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray8, (float) (byte) 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests15.assertFieldsEquals("random", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray23 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15, commonGramsTokenFilterFactoryTests22 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet24 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray23);
        java.util.Set<org.junit.Assert> assertSet25 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray23);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet26 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) baseTokenStreamTestCaseArray23);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.monster", false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder2, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder13);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray15 = new org.elasticsearch.common.settings.Settings.Builder[] { builder2, builder13 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet16 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) builderArray15, (java.lang.Object[]) charSequenceArray22);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("random", indexReader26, (int) '#', postingsEnum28, postingsEnum29);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling32, throttling33, throttling34, throttling35 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests40.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsEnumEquals("tests.nightly", postingsEnum43, postingsEnum44, false);
        java.lang.Object[] objArray47 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests18, throttlingEnumSet37, locale39, "tests.nightly" };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) baseTokenStreamTestCaseArray16, objArray47);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests15.assertFieldsEquals("random", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray23 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15, commonGramsTokenFilterFactoryTests22 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet24 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("random", indexReader34, fields35, fields36, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray40 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32, commonGramsTokenFilterFactoryTests39 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet41 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray40);
        java.util.Collection[] collectionArray43 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray44 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray43;
        baseTokenStreamTestCaseCollectionArray44[0] = baseTokenStreamTestCaseSet24;
        baseTokenStreamTestCaseCollectionArray44[1] = baseTokenStreamTestCaseSet41;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet49 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray44);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        commonGramsTokenFilterFactoryTests9.tearDown();
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder8, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests19.getTestName();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests9, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (short) 10, (double) 2);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        float[] floatArray2 = new float[] { (short) 100, 10L };
        float[] floatArray5 = new float[] { 0, 0L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray5, 0.0f);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        short[] shortArray3 = new short[] { (short) 10, (byte) 10, (byte) 1 };
        short[] shortArray8 = new short[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        short[] shortArray1 = new short[] { (short) 0 };
        short[] shortArray5 = new short[] { (short) 100, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder2, (java.lang.Object) 100.0f);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        java.lang.String str16 = commonGramsTokenFilterFactoryTests9.getTestName();
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("<unknown>", indexReader19, (int) (byte) 10, postingsEnum21, postingsEnum22);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray7, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) builder2, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests9.assertDocValuesEquals("tests.slow", (-1), numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), 10.0f, (float) 10L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        char[] charArray6 = new char[] { '4', '#', '#', '#', '4' };
        char[] charArray13 = new char[] { '4', '#', '4', 'a', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray6, charArray13);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 2);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray5, intArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        java.lang.String str15 = commonGramsTokenFilterFactoryTests8.getTestName();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("<unknown>", indexReader18, (int) (byte) 10, postingsEnum20, postingsEnum21);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray6, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray6);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray27, intArray28);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray27, intArray31);
        org.junit.Assert.assertArrayEquals(intArray6, intArray31);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray38, intArray39);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray38, intArray42);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray49, intArray50);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray49, intArray53);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray59, intArray60);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray59, intArray63);
        org.junit.Assert.assertArrayEquals("", intArray53, intArray63);
        int[] intArray69 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray31, intArray38, intArray53, intArray69, (java.lang.Integer) 100);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        char[] charArray5 = new char[] { 'a', '4', 'a', '4' };
        char[] charArray8 = new char[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray5, charArray8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        char[] charArray4 = new char[] { '4', '#', 'a' };
        char[] charArray11 = new char[] { 'a', '#', 'a', '4', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray4, charArray11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        java.lang.String str12 = commonGramsTokenFilterFactoryTests5.getTestName();
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("<unknown>", indexReader15, (int) (byte) 10, postingsEnum17, postingsEnum18);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray3, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) intArray3, (java.lang.Object) 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) (short) 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.slow", indexReader11, (int) '4', postingsEnum13, postingsEnum14);
        java.lang.String str16 = commonGramsTokenFilterFactoryTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) '4', (double) 'a', 100.0d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        long[] longArray1 = new long[] { (-1) };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.Class<?> wildcardClass8 = commonGramsTokenFilterFactoryTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray16);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass20 = queryCachingPolicy19.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy21 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass22 = queryCachingPolicy21.getClass();
        java.lang.reflect.Type[] typeArray23 = new java.lang.reflect.Type[] { wildcardClass20, wildcardClass22 };
        java.util.Set<java.lang.reflect.Type> typeSet24 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) baseTokenStreamTestCaseArray16, (java.lang.Object[]) typeArray23);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) -1, (long) 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        char[] charArray2 = new char[] { '#', 'a' };
        char[] charArray4 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) (byte) 0, (float) 1L);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("", indexReader19, (int) (short) 10, postingsEnum21, postingsEnum22);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray24 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests10 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet25 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray24);
        java.lang.Object obj26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) baseTokenStreamTestCaseArray24, obj26);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("tests.nightly", indexReader22, terms23, terms24, false);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", (int) (short) 1, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        float[] floatArray7 = new float[] { 10.0f, 2, (short) 0, 10, 100L, 1L };
        float[] floatArray8 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray7, floatArray8, (float) 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        float[] floatArray6 = new float[] { (byte) 100, 1.0f, 100, (short) -1, (byte) 1 };
        float[] floatArray8 = new float[] { (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray6, floatArray8, (-1.0f));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray3, byteArray9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        short[] shortArray1 = new short[] {};
        short[] shortArray3 = new short[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray1, shortArray3);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("random", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("", indexReader20, (int) (short) 10, postingsEnum22, postingsEnum23);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray25 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests11 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet26 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) baseTokenStreamTestCaseArray25);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray5, byteArray12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (-1));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (-1.0f), (float) 0L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        float[] floatArray4 = new float[] { 1.0f, 'a', 100 };
        float[] floatArray6 = new float[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray6, (float) (short) 100);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) (byte) -1, (float) 10, (float) (short) 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) "tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) -1 };
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray14);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) '4');
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 0.0f);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) 1, (double) 2, (double) (short) -1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray16);
        java.lang.Object[] objArray19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) baseTokenStreamTestCaseArray16, objArray19);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        float[] floatArray4 = new float[] { (byte) 1, (byte) 1, 0.0f };
        float[] floatArray10 = new float[] { (-1), (short) 1, 0, 2, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray4, floatArray10, (float) 100);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("random", indexReader16, (int) '#', postingsEnum18, postingsEnum19);
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("hi!", indexReader24, 100, postingsEnum26, postingsEnum27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "hi!");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        char[] charArray4 = new char[] { 'a', '#', '#' };
        char[] charArray10 = new char[] { '#', '#', 'a', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray4, charArray10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        long[] longArray5 = new long[] { ' ', (-1), (short) 1, 100L };
        long[] longArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests7.getTestName();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("random", indexReader18, fields19, fields20, false);
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("", indexReader25, (int) (short) 10, postingsEnum27, postingsEnum28);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray30 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests16 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet31 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) baseTokenStreamTestCaseArray30);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder1, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder12);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray14 = new org.elasticsearch.common.settings.Settings.Builder[] { builder1, builder12 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet15 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray14);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray28);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) builderArray14, (java.lang.Object[]) charSequenceArray28);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (short) -1, (double) (short) 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        long[] longArray0 = new long[] {};
        long[] longArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass2 = queryCachingPolicy1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) queryCachingPolicy1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (byte) 100 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        double[] doubleArray2 = new double[] { 1L, (-1.0f) };
        double[] doubleArray7 = new double[] { 'a', (short) 100, (short) 10, (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) 0L);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        java.lang.Object obj1 = new java.lang.Object();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) testRule14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        double[] doubleArray3 = new double[] { (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray14 = new double[] { (byte) -1, 100L, (short) 100, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray3, doubleArray14, (double) 100);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder2, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder13);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray15 = new org.elasticsearch.common.settings.Settings.Builder[] { builder2, builder13 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet16 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray32 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests17, commonGramsTokenFilterFactoryTests24, commonGramsTokenFilterFactoryTests31 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet33 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) builderArray15, (java.lang.Object[]) baseTokenStreamTestCaseArray32);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        java.lang.String str15 = commonGramsTokenFilterFactoryTests8.getTestName();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("", indexReader26, (int) (short) 10, postingsEnum28, postingsEnum29);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray31 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests17 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet32 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) baseTokenStreamTestCaseArray31);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0, (double) 100);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) 100.0f, (double) 0.0f, (double) 100);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray6);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 0, (double) 2, (double) 1.0f);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests12.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests12.ruleChain;
        commonGramsTokenFilterFactoryTests12.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) 'a', (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) 1.0f, 0.0d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", 0.0d, (double) 1, (double) 10.0f);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) (byte) 100, (float) 1L);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader8, (int) '#', postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests17.ruleChain;
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) builder16, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests17.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) 'a');
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", 100, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) intArray7, (java.lang.Object) (-1.0f));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        short[] shortArray0 = new short[] {};
        short[] shortArray7 = new short[] { (byte) 10, (short) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray7);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum3, postingsEnum4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder1, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder12);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray14 = new org.elasticsearch.common.settings.Settings.Builder[] { builder1, builder12 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet15 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray14);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("random", indexReader18, fields19, fields20, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests23.assertFieldsEquals("random", indexReader25, fields26, fields27, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray31 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests16, commonGramsTokenFilterFactoryTests23, commonGramsTokenFilterFactoryTests30 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet32 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("random", indexReader35, fields36, fields37, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests40.assertFieldsEquals("random", indexReader42, fields43, fields44, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray48 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests33, commonGramsTokenFilterFactoryTests40, commonGramsTokenFilterFactoryTests47 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet49 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray48);
        java.util.Collection[] collectionArray51 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray52 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray51;
        baseTokenStreamTestCaseCollectionArray52[0] = baseTokenStreamTestCaseSet32;
        baseTokenStreamTestCaseCollectionArray52[1] = baseTokenStreamTestCaseSet49;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet57 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray52);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) builderArray14, (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray52);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0, queryCachingPolicy1 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass5 = queryCachingPolicy4.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass7 = queryCachingPolicy6.getClass();
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { wildcardClass5, wildcardClass7 };
        java.util.Set<java.lang.reflect.Type> typeSet9 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray8);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) typeArray8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        float[] floatArray3 = new float[] { 10.0f, 'a' };
        float[] floatArray4 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray3, floatArray4, (float) 1L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) '#', (long) (byte) 100);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        long[] longArray4 = new long[] { (byte) 1, 100, (short) 10 };
        long[] longArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray5);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling4, throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray6);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray21);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) charSequenceArray21);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, 10.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        java.lang.String str12 = commonGramsTokenFilterFactoryTests5.getTestName();
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("<unknown>", indexReader15, (int) (byte) 10, postingsEnum17, postingsEnum18);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray3, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 100L, (java.lang.Object) postingsEnum23);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 100, (double) 100.0f);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        char[] charArray4 = new char[] { 'a', '#', '4', '4' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, 1.0f, (float) (byte) 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray13);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy16 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass17 = queryCachingPolicy16.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass19 = queryCachingPolicy18.getClass();
        java.lang.reflect.Type[] typeArray20 = new java.lang.reflect.Type[] { wildcardClass17, wildcardClass19 };
        java.util.Set<java.lang.reflect.Type> typeSet21 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) typeArray20);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, (long) 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 0, (double) (-1L), 10.0d);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray14);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "", (java.lang.Object) charSequenceArray14);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Set<org.junit.Assert> assertSet35 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray33);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet36 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) baseTokenStreamTestCaseArray33);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass3 = queryCachingPolicy2.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass5 = queryCachingPolicy4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass3, wildcardClass5 };
        java.util.Set<java.lang.reflect.Type> typeSet7 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray1, (java.lang.Object[]) typeArray6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        double[] doubleArray2 = new double[] { (byte) 1, '#' };
        double[] doubleArray5 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 100L);
        double[] doubleArray10 = new double[] { (byte) 1, '#' };
        double[] doubleArray13 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray13, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray13, (double) 100.0f);
        double[] doubleArray19 = new double[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray19, (double) 10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray3);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        commonGramsTokenFilterFactoryTests4.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) (byte) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) (-1.0f));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 0L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 'a', (float) (-1), 0.0f);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        long[] longArray6 = new long[] { 100, 1L, 1L, (-1L), 0L };
        long[] longArray8 = new long[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray6, longArray8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        long[] longArray2 = new long[] { '#' };
        long[] longArray9 = new long[] { 100, (short) 100, 2, 1, (byte) 1, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray2, longArray9);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum5, postingsEnum6, false);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) str9, (java.lang.Object) testRule22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests24.assertPositionsSkippingEquals("", indexReader33, (int) (short) 10, postingsEnum35, postingsEnum36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) str9, (java.lang.Object) indexReader33);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { (short) 10, 100L, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) (byte) 1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        char[] charArray4 = new char[] { 'a', ' ', 'a' };
        char[] charArray7 = new char[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray4, charArray7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        char[] charArray5 = new char[] { 'a', '4', '#', '#' };
        char[] charArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray5, charArray6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) (short) 100, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        long[] longArray2 = new long[] { 2 };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        char[] charArray0 = null;
        char[] charArray3 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder2, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder13);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray15 = new org.elasticsearch.common.settings.Settings.Builder[] { builder2, builder13 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet16 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) builderArray15, (java.lang.Object[]) charSequenceArray22);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) (byte) 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        double[] doubleArray3 = new double[] { (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray11 = new double[] { (byte) 1, '#' };
        double[] doubleArray14 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray14, (double) 100.0f);
        double[] doubleArray21 = new double[] { (byte) 1, '#' };
        double[] doubleArray24 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray24, (double) 100L);
        double[] doubleArray29 = new double[] { (byte) 1, '#' };
        double[] doubleArray32 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray29, (double) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray14, doubleArray29, (double) 0.0f);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("tests.nightly", indexReader22, terms23, terms24, false);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests14.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule30, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader8, (int) '#', postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, (int) '4', postingsEnum17, postingsEnum18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        java.util.Set<org.junit.Assert> assertSet18 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20, throttling21, throttling22, throttling23 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) baseTokenStreamTestCaseArray16, (java.lang.Object[]) throttlingArray24);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0, queryCachingPolicy1 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray18);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "", (java.lang.Object) charSequenceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) charSequenceArray18);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray15);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "", (java.lang.Object) charSequenceArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("random", indexReader29, fields30, fields31, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray35 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests20, commonGramsTokenFilterFactoryTests27, commonGramsTokenFilterFactoryTests34 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet36 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray35);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) baseTokenStreamTestCaseArray35);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        double[] doubleArray2 = new double[] { (byte) 1, '#' };
        double[] doubleArray5 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 100L);
        double[] doubleArray10 = new double[] { (byte) 1, '#' };
        double[] doubleArray13 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray13, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray13, (double) 100.0f);
        double[] doubleArray20 = new double[] { (byte) 1, '#' };
        double[] doubleArray23 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray20, 1.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (-1));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.slow", indexReader15, (int) (short) 10, postingsEnum17, postingsEnum18, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (short) 10, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray5);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        char[] charArray4 = new char[] { '#', ' ', 'a' };
        char[] charArray8 = new char[] { '4', 'a', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray4, charArray8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("random", indexReader23, fields24, fields25, false);
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests21);
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) testRule30, (java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray8);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray14, intArray15);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray14, intArray18);
        org.junit.Assert.assertArrayEquals(intArray4, intArray18);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray26, intArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("random", indexReader31, fields32, fields33, false);
        java.lang.String str36 = commonGramsTokenFilterFactoryTests29.getTestName();
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("<unknown>", indexReader39, (int) (byte) 10, postingsEnum41, postingsEnum42);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray27, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray27);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray48, intArray49);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray48, intArray52);
        org.junit.Assert.assertArrayEquals(intArray27, intArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray18, intArray52);
        int[] intArray58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray18, intArray58);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 100.0f, (double) (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule8;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule8, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray6 = new char[] { ' ', 'a', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100.0f, (double) (short) 10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        long[] longArray6 = new long[] { (short) -1, (-1), (-1), 0L, 100, (-1L) };
        long[] longArray12 = new long[] { (byte) 10, '#', (byte) 10, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1.0d, (double) (byte) 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling4, throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray6);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray23);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "", (java.lang.Object) charSequenceArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) charSequenceArray23);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 100, (long) (short) 10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) 10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader11, (int) (byte) 10, postingsEnum13, postingsEnum14);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.String str17 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        long[] longArray4 = new long[] { (byte) 10, 100L, 1L, (short) 100 };
        long[] longArray11 = new long[] { 'a', (short) 10, 10L, ' ', 10L, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        long[] longArray1 = null;
        long[] longArray6 = new long[] { 2, (byte) -1, 0L, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray1, longArray6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("random", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("tests.slow", indexReader28, (int) '4', postingsEnum30, postingsEnum31);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        char[] charArray5 = new char[] { '4', ' ', '4', ' ', '4' };
        char[] charArray8 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        double[] doubleArray3 = new double[] { (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray11 = new double[] { (byte) 1, '#' };
        double[] doubleArray14 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray14, (double) 100.0f);
        double[] doubleArray21 = new double[] { (byte) 1, '#' };
        double[] doubleArray24 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray24, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray6, doubleArray24, 100.0d);
        double[] doubleArray31 = new double[] { (byte) 1, '#' };
        double[] doubleArray34 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray34, (double) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray31, (double) 1L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        float[] floatArray1 = new float[] {};
        float[] floatArray4 = new float[] { 100.0f, (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray4, (float) 0L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        char[] charArray7 = new char[] { ' ', ' ', '#', ' ', '#', 'a' };
        char[] charArray12 = new char[] { 'a', 'a', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray7, charArray12);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) 1, 0.0d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (-1), 100.0d, 0.0d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) "hi!");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 2, (long) (short) 1);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        short[] shortArray7 = new short[] { (short) 1, (short) -1, (byte) 1, (byte) -1, (byte) -1, (short) 0 };
        short[] shortArray9 = new short[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray7, shortArray9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        long[] longArray6 = new long[] { (short) 100, 1, (short) 10, (-1), ' ' };
        long[] longArray10 = new long[] { '#', (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        float[] floatArray1 = new float[] { 2 };
        float[] floatArray6 = new float[] { ' ', 10L, 10L, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) 2);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        float[] floatArray5 = new float[] { 10, 100L, ' ', 0.0f, 100 };
        float[] floatArray7 = new float[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray7, 10.0f);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        char[] charArray4 = new char[] { '#', '#', '4' };
        char[] charArray10 = new char[] { '4', '#', 'a', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray4, charArray10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum14, postingsEnum15, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) testRule27);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 100, (-1.0d));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Collection[] collectionArray36 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray37 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray36;
        baseTokenStreamTestCaseCollectionArray37[0] = baseTokenStreamTestCaseSet17;
        baseTokenStreamTestCaseCollectionArray37[1] = baseTokenStreamTestCaseSet34;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray37);
        java.lang.Object[] objArray43 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray37, objArray43);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        java.lang.String str16 = commonGramsTokenFilterFactoryTests9.getTestName();
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("<unknown>", indexReader19, (int) (byte) 10, postingsEnum21, postingsEnum22);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.failfast", indexReader27, 100, postingsEnum29, postingsEnum30, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder2, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder13);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray15 = new org.elasticsearch.common.settings.Settings.Builder[] { builder2, builder13 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet16 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder18, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("random", indexReader24, fields25, fields26, false);
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder29);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray31 = new org.elasticsearch.common.settings.Settings.Builder[] { builder18, builder29 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet32 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray31);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) builderArray15, (java.lang.Object[]) builderArray31);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        float[] floatArray5 = new float[] { 10, 1L, (short) 100, (-1.0f) };
        float[] floatArray10 = new float[] { ' ', (byte) -1, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray5, floatArray10, (float) '#');
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (byte) 10, (double) 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 1, (double) (short) 0, (double) 2);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        short[] shortArray4 = new short[] { (byte) 1, (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray5);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray20 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy18, queryCachingPolicy19 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet21 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray20);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet22 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) baseTokenStreamTestCaseArray16, (java.lang.Object[]) queryCachingPolicyArray20);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 10, (double) 0L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray3);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("random", indexReader16, fields17, fields18, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray22 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14, commonGramsTokenFilterFactoryTests21 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet23 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray22);
        java.util.Set<org.junit.Assert> assertSet24 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) baseTokenStreamTestCaseArray22);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        long[] longArray3 = new long[] { (byte) 0, 10L, 1L };
        long[] longArray10 = new long[] { 100L, (byte) 10, 1L, 100L, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader10, 1, postingsEnum12, postingsEnum13, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs((-1));
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("random", indexReader24, terms25, terms26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.awaitsfix", postingsEnum5, postingsEnum6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsEnumEquals("tests.awaitsfix", postingsEnum26, postingsEnum27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        commonGramsTokenFilterFactoryTests23.assertTermsEquals("tests.nightly", indexReader31, terms32, terms33, false);
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) commonGramsTokenFilterFactoryTests23);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) postingsEnum5, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum14, postingsEnum15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        float[] floatArray7 = new float[] { 100.0f, (short) 10, 0.0f, (byte) -1, (short) 100, (short) -1 };
        float[] floatArray13 = new float[] { (-1.0f), 10.0f, (byte) 1, 10L, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray7, floatArray13, (float) ' ');
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (byte) 10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) '4');
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 'a', (double) 100, (double) 1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10L, (double) (byte) 100, (-1.0d));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) (byte) 1, (float) (byte) -1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder5, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder16);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray18 = new org.elasticsearch.common.settings.Settings.Builder[] { builder5, builder16 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet19 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "hi!", (java.lang.Object) builderArray18);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0.0f, (double) (short) 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (short) 1, (double) 1L, (double) 100.0f);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) builder8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) 100, (double) 10, (double) (short) 100);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 100L, 1.0f, (float) 10L);
    }
}

