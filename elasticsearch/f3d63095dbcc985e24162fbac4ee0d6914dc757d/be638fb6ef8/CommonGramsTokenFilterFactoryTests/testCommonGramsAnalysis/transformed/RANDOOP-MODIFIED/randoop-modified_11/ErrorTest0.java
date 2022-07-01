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
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short[] shortArray7 = new short[] { (byte) 10, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray2, byteArray8);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1), (double) 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { ' ', (-1.0f), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray1, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        int[] intArray5 = new int[] { '4', ' ', 0, (-1), (short) 1 };
        int[] intArray7 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        int[] intArray7 = new int[] { (byte) -1, 'a', (short) 1, 'a', (byte) 10, 10 };
        int[] intArray12 = new int[] { (byte) 1, (-1), (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray7, intArray12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("", true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) (short) 1, (float) 100, (float) (-1L));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.Object[] objArray14 = new java.lang.Object[] { builder9, 1.0d, 100.0d, 1.0f, (short) 0 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader20, (int) (short) 100, postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (byte) -1, 100L, 10L, commonGramsTokenFilterFactoryTests18 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", objArray14, objArray27);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", 10, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 1, 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) -1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100.0d, builder10, 1.0d, commonGramsTokenFilterFactoryTests12, (-1), (-1.0f) };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, false);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsSkippingEquals("", indexReader27, (int) (short) 100, postingsEnum29, postingsEnum30, false);
        java.lang.Object[] objArray37 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests16, indexReader27, (byte) 100, 0, "hi!", (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("", objArray15, objArray37);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L), "tests.badapples" };
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, "random", (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", objArray3, objArray7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 0L);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        int[] intArray2 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { 10, (byte) -1, '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray2, intArray7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        float[] floatArray6 = new float[] { '#', (short) 1, 100.0f, (-1), 0, (short) 100 };
        float[] floatArray8 = new float[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray8, (float) (byte) -1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 1, 0.0d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        long[] longArray4 = new long[] { 0, 1L, 0L, 100L };
        long[] longArray9 = new long[] { (short) 1, 1, '#', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { (byte) 0, (short) 100, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!", 'a', (short) -1 };
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj4, 100L, 10L, 10L, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray3, objArray9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] { (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        java.lang.Object[] objArray2 = new java.lang.Object[] { "hi!" };
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", objArray2, objArray3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 10L, (double) (short) 10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (-1.0d));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        int[] intArray2 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (byte) 100, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray2, intArray6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1), 10.0d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1.0f, (java.lang.Object) 100.0f);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        float[] floatArray6 = new float[] { 1, 1.0f, 100.0f, (byte) 100, (short) 100, 100L };
        float[] floatArray9 = new float[] { (short) 0, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray9, (float) 1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        byte[] byteArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray7, byteArray8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        float[] floatArray3 = new float[] { 0L, (-1), 0L };
        float[] floatArray5 = new float[] { 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) (short) 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) ' ', (double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        java.lang.Object obj1 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", obj1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.Object[] objArray21 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests0, (-1.0f), (-1L), 100, 0 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsSkippingEquals("", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27, false);
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsSkippingEquals("", indexReader32, (-1), postingsEnum34, postingsEnum35, true);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests22.ruleChain;
        java.lang.Class<?> wildcardClass39 = commonGramsTokenFilterFactoryTests22.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader42, (int) (short) 100, postingsEnum44, postingsEnum45, false);
        org.elasticsearch.common.settings.Settings.Builder builder48 = commonGramsTokenFilterFactoryTests40.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader50, (-1), postingsEnum52, postingsEnum53, true);
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests40.ruleChain;
        java.lang.Class<?> wildcardClass57 = commonGramsTokenFilterFactoryTests40.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests58.assertDocsSkippingEquals("", indexReader60, (int) (short) 100, postingsEnum62, postingsEnum63, false);
        org.elasticsearch.common.settings.Settings.Builder builder66 = commonGramsTokenFilterFactoryTests58.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests58.assertDocsSkippingEquals("", indexReader68, (-1), postingsEnum70, postingsEnum71, true);
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests58.ruleChain;
        java.lang.Class<?> wildcardClass75 = commonGramsTokenFilterFactoryTests58.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray76 = new java.lang.reflect.AnnotatedElement[] { wildcardClass39, wildcardClass57, wildcardClass75 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet77 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray21, (java.lang.Object[]) annotatedElementArray76);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        long[] longArray4 = new long[] { 1, 'a', 0L };
        long[] longArray10 = new long[] { (byte) -1, 100L, 'a', (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.Class<?> wildcardClass17 = commonGramsTokenFilterFactoryTests0.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader20, (int) (short) 100, postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader28, (-1), postingsEnum30, postingsEnum31, true);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests18.ruleChain;
        java.lang.Class<?> wildcardClass35 = commonGramsTokenFilterFactoryTests18.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader38, (int) (short) 100, postingsEnum40, postingsEnum41, false);
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests36.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader46, (-1), postingsEnum48, postingsEnum49, true);
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests36.ruleChain;
        java.lang.Class<?> wildcardClass53 = commonGramsTokenFilterFactoryTests36.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray54 = new java.lang.reflect.AnnotatedElement[] { wildcardClass17, wildcardClass35, wildcardClass53 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet55 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray54);
        java.lang.Object[] objArray57 = new java.lang.Object[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray54, objArray57);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) (byte) 0, (float) 0L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) 1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (short) 10, (double) 100L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.NumericDocValues numericDocValues3 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 10, numericDocValues3, numericDocValues4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        long[] longArray2 = new long[] { (short) 1 };
        long[] longArray5 = new long[] { (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        java.lang.Class<?> wildcardClass19 = commonGramsTokenFilterFactoryTests2.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader30, (-1), postingsEnum32, postingsEnum33, true);
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests20.ruleChain;
        java.lang.Class<?> wildcardClass37 = commonGramsTokenFilterFactoryTests20.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests38.assertDocsSkippingEquals("", indexReader40, (int) (short) 100, postingsEnum42, postingsEnum43, false);
        org.elasticsearch.common.settings.Settings.Builder builder46 = commonGramsTokenFilterFactoryTests38.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests38.assertDocsSkippingEquals("", indexReader48, (-1), postingsEnum50, postingsEnum51, true);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests38.ruleChain;
        java.lang.Class<?> wildcardClass55 = commonGramsTokenFilterFactoryTests38.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray56 = new java.lang.reflect.AnnotatedElement[] { wildcardClass19, wildcardClass37, wildcardClass55 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet57 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", objArray1, (java.lang.Object[]) annotatedElementArray56);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader17, (java.lang.Object) 10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        int[] intArray6 = new int[] { (byte) 100, 100, '#', (byte) 100, (short) 100 };
        int[] intArray13 = new int[] { '#', (short) 0, (short) 0, (short) 1, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray13);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) 0L, 1.0f);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) locale20);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        double[] doubleArray2 = new double[] { (byte) 100 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray2, doubleArray3, (double) 1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        long[] longArray5 = new long[] { 100, 100L, (-1), (-1) };
        long[] longArray11 = new long[] { ' ', 10L, (short) 1, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray5, longArray11);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) '4');
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        java.lang.Object obj17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "", obj17);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        double[] doubleArray4 = new double[] { (byte) -1, 1.0d, (byte) 10 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray4, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) 100, (long) (short) 10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) -1, (double) (byte) 10, (double) (short) 1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 100.0f, 0.0f, (float) 10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) (short) -1, (java.lang.Object) 10L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.Class<?> wildcardClass18 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24, false);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader29, (-1), postingsEnum31, postingsEnum32, true);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests19.ruleChain;
        java.lang.Class<?> wildcardClass36 = commonGramsTokenFilterFactoryTests19.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader39, (int) (short) 100, postingsEnum41, postingsEnum42, false);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests37.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader47, (-1), postingsEnum49, postingsEnum50, true);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests37.ruleChain;
        java.lang.Class<?> wildcardClass54 = commonGramsTokenFilterFactoryTests37.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray55 = new java.lang.reflect.AnnotatedElement[] { wildcardClass18, wildcardClass36, wildcardClass54 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet56 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray55);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests61.assertDocsSkippingEquals("", indexReader63, (int) (short) 100, postingsEnum65, postingsEnum66, false);
        org.elasticsearch.common.settings.Settings.Builder builder69 = commonGramsTokenFilterFactoryTests61.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests61.assertDocsSkippingEquals("", indexReader71, (-1), postingsEnum73, postingsEnum74, true);
        org.junit.rules.TestRule testRule77 = commonGramsTokenFilterFactoryTests61.ruleChain;
        java.lang.Object[] objArray78 = new java.lang.Object[] { "", (short) 10, '#', (short) 100, testRule77 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) annotatedElementArray55, objArray78);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        java.lang.Class<?> wildcardClass19 = commonGramsTokenFilterFactoryTests2.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) "tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        short[] shortArray6 = new short[] { (short) -1, (byte) -1, (short) 0, (short) -1, (byte) 1 };
        short[] shortArray9 = new short[] { (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray9);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        int[] intArray4 = new int[] { 1, (short) -1, (byte) 1, 0 };
        int[] intArray9 = new int[] { (byte) 10, (short) 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttling0, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader17, terms18, terms19, false);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (byte) 0, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        byte[] byteArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.Object obj17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule16, obj17);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", obj1, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        long[] longArray1 = new long[] { (-1L) };
        long[] longArray8 = new long[] { 1, 1, 10L, (-1L), 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        short[] shortArray5 = new short[] { (byte) 1, (byte) 100, (short) 10, (short) 1 };
        short[] shortArray7 = new short[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray5, shortArray7);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        byte[] byteArray8 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray7, byteArray8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0.0f, (java.lang.Object) postingsEnum27);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        double[] doubleArray3 = new double[] { (byte) 100, 0 };
        double[] doubleArray7 = new double[] { 100L, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray3, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (short) 1, (long) (byte) -1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) (byte) 1, (double) (byte) 100);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (short) 10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 'a');
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) -1, (long) (byte) -1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) 0L, (double) (byte) 0, (double) ' ');
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        long[] longArray1 = new long[] { (byte) 10 };
        long[] longArray3 = new long[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        float[] floatArray1 = new float[] { 1L };
        float[] floatArray7 = new float[] { (byte) -1, 100, (short) 1, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray7, 0.0f);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (byte) 100);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (-1), (double) (short) 10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '4', (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 100, 0.0d, 1.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader18, terms19, terms20, false);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        java.lang.Class<?> wildcardClass19 = commonGramsTokenFilterFactoryTests2.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) '4', (java.lang.Object) wildcardClass19);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.awaitsfix", indexReader25, (int) (short) 100, postingsEnum27, postingsEnum28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader25, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) (short) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray5, byteArray10);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        double[] doubleArray6 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray13 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray13, (double) 100.0f);
        double[] doubleArray17 = new double[] { 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray17, (double) (-1L));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader2, fields3, fields4, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) fields4, (java.lang.Object) (-1.0f));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) 10L, (double) (-1.0f));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) (short) 100, (float) 'a');
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100, 1L, 1.0d };
        java.lang.Object[] objArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray3, objArray4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader23, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests28.assertDocValuesEquals("tests.nightly", (int) (short) 100, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 10, (double) 1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader20, (int) (short) 100, postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("", indexReader29, (int) (short) 100, postingsEnum31, postingsEnum32, false);
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("", indexReader37, (-1), postingsEnum39, postingsEnum40, true);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests27.ruleChain;
        commonGramsTokenFilterFactoryTests27.tearDown();
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) builder26, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) (byte) -1, (float) 100);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1.0d), (double) (byte) 100, 1.0d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("", indexReader12, (int) (short) 100, postingsEnum14, postingsEnum15, false);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("", indexReader20, (-1), postingsEnum22, postingsEnum23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("tests.badapples", indexReader27, (int) (byte) -1, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("tests.awaitsfix", indexReader33, (int) (short) 100, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("", indexReader39, (int) (byte) 0, postingsEnum41, postingsEnum42);
        java.lang.Object[] objArray44 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests1, (-1), "" };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy45 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests47.assertDocsSkippingEquals("", indexReader49, (int) (short) 100, postingsEnum51, postingsEnum52, false);
        org.elasticsearch.common.settings.Settings.Builder builder55 = commonGramsTokenFilterFactoryTests47.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsSkippingEquals("", indexReader58, (int) (short) 100, postingsEnum60, postingsEnum61, false);
        org.elasticsearch.common.settings.Settings.Builder builder64 = commonGramsTokenFilterFactoryTests56.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsSkippingEquals("", indexReader66, (-1), postingsEnum68, postingsEnum69, true);
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests56.ruleChain;
        commonGramsTokenFilterFactoryTests56.tearDown();
        commonGramsTokenFilterFactoryTests56.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) builder55, (java.lang.Object) commonGramsTokenFilterFactoryTests56);
        org.elasticsearch.common.settings.Settings.Builder builder76 = commonGramsTokenFilterFactoryTests56.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests78 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        commonGramsTokenFilterFactoryTests78.assertDocsSkippingEquals("", indexReader80, (int) (short) 100, postingsEnum82, postingsEnum83, false);
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        org.apache.lucene.index.Terms terms89 = null;
        commonGramsTokenFilterFactoryTests78.assertTermsEquals("", indexReader87, terms88, terms89, false);
        java.lang.Object[] objArray93 = new java.lang.Object[] { queryCachingPolicy45, '4', commonGramsTokenFilterFactoryTests56, (short) 100, terms88, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", objArray44, objArray93);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) queryCachingPolicy3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) false, (java.lang.Object) "random");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader18, terms19, terms20, false);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsSkippingEquals("", indexReader26, (int) (short) 100, postingsEnum28, postingsEnum29, false);
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsSkippingEquals("", indexReader34, (-1), postingsEnum36, postingsEnum37, true);
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests24.ruleChain;
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) builder23, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 10L, 0.0d, (double) (-1.0f));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        long[] longArray5 = new long[] { (short) -1, 'a', (byte) 100, (-1) };
        long[] longArray9 = new long[] { 1L, (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray5, longArray9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) (byte) -1, (float) 10L);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        double[] doubleArray6 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray13 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray13, (double) 100.0f);
        double[] doubleArray22 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray29 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray29, (double) 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray29, (double) (short) 1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        char[] charArray1 = new char[] {};
        char[] charArray8 = new char[] { ' ', ' ', ' ', 'a', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        long[] longArray6 = new long[] { 0, (byte) -1, 10L, (-1L), 'a', 1L };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 10, 0.0d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        double[] doubleArray3 = new double[] { 100.0d, ' ', ' ' };
        double[] doubleArray10 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray17 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray17, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray17, 10.0d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("tests.weekly", indexReader26, fields27, fields28, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) indexReader26);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader33, 0, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.weekly", postingsEnum39, postingsEnum40, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 10.0f);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.Class<?> wildcardClass18 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24, false);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader29, (-1), postingsEnum31, postingsEnum32, true);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests19.ruleChain;
        java.lang.Class<?> wildcardClass36 = commonGramsTokenFilterFactoryTests19.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader39, (int) (short) 100, postingsEnum41, postingsEnum42, false);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests37.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader47, (-1), postingsEnum49, postingsEnum50, true);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests37.ruleChain;
        java.lang.Class<?> wildcardClass54 = commonGramsTokenFilterFactoryTests37.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray55 = new java.lang.reflect.AnnotatedElement[] { wildcardClass18, wildcardClass36, wildcardClass54 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet56 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray55);
        org.junit.Assert.assertNotSame((java.lang.Object) "", (java.lang.Object) annotatedElementSet56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) annotatedElementSet56, (java.lang.Object) 10.0f);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader32, (int) '4', postingsEnum34, postingsEnum35, true);
        java.lang.Class<?> wildcardClass38 = commonGramsTokenFilterFactoryTests1.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) throttling39);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", 0.0d, 0.0d, (double) (byte) 1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, true);
        java.lang.Object obj28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader23, obj28);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        double[] doubleArray7 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray14 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray23 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray30 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray30, (double) 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray30, (double) (short) -1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        float[] floatArray7 = new float[] { (-1L), 0.0f, 10, ' ', (short) 0, (short) 0 };
        float[] floatArray14 = new float[] { 'a', (short) 1, 10.0f, 1, 0, 1L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray7, floatArray14, (float) (-1));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) (byte) 10, (double) 1L, (double) (byte) 100);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) 1);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) ' ', (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader11, (int) (short) 100, postingsEnum13, postingsEnum14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader19, (-1), postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.tearDown();
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) builder8, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsSkippingEquals("", indexReader32, (int) (short) 100, postingsEnum34, postingsEnum35, false);
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests30.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsSkippingEquals("", indexReader40, (-1), postingsEnum42, postingsEnum43, true);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        commonGramsTokenFilterFactoryTests30.assertTermsEquals("tests.monster", indexReader47, terms48, terms49, false);
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests9, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray5 = new long[] { 0, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "random");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (-1L), (long) 10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        long[] longArray4 = new long[] { ' ', 100L, 'a' };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray4, longArray5);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        int[] intArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray10, intArray13);
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) '#', (double) (byte) -1);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        short[] shortArray2 = new short[] { (short) 0, (short) 1 };
        short[] shortArray4 = new short[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', 0.0f, (float) 10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("", indexReader31, (int) (short) 100, postingsEnum33, postingsEnum34, false);
        org.elasticsearch.common.settings.Settings.Builder builder37 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests38.assertDocsSkippingEquals("", indexReader40, (int) (short) 100, postingsEnum42, postingsEnum43, false);
        org.elasticsearch.common.settings.Settings.Builder builder46 = commonGramsTokenFilterFactoryTests38.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests38.assertDocsSkippingEquals("", indexReader48, (-1), postingsEnum50, postingsEnum51, true);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests38.ruleChain;
        commonGramsTokenFilterFactoryTests38.tearDown();
        commonGramsTokenFilterFactoryTests38.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) builder37, (java.lang.Object) commonGramsTokenFilterFactoryTests38);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) builder37);
        java.lang.Object obj59 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) builder37, obj59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((java.lang.Object) fields24, obj59);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        char[] charArray1 = new char[] {};
        char[] charArray8 = new char[] { '#', '#', 'a', '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray1, charArray8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) 1, 0.0f);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) (byte) -1, (-1.0d));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) (short) -1, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray2);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray7);
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
        int[] intArray18 = new int[] { (short) 0, (-1), (short) 1, 'a', 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray7, intArray18);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.awaitsfix", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader11, (int) (short) 100, postingsEnum13, postingsEnum14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader19, (-1), postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests9.ruleChain;
        java.lang.Class<?> wildcardClass26 = commonGramsTokenFilterFactoryTests9.getClass();
        org.junit.Assert.assertNotEquals((java.lang.Object) '#', (java.lang.Object) wildcardClass26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) false, (java.lang.Object) '#');
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        float[] floatArray7 = new float[] { (byte) 100, (-1L), 10.0f, 1, '4', (byte) -1 };
        float[] floatArray10 = new float[] { (short) 1, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray10, 10.0f);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling1, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling17 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray18, objArray20);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsSkippingEquals("", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27, false);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsEnumEquals("hi!", postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsEnumEquals("", postingsEnum36, postingsEnum37, false);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray41);
        java.lang.Object[] objArray45 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests0, queryCachingPolicy19, locale21, false, intArray41 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling47);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests49.assertDocsSkippingEquals("", indexReader51, (int) (short) 100, postingsEnum53, postingsEnum54, false);
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests49.assertDocsEnumEquals("hi!", postingsEnum58, postingsEnum59, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling47, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46, throttling47, throttling63 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray45, (java.lang.Object[]) throttlingArray64);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 0, (-1.0d), 0.0d);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (short) 1, (double) 0.0f);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (-1.0f), (java.lang.Object) intArray2);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 0, 0.0d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100.0f, (double) 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        double[] doubleArray6 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray13 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray13, (double) 100.0f);
        double[] doubleArray20 = new double[] { 0, ' ', 0.0f, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray20, (double) (byte) 1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        long[] longArray2 = new long[] { '#', 100L };
        long[] longArray7 = new long[] { '#', (short) 100, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        char[] charArray4 = new char[] { '#', '#', '4' };
        char[] charArray7 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray4, charArray7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray2);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray7);
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
        int[] intArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray7, intArray12);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        java.lang.String str28 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        char[] charArray3 = new char[] { '#', 'a' };
        char[] charArray7 = new char[] { 'a', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray3, charArray7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), 10.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        short[] shortArray4 = new short[] { (byte) 0, (short) 1, (byte) 10 };
        short[] shortArray10 = new short[] { (byte) 10, (byte) 100, (short) 100, (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 'a', (long) (short) 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        short[] shortArray3 = new short[] { (short) 100, (short) 100 };
        short[] shortArray5 = new short[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray3, shortArray5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        long[] longArray2 = new long[] { (-1) };
        long[] longArray5 = new long[] { 0, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray7, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertArrayEquals("random", intArray14, intArray22);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray14, intArray27);
        java.lang.Class<?> wildcardClass30 = intArray14.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("", indexReader33, (int) (short) 100, postingsEnum35, postingsEnum36, false);
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests31.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader41, (int) (byte) 100, postingsEnum43, postingsEnum44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) wildcardClass30, (java.lang.Object) indexReader41);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10.0f, (double) (byte) 10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str30 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("", indexReader34, (int) (short) 100, postingsEnum36, postingsEnum37, false);
        org.elasticsearch.common.settings.Settings.Builder builder40 = commonGramsTokenFilterFactoryTests32.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("", indexReader42, (-1), postingsEnum44, postingsEnum45, true);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        commonGramsTokenFilterFactoryTests32.assertTermsEquals("", indexReader49, terms50, terms51, false);
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests32.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("", indexReader57, fields58, fields59, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 10L, (long) 'a');
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.monster", indexReader14, 100, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader20, (-1), postingsEnum22, postingsEnum23, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader28, (int) (short) 100, postingsEnum30, postingsEnum31, false);
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader36, (-1), postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        commonGramsTokenFilterFactoryTests26.assertTermsEquals("tests.monster", indexReader43, terms44, terms45, false);
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader20, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) (-1L));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader18, terms19, terms20, false);
        double[] doubleArray30 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray37 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray37, (double) 100.0f);
        double[] doubleArray46 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray53 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray53, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray37, doubleArray46, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) false, (java.lang.Object) doubleArray37);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader19, terms20, terms21, false);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        long[] longArray5 = new long[] { 'a', (byte) 100, 10L, (byte) -1, ' ' };
        long[] longArray11 = new long[] { 100L, 1L, 0L, 0, (short) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray11);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertArrayEquals(intArray1, intArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) -1, (-1.0d), (double) (byte) -1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader25);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader32, 0, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.weekly", postingsEnum38, postingsEnum39, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.awaitsfix", 10, numericDocValues45, numericDocValues46);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader32, (int) '4', postingsEnum34, postingsEnum35, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) indexReader32, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) (short) 0, (float) 1, (float) (-1L));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 1L, (long) (byte) -1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.slow", true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (-1), (java.lang.Object) 100L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 0, 1L);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (short) -1, (double) 0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        float[] floatArray0 = null;
        float[] floatArray4 = new float[] { 100L, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) (byte) 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 10, (double) ' ', (double) (short) 0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        long[] longArray5 = new long[] { (short) -1, 100, 10, '#', (short) 0 };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, false);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader26, (-1), postingsEnum28, postingsEnum29, true);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests16.ruleChain;
        java.lang.Class<?> wildcardClass33 = commonGramsTokenFilterFactoryTests16.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsSkippingEquals("", indexReader36, (int) (short) 100, postingsEnum38, postingsEnum39, false);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests34.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsSkippingEquals("", indexReader44, (-1), postingsEnum46, postingsEnum47, true);
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests34.ruleChain;
        java.lang.Class<?> wildcardClass51 = commonGramsTokenFilterFactoryTests34.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsSkippingEquals("", indexReader54, (int) (short) 100, postingsEnum56, postingsEnum57, false);
        org.elasticsearch.common.settings.Settings.Builder builder60 = commonGramsTokenFilterFactoryTests52.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsSkippingEquals("", indexReader62, (-1), postingsEnum64, postingsEnum65, true);
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests52.ruleChain;
        java.lang.Class<?> wildcardClass69 = commonGramsTokenFilterFactoryTests52.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray70 = new java.lang.reflect.AnnotatedElement[] { wildcardClass33, wildcardClass51, wildcardClass69 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet71 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray70);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling72 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling72);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) annotatedElementSet71, (java.lang.Object) throttling72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) false, (java.lang.Object) annotatedElementSet71);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        java.lang.Class<?> wildcardClass19 = commonGramsTokenFilterFactoryTests2.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader30, (-1), postingsEnum32, postingsEnum33, true);
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests20.ruleChain;
        java.lang.Class<?> wildcardClass37 = commonGramsTokenFilterFactoryTests20.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests38.assertDocsSkippingEquals("", indexReader40, (int) (short) 100, postingsEnum42, postingsEnum43, false);
        org.elasticsearch.common.settings.Settings.Builder builder46 = commonGramsTokenFilterFactoryTests38.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests38.assertDocsSkippingEquals("", indexReader48, (-1), postingsEnum50, postingsEnum51, true);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests38.ruleChain;
        java.lang.Class<?> wildcardClass55 = commonGramsTokenFilterFactoryTests38.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray56 = new java.lang.reflect.AnnotatedElement[] { wildcardClass19, wildcardClass37, wildcardClass55 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet57 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (short) 1, (java.lang.Object) annotatedElementArray56);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        char[] charArray4 = new char[] { '#', '4', '#', ' ' };
        char[] charArray10 = new char[] { 'a', '4', ' ', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (short) 10, (float) (-1L), 0.0f);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.Class<?> wildcardClass17 = commonGramsTokenFilterFactoryTests0.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader20, (int) (short) 100, postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader28, (-1), postingsEnum30, postingsEnum31, true);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests18.ruleChain;
        java.lang.Class<?> wildcardClass35 = commonGramsTokenFilterFactoryTests18.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader38, (int) (short) 100, postingsEnum40, postingsEnum41, false);
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests36.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader46, (-1), postingsEnum48, postingsEnum49, true);
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests36.ruleChain;
        java.lang.Class<?> wildcardClass53 = commonGramsTokenFilterFactoryTests36.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray54 = new java.lang.reflect.AnnotatedElement[] { wildcardClass17, wildcardClass35, wildcardClass53 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet55 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling56 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling57);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsSkippingEquals("", indexReader61, (int) (short) 100, postingsEnum63, postingsEnum64, false);
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsEnumEquals("hi!", postingsEnum68, postingsEnum69, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling57, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray74 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling56, throttling57, throttling73 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray74);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray54, (java.lang.Object[]) throttlingArray74);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.Class<?> wildcardClass18 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24, false);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader29, (-1), postingsEnum31, postingsEnum32, true);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests19.ruleChain;
        java.lang.Class<?> wildcardClass36 = commonGramsTokenFilterFactoryTests19.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader39, (int) (short) 100, postingsEnum41, postingsEnum42, false);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests37.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader47, (-1), postingsEnum49, postingsEnum50, true);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests37.ruleChain;
        java.lang.Class<?> wildcardClass54 = commonGramsTokenFilterFactoryTests37.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray55 = new java.lang.reflect.AnnotatedElement[] { wildcardClass18, wildcardClass36, wildcardClass54 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet56 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) annotatedElementArray55);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (byte) 1, (double) 1L, (double) '4');
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        char[] charArray6 = new char[] { '4', '#', 'a', 'a', '4' };
        char[] charArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray6, charArray7);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        short[] shortArray4 = new short[] { (byte) 1, (short) 0, (byte) 0 };
        short[] shortArray6 = new short[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray4, shortArray6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader31, (int) '4', postingsEnum33, postingsEnum34, true);
        java.lang.Class<?> wildcardClass37 = commonGramsTokenFilterFactoryTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = new float[] { (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, (float) (byte) 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, 10.0d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        long[] longArray2 = new long[] { (byte) 10 };
        long[] longArray6 = new long[] { 'a', 0L, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 10, (double) 1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray15 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray1, doubleArray15, (double) 1L);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        double[] doubleArray9 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray16 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray16, (double) 100.0f);
        double[] doubleArray25 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray32 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray32, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray16, doubleArray25, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) (-1), (java.lang.Object) 100.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, 100L);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray7 = new short[] { (short) 1, (byte) 0, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray2, shortArray7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        char[] charArray4 = new char[] { '4', '#', '#' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray4, charArray5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        long[] longArray2 = new long[] { '#' };
        long[] longArray7 = new long[] { 10, (byte) 0, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray2, longArray7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        float[] floatArray3 = new float[] { (byte) 10, (byte) 10 };
        float[] floatArray6 = new float[] { 1, (-1.0f) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray3, floatArray6, 10.0f);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 100.0f);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.Class<?> wildcardClass18 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24, false);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader29, (-1), postingsEnum31, postingsEnum32, true);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests19.ruleChain;
        java.lang.Class<?> wildcardClass36 = commonGramsTokenFilterFactoryTests19.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader39, (int) (short) 100, postingsEnum41, postingsEnum42, false);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests37.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader47, (-1), postingsEnum49, postingsEnum50, true);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests37.ruleChain;
        java.lang.Class<?> wildcardClass54 = commonGramsTokenFilterFactoryTests37.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray55 = new java.lang.reflect.AnnotatedElement[] { wildcardClass18, wildcardClass36, wildcardClass54 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet56 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray55);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray58);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray63);
        org.junit.Assert.assertArrayEquals(intArray58, intArray63);
        java.lang.Object[] objArray68 = new java.lang.Object[] { intArray58 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) annotatedElementArray55, objArray68);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        float[] floatArray5 = new float[] { 0, '4', (byte) 100, (-1) };
        float[] floatArray9 = new float[] { (short) 100, 1.0f, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray5, floatArray9, 0.0f);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader32, (int) '4', postingsEnum34, postingsEnum35, true);
        java.lang.Class<?> wildcardClass38 = commonGramsTokenFilterFactoryTests1.getClass();
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClass38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) wildcardClass38);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) 10.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1L, (long) (short) -1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum14, postingsEnum15, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling3, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.slow", (java.lang.Object) throttlingEnumSet21);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.monster", indexReader18, terms19, terms20, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray27, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals(intArray34, intArray37);
        org.junit.Assert.assertArrayEquals(intArray30, intArray37);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals(intArray42, intArray45);
        org.junit.Assert.assertArrayEquals("random", intArray37, intArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "random");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.monster", indexReader14, 100, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader20, (-1), postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", 100, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0L, (-1L));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0.0d, 0.0d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray8);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        char[] charArray5 = new char[] { '4', ' ', '#', '4' };
        char[] charArray8 = new char[] { 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray5, charArray8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", (-1), numericDocValues39, numericDocValues40);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) (byte) -1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader29, terms30, terms31, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", (-1), numericDocValues37, numericDocValues38);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray14 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray24 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray31 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray31, (double) 100.0f);
        double[] doubleArray40 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray47 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray47, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray31, doubleArray40, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray31, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray31, 0.0d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (-1), (-1L));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) (byte) 0, (float) (short) 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray7, intArray10);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals(intArray14, intArray17);
        org.junit.Assert.assertArrayEquals(intArray10, intArray17);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray22, intArray25);
        org.junit.Assert.assertArrayEquals("random", intArray17, intArray25);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray25, intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray2, intArray30);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader11, (int) (short) 100, postingsEnum13, postingsEnum14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader19, (-1), postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.tearDown();
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) builder8, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) 100);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", obj1, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (-1.0f), (double) (byte) -1);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (-1L), (double) (-1));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.monster", indexReader14, 100, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader20, (-1), postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("", indexReader30, (int) (short) 100, postingsEnum32, postingsEnum33, false);
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests28.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("", indexReader38, (-1), postingsEnum40, postingsEnum41, true);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("tests.badapples", indexReader45, (int) (byte) -1, postingsEnum47, postingsEnum48);
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule27, (java.lang.Object) '4');
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        short[] shortArray1 = new short[] { (short) -1 };
        short[] shortArray5 = new short[] { (short) 1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray7, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertArrayEquals("random", intArray14, intArray22);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals(intArray22, intArray27);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray33, intArray36);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals(intArray40, intArray43);
        org.junit.Assert.assertArrayEquals(intArray36, intArray43);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals(intArray48, intArray51);
        org.junit.Assert.assertArrayEquals("random", intArray43, intArray51);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray43, intArray56);
        org.junit.Assert.assertArrayEquals("hi!", intArray27, intArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) "hi!", (java.lang.Object) 0.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) 10, (float) 10L);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        short[] shortArray1 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, 0.0f, (float) '4');
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        long[] longArray4 = new long[] { (byte) 0, ' ', (byte) 10 };
        long[] longArray6 = new long[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        long[] longArray3 = new long[] { 1, ' ' };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        long[] longArray2 = new long[] { 100L };
        long[] longArray8 = new long[] { (byte) 0, 100L, '#', (short) 100, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray2, longArray8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        short[] shortArray5 = new short[] { (short) 10, (short) 10, (byte) 0, (short) 100 };
        short[] shortArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "tests.failfast", "random" };
        java.util.Set<java.lang.CharSequence> charSequenceSet3 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsSkippingEquals("", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsEnumEquals("hi!", postingsEnum17, postingsEnum18, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling6, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5, throttling6, throttling22 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("", indexReader30, (int) (short) 100, postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("hi!", postingsEnum37, postingsEnum38, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling26, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26, throttling42 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray2, (java.lang.Object[]) throttlingArray43);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        byte[] byteArray7 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        short[] shortArray6 = new short[] { (byte) 100, (short) 10, (byte) 10, (byte) 1, (byte) 1, (short) 100 };
        short[] shortArray12 = new short[] { (short) 1, (byte) -1, (byte) 100, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray12);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 100);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        char[] charArray6 = new char[] { ' ', '4', ' ', ' ', 'a', 'a' };
        char[] charArray11 = new char[] { ' ', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray4, byteArray10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        short[] shortArray2 = new short[] { (byte) -1 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray2, shortArray3);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 10, (long) (short) 10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("hi!", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 100, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader14, (-1), postingsEnum16, postingsEnum17, true);
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests4.ruleChain;
        java.lang.Class<?> wildcardClass21 = commonGramsTokenFilterFactoryTests4.getClass();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        java.lang.String str28 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader24, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("hi!", indexReader32, terms33, terms34, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals(intArray25, intArray28);
        org.junit.Assert.assertArrayEquals(intArray21, intArray28);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray33, intArray36);
        org.junit.Assert.assertArrayEquals("random", intArray28, intArray36);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray28, intArray41);
        java.lang.Class<?> wildcardClass44 = intArray28.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader10, (java.lang.Object) intArray28);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) testRule17);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 1, (long) 1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray9, intArray12);
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (byte) 100, (java.lang.Object) intArray5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        short[] shortArray7 = new short[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray5, shortArray7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 100.0d, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "tests.failfast", "random" };
        java.util.Set<java.lang.CharSequence> charSequenceSet3 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsSkippingEquals("", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsEnumEquals("hi!", postingsEnum17, postingsEnum18, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling6, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5, throttling6, throttling22 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("", indexReader30, (int) (short) 100, postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("hi!", postingsEnum37, postingsEnum38, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling26, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26, throttling42 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray2, (java.lang.Object[]) throttlingArray43);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (-1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "tests.failfast", (java.lang.Object) builder11);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0L, 100L);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 10, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray7, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertArrayEquals("random", intArray14, intArray22);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals(intArray22, intArray27);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray33, intArray36);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals(intArray40, intArray43);
        org.junit.Assert.assertArrayEquals(intArray36, intArray43);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals(intArray48, intArray51);
        org.junit.Assert.assertArrayEquals("random", intArray43, intArray51);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals(intArray51, intArray56);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray64, intArray65);
        org.junit.Assert.assertArrayEquals(intArray62, intArray65);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals(intArray69, intArray72);
        org.junit.Assert.assertArrayEquals(intArray65, intArray72);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray76, intArray77);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        org.junit.Assert.assertArrayEquals(intArray77, intArray80);
        org.junit.Assert.assertArrayEquals("random", intArray72, intArray80);
        int[] intArray84 = new int[] {};
        int[] intArray85 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray84, intArray85);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray72, intArray85);
        org.junit.Assert.assertArrayEquals("hi!", intArray56, intArray85);
        org.junit.Assert.assertArrayEquals("", intArray22, intArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) intArray85);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 100.0d, (double) (byte) 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '#', (double) ' ', (double) (-1.0f));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        long[] longArray3 = new long[] { '4', 0, 0 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), 0L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "tests.failfast", "random" };
        java.util.Set<java.lang.CharSequence> charSequenceSet3 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsSkippingEquals("", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsEnumEquals("hi!", postingsEnum17, postingsEnum18, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling6, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5, throttling6, throttling22 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("", indexReader30, (int) (short) 100, postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("hi!", postingsEnum37, postingsEnum38, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling26, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26, throttling42 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray43);
        double[] doubleArray52 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray59 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray59, (double) 100.0f);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray23, (java.lang.Object) doubleArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray2, (java.lang.Object[]) throttlingArray23);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) (short) 10, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray7 = new char[] { '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray2, charArray7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        long[] longArray2 = new long[] { (short) 100 };
        long[] longArray5 = new long[] { (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray2, longArray5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 10 };
        byte[] byteArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader23, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("hi!", indexReader31, terms32, terms33, false);
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 10, (java.lang.Object) 'a');
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 0.0f, (double) 0, (double) ' ');
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.nightly");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        long[] longArray1 = new long[] { (short) 10 };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("", indexReader12, (int) (short) 100, postingsEnum14, postingsEnum15, false);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("", indexReader20, (-1), postingsEnum22, postingsEnum23, true);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests10.ruleChain;
        commonGramsTokenFilterFactoryTests10.tearDown();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) builder9, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 1L);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) 1L);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray37, floatArray40, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray37, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) floatArray32);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray1);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray6);
        org.junit.Assert.assertArrayEquals(intArray1, intArray6);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray12);
        org.junit.Assert.assertArrayEquals(intArray1, intArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray12, (java.lang.Object) 100);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray6, byteArray13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), 0.0d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling1, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling17 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet20 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray18);
        java.lang.Object[] objArray21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray18, objArray21);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) -1, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, 100.0d, (double) (byte) 100);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader35, terms36, terms37, false);
        java.lang.String str40 = commonGramsTokenFilterFactoryTests0.getTestName();
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 1L);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) floatArray41);
        org.apache.lucene.index.NumericDocValues numericDocValues48 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", (int) (short) -1, numericDocValues48, numericDocValues49);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum14, postingsEnum15, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling3, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsSkippingEquals("", indexReader27, (int) (short) 100, postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsEnumEquals("hi!", postingsEnum34, postingsEnum35, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling23, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23, throttling39 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) throttlingArray40);
        double[] doubleArray49 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray56 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray56, (double) 100.0f);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray20, (java.lang.Object) doubleArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) doubleArray56);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader8, (int) (short) 100, postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsEnumEquals("hi!", postingsEnum15, postingsEnum16, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling4, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4, throttling20 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("", indexReader29, (int) (short) 100, postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsEnumEquals("hi!", postingsEnum36, postingsEnum37, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling25, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24, throttling25, throttling41 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling45);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests47.assertDocsSkippingEquals("", indexReader49, (int) (short) 100, postingsEnum51, postingsEnum52, false);
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests47.assertDocsEnumEquals("hi!", postingsEnum56, postingsEnum57, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling45, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling61 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray62 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling44, throttling45, throttling61 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray62);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray42, (java.lang.Object[]) throttlingArray62);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) throttlingArray21, (java.lang.Object[]) throttlingArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) throttlingArray62);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        short[] shortArray4 = new short[] { (short) -1, (byte) 100, (byte) -1, (short) 100 };
        short[] shortArray10 = new short[] { (byte) 0, (short) 100, (short) 100, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader25);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader32, 0, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.weekly", postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        long[] longArray0 = new long[] {};
        long[] longArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (byte) 100 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("hi!", postingsEnum13, postingsEnum14, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling2, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling18 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsSkippingEquals("", indexReader26, (int) (short) 100, postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsEnumEquals("hi!", postingsEnum33, postingsEnum34, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling22, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling21, throttling22, throttling38 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray19, (java.lang.Object[]) throttlingArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling43);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests45.assertDocsSkippingEquals("", indexReader47, (int) (short) 100, postingsEnum49, postingsEnum50, false);
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests45.assertDocsEnumEquals("hi!", postingsEnum54, postingsEnum55, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling43, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42, throttling43, throttling59 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet62 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray19, (java.lang.Object[]) throttlingArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) throttlingArray19);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) -1, 100.0d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) -1, (-1L));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum35, postingsEnum36, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum42, postingsEnum43);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 100, obj1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.awaitsfix", indexReader26, (int) (short) 100, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader26, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        commonGramsTokenFilterFactoryTests31.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) (byte) 10, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray1, byteArray10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (-1.0d), (double) '#', (double) (byte) 100);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum35, postingsEnum36, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum42, postingsEnum43);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (-1));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader21, (int) (short) -1, postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        short[] shortArray0 = new short[] {};
        short[] shortArray7 = new short[] { (byte) 10, (short) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 0.0f, (-1.0d));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 'a', (long) (short) -1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) ' ', (double) (byte) 1);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        short[] shortArray6 = new short[] { (short) 0, (byte) 10, (short) 1, (byte) -1, (byte) 0, (short) 0 };
        short[] shortArray7 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray20, charArray24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader32, fields33, fields34, true);
        org.elasticsearch.common.settings.Settings.Builder builder37 = commonGramsTokenFilterFactoryTests28.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("", indexReader39, fields40, fields41, false);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests28.ruleChain;
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) charArray46);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray46, charArray50);
        org.junit.Assert.assertArrayEquals("hi!", charArray20, charArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests55.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, true);
        org.elasticsearch.common.settings.Settings.Builder builder64 = commonGramsTokenFilterFactoryTests55.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("", indexReader66, fields67, fields68, false);
        org.junit.rules.TestRule testRule71 = commonGramsTokenFilterFactoryTests55.ruleChain;
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests55, (java.lang.Object) charArray73);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray73, charArray77);
        org.junit.Assert.assertArrayEquals(charArray46, charArray77);
        char[] charArray81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray77, charArray81);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader25, (int) (short) 100, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", 0, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (short) 10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (short) 1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 'a');
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader29, terms30, terms31, false);
        java.lang.String str34 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader37, (int) (short) 100, postingsEnum39, postingsEnum40, false);
        org.elasticsearch.common.settings.Settings.Builder builder43 = commonGramsTokenFilterFactoryTests35.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader45, (-1), postingsEnum47, postingsEnum48, true);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("tests.badapples", indexReader52, (int) (byte) -1, postingsEnum54, postingsEnum55);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("tests.awaitsfix", indexReader58, (int) (short) 100, postingsEnum60, postingsEnum61);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("", indexReader64, (int) (byte) 0, postingsEnum66, postingsEnum67);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        commonGramsTokenFilterFactoryTests35.assertTermsEquals("tests.badapples", indexReader70, terms71, terms72, false);
        java.lang.String str75 = commonGramsTokenFilterFactoryTests35.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.NumericDocValues numericDocValues42 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", 100, numericDocValues42, numericDocValues43);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (byte) 1, (float) 0L, (float) (-1L));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum3, postingsEnum4);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) (byte) 1, (double) (short) -1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray2);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray7);
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray13);
        org.junit.Assert.assertArrayEquals(intArray2, intArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) intArray13, (java.lang.Object) 0.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray2);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader25);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader32, 0, postingsEnum34, postingsEnum35);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsSkippingEquals("", indexReader41, (int) (short) 100, postingsEnum43, postingsEnum44, false);
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests39.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsSkippingEquals("", indexReader49, (-1), postingsEnum51, postingsEnum52, true);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("tests.badapples", indexReader56, (int) (byte) -1, postingsEnum58, postingsEnum59);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("tests.awaitsfix", indexReader62, (int) (short) 100, postingsEnum64, postingsEnum65);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader62, (java.lang.Object) commonGramsTokenFilterFactoryTests67);
        commonGramsTokenFilterFactoryTests67.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests38, (java.lang.Object) commonGramsTokenFilterFactoryTests67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests38);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 10L, 0.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("tests.weekly", indexReader26, fields27, fields28, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) indexReader26);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) testRule32);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        double[] doubleArray8 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray15 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) "tests.badapples", (java.lang.Object) doubleArray8);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 0, (long) '#');
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        double[] doubleArray7 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray14 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray24 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray31 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray31, (double) 100.0f);
        double[] doubleArray40 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray47 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray47, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray31, doubleArray40, 100.0d);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray14, doubleArray40, (double) (-1.0f));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray3 = new java.util.Locale[] { locale2 };
        java.util.Set<java.util.Locale> localeSet4 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling7);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader11, (int) (short) 100, postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsEnumEquals("hi!", postingsEnum18, postingsEnum19, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling7, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6, throttling7, throttling23 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("", indexReader31, (int) (short) 100, postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("hi!", postingsEnum38, postingsEnum39, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling27, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling26, throttling27, throttling43 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) localeArray3, (java.lang.Object[]) throttlingArray44);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum15, postingsEnum16, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        short[] shortArray0 = new short[] {};
        short[] shortArray6 = new short[] { (short) -1, (short) 0, (short) 100, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray6);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader17);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader25);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader32, 0, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.maxfailures", (int) (short) 10, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray20, charArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) charArray20);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (-1));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling1, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling17 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling21);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsSkippingEquals("", indexReader25, (int) (short) 100, postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsEnumEquals("hi!", postingsEnum32, postingsEnum33, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling21, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20, throttling21, throttling37 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray38);
        int[] intArray44 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[] intArray48 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[][] intArray49 = new int[][] { intArray44, intArray48 };
        java.util.Set<int[]> intArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(intArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) intArray49);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray10, intArray13);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray17, intArray20);
        org.junit.Assert.assertArrayEquals(intArray13, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals(intArray25, intArray28);
        org.junit.Assert.assertArrayEquals("random", intArray20, intArray28);
        org.junit.Assert.assertArrayEquals(intArray5, intArray20);
        int[] intArray33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray5, intArray33);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100L, (double) 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader11, (int) (short) 100, postingsEnum13, postingsEnum14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader19, (-1), postingsEnum21, postingsEnum22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("tests.badapples", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("tests.awaitsfix", indexReader32, (int) (short) 100, postingsEnum34, postingsEnum35);
        commonGramsTokenFilterFactoryTests9.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("hi!", indexReader40, 0, postingsEnum42, postingsEnum43);
        commonGramsTokenFilterFactoryTests9.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        double[] doubleArray6 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray13 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray13, (double) 100.0f);
        double[] doubleArray23 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray30 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray30, (double) 100.0f);
        double[] doubleArray39 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray46 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray46, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray30, doubleArray39, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray30, (double) (short) 100);
        java.lang.Class<?> wildcardClass53 = doubleArray13.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass53);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray20, charArray24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader32, fields33, fields34, true);
        org.elasticsearch.common.settings.Settings.Builder builder37 = commonGramsTokenFilterFactoryTests28.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("", indexReader39, fields40, fields41, false);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests28.ruleChain;
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) charArray46);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray46, charArray50);
        org.junit.Assert.assertArrayEquals("hi!", charArray20, charArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests55.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, true);
        org.elasticsearch.common.settings.Settings.Builder builder64 = commonGramsTokenFilterFactoryTests55.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("", indexReader66, fields67, fields68, false);
        org.junit.rules.TestRule testRule71 = commonGramsTokenFilterFactoryTests55.ruleChain;
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests55, (java.lang.Object) charArray73);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray73, charArray77);
        org.junit.Assert.assertArrayEquals(charArray46, charArray77);
        char[] charArray81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray46, charArray81);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("", indexReader33, (int) (short) 100, postingsEnum35, postingsEnum36, false);
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests31.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("", indexReader41, (-1), postingsEnum43, postingsEnum44, true);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("tests.badapples", indexReader48, (int) (byte) -1, postingsEnum50, postingsEnum51);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("tests.weekly", indexReader54, fields55, fields56, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) indexReader54);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("tests.badapples", indexReader61, 0, postingsEnum63, postingsEnum64);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) postingsEnum26, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests30.assertDocsAndPositionsEnumEquals("", postingsEnum69, postingsEnum70);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0L, 1L);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) '#', (double) 100.0f);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests2.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling1, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling17 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader30, (-1), postingsEnum32, postingsEnum33, true);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        commonGramsTokenFilterFactoryTests20.assertTermsEquals("tests.monster", indexReader37, terms38, terms39, false);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        java.lang.Object obj43 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests20, obj43);
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttlingEnumSet19, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling1, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling17 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling21);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsSkippingEquals("", indexReader25, (int) (short) 100, postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsEnumEquals("hi!", postingsEnum32, postingsEnum33, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling21, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20, throttling21, throttling37 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray38);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet41 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray38);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale43 };
        java.util.Set<java.util.Locale> localeSet45 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray38, (java.lang.Object[]) localeArray44);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) 100, 0L);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray12);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        double[] doubleArray7 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray14 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray24 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray31 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray31, (double) 100.0f);
        double[] doubleArray40 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray47 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray47, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray31, doubleArray40, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray31, (double) (short) 100);
        double[] doubleArray60 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray67 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray67, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray67, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) doubleArray67);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        long[] longArray4 = new long[] { (-1L), '4', (byte) 100, (byte) -1 };
        long[] longArray11 = new long[] { 10L, (byte) -1, (-1L), (short) -1, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 100);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        long[] longArray2 = new long[] { 0L, 100L };
        long[] longArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        long[] longArray3 = new long[] { 10, '#', '4' };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsSkippingEquals("", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12, false);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsSkippingEquals("", indexReader17, (-1), postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("tests.badapples", indexReader24, (int) (byte) -1, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("tests.weekly", indexReader30, fields31, fields32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        commonGramsTokenFilterFactoryTests7.assertTermsEquals("tests.weekly", indexReader36, terms37, terms38, false);
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) intArray3, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) "tests.slow", (java.lang.Object) "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        short[] shortArray2 = new short[] { (short) -1, (short) 0 };
        short[] shortArray9 = new short[] { (short) -1, (byte) 0, (short) 1, (byte) -1, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, 0L);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.NumericDocValues numericDocValues42 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 10, numericDocValues42, numericDocValues43);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader8, (int) (short) 100, postingsEnum10, postingsEnum11, false);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader16, (-1), postingsEnum18, postingsEnum19, true);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests6.ruleChain;
        java.lang.Class<?> wildcardClass23 = commonGramsTokenFilterFactoryTests6.getClass();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) locale2, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader24, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("", indexReader35, (int) (short) 100, postingsEnum37, postingsEnum38, false);
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("", indexReader43, (-1), postingsEnum45, postingsEnum46, true);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("tests.badapples", indexReader50, (int) (byte) -1, postingsEnum52, postingsEnum53);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("tests.awaitsfix", indexReader56, (int) (short) 100, postingsEnum58, postingsEnum59);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("", indexReader62, (int) (byte) 0, postingsEnum64, postingsEnum65);
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder68 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests33.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        short[] shortArray4 = new short[] { (byte) 10, (short) 1, (short) 100 };
        short[] shortArray5 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray5);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 1L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray3, floatArray6, (float) 10L);
        java.lang.Class<?> wildcardClass12 = floatArray6.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) floatArray6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        long[] longArray5 = new long[] { 1L, ' ', 'a', (byte) -1 };
        long[] longArray11 = new long[] { (-1L), 100, (short) 10, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader25);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader32, 0, postingsEnum34, postingsEnum35);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("random", indexReader39, (int) ' ', postingsEnum41, postingsEnum42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("hi!", indexReader46, 10, postingsEnum48, postingsEnum49, false);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader53, (int) (short) 0, postingsEnum55, postingsEnum56);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum60, postingsEnum61);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("hi!");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) ' ', numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (-1));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader25);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader32, 0, postingsEnum34, postingsEnum35);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader42, (int) (short) 100, postingsEnum44, postingsEnum45, false);
        org.elasticsearch.common.settings.Settings.Builder builder48 = commonGramsTokenFilterFactoryTests40.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader50, (-1), postingsEnum52, postingsEnum53, true);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests40.assertPositionsSkippingEquals("tests.badapples", indexReader57, (int) (byte) -1, postingsEnum59, postingsEnum60);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        commonGramsTokenFilterFactoryTests40.assertFieldsEquals("tests.weekly", indexReader63, fields64, fields65, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) indexReader63);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("tests.badapples", indexReader70, 0, postingsEnum72, postingsEnum73);
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("tests.weekly", postingsEnum76, postingsEnum77, true);
        commonGramsTokenFilterFactoryTests39.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) testRule37, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
        org.apache.lucene.index.NumericDocValues numericDocValues84 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests39.assertDocValuesEquals("random", (int) (byte) 100, numericDocValues84, numericDocValues85);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray18);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray29);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray33);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        double[] doubleArray0 = null;
        double[] doubleArray8 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray15 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        double[] doubleArray25 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray32 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray32, (double) 100.0f);
        double[] doubleArray41 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray48 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray48, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray32, doubleArray41, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray32, (double) (short) 100);
        double[] doubleArray61 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray68 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray68, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray15, doubleArray68, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray68, 1.0d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        char[] charArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests5.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, true);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("", indexReader16, fields17, fields18, false);
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests5.ruleChain;
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) charArray23);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray23, charArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests31.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, true);
        org.elasticsearch.common.settings.Settings.Builder builder40 = commonGramsTokenFilterFactoryTests31.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("", indexReader42, fields43, fields44, false);
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests31.ruleChain;
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests31, (java.lang.Object) charArray49);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray49, charArray53);
        org.junit.Assert.assertArrayEquals("hi!", charArray23, charArray49);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("random", charArray49, charArray57);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray57, charArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray1, charArray57);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader25, (int) (short) 1, postingsEnum27, postingsEnum28, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader25);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        byte[] byteArray0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        long[] longArray3 = new long[] { 100L, 100L, '#' };
        long[] longArray7 = new long[] { (byte) 1, (-1L), 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        java.util.Set<int[]> intArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(intArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling11);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("", indexReader15, (int) (short) 100, postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("hi!", postingsEnum22, postingsEnum23, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling11, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling10, throttling11, throttling27 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray8, (java.lang.Object[]) throttlingArray28);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) '#', (double) 10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 1L, (double) (byte) 10, 100.0d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) (short) 1);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), 0.0d, 0.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader24, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("hi!", indexReader32, terms33, terms34, false);
        commonGramsTokenFilterFactoryTests29.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule40;
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) testRule40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests29);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        long[] longArray0 = new long[] {};
        long[] longArray3 = new long[] { 'a', (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 1L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray3, floatArray6, (float) 10L);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) 1L);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray14, floatArray17, (float) 10L);
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray14, (float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray6);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0d, (double) 'a');
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0d, (double) 100, (double) (short) 10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", (int) ' ', numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "tests.failfast", "random" };
        java.util.Set<java.lang.CharSequence> charSequenceSet3 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsSkippingEquals("", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsEnumEquals("hi!", postingsEnum17, postingsEnum18, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling6, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5, throttling6, throttling22 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("", indexReader30, (int) (short) 100, postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("hi!", postingsEnum37, postingsEnum38, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling26, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26, throttling42 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray43);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling47);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests49.assertDocsSkippingEquals("", indexReader51, (int) (short) 100, postingsEnum53, postingsEnum54, false);
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests49.assertDocsEnumEquals("hi!", postingsEnum58, postingsEnum59, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling47, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46, throttling47, throttling63 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray64);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet66 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling68 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling69 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling69);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsSkippingEquals("", indexReader73, (int) (short) 100, postingsEnum75, postingsEnum76, false);
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsEnumEquals("hi!", postingsEnum80, postingsEnum81, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling69, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling85 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray86 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling68, throttling69, throttling85 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet87 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray86);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet88 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray86);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray2, (java.lang.Object[]) throttlingArray23);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader29, terms30, terms31, false);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertArrayEquals(intArray1, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray8, intArray11);
        org.junit.Assert.assertArrayEquals(intArray4, intArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray11, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) 1, (long) 10);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.Class<?> wildcardClass18 = commonGramsTokenFilterFactoryTests0.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader30, (-1), postingsEnum32, postingsEnum33, true);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        commonGramsTokenFilterFactoryTests20.assertTermsEquals("", indexReader37, terms38, terms39, false);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("", indexReader45, fields46, fields47, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass18, (java.lang.Object) fields47);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (byte) 100);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        short[] shortArray3 = new short[] { (short) 100, (short) -1, (byte) 100 };
        short[] shortArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum14, postingsEnum15, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling3, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsSkippingEquals("", indexReader27, (int) (short) 100, postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsEnumEquals("hi!", postingsEnum34, postingsEnum35, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling23, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23, throttling39 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray20, (java.lang.Object[]) throttlingArray40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling44);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("", indexReader48, (int) (short) 100, postingsEnum50, postingsEnum51, false);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("hi!", postingsEnum55, postingsEnum56, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling44, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44, throttling60 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling64 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling64);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests66.assertDocsSkippingEquals("", indexReader68, (int) (short) 100, postingsEnum70, postingsEnum71, false);
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests66.assertDocsEnumEquals("hi!", postingsEnum75, postingsEnum76, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling64, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling80 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray81 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling63, throttling64, throttling80 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray81);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray61, (java.lang.Object[]) throttlingArray81);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) throttlingArray40, (java.lang.Object[]) throttlingArray81);
        java.lang.Object[] objArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) throttlingArray40, objArray85);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        char[] charArray0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader5, fields6, fields7, true);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray19);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        long[] longArray5 = new long[] { 0L, ' ', 'a', (-1) };
        long[] longArray8 = new long[] { 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 10, 0.0d);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1.0d), (double) ' ');
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) 10, 10.0d, (double) 1L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24, false);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader29, (-1), postingsEnum31, postingsEnum32, true);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) testRule18, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        commonGramsTokenFilterFactoryTests19.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", 0.0d, (double) 0L, (double) '4');
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray10, intArray13);
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        org.junit.Assert.assertArrayEquals("random", intArray13, intArray21);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals(intArray21, intArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsSkippingEquals("", indexReader32, (int) (short) 100, postingsEnum34, postingsEnum35, false);
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests30.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsSkippingEquals("", indexReader40, (-1), postingsEnum42, postingsEnum43, true);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests30.ruleChain;
        java.lang.Class<?> wildcardClass47 = commonGramsTokenFilterFactoryTests30.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsSkippingEquals("", indexReader50, (int) (short) 100, postingsEnum52, postingsEnum53, false);
        org.elasticsearch.common.settings.Settings.Builder builder56 = commonGramsTokenFilterFactoryTests48.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsSkippingEquals("", indexReader58, (-1), postingsEnum60, postingsEnum61, true);
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests48.ruleChain;
        java.lang.Class<?> wildcardClass65 = commonGramsTokenFilterFactoryTests48.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests66.assertDocsSkippingEquals("", indexReader68, (int) (short) 100, postingsEnum70, postingsEnum71, false);
        org.elasticsearch.common.settings.Settings.Builder builder74 = commonGramsTokenFilterFactoryTests66.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests66.assertDocsSkippingEquals("", indexReader76, (-1), postingsEnum78, postingsEnum79, true);
        org.junit.rules.TestRule testRule82 = commonGramsTokenFilterFactoryTests66.ruleChain;
        java.lang.Class<?> wildcardClass83 = commonGramsTokenFilterFactoryTests66.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray84 = new java.lang.reflect.AnnotatedElement[] { wildcardClass47, wildcardClass65, wildcardClass83 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet85 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray84);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling86 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling86);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) annotatedElementSet85, (java.lang.Object) throttling86);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) intArray21, (java.lang.Object) annotatedElementSet85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray21);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        short[] shortArray5 = new short[] { (byte) 0, (short) 0, (byte) 10, (byte) 1 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray5, shortArray6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 1, 0.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '#', (double) 100.0f, (double) 0L);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 10L, (double) 0L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100.0d, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.maxfailures", indexReader17, (int) (short) 1, postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("europarl.lines.txt.gz", (int) '4', numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 0, (double) (byte) 100);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.weekly", indexReader30, terms31, terms32, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader38, fields39, fields40, true);
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum44, postingsEnum45, false);
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, false);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 1L);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray28, floatArray31, (float) 10L);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) 1L);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray39, floatArray42, (float) 10L);
        org.junit.Assert.assertArrayEquals("", floatArray31, floatArray39, (float) (byte) 0);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) 1L);
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray53, floatArray56, (float) 0L);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray56, floatArray59, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray59, (float) 100L);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) 1L);
        float[] floatArray73 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray70, floatArray73, (float) 0L);
        float[] floatArray76 = new float[] {};
        float[] floatArray77 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray76, floatArray77, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray73, floatArray76, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray76, (float) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) false, (java.lang.Object) floatArray76);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader17, terms18, terms19, false);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) (short) 100, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum27, (java.lang.Object) throttling29);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) 100L, (float) (byte) -1, (float) ' ');
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) '#', (long) 100);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        long[] longArray3 = new long[] { '#', (short) 0, 'a' };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum14, postingsEnum15, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling3, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsSkippingEquals("", indexReader27, (int) (short) 100, postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsEnumEquals("hi!", postingsEnum34, postingsEnum35, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling23, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23, throttling39 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray20, (java.lang.Object[]) throttlingArray40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling44);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("", indexReader48, (int) (short) 100, postingsEnum50, postingsEnum51, false);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("hi!", postingsEnum55, postingsEnum56, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling44, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44, throttling60 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet63 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray20, (java.lang.Object[]) throttlingArray61);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling65 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling66 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling66);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests68 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests68.assertDocsSkippingEquals("", indexReader70, (int) (short) 100, postingsEnum72, postingsEnum73, false);
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests68.assertDocsEnumEquals("hi!", postingsEnum77, postingsEnum78, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling66, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling82 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray83 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling65, throttling66, throttling82 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray83);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet85 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray83);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) throttlingArray83);
        java.util.Locale locale88 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale88 };
        java.util.Set<java.util.Locale> localeSet90 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) throttlingArray83, (java.lang.Object[]) localeArray89);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10L, (double) 0, (-1.0d));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader23, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests28.assertDocValuesEquals("tests.monster", 0, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray20, charArray24);
        char[] charArray29 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray24, charArray29);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("random", indexReader26, (int) (short) 100, postingsEnum28, postingsEnum29);
        java.lang.String str31 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) str31);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.lang.Class<?> wildcardClass16 = locale15.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) wildcardClass16);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray7, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertArrayEquals("random", intArray14, intArray22);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray14, intArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests33.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, true);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("", indexReader44, fields45, fields46, false);
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests33.ruleChain;
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) charArray51);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray51, charArray55);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests59.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        commonGramsTokenFilterFactoryTests59.assertFieldsEquals("europarl.lines.txt.gz", indexReader63, fields64, fields65, true);
        org.elasticsearch.common.settings.Settings.Builder builder68 = commonGramsTokenFilterFactoryTests59.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        commonGramsTokenFilterFactoryTests59.assertFieldsEquals("", indexReader70, fields71, fields72, false);
        org.junit.rules.TestRule testRule75 = commonGramsTokenFilterFactoryTests59.ruleChain;
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests59, (java.lang.Object) charArray77);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray77, charArray81);
        org.junit.Assert.assertArrayEquals("hi!", charArray51, charArray77);
        char[] charArray85 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray77, charArray85);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "tests.nightly", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray15 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        double[] doubleArray25 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray32 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray32, (double) 100.0f);
        double[] doubleArray41 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray48 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray48, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray32, doubleArray41, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray32, (double) 0.0f);
        double[] doubleArray61 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray68 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray68, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray68, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray1, doubleArray32, (double) (-1L));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        long[] longArray3 = new long[] { (short) 1, (byte) 0 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray3, longArray4);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 100L, (long) 1);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, (double) 0.0f, 100.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[] intArray8 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[][] intArray9 = new int[][] { intArray4, intArray8 };
        java.util.Set<int[]> intArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(intArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsSkippingEquals("", indexReader17, (int) (short) 100, postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("hi!", postingsEnum24, postingsEnum25, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling13, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12, throttling13, throttling29 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader37, (int) (short) 100, postingsEnum39, postingsEnum40, false);
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsEnumEquals("hi!", postingsEnum44, postingsEnum45, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling33, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling32, throttling33, throttling49 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray30, (java.lang.Object[]) throttlingArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) intArray9, (java.lang.Object[]) throttlingArray50);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        long[] longArray1 = null;
        long[] longArray7 = new long[] { '4', 10, (byte) -1, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray1, longArray7);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100.0f, (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) -1, (double) 100);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsSkippingEquals("", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13, false);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) builder16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray0, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        long[] longArray2 = new long[] { (byte) 0 };
        long[] longArray8 = new long[] { (short) -1, 0, 0, 100L, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray2, longArray8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100L, (long) (byte) 100);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader14, (-1), postingsEnum16, postingsEnum17, true);
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests4.ruleChain;
        java.lang.Class<?> wildcardClass21 = commonGramsTokenFilterFactoryTests4.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsSkippingEquals("", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27, false);
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsSkippingEquals("", indexReader32, (-1), postingsEnum34, postingsEnum35, true);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests22.ruleChain;
        java.lang.Class<?> wildcardClass39 = commonGramsTokenFilterFactoryTests22.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader42, (int) (short) 100, postingsEnum44, postingsEnum45, false);
        org.elasticsearch.common.settings.Settings.Builder builder48 = commonGramsTokenFilterFactoryTests40.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader50, (-1), postingsEnum52, postingsEnum53, true);
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests40.ruleChain;
        java.lang.Class<?> wildcardClass57 = commonGramsTokenFilterFactoryTests40.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray58 = new java.lang.reflect.AnnotatedElement[] { wildcardClass21, wildcardClass39, wildcardClass57 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet59 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsSkippingEquals("", indexReader62, (int) (short) 100, postingsEnum64, postingsEnum65, false);
        org.elasticsearch.common.settings.Settings.Builder builder68 = commonGramsTokenFilterFactoryTests60.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsSkippingEquals("", indexReader70, (-1), postingsEnum72, postingsEnum73, true);
        org.junit.rules.TestRule testRule76 = commonGramsTokenFilterFactoryTests60.ruleChain;
        java.lang.Object[] objArray77 = new java.lang.Object[] { "<unknown>", "hi!", 1L, annotatedElementArray58, commonGramsTokenFilterFactoryTests60 };
        java.util.Set<java.lang.Object> objSet78 = org.apache.lucene.util.LuceneTestCase.asSet(objArray77);
        java.lang.Object[] objArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray77, objArray79);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) 10L, (float) 10L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray20, charArray24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader32, fields33, fields34, true);
        org.elasticsearch.common.settings.Settings.Builder builder37 = commonGramsTokenFilterFactoryTests28.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("", indexReader39, fields40, fields41, false);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests28.ruleChain;
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) charArray46);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray46, charArray50);
        org.junit.Assert.assertArrayEquals("hi!", charArray20, charArray46);
        char[] charArray55 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray20, charArray55);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray9, intArray12);
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals(intArray12, intArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) intArray16);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) 100L, (float) (short) 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0f, (float) (byte) 10, (float) (-1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        long[] longArray1 = null;
        long[] longArray5 = new long[] { (byte) -1, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray5);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader19, (int) (short) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", (int) ' ', numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 1L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 1L);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray7, floatArray10, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) (byte) 100);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) 1L);
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray21, floatArray24, (float) 0L);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray24, floatArray27, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray24, (float) ' ');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader37, (int) (short) 100, postingsEnum39, postingsEnum40, false);
        org.elasticsearch.common.settings.Settings.Builder builder43 = commonGramsTokenFilterFactoryTests35.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) floatArray24, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray24);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        double[] doubleArray7 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray14 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray23 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray30 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray30, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray14, doubleArray23, 100.0d);
        double[] doubleArray38 = new double[] { 1.0d, '4', 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray38, (double) 0.0f);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        short[] shortArray6 = new short[] { (short) 0, (short) 1, (byte) 0, (short) 100, (byte) 1, (short) 10 };
        short[] shortArray10 = new short[] { (short) 0, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) (byte) 0, 0.0d, (double) 10L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 1L);
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray3, floatArray6, (float) 0L);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray6, floatArray9, (float) 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0L);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) -1, (short) 1, (byte) 1, (byte) 10 };
        short[] shortArray14 = new short[] { (byte) 0, (byte) 10, (byte) 10, (short) 1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray7, shortArray14);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) (-1.0d));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 0, 0L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("hi!", postingsEnum13, postingsEnum14, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling2, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling18 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) throttlingArray19);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) '4', 0.0f);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("tests.weekly", indexReader26, fields27, fields28, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) indexReader26);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader33, 0, postingsEnum35, postingsEnum36);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.slow", indexReader40, (int) (short) 10, postingsEnum42, postingsEnum43, false);
        java.lang.String str46 = commonGramsTokenFilterFactoryTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        long[] longArray4 = new long[] { (byte) -1, 0L, (byte) 10 };
        long[] longArray10 = new long[] { '#', (byte) -1, (byte) 1, 100L, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray4, longArray10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 0L, (double) (short) 10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray3 = new java.util.Locale[] { locale2 };
        java.util.Set<java.util.Locale> localeSet4 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsSkippingEquals("", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12, false);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsSkippingEquals("", indexReader17, (-1), postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("tests.badapples", indexReader24, (int) (byte) -1, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("tests.weekly", indexReader30, fields31, fields32, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) indexReader30);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("tests.badapples", indexReader37, 0, postingsEnum39, postingsEnum40);
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests6.ruleChain;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("random", indexReader44, (int) ' ', postingsEnum46, postingsEnum47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("hi!", indexReader51, 10, postingsEnum53, postingsEnum54, false);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("hi!", indexReader58, (int) (short) 0, postingsEnum60, postingsEnum61);
        org.elasticsearch.common.settings.Settings.Builder builder63 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray3, (java.lang.Object) builder63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling65 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling66 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling66);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests68 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests68.assertDocsSkippingEquals("", indexReader70, (int) (short) 100, postingsEnum72, postingsEnum73, false);
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests68.assertDocsEnumEquals("hi!", postingsEnum77, postingsEnum78, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling66, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling82 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray83 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling65, throttling66, throttling82 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray83);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet85 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray3, (java.lang.Object[]) throttlingArray83);
    }
}

