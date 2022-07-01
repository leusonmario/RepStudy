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
        short[] shortArray2 = new short[] { (byte) 10 };
        short[] shortArray8 = new short[] { (short) -1, (byte) -1, (short) 0, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray2, shortArray8);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        long[] longArray1 = new long[] {};
        long[] longArray5 = new long[] { 100L, 0L, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray1, longArray5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray4);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) 10L);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { (-1.0f), 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (-1.0f));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        short[] shortArray1 = new short[] { (short) 0 };
        short[] shortArray5 = new short[] { (byte) 100, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (long) 1, 1L);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        float[] floatArray1 = new float[] {};
        float[] floatArray8 = new float[] { 4, (short) 1, (byte) 100, 10, (byte) 1, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray1, floatArray8, (float) 0L);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", 1, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) 0L, (float) '4');
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        long[] longArray0 = null;
        long[] longArray1 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (byte) 0, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        double[] doubleArray5 = new double[] { (byte) -1, (byte) -1, 1.0d, 2, 0 };
        double[] doubleArray8 = new double[] { (-1.0f), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) 4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 100.0d, (double) 100);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 1L, (long) ' ');
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        char[] charArray0 = null;
        char[] charArray3 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) (byte) -1, postingsEnum13, postingsEnum14, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) '4', (float) 'a', (float) ' ');
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        char[] charArray6 = new char[] { '4', '#', ' ', ' ', '#' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray6, charArray7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) '#', (java.lang.Object) (short) -1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        float[] floatArray2 = new float[] { (short) 100, (byte) 0 };
        float[] floatArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 1L);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.junit.rules.TestRule testRule1 = null;
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule(testRule1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 10.0f, (java.lang.Object) ruleChain2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.util.Set[] setArray12 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray13 = (java.util.Set<java.io.Serializable>[]) setArray12;
        serializableSetArray13[0] = serializableSet2;
        serializableSetArray13[1] = serializableSet4;
        serializableSetArray13[2] = serializableSet6;
        serializableSetArray13[3] = serializableSet8;
        serializableSetArray13[4] = serializableSet10;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 3, (java.lang.Object) serializableSetSet24);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) ' ');
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) ' ');
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1, (java.lang.Object) 10L);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.failfast", obj1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        float[] floatArray1 = new float[] { 1L };
        float[] floatArray7 = new float[] { (byte) 0, 4, 5, 100.0f, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray7, (float) 0L);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        double[] doubleArray5 = new double[] { (short) 100, (byte) 1, 0.0d, (-1L) };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray5, doubleArray6, (double) 10.0f);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray1, shortArray3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) 0.0d, (java.lang.Object) throttling2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader17, terms18, terms19, true);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray23, intArray24);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray27, intArray28);
        org.junit.Assert.assertArrayEquals(intArray24, intArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) indexReader17, (java.lang.Object) intArray27);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        java.lang.String str21 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) (byte) 100, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.junit.rules.RuleChain ruleChain0 = org.junit.rules.RuleChain.emptyRuleChain();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        double[] doubleArray4 = new double[] { ' ', (-1), 3 };
        double[] doubleArray10 = new double[] { 0L, 10.0f, (byte) 1, 10.0d, (-1.0d) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray4, doubleArray10, (double) (short) 1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 0, (long) 4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray3, byteArray5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 1.0d, (double) (short) 10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) 'a');
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.slow", true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        char[] charArray5 = new char[] { '4', 'a', ' ', ' ', ' ' };
        char[] charArray8 = new char[] { 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain15);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.junit.rules.TestRule testRule0 = null;
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.outerRule(testRule0);
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain1, obj2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        java.lang.Object obj0 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray5, (java.lang.Object) 100.0d);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray5, intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) intArray15);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) 1.0f, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) 10L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.util.Set[] setArray12 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray13 = (java.util.Set<java.io.Serializable>[]) setArray12;
        serializableSetArray13[0] = serializableSet2;
        serializableSetArray13[1] = serializableSet4;
        serializableSetArray13[2] = serializableSet6;
        serializableSetArray13[3] = serializableSet8;
        serializableSetArray13[4] = serializableSet10;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray13);
        java.util.List<java.util.Set<java.io.Serializable>> serializableSetList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, serializableSetArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) serializableSetList25, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 100);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        java.lang.Object[] objArray0 = null;
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray8);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) serializableArray3);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 3, (long) (byte) 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (-1), 0L);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        short[] shortArray1 = new short[] { (byte) 0 };
        short[] shortArray3 = new short[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        char[] charArray3 = new char[] { 'a', 'a' };
        char[] charArray7 = new char[] { 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray3, charArray7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray8);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 10, (java.lang.Object) serializableArray13);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        float[] floatArray3 = new float[] { (byte) 100, '#' };
        float[] floatArray5 = new float[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray3, floatArray5, (float) (short) 10);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) boolean22);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray6 = new short[] { (short) 0, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        short[] shortArray7 = new short[] { (short) 10, (byte) -1, (byte) 10, (byte) 10, (short) 10, (short) 0 };
        short[] shortArray9 = new short[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray7, shortArray9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.tearDown();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests15.assertDocsSkippingEquals("tests.nightly", indexReader24, (int) (byte) -1, postingsEnum26, postingsEnum27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (short) -1, postingsEnum33, postingsEnum34);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule38 = kuromojiAnalysisTests37.ruleChain;
        kuromojiAnalysisTests37.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests37);
        org.junit.rules.RuleChain ruleChain41 = kuromojiAnalysisTests37.failureAndSuccessEvents;
        kuromojiAnalysisTests15.failureAndSuccessEvents = ruleChain41;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests43.tearDown();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        kuromojiAnalysisTests43.assertFieldsEquals("enwiki.random.lines.txt", indexReader46, fields47, fields48, true);
        kuromojiAnalysisTests43.setUp();
        kuromojiAnalysisTests43.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests54.tearDown();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        kuromojiAnalysisTests54.assertTermsEquals("tests.failfast", indexReader57, terms58, terms59, false);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        kuromojiAnalysisTests54.assertTermsEquals("", indexReader63, terms64, terms65, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests68.tearDown();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        kuromojiAnalysisTests68.assertTermsEquals("tests.failfast", indexReader71, terms72, terms73, false);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        kuromojiAnalysisTests68.assertDocsSkippingEquals("tests.nightly", indexReader77, (int) (byte) -1, postingsEnum79, postingsEnum80, false);
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        kuromojiAnalysisTests68.assertTermsEquals("", indexReader84, terms85, terms86, true);
        org.junit.Assert[] assertArray89 = new org.junit.Assert[] { kuromojiAnalysisTests1, kuromojiAnalysisTests15, kuromojiAnalysisTests43, kuromojiAnalysisTests54, kuromojiAnalysisTests68 };
        java.util.List<org.junit.Assert> assertList90 = org.elasticsearch.test.ESTestCase.randomSubsetOf(4, assertArray89);
        java.util.concurrent.ExecutorService executorService91 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray92 = new java.util.concurrent.ExecutorService[] { executorService91 };
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray92);
        boolean boolean94 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) assertArray89, (java.lang.Object[]) executorServiceArray92);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        java.io.Serializable[] serializableArray0 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet1 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray0);
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray0, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) ' ', (-1.0f), (float) 0L);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        char[] charArray3 = new char[] { ' ', '#' };
        char[] charArray5 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray3, charArray5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.util.Set[] setArray12 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray13 = (java.util.Set<java.io.Serializable>[]) setArray12;
        serializableSetArray13[0] = serializableSet2;
        serializableSetArray13[1] = serializableSet4;
        serializableSetArray13[2] = serializableSet6;
        serializableSetArray13[3] = serializableSet8;
        serializableSetArray13[4] = serializableSet10;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray13);
        java.util.List<java.util.Set<java.io.Serializable>> serializableSetList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, serializableSetArray13);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray33);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray43);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray38);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableSetArray13, (java.lang.Object[]) serializableArray49);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.monster");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.monster", 0, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) -1, (double) (byte) 100, (double) (short) 100);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) (short) 0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement12 = null;
        org.junit.runner.Description description13 = null;
        org.junit.runners.model.Statement statement14 = ruleChain11.apply(statement12, description13);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests16.ruleChain;
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests16);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests16.assertTermsEquals("random", indexReader21, terms22, terms23, false);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement27 = null;
        org.junit.runner.Description description28 = null;
        org.junit.runners.model.Statement statement29 = ruleChain26.apply(statement27, description28);
        org.junit.runner.Description description30 = null;
        org.junit.runners.model.Statement statement31 = ruleChain11.apply(statement29, description30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.tearDown();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests32.assertTermsEquals("tests.failfast", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests32.assertDocsSkippingEquals("tests.nightly", indexReader41, (int) (byte) -1, postingsEnum43, postingsEnum44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests32.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader48, (int) (short) -1, postingsEnum50, postingsEnum51);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests54.ruleChain;
        kuromojiAnalysisTests54.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests54);
        org.junit.rules.RuleChain ruleChain58 = kuromojiAnalysisTests54.failureAndSuccessEvents;
        kuromojiAnalysisTests32.failureAndSuccessEvents = ruleChain58;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) statement31, (java.lang.Object) ruleChain58);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.util.Set[] setArray12 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray13 = (java.util.Set<java.io.Serializable>[]) setArray12;
        serializableSetArray13[0] = serializableSet2;
        serializableSetArray13[1] = serializableSet4;
        serializableSetArray13[2] = serializableSet6;
        serializableSetArray13[3] = serializableSet8;
        serializableSetArray13[4] = serializableSet10;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray13);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) serializableSetSet24, (java.lang.Object) boolean29);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests10.assertTermsEquals("tests.failfast", indexReader13, terms14, terms15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests10.assertDocsSkippingEquals("tests.nightly", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) (short) -1, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests32.ruleChain;
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests32);
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        kuromojiAnalysisTests10.failureAndSuccessEvents = ruleChain36;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests10.assertDocsSkippingEquals("tests.badapples", indexReader39, 0, postingsEnum41, postingsEnum42, true);
        kuromojiAnalysisTests10.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 0, (double) (byte) 1, (double) 2);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) 1, (double) 10L);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        double[] doubleArray5 = new double[] { 100, 3, (short) 1, 3, 4 };
        double[] doubleArray8 = new double[] { 0L, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) 0.0f);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.util.Set[] setArray13 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray14 = (java.util.Set<java.io.Serializable>[]) setArray13;
        serializableSetArray14[0] = serializableSet3;
        serializableSetArray14[1] = serializableSet5;
        serializableSetArray14[2] = serializableSet7;
        serializableSetArray14[3] = serializableSet9;
        serializableSetArray14[4] = serializableSet11;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray14);
        java.util.List<java.util.Set<java.io.Serializable>> serializableSetList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, serializableSetArray14);
        java.lang.Object[] objArray30 = new java.lang.Object[] { "tests.nightly", (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) serializableSetArray14, objArray30);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.nightly", "europarl.lines.txt.gz", "tests.maxfailures", "tests.badapples", "tests.failfast" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) executorServiceArray8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 5, (double) (-1));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) '4');
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) testRuleIgnoreAfterMaxFailures1, (java.lang.Object) '#');
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule16 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule16;
        org.junit.rules.RuleChain ruleChain18 = ruleChain15.around(testRule16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests19.tearDown();
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests19.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain18, (java.lang.Object) kuromojiAnalysisTests19);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.lang.Iterable[] iterableArray6 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray7 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray6;
        serializableIterableArray7[0] = serializableSet2;
        serializableIterableArray7[1] = serializableSet4;
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableIterableArray7);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray20, (java.lang.Object[]) serializableArray22);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray22);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) serializableArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) serializableIterableArray7, (java.lang.Object[]) serializableArray14);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (short) 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        java.lang.Object obj28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain26, obj28);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement13 = null;
        org.junit.runner.Description description14 = null;
        org.junit.runners.model.Statement statement15 = ruleChain12.apply(statement13, description14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) ruleChain12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) -1, (double) (byte) -1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) 2, (float) (short) -1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (byte) -1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        short[] shortArray2 = new short[] { (short) 10 };
        short[] shortArray8 = new short[] { (short) -1, (byte) -1, (byte) 0, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        char[] charArray3 = new char[] { '#', 'a', '4' };
        char[] charArray6 = new char[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        java.lang.String str21 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        byte[] byteArray0 = null;
        byte[] byteArray1 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        long[] longArray5 = new long[] { 3, 100L, (byte) 10, 10L, (byte) -1 };
        long[] longArray8 = new long[] { (byte) 0, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray11);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100.0f);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray10);
        java.lang.Object obj15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) "tests.nightly", obj15);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray9);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) serializableArray19);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray14);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray25);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray35);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        java.util.Set[] setArray49 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray50 = (java.util.Set<java.io.Serializable>[]) setArray49;
        serializableSetArray50[0] = serializableSet39;
        serializableSetArray50[1] = serializableSet41;
        serializableSetArray50[2] = serializableSet43;
        serializableSetArray50[3] = serializableSet45;
        serializableSetArray50[4] = serializableSet47;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray50);
        java.lang.Object[] objArray62 = new java.lang.Object[] { 'a', serializableArray25, serializableArray33, serializableSetArray50 };
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet66 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray65);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray68);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray68, (java.lang.Object[]) serializableArray70);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray65, (java.lang.Object[]) serializableArray70);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet76 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray75);
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet79 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray78);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray78, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray75, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray65, (java.lang.Object[]) serializableArray75);
        java.io.Serializable[] serializableArray86 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet87 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray86);
        java.io.Serializable[] serializableArray88 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet89 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray88);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray86, (java.lang.Object[]) serializableArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray65, (java.lang.Object[]) serializableArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray62, (java.lang.Object[]) serializableArray65);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        char[] charArray1 = new char[] { '4' };
        char[] charArray2 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        int[] intArray3 = new int[] { (byte) -1, '#' };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray7, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray8, intArray11);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray8, (java.lang.Object) 100.0d);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray20, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray21, intArray24);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray21, (java.lang.Object) 100.0d);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray21, intArray31);
        org.junit.Assert.assertArrayEquals("random", intArray8, intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray3, intArray8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray9);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) serializableArray19);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray14);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.tearDown();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests32.assertTermsEquals("tests.failfast", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests32.assertDocsSkippingEquals("tests.nightly", indexReader41, (int) (byte) -1, postingsEnum43, postingsEnum44, false);
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule48 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule48;
        org.junit.rules.RuleChain ruleChain50 = ruleChain47.around(testRule48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) ruleChain47);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 0, (long) (byte) 1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (long) (short) 100, (long) (short) 100);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        short[] shortArray3 = new short[] { (byte) 10, (byte) 0 };
        short[] shortArray5 = new short[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray3, shortArray5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 100L, 0.0d);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        long[] longArray5 = new long[] { '#', 1, 'a', (-1L) };
        long[] longArray9 = new long[] { 1, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.junit.rules.RuleChain ruleChain0 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement13 = null;
        org.junit.runner.Description description14 = null;
        org.junit.runners.model.Statement statement15 = ruleChain12.apply(statement13, description14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests17.ruleChain;
        kuromojiAnalysisTests17.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests17);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests17.assertTermsEquals("random", indexReader22, terms23, terms24, false);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests17.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement28 = null;
        org.junit.runner.Description description29 = null;
        org.junit.runners.model.Statement statement30 = ruleChain27.apply(statement28, description29);
        org.junit.runner.Description description31 = null;
        org.junit.runners.model.Statement statement32 = ruleChain12.apply(statement30, description31);
        org.junit.runner.Description description33 = null;
        org.junit.runners.model.Statement statement34 = ruleChain0.apply(statement30, description33);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests35.tearDown();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests35.assertTermsEquals("tests.failfast", indexReader38, terms39, terms40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests35.assertDocsSkippingEquals("tests.nightly", indexReader44, (int) (byte) -1, postingsEnum46, postingsEnum47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests35.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader51, (int) (short) -1, postingsEnum53, postingsEnum54);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests57 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule58 = kuromojiAnalysisTests57.ruleChain;
        kuromojiAnalysisTests57.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests57);
        org.junit.rules.RuleChain ruleChain61 = kuromojiAnalysisTests57.failureAndSuccessEvents;
        kuromojiAnalysisTests35.failureAndSuccessEvents = ruleChain61;
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        kuromojiAnalysisTests35.assertDocsSkippingEquals("tests.badapples", indexReader64, 0, postingsEnum66, postingsEnum67, true);
        kuromojiAnalysisTests35.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain0, (java.lang.Object) kuromojiAnalysisTests35);
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests35.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum73, postingsEnum74);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a' };
        char[] charArray8 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray6, charArray8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.junit.rules.TestRule testRule1 = org.apache.lucene.util.LuceneTestCase.classRules;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) testRule1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        short[] shortArray6 = new short[] { (short) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        short[] shortArray7 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray1, byteArray4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        java.lang.String str23 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests25.ruleChain;
        kuromojiAnalysisTests25.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests25);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests25.assertTermsEquals("random", indexReader30, terms31, terms32, false);
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement36 = null;
        org.junit.runner.Description description37 = null;
        org.junit.runners.model.Statement statement38 = ruleChain35.apply(statement36, description37);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule41 = kuromojiAnalysisTests40.ruleChain;
        kuromojiAnalysisTests40.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests40);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests40.assertTermsEquals("random", indexReader45, terms46, terms47, false);
        org.junit.rules.RuleChain ruleChain50 = kuromojiAnalysisTests40.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement51 = null;
        org.junit.runner.Description description52 = null;
        org.junit.runners.model.Statement statement53 = ruleChain50.apply(statement51, description52);
        org.junit.runner.Description description54 = null;
        org.junit.runners.model.Statement statement55 = ruleChain35.apply(statement53, description54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) statement55);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader13, terms14, terms15, false);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("", (int) '#', numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 10, (long) 2);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 'a', (java.lang.Object) intArray3);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule5 = kuromojiAnalysisTests4.ruleChain;
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests4);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests4.assertTermsEquals("random", indexReader9, terms10, terms11, false);
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests4.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement15 = null;
        org.junit.runner.Description description16 = null;
        org.junit.runners.model.Statement statement17 = ruleChain14.apply(statement15, description16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests19.ruleChain;
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests19);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests19.assertTermsEquals("random", indexReader24, terms25, terms26, false);
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests19.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement30 = null;
        org.junit.runner.Description description31 = null;
        org.junit.runners.model.Statement statement32 = ruleChain29.apply(statement30, description31);
        org.junit.runner.Description description33 = null;
        org.junit.runners.model.Statement statement34 = ruleChain14.apply(statement32, description33);
        org.junit.runner.Description description35 = null;
        org.junit.runners.model.Statement statement36 = ruleChain2.apply(statement32, description35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests37.tearDown();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        kuromojiAnalysisTests37.assertTermsEquals("tests.failfast", indexReader40, terms41, terms42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests37.assertDocsSkippingEquals("tests.nightly", indexReader46, (int) (byte) -1, postingsEnum48, postingsEnum49, false);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests37.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader53, (int) (short) -1, postingsEnum55, postingsEnum56);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests59 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule60 = kuromojiAnalysisTests59.ruleChain;
        kuromojiAnalysisTests59.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests59);
        org.junit.rules.RuleChain ruleChain63 = kuromojiAnalysisTests59.failureAndSuccessEvents;
        kuromojiAnalysisTests37.failureAndSuccessEvents = ruleChain63;
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        kuromojiAnalysisTests37.assertDocsSkippingEquals("tests.badapples", indexReader66, 0, postingsEnum68, postingsEnum69, true);
        kuromojiAnalysisTests37.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain2, (java.lang.Object) kuromojiAnalysisTests37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) (byte) 0, (java.lang.Object) kuromojiAnalysisTests37);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) 0L);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        long[] longArray3 = new long[] { ' ', '4' };
        long[] longArray5 = new long[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray4, (java.lang.Object) 100.0d);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray16, intArray17);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray17, intArray20);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray17, (java.lang.Object) 100.0d);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray27, intArray28);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray17, intArray27);
        org.junit.Assert.assertArrayEquals("random", intArray4, intArray17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.tearDown();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests32.assertTermsEquals("tests.failfast", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests32.assertDocsSkippingEquals("tests.nightly", indexReader41, (int) (byte) -1, postingsEnum43, postingsEnum44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests32.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader48, (int) (short) -1, postingsEnum50, postingsEnum51);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests54.ruleChain;
        kuromojiAnalysisTests54.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests54);
        org.junit.rules.RuleChain ruleChain58 = kuromojiAnalysisTests54.failureAndSuccessEvents;
        kuromojiAnalysisTests32.failureAndSuccessEvents = ruleChain58;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests32.assertDocsSkippingEquals("tests.badapples", indexReader61, 0, postingsEnum63, postingsEnum64, true);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        kuromojiAnalysisTests32.assertTermsEquals("random", indexReader68, terms69, terms70, false);
        kuromojiAnalysisTests32.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain74 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray4, (java.lang.Object) ruleChain74);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader9, 1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.weekly", indexReader16, 1, postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        long[] longArray2 = new long[] { 3 };
        long[] longArray7 = new long[] { (byte) 10, 5, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray2, longArray7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        long[] longArray1 = new long[] { 10L };
        long[] longArray7 = new long[] { (short) 100, (byte) 100, 4, (byte) 1, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray7);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttling0, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 100L, 0L);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain26, (java.lang.Object) 100L);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) (short) -1, 0.0f);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.nightly", "europarl.lines.txt.gz", "tests.maxfailures", "tests.badapples", "tests.failfast" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) charSequenceArray6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        double[] doubleArray3 = new double[] { 0L, (short) 1 };
        double[] doubleArray5 = new double[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        short[] shortArray5 = new short[] { (byte) 1, (byte) 100, (short) 1, (short) -1, (short) 1 };
        short[] shortArray9 = new short[] { (byte) 10, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("hi!", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum17);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        float[] floatArray2 = new float[] { (short) -1, 0L };
        float[] floatArray8 = new float[] { (short) -1, (-1.0f), (byte) 1, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) 10L);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) (short) 1, (double) (short) 10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.util.Set[] setArray18 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray19 = (java.util.Set<java.io.Serializable>[]) setArray18;
        serializableSetArray19[0] = serializableSet8;
        serializableSetArray19[1] = serializableSet10;
        serializableSetArray19[2] = serializableSet12;
        serializableSetArray19[3] = serializableSet14;
        serializableSetArray19[4] = serializableSet16;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableSetArray19);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        short[] shortArray5 = new short[] { (short) 0, (short) 0, (byte) 0, (byte) 1 };
        short[] shortArray9 = new short[] { (short) -1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray5, shortArray9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 'a', (double) 10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), 10L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { 10.0f, (short) 0, (byte) 1, 1.0f, '#', (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray1, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("random", indexReader17, (int) ' ', postingsEnum19, postingsEnum20, true);
        kuromojiAnalysisTests1.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("enwiki.random.lines.txt", indexReader27, fields28, fields29, true);
        kuromojiAnalysisTests24.setUp();
        kuromojiAnalysisTests24.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests24.resetCheckIndexStatus();
        kuromojiAnalysisTests24.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests24);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("random", 1, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule36;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule36, (java.lang.Object) throttling38);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        short[] shortArray6 = new short[] { (short) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        short[] shortArray11 = new short[] { (short) 10, (byte) 100, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule16 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule16;
        org.junit.rules.RuleChain ruleChain18 = ruleChain15.around(testRule16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests20.ruleChain;
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests20);
        org.junit.rules.RuleChain ruleChain24 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule25 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.outerRule(testRule25);
        org.junit.rules.RuleChain[] ruleChainArray27 = new org.junit.rules.RuleChain[] { ruleChain15, ruleChain24, ruleChain26 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet28 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray27);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.lang.Iterable[] iterableArray39 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray40 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray39;
        serializableIterableArray40[0] = serializableSet31;
        serializableIterableArray40[1] = serializableSet33;
        serializableIterableArray40[2] = serializableSet35;
        serializableIterableArray40[3] = serializableSet37;
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        java.lang.Iterable[] iterableArray58 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray59 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray58;
        serializableIterableArray59[0] = serializableSet50;
        serializableIterableArray59[1] = serializableSet52;
        serializableIterableArray59[2] = serializableSet54;
        serializableIterableArray59[3] = serializableSet56;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray68);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet75 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray74);
        java.lang.Iterable[] iterableArray77 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray78 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray77;
        serializableIterableArray78[0] = serializableSet69;
        serializableIterableArray78[1] = serializableSet71;
        serializableIterableArray78[2] = serializableSet73;
        serializableIterableArray78[3] = serializableSet75;
        java.lang.Iterable[][] iterableArray88 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][] serializableIterableArray89 = (java.lang.Iterable<java.io.Serializable>[][]) iterableArray88;
        serializableIterableArray89[0] = serializableIterableArray40;
        serializableIterableArray89[1] = serializableIterableArray59;
        serializableIterableArray89[2] = serializableIterableArray78;
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList96 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, serializableIterableArray89);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray27, (java.lang.Object[]) serializableIterableArray89);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        long[] longArray7 = new long[] { (-1L), 100, 1L, 10L, '4', (byte) 10 };
        long[] longArray13 = new long[] { '#', '4', (byte) 1, 1L, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray7, longArray13);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        long[] longArray6 = new long[] { '#', 3, (byte) 100, 0, 'a' };
        long[] longArray10 = new long[] { (byte) 0, (byte) 10, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray6, longArray10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", (int) (short) -1, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.lang.Object obj5 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) boolean4, obj5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        long[] longArray6 = new long[] { 0L, 1L, (byte) 0, (byte) 0, '4' };
        long[] longArray10 = new long[] { 5, (-1L), 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray6, longArray10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        short[] shortArray6 = new short[] { (short) 100, (short) 10, (short) 0, (byte) -1, (byte) 0 };
        short[] shortArray13 = new short[] { (short) -1, (byte) 1, (short) 1, (short) 10, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray6, shortArray13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) (short) -1, (java.lang.Object) testRuleIgnoreAfterMaxFailures2);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        long[] longArray6 = new long[] { (short) -1, 4, 1, 1, (short) 100, '4' };
        long[] longArray13 = new long[] { 2, 100, '4', 4, 'a', 1L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 'a', 0L);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        double[] doubleArray6 = new double[] { 1.0d, (-1), 100, 1.0f, (byte) 0 };
        double[] doubleArray10 = new double[] { 10.0f, 10L, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray6, doubleArray10, (double) 1.0f);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        short[] shortArray1 = null;
        short[] shortArray7 = new short[] { (short) -1, (byte) -1, (short) -1, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray1, shortArray7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) 100, 10L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        float[] floatArray6 = new float[] { 1.0f, (short) -1, ' ', 0, '#', ' ' };
        float[] floatArray13 = new float[] { 100L, (byte) 0, 'a', 10.0f, (short) -1, 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray13, (float) (short) 10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        short[] shortArray2 = new short[] { (byte) 10 };
        short[] shortArray9 = new short[] { (byte) 1, (short) 0, (short) 1, (short) 1, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray5, (java.lang.Object) 100.0d);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray17, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray18, (java.lang.Object) 100.0d);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray18, intArray28);
        org.junit.Assert.assertArrayEquals("random", intArray5, intArray18);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray35, intArray36);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray39, intArray40);
        org.junit.Assert.assertArrayEquals(intArray36, intArray39);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray36, (java.lang.Object) 100.0d);
        org.junit.Assert.assertArrayEquals(intArray18, intArray36);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray47, intArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray18, intArray47);
        int[] intArray55 = new int[] { 'a', 1, (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray47, intArray55);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        long[] longArray3 = new long[] { 0L, 10, 'a' };
        long[] longArray5 = new long[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader36, terms37, terms38, false);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.weekly", indexReader44, (int) (short) 100, postingsEnum46, postingsEnum47);
        org.apache.lucene.index.NumericDocValues numericDocValues51 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.monster", (-1), numericDocValues51, numericDocValues52);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        double[] doubleArray5 = new double[] { 'a', 100, (short) 0, (short) 10, (-1L) };
        double[] doubleArray9 = new double[] { 0.0f, (short) 1, 100.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        double[] doubleArray6 = new double[] { '4', (byte) 1, 100L, (short) -1, 0L };
        double[] doubleArray11 = new double[] { (short) 0, (byte) 10, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, 0.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (-1L), (double) (short) 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        float[] floatArray7 = new float[] { ' ', '#', (byte) 100, (short) 0, (short) 0, 0 };
        float[] floatArray12 = new float[] { (short) 100, (byte) -1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray7, floatArray12, (float) (byte) -1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray1, intArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests9.ruleChain;
        kuromojiAnalysisTests9.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        org.junit.rules.RuleChain ruleChain19 = kuromojiAnalysisTests9.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement20 = null;
        org.junit.runner.Description description21 = null;
        org.junit.runners.model.Statement statement22 = ruleChain19.apply(statement20, description21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests24.ruleChain;
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests24);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests24.assertTermsEquals("random", indexReader29, terms30, terms31, false);
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests24.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement35 = null;
        org.junit.runner.Description description36 = null;
        org.junit.runners.model.Statement statement37 = ruleChain34.apply(statement35, description36);
        org.junit.runner.Description description38 = null;
        org.junit.runners.model.Statement statement39 = ruleChain19.apply(statement37, description38);
        org.junit.runner.Description description40 = null;
        org.junit.runners.model.Statement statement41 = ruleChain7.apply(statement37, description40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.tearDown();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests42.assertTermsEquals("tests.failfast", indexReader45, terms46, terms47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests42.assertDocsSkippingEquals("tests.nightly", indexReader51, (int) (byte) -1, postingsEnum53, postingsEnum54, false);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        kuromojiAnalysisTests42.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader58, (int) (short) -1, postingsEnum60, postingsEnum61);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests64 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule65 = kuromojiAnalysisTests64.ruleChain;
        kuromojiAnalysisTests64.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests64);
        org.junit.rules.RuleChain ruleChain68 = kuromojiAnalysisTests64.failureAndSuccessEvents;
        kuromojiAnalysisTests42.failureAndSuccessEvents = ruleChain68;
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        kuromojiAnalysisTests42.assertDocsSkippingEquals("tests.badapples", indexReader71, 0, postingsEnum73, postingsEnum74, true);
        kuromojiAnalysisTests42.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain7, (java.lang.Object) kuromojiAnalysisTests42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests79 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule80 = kuromojiAnalysisTests79.ruleChain;
        org.junit.rules.RuleChain ruleChain81 = org.junit.rules.RuleChain.outerRule(testRule80);
        org.junit.rules.RuleChain ruleChain82 = ruleChain7.around(testRule80);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.NumericDocValues numericDocValues86 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.weekly", 100, numericDocValues86, numericDocValues87);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule37 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule37;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule37;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) testRule37);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        char[] charArray4 = new char[] { ' ', ' ', ' ', '#' };
        char[] charArray6 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray6);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests9, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4, throttling5, throttling6, throttling7, throttling13, throttling15 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling17, throttling18, throttling19, throttling20, throttling26, throttling28 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests35.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests35, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31, throttling32, throttling33, throttling39, throttling41 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests48, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling52);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44, throttling45, throttling46, throttling52, throttling54 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray16, throttlingArray29, throttlingArray42, throttlingArray55 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArrayList57 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, throttlingArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) throttlingArray56);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 4, (double) (byte) -1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 10, (long) 100);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) ' ', (double) 100L, (double) (short) 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("hi!", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        long[] longArray6 = new long[] { (short) -1, (-1), 1L, 4, (short) 10, (short) 100 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 100L, (-1L));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.badapples", false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement13 = null;
        org.junit.runner.Description description14 = null;
        org.junit.runners.model.Statement statement15 = ruleChain12.apply(statement13, description14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests17.ruleChain;
        kuromojiAnalysisTests17.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests17);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests17.assertTermsEquals("random", indexReader22, terms23, terms24, false);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests17.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement28 = null;
        org.junit.runner.Description description29 = null;
        org.junit.runners.model.Statement statement30 = ruleChain27.apply(statement28, description29);
        org.junit.runner.Description description31 = null;
        org.junit.runners.model.Statement statement32 = ruleChain12.apply(statement30, description31);
        org.junit.rules.TestRule testRule33 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.outerRule(testRule33);
        org.junit.rules.RuleChain ruleChain35 = ruleChain12.around(testRule33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) ruleChain12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        long[] longArray6 = new long[] { (byte) 100, (short) 0, (byte) 100, (byte) -1, (short) 0 };
        long[] longArray9 = new long[] { (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray6, longArray9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray20);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray30);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray25);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) serializableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) serializableArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) serializableArray49);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray59);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) serializableArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) serializableArray44);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        short[] shortArray3 = new short[] { (short) 1, (byte) 1, (byte) 10 };
        short[] shortArray9 = new short[] { (short) 1, (short) 1, (byte) -1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        char[] charArray4 = new char[] { '#', ' ', ' ' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) '4', (double) 5);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray6 = new short[] { (byte) 10, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray2, shortArray6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain3);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        long[] longArray2 = new long[] { (short) -1, 3 };
        long[] longArray6 = new long[] { (short) -1, 4, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1L, (double) 1L, (double) 'a');
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0.0f, (double) (byte) 100, (double) 'a');
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.rules.RuleChain ruleChain6 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) 10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests36.tearDown();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        kuromojiAnalysisTests36.assertTermsEquals("tests.failfast", indexReader39, terms40, terms41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests36.assertTermsEquals("", indexReader45, terms46, terms47, false);
        kuromojiAnalysisTests36.overrideTestDefaultQueryCache();
        java.lang.String str51 = kuromojiAnalysisTests36.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) str51);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        float[] floatArray3 = new float[] { (short) 0, 0, 100L };
        float[] floatArray9 = new float[] { ' ', 2, '4', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray9, 0.0f);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) 100.0f, (double) 100L, (double) 4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        float[] floatArray4 = new float[] { (short) -1, 1.0f, (byte) 0 };
        float[] floatArray8 = new float[] { 1.0f, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray8, (float) 10);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray7);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray7);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray12);
        java.lang.Object[] objArray22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray12, objArray22);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.maxfailures");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        short[] shortArray1 = new short[] {};
        short[] shortArray7 = new short[] { (byte) 100, (byte) 10, (short) -1, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray1, shortArray7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("", true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) 5, (-1.0d));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.failfast", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests17.assertTermsEquals("tests.failfast", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("tests.nightly", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (short) -1, postingsEnum35, postingsEnum36);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests39.ruleChain;
        kuromojiAnalysisTests39.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests39);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("tests.badapples", indexReader46, 0, postingsEnum48, postingsEnum49, true);
        kuromojiAnalysisTests17.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests17);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        long[] longArray6 = new long[] { 4, (byte) 1, '#', (short) -1, 100L, 100 };
        long[] longArray13 = new long[] { (short) 1, 100L, (short) 10, (short) 100, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray9);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests20.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests20, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15, throttling16, throttling17, throttling18, throttling24, throttling26 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests33, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling28, throttling29, throttling30, throttling31, throttling37, throttling39 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests46.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests46, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling50);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling41, throttling42, throttling43, throttling44, throttling50, throttling52 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling55 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling56 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests59 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests59.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests59, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling65 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray66 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling54, throttling55, throttling56, throttling57, throttling63, throttling65 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray67 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray27, throttlingArray40, throttlingArray53, throttlingArray66 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArrayList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, throttlingArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray9, (java.lang.Object[]) throttlingArray67);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        double[] doubleArray3 = new double[] { 1L, (short) 0 };
        double[] doubleArray5 = new double[] { 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray3, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) ' ', (double) (byte) 100);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader8, fields9, fields10, false);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 0, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) 'a', numericDocValues37, numericDocValues38);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        short[] shortArray2 = new short[] { (short) 10 };
        short[] shortArray7 = new short[] { (short) -1, (short) 0, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray2, shortArray7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        short[] shortArray4 = new short[] { (short) 10, (byte) 100, (byte) 10, (byte) -1 };
        short[] shortArray10 = new short[] { (short) 10, (byte) 100, (byte) 10, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        long[] longArray5 = new long[] { 0, '#', 3, 10, 100 };
        long[] longArray9 = new long[] { (byte) 100, 10, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        long[] longArray2 = new long[] { 10L };
        long[] longArray7 = new long[] { ' ', (byte) 10, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray2, longArray7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        short[] shortArray2 = new short[] { (byte) 10 };
        short[] shortArray4 = new short[] { (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 0, (double) 4, (double) (short) -1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) '4', (-1.0f), (float) '4');
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule17 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        org.junit.rules.RuleChain ruleChain19 = ruleChain16.around(testRule17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests21);
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule26 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.outerRule(testRule26);
        org.junit.rules.RuleChain[] ruleChainArray28 = new org.junit.rules.RuleChain[] { ruleChain16, ruleChain25, ruleChain27 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet29 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray28);
        java.util.Set<org.junit.rules.TestRule> testRuleSet30 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) testRuleSet30);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.slow", false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (-1L), (double) 0.0f);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        float[] floatArray4 = new float[] { (byte) 10, 0L, 4 };
        float[] floatArray7 = new float[] { 0L, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray4, floatArray7, (float) 0L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray8);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray13);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) serializableArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray24);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.lang.Iterable[] iterableArray40 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray41 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray40;
        serializableIterableArray41[0] = serializableSet32;
        serializableIterableArray41[1] = serializableSet34;
        serializableIterableArray41[2] = serializableSet36;
        serializableIterableArray41[3] = serializableSet38;
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        java.lang.Iterable[] iterableArray59 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray60 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray59;
        serializableIterableArray60[0] = serializableSet51;
        serializableIterableArray60[1] = serializableSet53;
        serializableIterableArray60[2] = serializableSet55;
        serializableIterableArray60[3] = serializableSet57;
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet70 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray69);
        java.io.Serializable[] serializableArray71 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray71);
        java.io.Serializable[] serializableArray73 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet74 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray73);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet76 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray75);
        java.lang.Iterable[] iterableArray78 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray79 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray78;
        serializableIterableArray79[0] = serializableSet70;
        serializableIterableArray79[1] = serializableSet72;
        serializableIterableArray79[2] = serializableSet74;
        serializableIterableArray79[3] = serializableSet76;
        java.lang.Iterable[][] iterableArray89 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][] serializableIterableArray90 = (java.lang.Iterable<java.io.Serializable>[][]) iterableArray89;
        serializableIterableArray90[0] = serializableIterableArray41;
        serializableIterableArray90[1] = serializableIterableArray60;
        serializableIterableArray90[2] = serializableIterableArray79;
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList97 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, serializableIterableArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableIterableArray90);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 10, (double) 0L, 0.0d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        double[] doubleArray6 = new double[] { (-1.0f), 3, (short) 100, (short) -1, 4 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray6, doubleArray7, (double) 100);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray5, (java.lang.Object) 100.0d);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray17, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray18, (java.lang.Object) 100.0d);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray18, intArray28);
        org.junit.Assert.assertArrayEquals("random", intArray5, intArray18);
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray33);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray18, intArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) 10L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        double[] doubleArray3 = new double[] { 0.0d, (-1) };
        double[] doubleArray10 = new double[] { (-1.0f), (short) 1, (short) -1, (-1.0f), '#', (-1.0d) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray3, doubleArray10, (double) 1.0f);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 'a', (double) 3, (double) (short) 100);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests19.ruleChain;
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests19);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests19.assertTermsEquals("random", indexReader24, terms25, terms26, false);
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests19.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement30 = null;
        org.junit.runner.Description description31 = null;
        org.junit.runners.model.Statement statement32 = ruleChain29.apply(statement30, description31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule35 = kuromojiAnalysisTests34.ruleChain;
        kuromojiAnalysisTests34.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests34);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        kuromojiAnalysisTests34.assertTermsEquals("random", indexReader39, terms40, terms41, false);
        org.junit.rules.RuleChain ruleChain44 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement45 = null;
        org.junit.runner.Description description46 = null;
        org.junit.runners.model.Statement statement47 = ruleChain44.apply(statement45, description46);
        org.junit.runner.Description description48 = null;
        org.junit.runners.model.Statement statement49 = ruleChain29.apply(statement47, description48);
        org.junit.runner.Description description50 = null;
        org.junit.runners.model.Statement statement51 = ruleChain17.apply(statement47, description50);
        org.junit.runner.Description description52 = null;
        org.junit.runners.model.Statement statement53 = ruleChain16.apply(statement47, description52);
        org.junit.rules.RuleChain ruleChain54 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule57 = kuromojiAnalysisTests56.ruleChain;
        kuromojiAnalysisTests56.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests56);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        kuromojiAnalysisTests56.assertTermsEquals("random", indexReader61, terms62, terms63, false);
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests56.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement67 = null;
        org.junit.runner.Description description68 = null;
        org.junit.runners.model.Statement statement69 = ruleChain66.apply(statement67, description68);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests71 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule72 = kuromojiAnalysisTests71.ruleChain;
        kuromojiAnalysisTests71.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests71);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        kuromojiAnalysisTests71.assertTermsEquals("random", indexReader76, terms77, terms78, false);
        org.junit.rules.RuleChain ruleChain81 = kuromojiAnalysisTests71.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement82 = null;
        org.junit.runner.Description description83 = null;
        org.junit.runners.model.Statement statement84 = ruleChain81.apply(statement82, description83);
        org.junit.runner.Description description85 = null;
        org.junit.runners.model.Statement statement86 = ruleChain66.apply(statement84, description85);
        org.junit.runner.Description description87 = null;
        org.junit.runners.model.Statement statement88 = ruleChain54.apply(statement84, description87);
        org.junit.runner.Description description89 = null;
        org.junit.runners.model.Statement statement90 = ruleChain16.apply(statement84, description89);
        org.junit.rules.RuleChain ruleChain91 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain16);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) ruleChain91, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (short) 1, 1.0d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, 10L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader37, terms38, terms39, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        java.lang.String str43 = kuromojiAnalysisTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 1, (double) 'a', (double) (byte) -1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        java.lang.Object obj0 = new java.lang.Object();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.weekly", indexReader20, 1, postingsEnum22, postingsEnum23, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) postingsEnum22);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) 0, (long) 5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader16, 0, postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.weekly", 1, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        float[] floatArray5 = new float[] { 10.0f, (-1), (-1.0f), 100.0f };
        float[] floatArray7 = new float[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray5, floatArray7, (float) 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, 0.0d, (double) (short) 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        long[] longArray3 = new long[] { 10L, (-1) };
        long[] longArray9 = new long[] { 0, (short) 100, (short) 1, (short) -1, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray3, longArray9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("europarl.lines.txt.gz", true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.failfast", (int) (short) 100, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        char[] charArray3 = new char[] { ' ', '#' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray3, charArray4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        float[] floatArray4 = new float[] { 0, (short) 1, (-1L) };
        float[] floatArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray4, floatArray5, (float) 10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, 0.0d, (double) 4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) 10, (float) (-1));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) '#', (float) '4', (float) (short) -1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        double[] doubleArray5 = new double[] { 0.0f, 1L, 5, 0L };
        double[] doubleArray10 = new double[] { 10.0f, (short) 10, '#', 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray5, doubleArray10, (-1.0d));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        double[] doubleArray5 = new double[] { ' ', 100, 10L, (short) 100 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray5, doubleArray6, (double) (-1.0f));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray5, byteArray11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("hi!", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        short[] shortArray1 = new short[] { (short) 1 };
        short[] shortArray5 = new short[] { (byte) 100, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        char[] charArray1 = new char[] { '4' };
        char[] charArray8 = new char[] { '4', '#', ' ', '#', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule17 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        org.junit.rules.RuleChain ruleChain19 = ruleChain16.around(testRule17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests21);
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule26 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.outerRule(testRule26);
        org.junit.rules.RuleChain[] ruleChainArray28 = new org.junit.rules.RuleChain[] { ruleChain16, ruleChain25, ruleChain27 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet29 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray28);
        java.util.Set<org.junit.rules.TestRule> testRuleSet30 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.util.Set[] setArray42 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray43 = (java.util.Set<java.io.Serializable>[]) setArray42;
        serializableSetArray43[0] = serializableSet32;
        serializableSetArray43[1] = serializableSet34;
        serializableSetArray43[2] = serializableSet36;
        serializableSetArray43[3] = serializableSet38;
        serializableSetArray43[4] = serializableSet40;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) ruleChainArray28, (java.lang.Object[]) serializableSetArray43);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule16 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule16;
        org.junit.rules.RuleChain ruleChain18 = ruleChain15.around(testRule16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests20.ruleChain;
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests20);
        org.junit.rules.RuleChain ruleChain24 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule25 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.outerRule(testRule25);
        org.junit.rules.RuleChain[] ruleChainArray27 = new org.junit.rules.RuleChain[] { ruleChain15, ruleChain24, ruleChain26 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet28 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray27);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray37);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) executorServiceArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray27, (java.lang.Object[]) serializableArray32);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, 10.0d, 0.0d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        long[] longArray1 = new long[] {};
        long[] longArray6 = new long[] { 2, 5, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray1, longArray6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        float[] floatArray6 = new float[] { (byte) 10, 0L, 10L, 0, 10.0f, 2 };
        float[] floatArray11 = new float[] { (short) 100, (-1), (-1.0f), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) 100);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests23.assertTermsEquals("tests.failfast", indexReader26, terms27, terms28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests23.assertDocsSkippingEquals("tests.nightly", indexReader32, (int) (byte) -1, postingsEnum34, postingsEnum35, false);
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain39 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests41 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests41.ruleChain;
        kuromojiAnalysisTests41.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests41);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        kuromojiAnalysisTests41.assertTermsEquals("random", indexReader46, terms47, terms48, false);
        org.junit.rules.RuleChain ruleChain51 = kuromojiAnalysisTests41.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement52 = null;
        org.junit.runner.Description description53 = null;
        org.junit.runners.model.Statement statement54 = ruleChain51.apply(statement52, description53);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule57 = kuromojiAnalysisTests56.ruleChain;
        kuromojiAnalysisTests56.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests56);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        kuromojiAnalysisTests56.assertTermsEquals("random", indexReader61, terms62, terms63, false);
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests56.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement67 = null;
        org.junit.runner.Description description68 = null;
        org.junit.runners.model.Statement statement69 = ruleChain66.apply(statement67, description68);
        org.junit.runner.Description description70 = null;
        org.junit.runners.model.Statement statement71 = ruleChain51.apply(statement69, description70);
        org.junit.runner.Description description72 = null;
        org.junit.runners.model.Statement statement73 = ruleChain39.apply(statement69, description72);
        org.junit.runner.Description description74 = null;
        org.junit.runners.model.Statement statement75 = ruleChain38.apply(statement69, description74);
        org.junit.runner.Description description76 = null;
        org.junit.runners.model.Statement statement77 = ruleChain22.apply(statement69, description76);
        java.lang.Object obj78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) statement69, obj78);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.Object obj36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, obj36);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        long[] longArray0 = new long[] {};
        long[] longArray4 = new long[] { 0, 1L, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 100, (short) -1, (short) 100 };
        short[] shortArray10 = new short[] { (short) 100, (short) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 0.0f, (double) (-1.0f));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("hi!", 4, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet7 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) throttlingArray6);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) serializableArray12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        short[] shortArray3 = new short[] { (short) 100, (byte) 0, (byte) -1 };
        short[] shortArray10 = new short[] { (byte) -1, (short) 1, (byte) 0, (byte) 0, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 5, (double) 0.0f);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("", indexReader10, 1, postingsEnum12, postingsEnum13, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests18.assertTermsEquals("tests.failfast", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests18.assertTermsEquals("", indexReader27, terms28, terms29, false);
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests16, (java.lang.Object) kuromojiAnalysisTests18);
        kuromojiAnalysisTests18.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) postingsEnum12, (java.lang.Object) kuromojiAnalysisTests18);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) fields4);
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
        float[] floatArray0 = new float[] {};
        float[] floatArray5 = new float[] { 2, (byte) -1, 10, (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (float) 100);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) '4');
        double[] doubleArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray4, (double) 1L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        char[] charArray5 = new char[] { '4', 'a', ' ', ' ', ' ' };
        char[] charArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        byte[] byteArray7 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 1, 10.0d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        java.io.Serializable[] serializableArray0 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet1 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray0);
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.util.Set[] setArray11 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray12 = (java.util.Set<java.io.Serializable>[]) setArray11;
        serializableSetArray12[0] = serializableSet1;
        serializableSetArray12[1] = serializableSet3;
        serializableSetArray12[2] = serializableSet5;
        serializableSetArray12[3] = serializableSet7;
        serializableSetArray12[4] = serializableSet9;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray12);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray30, (java.lang.Object[]) serializableArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) serializableArray32);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) serializableArray37);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray52, (java.lang.Object[]) serializableArray54);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray54);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray62, (java.lang.Object[]) serializableArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray59, (java.lang.Object[]) serializableArray64);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray59);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray70, (java.lang.Object[]) serializableArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray70);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) serializableArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableSetArray12, (java.lang.Object[]) serializableArray27);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (-1), (double) 10, (double) 10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1.0f), (double) 1L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests13.ruleChain;
        kuromojiAnalysisTests13.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = kuromojiAnalysisTests13.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) wildcardClass19);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        short[] shortArray5 = new short[] { (short) 0, (byte) 0, (short) 10, (short) 10 };
        short[] shortArray11 = new short[] { (byte) 1, (short) 1, (short) 100, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray5, shortArray11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        long[] longArray0 = new long[] {};
        long[] longArray4 = new long[] { 100, (short) 1, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule17 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        org.junit.rules.RuleChain ruleChain19 = ruleChain16.around(testRule17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests21);
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule26 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.outerRule(testRule26);
        org.junit.rules.RuleChain[] ruleChainArray28 = new org.junit.rules.RuleChain[] { ruleChain16, ruleChain25, ruleChain27 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet29 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) ruleChainArray28);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        short[] shortArray4 = new short[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1, (short) 10, (byte) -1, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 100);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray8);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray13);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) serializableArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray24);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.lang.Iterable[] iterableArray41 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray42 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray41;
        serializableIterableArray42[0] = serializableSet33;
        serializableIterableArray42[1] = serializableSet35;
        serializableIterableArray42[2] = serializableSet37;
        serializableIterableArray42[3] = serializableSet39;
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.lang.Iterable[] iterableArray60 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray61 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray60;
        serializableIterableArray61[0] = serializableSet52;
        serializableIterableArray61[1] = serializableSet54;
        serializableIterableArray61[2] = serializableSet56;
        serializableIterableArray61[3] = serializableSet58;
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet75 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray74);
        java.io.Serializable[] serializableArray76 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet77 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray76);
        java.lang.Iterable[] iterableArray79 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray80 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray79;
        serializableIterableArray80[0] = serializableSet71;
        serializableIterableArray80[1] = serializableSet73;
        serializableIterableArray80[2] = serializableSet75;
        serializableIterableArray80[3] = serializableSet77;
        java.lang.Iterable[][] iterableArray90 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][] serializableIterableArray91 = (java.lang.Iterable<java.io.Serializable>[][]) iterableArray90;
        serializableIterableArray91[0] = serializableIterableArray42;
        serializableIterableArray91[1] = serializableIterableArray61;
        serializableIterableArray91[2] = serializableIterableArray80;
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList98 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, serializableIterableArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray24, (java.lang.Object[]) serializableIterableArray91);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (-1L), (double) 'a');
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (long) 100, 100L);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 0, (double) (short) -1, (double) '4');
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) '4', (long) (byte) 10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 1L, (double) (short) 1, (double) 1L);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        short[] shortArray5 = new short[] { (short) 0, (short) 1, (byte) 100, (byte) 0 };
        short[] shortArray9 = new short[] { (byte) -1, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray5, shortArray9);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        float[] floatArray5 = new float[] { (byte) 1, 0.0f, 1, 10, 10 };
        float[] floatArray13 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray20 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray13, floatArray20, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray13, (float) 0L);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 1.0f, (double) (short) 1, 0.0d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (byte) -1, (double) (short) -1);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray8);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) serializableArray13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) ' ');
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.lang.Iterable[] iterableArray7 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray8 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray7;
        serializableIterableArray8[0] = serializableSet3;
        serializableIterableArray8[1] = serializableSet5;
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableIterableArray8);
        org.junit.Assert.assertNotEquals((java.lang.Object) true, (java.lang.Object) serializableIterableArray8);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray24);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray37);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray42);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray59);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet68 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray67);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet70 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray69);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray67, (java.lang.Object[]) serializableArray69);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray64, (java.lang.Object[]) serializableArray69);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray64);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet76 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray75);
        java.io.Serializable[] serializableArray77 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet78 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray77);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray75, (java.lang.Object[]) serializableArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray75);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) serializableIterableArray8, (java.lang.Object[]) serializableArray16);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        char[] charArray5 = new char[] { '#', 'a', ' ', ' ', 'a' };
        char[] charArray6 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        short[] shortArray3 = new short[] { (short) 0, (short) 10, (byte) 0 };
        short[] shortArray10 = new short[] { (byte) 0, (short) 100, (byte) 0, (byte) 10, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests3);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests3.assertPositionsSkippingEquals("tests.weekly", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests13.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) (byte) -1, postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (short) -1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests35.ruleChain;
        kuromojiAnalysisTests35.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests35);
        org.junit.rules.RuleChain ruleChain39 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        kuromojiAnalysisTests13.failureAndSuccessEvents = ruleChain39;
        kuromojiAnalysisTests3.failureAndSuccessEvents = ruleChain39;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests3.assertPositionsSkippingEquals("tests.monster", indexReader43, (int) (byte) 1, postingsEnum45, postingsEnum46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.tearDown();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        kuromojiAnalysisTests48.assertFieldsEquals("enwiki.random.lines.txt", indexReader51, fields52, fields53, true);
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        kuromojiAnalysisTests48.assertDocsEnumEquals("tests.monster", postingsEnum57, postingsEnum58, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests61.tearDown();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        kuromojiAnalysisTests61.assertFieldsEquals("enwiki.random.lines.txt", indexReader64, fields65, fields66, true);
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        kuromojiAnalysisTests61.assertDocsEnumEquals("tests.monster", postingsEnum70, postingsEnum71, true);
        java.lang.String str74 = kuromojiAnalysisTests61.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray75 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests3, kuromojiAnalysisTests48, kuromojiAnalysisTests61 };
        java.util.List<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsList76 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, kuromojiAnalysisTestsArray75);
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet79 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray78);
        java.io.Serializable[] serializableArray81 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet82 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray81);
        java.io.Serializable[] serializableArray84 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet85 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray84);
        java.io.Serializable[] serializableArray86 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet87 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray86);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray84, (java.lang.Object[]) serializableArray86);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray81, (java.lang.Object[]) serializableArray86);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray78, (java.lang.Object[]) serializableArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) kuromojiAnalysisTestsArray75, (java.lang.Object[]) serializableArray78);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests17.ruleChain;
        kuromojiAnalysisTests17.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests17);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests17.assertTermsEquals("random", indexReader22, terms23, terms24, false);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests17.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests17.assertTermsEquals("", indexReader29, terms30, terms31, true);
        kuromojiAnalysisTests17.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule37 = kuromojiAnalysisTests36.ruleChain;
        kuromojiAnalysisTests36.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests36);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain40;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain40);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) 1L, (double) (byte) 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 1.0f, (java.lang.Object) 100);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, 1.0d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests36.tearDown();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        kuromojiAnalysisTests36.assertTermsEquals("tests.failfast", indexReader39, terms40, terms41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.nightly", indexReader45, (int) (byte) -1, postingsEnum47, postingsEnum48, false);
        org.junit.rules.RuleChain ruleChain51 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures52 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures53 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures52);
        org.junit.rules.RuleChain ruleChain54 = ruleChain51.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures53);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling56 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray57 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling56 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet58 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray57);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList59 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling60 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet62 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray57, (java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain51, (java.lang.Object) throttlingArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) postingsEnum32, (java.lang.Object) throttlingArray61);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray11);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) serializableArray3);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests19.ruleChain;
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests19);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests19.assertPositionsSkippingEquals("tests.weekly", indexReader24, 100, postingsEnum26, postingsEnum27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean17, (java.lang.Object) indexReader24);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum37, postingsEnum38, false);
        org.junit.rules.TestRule testRule41 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("random", 0, numericDocValues45, numericDocValues46);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) '4', (float) (short) -1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray2, intArray3);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray10, intArray11);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray14, intArray15);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray11, (java.lang.Object) 100.0d);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray23, intArray24);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray27, intArray28);
        org.junit.Assert.assertArrayEquals(intArray24, intArray27);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray24, (java.lang.Object) 100.0d);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray24, intArray34);
        org.junit.Assert.assertArrayEquals("random", intArray11, intArray24);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray41, intArray42);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray45, intArray46);
        org.junit.Assert.assertArrayEquals(intArray42, intArray45);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray42, (java.lang.Object) 100.0d);
        org.junit.Assert.assertArrayEquals(intArray24, intArray42);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray55, intArray56);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray59, intArray60);
        org.junit.Assert.assertArrayEquals(intArray56, intArray59);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray56, (java.lang.Object) 100.0d);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray56, intArray66);
        org.junit.Assert.assertArrayEquals(intArray42, intArray66);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) "<unknown>", (java.lang.Object) intArray66);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray66);
        int[] intArray73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray73);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, true);
        kuromojiAnalysisTests10.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests10.assertTermsEquals("tests.slow", indexReader20, terms21, terms22, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.monster", postingsEnum10, postingsEnum11, true);
        java.lang.Class<?> wildcardClass14 = kuromojiAnalysisTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) (byte) -1, postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (short) -1, postingsEnum34, postingsEnum35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests38.ruleChain;
        kuromojiAnalysisTests38.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests38);
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.badapples", indexReader45, 0, postingsEnum47, postingsEnum48, true);
        kuromojiAnalysisTests16.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests16);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        char[] charArray0 = null;
        char[] charArray7 = new char[] { '4', ' ', '4', '#', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray7);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        char[] charArray5 = new char[] { '#', '4', '#', ' ' };
        char[] charArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        int[] intArray1 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray6, (java.lang.Object) 100.0d);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray6, intArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray16);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1L), 100L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader16, terms17, terms18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("<unknown>", indexReader22, (int) (byte) 100, postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        char[] charArray1 = new char[] { '4' };
        char[] charArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        float[] floatArray8 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray15 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray24 = new float[] { 10, 0L, (short) 1, (short) -1, 5, 0L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray15, floatArray24, (float) (short) 1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        char[] charArray5 = new char[] { '#', ' ', ' ', '4' };
        char[] charArray7 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray5, charArray7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray5, byteArray8);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) (short) 1);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests3.assertTermsEquals("", indexReader12, terms13, terms14, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests17.assertTermsEquals("tests.failfast", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("tests.nightly", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (short) -1, postingsEnum35, postingsEnum36);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests39.ruleChain;
        kuromojiAnalysisTests39.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests39);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain43;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests45.tearDown();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        kuromojiAnalysisTests45.assertFieldsEquals("enwiki.random.lines.txt", indexReader48, fields49, fields50, true);
        kuromojiAnalysisTests45.setUp();
        kuromojiAnalysisTests45.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests56.tearDown();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        kuromojiAnalysisTests56.assertTermsEquals("tests.failfast", indexReader59, terms60, terms61, false);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        kuromojiAnalysisTests56.assertTermsEquals("", indexReader65, terms66, terms67, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests70 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests70.tearDown();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        kuromojiAnalysisTests70.assertTermsEquals("tests.failfast", indexReader73, terms74, terms75, false);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        kuromojiAnalysisTests70.assertDocsSkippingEquals("tests.nightly", indexReader79, (int) (byte) -1, postingsEnum81, postingsEnum82, false);
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        kuromojiAnalysisTests70.assertTermsEquals("", indexReader86, terms87, terms88, true);
        org.junit.Assert[] assertArray91 = new org.junit.Assert[] { kuromojiAnalysisTests3, kuromojiAnalysisTests17, kuromojiAnalysisTests45, kuromojiAnalysisTests56, kuromojiAnalysisTests70 };
        java.util.List<org.junit.Assert> assertList92 = org.elasticsearch.test.ESTestCase.randomSubsetOf(4, assertArray91);
        java.util.List<java.lang.Object> objList93 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, (java.lang.Object[]) assertArray91);
        java.io.Serializable[] serializableArray94 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet95 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) assertArray91, (java.lang.Object[]) serializableArray94);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        long[] longArray2 = new long[] { 'a' };
        long[] longArray8 = new long[] { 1, ' ', (-1), (short) 10, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray2, longArray8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray10);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray21, (java.lang.Object[]) serializableArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray23);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray28);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray43, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray45);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray53, (java.lang.Object[]) serializableArray55);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray55);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray50);
        java.io.Serializable[] serializableArray61 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet62 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray61);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray61, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray61);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray18);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        java.lang.Iterable[] iterableArray75 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray76 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray75;
        serializableIterableArray76[0] = serializableSet71;
        serializableIterableArray76[1] = serializableSet73;
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableIterableArray76);
        org.junit.Assert.assertNotEquals((java.lang.Object) true, (java.lang.Object) serializableIterableArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableIterableArray76);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        java.lang.Object[] objArray1 = null;
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray10);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray15);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray30, (java.lang.Object[]) serializableArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) serializableArray32);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) serializableArray37);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray27, (java.lang.Object[]) serializableArray48);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", objArray1, (java.lang.Object[]) serializableArray5);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        long[] longArray5 = new long[] { 3, (-1L), (short) -1, 'a', (short) 1 };
        long[] longArray8 = new long[] { (byte) 10, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        long[] longArray1 = new long[] { ' ' };
        long[] longArray7 = new long[] { (short) 10, (byte) 1, (byte) 10, 0, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.nightly", indexReader7, (int) ' ', postingsEnum9, postingsEnum10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests12);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        long[] longArray5 = new long[] { 1, (short) 0, (byte) -1, (byte) 0 };
        long[] longArray10 = new long[] { 2, 10, 3, 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray5, longArray10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule37 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule37;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) testRule37);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        short[] shortArray7 = new short[] { (short) 1, (short) -1, (short) -1, (byte) 100, (byte) 100, (short) 10 };
        short[] shortArray10 = new short[] { (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.tearDown();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests15.assertDocsSkippingEquals("tests.nightly", indexReader24, (int) (byte) -1, postingsEnum26, postingsEnum27, false);
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests15.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule31 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule31;
        org.junit.rules.RuleChain ruleChain33 = ruleChain30.around(testRule31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests35.ruleChain;
        kuromojiAnalysisTests35.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests35);
        org.junit.rules.RuleChain ruleChain39 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule40 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain41 = org.junit.rules.RuleChain.outerRule(testRule40);
        org.junit.rules.RuleChain[] ruleChainArray42 = new org.junit.rules.RuleChain[] { ruleChain30, ruleChain39, ruleChain41 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet43 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray42);
        java.util.Set<org.junit.rules.TestRule> testRuleSet44 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray42);
        java.util.Set<org.junit.rules.TestRule> testRuleSet45 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) ruleChainArray42);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray9);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests14.ruleChain;
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests14.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests19.ruleChain;
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests19);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests19.assertTermsEquals("random", indexReader24, terms25, terms26, false);
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests19.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement30 = null;
        org.junit.runner.Description description31 = null;
        org.junit.runners.model.Statement statement32 = ruleChain29.apply(statement30, description31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule35 = kuromojiAnalysisTests34.ruleChain;
        kuromojiAnalysisTests34.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests34);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        kuromojiAnalysisTests34.assertTermsEquals("random", indexReader39, terms40, terms41, false);
        org.junit.rules.RuleChain ruleChain44 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement45 = null;
        org.junit.runner.Description description46 = null;
        org.junit.runners.model.Statement statement47 = ruleChain44.apply(statement45, description46);
        org.junit.runner.Description description48 = null;
        org.junit.runners.model.Statement statement49 = ruleChain29.apply(statement47, description48);
        kuromojiAnalysisTests14.failureAndSuccessEvents = ruleChain29;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests51.tearDown();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        kuromojiAnalysisTests51.assertTermsEquals("tests.failfast", indexReader54, terms55, terms56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests51.assertDocsSkippingEquals("tests.nightly", indexReader60, (int) (byte) -1, postingsEnum62, postingsEnum63, false);
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests51.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule67 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule67;
        org.junit.rules.RuleChain ruleChain69 = ruleChain66.around(testRule67);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests71 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule72 = kuromojiAnalysisTests71.ruleChain;
        kuromojiAnalysisTests71.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests71);
        org.junit.rules.RuleChain ruleChain75 = kuromojiAnalysisTests71.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule76 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain77 = org.junit.rules.RuleChain.outerRule(testRule76);
        org.junit.rules.RuleChain[] ruleChainArray78 = new org.junit.rules.RuleChain[] { ruleChain66, ruleChain75, ruleChain77 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet79 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray78);
        java.util.Set<org.junit.rules.TestRule> testRuleSet80 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray78);
        java.util.Set<java.lang.Object> objSet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) ruleChainArray78);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests14, (java.lang.Object) ruleChainArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) ruleChainArray78);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.junit.rules.TestRule testRule1 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule(testRule1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) ruleChain2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100.0f, (double) 10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (short) 100);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        long[] longArray0 = null;
        long[] longArray4 = new long[] { 3, 2, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray5, byteArray10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        float[] floatArray8 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray15 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray25 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray32 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray25, floatArray32, (float) (byte) 100);
        float[] floatArray42 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray49 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray42, floatArray49, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray49, 1.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray8, floatArray32, (float) 3);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, 10.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.badapples", (int) (short) 10, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        double[] doubleArray0 = null;
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) '#');
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10.0f, (double) 100L, (double) 10.0f);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum9, postingsEnum10, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "<unknown>");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 100);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        short[] shortArray7 = new short[] { (short) -1, (byte) 0, (short) 0, (byte) 100, (short) 1, (byte) 10 };
        short[] shortArray13 = new short[] { (byte) -1, (byte) 10, (byte) 1, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray7, shortArray13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (short) -1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, 10.0d, (double) 1);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (-1L));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        double[] doubleArray2 = new double[] { 4 };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray2, doubleArray3, 0.0d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        float[] floatArray2 = new float[] { (short) -1 };
        float[] floatArray10 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray17 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray17, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray2, floatArray17, (float) (short) 1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) (short) 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        float[] floatArray7 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray14 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray24 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray31 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray24, floatArray31, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray31, (float) 4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        char[] charArray1 = new char[] { '4' };
        char[] charArray6 = new char[] { '#', 'a', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        float[] floatArray3 = new float[] { (byte) 100, (byte) 100 };
        float[] floatArray11 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray18 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray11, floatArray18, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray3, floatArray11, 100.0f);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.badapples", indexReader7, (int) ' ', postingsEnum9, postingsEnum10);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.lang.Iterable[] iterableArray22 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray23 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray22;
        serializableIterableArray23[0] = serializableSet14;
        serializableIterableArray23[1] = serializableSet16;
        serializableIterableArray23[2] = serializableSet18;
        serializableIterableArray23[3] = serializableSet20;
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.lang.Iterable[] iterableArray41 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray42 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray41;
        serializableIterableArray42[0] = serializableSet33;
        serializableIterableArray42[1] = serializableSet35;
        serializableIterableArray42[2] = serializableSet37;
        serializableIterableArray42[3] = serializableSet39;
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.lang.Iterable[] iterableArray60 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray61 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray60;
        serializableIterableArray61[0] = serializableSet52;
        serializableIterableArray61[1] = serializableSet54;
        serializableIterableArray61[2] = serializableSet56;
        serializableIterableArray61[3] = serializableSet58;
        java.lang.Iterable[][] iterableArray71 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][] serializableIterableArray72 = (java.lang.Iterable<java.io.Serializable>[][]) iterableArray71;
        serializableIterableArray72[0] = serializableIterableArray23;
        serializableIterableArray72[1] = serializableIterableArray42;
        serializableIterableArray72[2] = serializableIterableArray61;
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList79 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, serializableIterableArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.badapples", (java.lang.Object) serializableIterableArray72);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet6 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray5);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) throttlingArray5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule16 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule16;
        org.junit.rules.RuleChain ruleChain18 = ruleChain15.around(testRule16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests20.ruleChain;
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests20);
        org.junit.rules.RuleChain ruleChain24 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule25 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.outerRule(testRule25);
        org.junit.rules.RuleChain[] ruleChainArray27 = new org.junit.rules.RuleChain[] { ruleChain15, ruleChain24, ruleChain26 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet28 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray27);
        java.util.Set<org.junit.rules.TestRule> testRuleSet29 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.List<java.lang.Object> objList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, (java.lang.Object[]) executorServiceArray32);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray27, (java.lang.Object[]) executorServiceArray32);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        long[] longArray7 = new long[] { (byte) 100, (-1), (short) 0, '4', 'a', 3 };
        long[] longArray11 = new long[] { (byte) 100, 0L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader6, (int) (short) 1, postingsEnum8, postingsEnum9);
        java.lang.String str11 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("random", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        short[] shortArray6 = new short[] { (short) 1, (short) 100, (short) 100, (short) 10, (short) 100 };
        short[] shortArray12 = new short[] { (byte) 1, (byte) 0, (byte) 0, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray6, shortArray12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) serializableArray3);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 4, (double) (-1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray6 = new char[] { '4', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        long[] longArray7 = new long[] { 100L, (byte) 1, (short) 0, 2, 3, 10 };
        long[] longArray9 = new long[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray7, longArray9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader11, terms12, terms13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.maxfailures", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("hi!", (int) (short) 100, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        long[] longArray1 = new long[] { 0 };
        long[] longArray5 = new long[] { (byte) 1, (-1L), 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) (byte) 100);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) '#');
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.weekly", indexReader7, (int) (short) 1, postingsEnum9, postingsEnum10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests12.assertDocsSkippingEquals("tests.nightly", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader28, (int) (short) -1, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule35 = kuromojiAnalysisTests34.ruleChain;
        kuromojiAnalysisTests34.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests34);
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        kuromojiAnalysisTests12.failureAndSuccessEvents = ruleChain38;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain38;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.monster", indexReader42, (int) (byte) 1, postingsEnum44, postingsEnum45);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests47.tearDown();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        kuromojiAnalysisTests47.assertFieldsEquals("enwiki.random.lines.txt", indexReader50, fields51, fields52, true);
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        kuromojiAnalysisTests47.assertDocsEnumEquals("tests.monster", postingsEnum56, postingsEnum57, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests60 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests60.tearDown();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        kuromojiAnalysisTests60.assertFieldsEquals("enwiki.random.lines.txt", indexReader63, fields64, fields65, true);
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        kuromojiAnalysisTests60.assertDocsEnumEquals("tests.monster", postingsEnum69, postingsEnum70, true);
        java.lang.String str73 = kuromojiAnalysisTests60.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray74 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests2, kuromojiAnalysisTests47, kuromojiAnalysisTests60 };
        java.util.List<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsList75 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, kuromojiAnalysisTestsArray74);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests76 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests76.tearDown();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.Fields fields80 = null;
        org.apache.lucene.index.Fields fields81 = null;
        kuromojiAnalysisTests76.assertFieldsEquals("enwiki.random.lines.txt", indexReader79, fields80, fields81, true);
        kuromojiAnalysisTests76.setUp();
        kuromojiAnalysisTests76.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests76.resetCheckIndexStatus();
        kuromojiAnalysisTests76.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests76.ensureCleanedUp();
        kuromojiAnalysisTests76.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTestsList75, (java.lang.Object) kuromojiAnalysisTests76);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (-1), (long) 4);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0 };
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule17 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        org.junit.rules.RuleChain ruleChain19 = ruleChain16.around(testRule17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) ruleChain19);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests5.assertTermsEquals("tests.failfast", indexReader8, terms9, terms10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests5.assertTermsEquals("", indexReader14, terms15, terms16, false);
        org.junit.rules.RuleChain ruleChain19 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests5);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        char[] charArray7 = new char[] { ' ', ' ', ' ', 'a', '4', ' ' };
        char[] charArray12 = new char[] { '#', '4', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray7, charArray12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 10.0d, (double) 'a', (double) 3);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        char[] charArray5 = new char[] { '#', ' ', '#', '4', '4' };
        char[] charArray10 = new char[] { '4', '4', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum15, postingsEnum16, true);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests20.ruleChain;
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests20.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests20, (java.lang.Object) (-1));
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests20.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests20);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) terms8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) 0, (double) 100);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests3.assertTermsEquals("", indexReader12, terms13, terms14, false);
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests3.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests3);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.maxfailures", indexReader20, terms21, terms22, false);
        java.lang.Object obj25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) terms21, obj25);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        long[] longArray7 = new long[] { '#', (short) 0, 5, (short) 100, 3, '4' };
        long[] longArray11 = new long[] { (byte) 1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray7, longArray11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests3);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests3.assertTermsEquals("random", indexReader8, terms9, terms10, false);
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests3.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement14 = null;
        org.junit.runner.Description description15 = null;
        org.junit.runners.model.Statement statement16 = ruleChain13.apply(statement14, description15);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests18.ruleChain;
        kuromojiAnalysisTests18.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests18);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests18.assertTermsEquals("random", indexReader23, terms24, terms25, false);
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement29 = null;
        org.junit.runner.Description description30 = null;
        org.junit.runners.model.Statement statement31 = ruleChain28.apply(statement29, description30);
        org.junit.runner.Description description32 = null;
        org.junit.runners.model.Statement statement33 = ruleChain13.apply(statement31, description32);
        org.junit.runner.Description description34 = null;
        org.junit.runners.model.Statement statement35 = ruleChain1.apply(statement31, description34);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests36.tearDown();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        kuromojiAnalysisTests36.assertTermsEquals("tests.failfast", indexReader39, terms40, terms41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.nightly", indexReader45, (int) (byte) -1, postingsEnum47, postingsEnum48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader52, (int) (short) -1, postingsEnum54, postingsEnum55);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule59 = kuromojiAnalysisTests58.ruleChain;
        kuromojiAnalysisTests58.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests58);
        org.junit.rules.RuleChain ruleChain62 = kuromojiAnalysisTests58.failureAndSuccessEvents;
        kuromojiAnalysisTests36.failureAndSuccessEvents = ruleChain62;
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.badapples", indexReader65, 0, postingsEnum67, postingsEnum68, true);
        kuromojiAnalysisTests36.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain1, (java.lang.Object) kuromojiAnalysisTests36);
        org.junit.rules.RuleChain ruleChain73 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests75 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule76 = kuromojiAnalysisTests75.ruleChain;
        kuromojiAnalysisTests75.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests75);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        kuromojiAnalysisTests75.assertTermsEquals("random", indexReader80, terms81, terms82, false);
        org.junit.rules.RuleChain ruleChain85 = kuromojiAnalysisTests75.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        org.apache.lucene.index.Terms terms89 = null;
        kuromojiAnalysisTests75.assertTermsEquals("", indexReader87, terms88, terms89, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests36, (java.lang.Object) indexReader87);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests3.assertTermsEquals("", indexReader12, terms13, terms14, false);
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests3.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests3);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 10, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        float[] floatArray1 = null;
        float[] floatArray9 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray16 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray33 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray33, (float) (byte) 100);
        float[] floatArray43 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray50 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray43, floatArray50, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray50, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray50, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray50, (float) 100L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray10);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray15);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray33);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray43);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray38);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray49);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray49);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray49);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        java.io.Serializable[] serializableArray61 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet62 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray61);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray64, (java.lang.Object[]) serializableArray66);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray61, (java.lang.Object[]) serializableArray66);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray58, (java.lang.Object[]) serializableArray66);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) serializableArray66);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 1.0f, 0.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        long[] longArray7 = new long[] { (byte) 100, 4, 1, (short) -1, '#', (byte) -1 };
        long[] longArray8 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray7, longArray8);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 0, 0.0d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) 1, (long) 2);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) (byte) 10, (double) (-1L));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.lang.Iterable[] iterableArray10 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray11 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray10;
        serializableIterableArray11[0] = serializableSet2;
        serializableIterableArray11[1] = serializableSet4;
        serializableIterableArray11[2] = serializableSet6;
        serializableIterableArray11[3] = serializableSet8;
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        java.lang.Iterable[] iterableArray29 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray30 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray29;
        serializableIterableArray30[0] = serializableSet21;
        serializableIterableArray30[1] = serializableSet23;
        serializableIterableArray30[2] = serializableSet25;
        serializableIterableArray30[3] = serializableSet27;
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        java.lang.Iterable[] iterableArray48 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray49 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray48;
        serializableIterableArray49[0] = serializableSet40;
        serializableIterableArray49[1] = serializableSet42;
        serializableIterableArray49[2] = serializableSet44;
        serializableIterableArray49[3] = serializableSet46;
        java.lang.Iterable[][] iterableArray59 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][] serializableIterableArray60 = (java.lang.Iterable<java.io.Serializable>[][]) iterableArray59;
        serializableIterableArray60[0] = serializableIterableArray11;
        serializableIterableArray60[1] = serializableIterableArray30;
        serializableIterableArray60[2] = serializableIterableArray49;
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList67 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, serializableIterableArray60);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableIterableArray60, (java.lang.Object[]) executorServiceArray69);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("hi!", 4, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        double[] doubleArray2 = new double[] { 100L, 0.0f };
        double[] doubleArray4 = new double[] { 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) 2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        char[] charArray6 = new char[] { 'a', 'a', '#', '#', '4' };
        char[] charArray9 = new char[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray6, charArray9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.lang.Iterable[] iterableArray6 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray7 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray6;
        serializableIterableArray7[0] = serializableSet2;
        serializableIterableArray7[1] = serializableSet4;
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableIterableArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) serializableIterableArray7, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.util.Set[] setArray21 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray22 = (java.util.Set<java.io.Serializable>[]) setArray21;
        serializableSetArray22[0] = serializableSet11;
        serializableSetArray22[1] = serializableSet13;
        serializableSetArray22[2] = serializableSet15;
        serializableSetArray22[3] = serializableSet17;
        serializableSetArray22[4] = serializableSet19;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray22);
        java.util.List<java.util.Set<java.io.Serializable>> serializableSetList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, serializableSetArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "tests.failfast", (java.lang.Object) (short) 1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule2;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule2;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) testRule2, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule17 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        org.junit.rules.RuleChain ruleChain19 = ruleChain16.around(testRule17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests21);
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule26 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.outerRule(testRule26);
        org.junit.rules.RuleChain[] ruleChainArray28 = new org.junit.rules.RuleChain[] { ruleChain16, ruleChain25, ruleChain27 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet29 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray28);
        java.util.Set<org.junit.rules.TestRule> testRuleSet30 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray28);
        java.util.Set<org.junit.rules.TestRule> testRuleSet31 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray28);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests32.ruleChain;
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests32.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests32.assertDocsEnumEquals("<unknown>", postingsEnum37, postingsEnum38, true);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        kuromojiAnalysisTests32.assertFieldsEquals("hi!", indexReader42, fields43, fields44, false);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        org.junit.Assert.assertNotEquals((java.lang.Object) false, (java.lang.Object) serializableArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) ruleChainArray28, (java.lang.Object[]) serializableArray47);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 10.0f, (float) (short) 100, 10.0f);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 3);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        char[] charArray4 = new char[] { 'a', ' ', '4', '4' };
        char[] charArray8 = new char[] { 'a', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 10 };
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray5, byteArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 5, (double) 10);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        double[] doubleArray4 = new double[] { 1.0d, 5, 0.0d, 1L };
        double[] doubleArray10 = new double[] { (byte) 0, '4', 0, 3, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray10, (double) (byte) 1);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 2, (double) 100);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (short) -1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet8 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) throttlingArray7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.badapples", indexReader13, 0, postingsEnum15, postingsEnum16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests19.ruleChain;
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests19);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests19.assertTermsEquals("random", indexReader24, terms25, terms26, false);
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests19.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain29);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '4', (double) 10.0f);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("<unknown>", postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("hi!", indexReader11, fields12, fields13, false);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("random", postingsEnum17, postingsEnum18, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("enwiki.random.lines.txt", indexReader24, fields25, fields26, true);
        kuromojiAnalysisTests21.setUp();
        kuromojiAnalysisTests21.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("enwiki.random.lines.txt", indexReader33, fields34, fields35, false);
        org.junit.rules.TestRule testRule38 = kuromojiAnalysisTests21.ruleChain;
        java.lang.String str39 = kuromojiAnalysisTests21.getTestName();
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) false, (java.lang.Object) kuromojiAnalysisTests21);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.Object[] objArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, objArray4);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet2 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray1);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray10);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray15);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray1, (java.lang.Object[]) serializableArray15);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray12);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) serializableArray4);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.lang.Iterable[] iterableArray28 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray29 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray28;
        serializableIterableArray29[0] = serializableSet20;
        serializableIterableArray29[1] = serializableSet22;
        serializableIterableArray29[2] = serializableSet24;
        serializableIterableArray29[3] = serializableSet26;
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.lang.Iterable[] iterableArray47 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray48 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray47;
        serializableIterableArray48[0] = serializableSet39;
        serializableIterableArray48[1] = serializableSet41;
        serializableIterableArray48[2] = serializableSet43;
        serializableIterableArray48[3] = serializableSet45;
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        java.io.Serializable[] serializableArray61 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet62 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray61);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.lang.Iterable[] iterableArray66 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray67 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray66;
        serializableIterableArray67[0] = serializableSet58;
        serializableIterableArray67[1] = serializableSet60;
        serializableIterableArray67[2] = serializableSet62;
        serializableIterableArray67[3] = serializableSet64;
        java.lang.Iterable[][] iterableArray77 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][] serializableIterableArray78 = (java.lang.Iterable<java.io.Serializable>[][]) iterableArray77;
        serializableIterableArray78[0] = serializableIterableArray29;
        serializableIterableArray78[1] = serializableIterableArray48;
        serializableIterableArray78[2] = serializableIterableArray67;
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList85 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, serializableIterableArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) serializableIterableArray78);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (-1.0d));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        long[] longArray1 = new long[] {};
        long[] longArray8 = new long[] { 1, 'a', ' ', (byte) 100, 5, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (-1L), (long) (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) '4');
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray5, (double) (byte) -1);
        double[] doubleArray11 = new double[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray11, (double) 5);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        char[] charArray2 = new char[] { '#' };
        char[] charArray8 = new char[] { ' ', '4', ' ', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray2, charArray8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) 5, (double) (byte) 10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        long[] longArray3 = new long[] { (byte) 1, 100 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray3, longArray4);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) (byte) -1, postingsEnum27, postingsEnum28, false);
        org.junit.rules.RuleChain ruleChain31 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule32 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule32;
        org.junit.rules.RuleChain ruleChain34 = ruleChain31.around(testRule32);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain31;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum38, postingsEnum39);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1L, (long) (byte) -1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        double[] doubleArray6 = new double[] { (byte) 10, 1.0d, 1, 100L, (-1), 1.0f };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) '4');
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray12, (double) (byte) -1);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray17, (double) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        long[] longArray4 = new long[] { 2, 10L, '4', (byte) 10 };
        long[] longArray11 = new long[] { 10L, ' ', (-1), (short) 10, 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray12);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) executorServiceArray1, (java.lang.Object) serializableArray12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        long[] longArray1 = new long[] { (short) 0 };
        long[] longArray6 = new long[] { ' ', (short) 0, 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100, (double) 5, (-1.0d));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] { (byte) 1, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray4);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) (-1));
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain9 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests11.ruleChain;
        kuromojiAnalysisTests11.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests11);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests11.assertTermsEquals("random", indexReader16, terms17, terms18, false);
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests11.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement22 = null;
        org.junit.runner.Description description23 = null;
        org.junit.runners.model.Statement statement24 = ruleChain21.apply(statement22, description23);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests26.ruleChain;
        kuromojiAnalysisTests26.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests26);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests26.assertTermsEquals("random", indexReader31, terms32, terms33, false);
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement37 = null;
        org.junit.runner.Description description38 = null;
        org.junit.runners.model.Statement statement39 = ruleChain36.apply(statement37, description38);
        org.junit.runner.Description description40 = null;
        org.junit.runners.model.Statement statement41 = ruleChain21.apply(statement39, description40);
        org.junit.runner.Description description42 = null;
        org.junit.runners.model.Statement statement43 = ruleChain9.apply(statement39, description42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests44.tearDown();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        kuromojiAnalysisTests44.assertTermsEquals("tests.failfast", indexReader47, terms48, terms49, false);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests44.assertDocsSkippingEquals("tests.nightly", indexReader53, (int) (byte) -1, postingsEnum55, postingsEnum56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests44.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader60, (int) (short) -1, postingsEnum62, postingsEnum63);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests66 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule67 = kuromojiAnalysisTests66.ruleChain;
        kuromojiAnalysisTests66.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests66);
        org.junit.rules.RuleChain ruleChain70 = kuromojiAnalysisTests66.failureAndSuccessEvents;
        kuromojiAnalysisTests44.failureAndSuccessEvents = ruleChain70;
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        kuromojiAnalysisTests44.assertDocsSkippingEquals("tests.badapples", indexReader73, 0, postingsEnum75, postingsEnum76, true);
        kuromojiAnalysisTests44.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain9, (java.lang.Object) kuromojiAnalysisTests44);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests81 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule82 = kuromojiAnalysisTests81.ruleChain;
        org.junit.rules.RuleChain ruleChain83 = org.junit.rules.RuleChain.outerRule(testRule82);
        org.junit.rules.RuleChain ruleChain84 = ruleChain9.around(testRule82);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain9;
        kuromojiAnalysisTests2.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", obj1, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 2, (float) 4, (float) (byte) 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        long[] longArray6 = new long[] { 10L, 1, 10L, (byte) 100, (byte) 100, 4 };
        long[] longArray10 = new long[] { (byte) 10, (short) 10, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, 1L);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, 0.0d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) ' ', (float) (short) -1, (float) 1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests17.assertTermsEquals("tests.failfast", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("tests.nightly", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (short) -1, postingsEnum35, postingsEnum36);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests39.ruleChain;
        kuromojiAnalysisTests39.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests39);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("tests.badapples", indexReader46, 0, postingsEnum48, postingsEnum49, true);
        kuromojiAnalysisTests17.ensureCheckIndexPassed();
        kuromojiAnalysisTests17.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests17);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", 5, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        char[] charArray7 = new char[] { ' ', 'a', 'a', '4', '4', '#' };
        char[] charArray9 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray7, charArray9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, (double) 1.0f, (double) 10L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("hi!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        double[] doubleArray4 = new double[] { 100.0f, 1, (-1.0d), (byte) 0 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray11, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray11, (double) (short) 10);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) '4');
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray21, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray21, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray11, doubleArray16, (double) 4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray16, (double) (-1.0f));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 1.0f, (double) 0);
    }
}

