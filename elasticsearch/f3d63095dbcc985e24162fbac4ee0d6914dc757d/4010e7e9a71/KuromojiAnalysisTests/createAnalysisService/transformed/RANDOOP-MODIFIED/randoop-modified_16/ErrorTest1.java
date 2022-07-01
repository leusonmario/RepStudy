import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray8);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray14, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray14);
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("enwiki.random.lines.txt", indexReader27, fields28, fields29, true);
        kuromojiAnalysisTests24.setUp();
        kuromojiAnalysisTests24.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests24);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("enwiki.random.lines.txt", indexReader36, fields37, fields38, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray8, (java.lang.Object) fields38);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 10, (double) (short) 0, 0.0d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        char[] charArray1 = new char[] {};
        char[] charArray4 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray4);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        short[] shortArray2 = new short[] { (byte) -1, (short) 100 };
        short[] shortArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 2);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) '4');
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray5, (double) (byte) -1);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray11, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray10, (double) 2);
        double[] doubleArray16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray16, (double) ' ');
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        double[] doubleArray6 = new double[] { 1L, 0.0d, (byte) -1, 10.0f, (-1.0f) };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray6, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 1);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
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
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray50, (float) (byte) 1);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        int[] intArray5 = new int[] { (byte) 1, (byte) 0, '4', (short) -1 };
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray10, intArray11);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray14, intArray15);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray11, (java.lang.Object) 100.0d);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray11, intArray21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests26.ruleChain;
        kuromojiAnalysisTests26.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests26);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests26.assertTermsEquals("random", indexReader31, terms32, terms33, false);
        kuromojiAnalysisTests26.ensureCheckIndexPassed();
        kuromojiAnalysisTests26.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray42, intArray43);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray46, intArray47);
        org.junit.Assert.assertArrayEquals(intArray43, intArray46);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray43, (java.lang.Object) 100.0d);
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
        org.junit.Assert.assertArrayEquals("random", intArray43, intArray56);
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray71);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain38, (java.lang.Object) intArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray11, intArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray5, intArray11);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        float[] floatArray7 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray14 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray24 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray31 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray24, floatArray31, (float) (byte) 100);
        float[] floatArray41 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray48 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray41, floatArray48, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray48, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray48, 10.0f);
        float[] floatArray55 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray55, 0.0f);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        long[] longArray5 = new long[] { 0, 100, ' ', 0L, '#' };
        long[] longArray11 = new long[] { (byte) 1, 5, (byte) 1, '#', (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray11);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        float[] floatArray8 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray15 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray25 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray32 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray25, floatArray32, (float) (byte) 100);
        float[] floatArray42 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray49 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray42, floatArray49, (float) (byte) 100);
        float[] floatArray59 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray66 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray59, floatArray66, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray66, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray66, 10.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray8, floatArray66, (float) 3);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        short[] shortArray3 = new short[] { (byte) 10, (byte) 10 };
        short[] shortArray7 = new short[] { (short) 1, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray3, shortArray7);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) 0L, (double) (byte) 0, (double) 100);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((-1));
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("random", postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests19.ruleChain;
        org.junit.rules.RuleChain ruleChain21 = org.junit.rules.RuleChain.outerRule(testRule20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) "random", (java.lang.Object) ruleChain21);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) '#');
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 3);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        long[] longArray6 = new long[] { 0, 'a', 10L, (byte) 100, 1L };
        long[] longArray9 = new long[] { (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray6, longArray9);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
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
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", objArray1, (java.lang.Object[]) serializableArray5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) -1, (double) (byte) 10, (double) 1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) (short) 10, (float) (byte) 0);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "random");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        kuromojiAnalysisTests13.setUp();
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("enwiki.random.lines.txt", indexReader25, fields26, fields27, false);
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests13.ruleChain;
        java.lang.String str31 = kuromojiAnalysisTests13.getTestName();
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) ruleChain32);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 4, (float) 'a', (float) '4');
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        long[] longArray1 = new long[] { (byte) -1 };
        long[] longArray6 = new long[] { 10L, (-1), 'a', 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 4, (double) (byte) 10, (double) (short) -1);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 100L);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        short[] shortArray5 = new short[] { (short) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        short[] shortArray7 = new short[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
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
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray35);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray30, (java.lang.Object[]) serializableArray35);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray43, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray30, (java.lang.Object[]) serializableArray40);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray56, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray53, (java.lang.Object[]) serializableArray58);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray68);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray66, (java.lang.Object[]) serializableArray68);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray68);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray53, (java.lang.Object[]) serializableArray63);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet75 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray74);
        java.io.Serializable[] serializableArray76 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet77 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray76);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray74, (java.lang.Object[]) serializableArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray53, (java.lang.Object[]) serializableArray74);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray74);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray74, (java.lang.Object[]) executorServiceArray82);
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableSetArray13, (java.lang.Object[]) executorServiceArray82);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray11);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray16);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) serializableArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray27);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray40);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) serializableArray50);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray35);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 1.0d);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        short[] shortArray5 = new short[] { (short) 100, (byte) -1, (byte) -1, (short) 0, (byte) -1 };
        short[] shortArray8 = new short[] { (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        short[] shortArray3 = new short[] { (byte) -1, (short) 1, (short) 100 };
        short[] shortArray4 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 0, (long) (short) 1);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
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
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray9, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray9, byteArray13);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray19, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray19, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray19);
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray13);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray31, byteArray32);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray31, byteArray35);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray41, byteArray42);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray41, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (short) 1);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
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
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        short[] shortArray3 = new short[] { (byte) 10, (short) 1, (short) 100 };
        short[] shortArray7 = new short[] { (byte) 0, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray7);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        char[] charArray1 = new char[] {};
        char[] charArray5 = new char[] { 'a', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray1, charArray5);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet8 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) throttlingArray7);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray8 = new char[] { '4', '4', '#', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray2, charArray8);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        short[] shortArray0 = new short[] {};
        short[] shortArray5 = new short[] { (short) 1, (byte) 0, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray5);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        char[] charArray1 = new char[] {};
        char[] charArray7 = new char[] { '4', '#', 'a', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray7);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule6 = kuromojiAnalysisTests5.ruleChain;
        kuromojiAnalysisTests5.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests5);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests5.assertTermsEquals("random", indexReader10, terms11, terms12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement16 = null;
        org.junit.runner.Description description17 = null;
        org.junit.runners.model.Statement statement18 = ruleChain15.apply(statement16, description17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests20.ruleChain;
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests20);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests20.assertTermsEquals("random", indexReader25, terms26, terms27, false);
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement31 = null;
        org.junit.runner.Description description32 = null;
        org.junit.runners.model.Statement statement33 = ruleChain30.apply(statement31, description32);
        org.junit.runner.Description description34 = null;
        org.junit.runners.model.Statement statement35 = ruleChain15.apply(statement33, description34);
        org.junit.rules.TestRule testRule36 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.outerRule(testRule36);
        org.junit.rules.RuleChain ruleChain38 = ruleChain15.around(testRule36);
        org.junit.rules.RuleChain ruleChain39 = ruleChain3.around((org.junit.rules.TestRule) ruleChain15);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        org.junit.rules.RuleChain ruleChain41 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule44 = kuromojiAnalysisTests43.ruleChain;
        kuromojiAnalysisTests43.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests43);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        kuromojiAnalysisTests43.assertTermsEquals("random", indexReader48, terms49, terms50, false);
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests43.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement54 = null;
        org.junit.runner.Description description55 = null;
        org.junit.runners.model.Statement statement56 = ruleChain53.apply(statement54, description55);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule59 = kuromojiAnalysisTests58.ruleChain;
        kuromojiAnalysisTests58.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests58);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        kuromojiAnalysisTests58.assertTermsEquals("random", indexReader63, terms64, terms65, false);
        org.junit.rules.RuleChain ruleChain68 = kuromojiAnalysisTests58.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement69 = null;
        org.junit.runner.Description description70 = null;
        org.junit.runners.model.Statement statement71 = ruleChain68.apply(statement69, description70);
        org.junit.runner.Description description72 = null;
        org.junit.runners.model.Statement statement73 = ruleChain53.apply(statement71, description72);
        org.junit.runner.Description description74 = null;
        org.junit.runners.model.Statement statement75 = ruleChain41.apply(statement71, description74);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain3, (java.lang.Object) ruleChain41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain41);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader16);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0.0f, (double) 5, (double) 3);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 1, (long) (byte) 10);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        long[] longArray4 = new long[] { (byte) 100, (short) 1, (byte) 1, 0 };
        long[] longArray9 = new long[] { '#', '4', 5, (-1) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
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
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests15.assertDocsSkippingEquals("tests.badapples", indexReader44, 0, postingsEnum46, postingsEnum47, true);
        kuromojiAnalysisTests15.ensureCheckIndexPassed();
        kuromojiAnalysisTests15.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) description13, (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        char[] charArray6 = new char[] { '#', '4', ' ', '#', '4' };
        char[] charArray11 = new char[] { '#', '4', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray6, charArray11);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
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
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", 0, numericDocValues45, numericDocValues46);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0L);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        short[] shortArray4 = new short[] { (byte) 100, (short) 0, (byte) 100 };
        short[] shortArray9 = new short[] { (short) 100, (short) 10, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray9);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        long[] longArray7 = new long[] { (-1L), ' ', 0L, (byte) 100, (byte) -1, 3 };
        long[] longArray8 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray7, longArray8);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
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
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests0.ruleChain;
        java.lang.String str18 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
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
        java.lang.Object obj76 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling78 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray79 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling78 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet80 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray79);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList81 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray79);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling82 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray83 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling82 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet84 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray79, (java.lang.Object[]) throttlingArray83);
        org.junit.Assert.assertNotEquals(obj76, (java.lang.Object) throttlingArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) kuromojiAnalysisTestsArray74, (java.lang.Object[]) throttlingArray79);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        long[] longArray3 = new long[] { (short) 10, 100 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray4);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
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
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("<unknown>", indexReader23, (int) (byte) 100, postingsEnum25, postingsEnum26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        long[] longArray4 = new long[] { 0, (byte) -1, ' ' };
        long[] longArray10 = new long[] { 10L, (short) 1, 100, 5, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray4, longArray10);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        short[] shortArray6 = new short[] { (byte) 10, (short) -1, (short) 10, (short) 100, (byte) 100 };
        short[] shortArray11 = new short[] { (short) 100, (byte) 1, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray6, shortArray11);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
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
        java.lang.Object obj14 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet18 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray17);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet22 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray17, (java.lang.Object[]) throttlingArray21);
        org.junit.Assert.assertNotEquals(obj14, (java.lang.Object) throttlingArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) throttlingArray17);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        long[] longArray5 = new long[] { 2, (byte) 100, (-1), (short) 0 };
        long[] longArray8 = new long[] { (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray8);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (byte) 10, (float) (short) 100, (float) '#');
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
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
        kuromojiAnalysisTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", 100, numericDocValues36, numericDocValues37);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 100, (double) (byte) -1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) ' ', (-1L));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        float[] floatArray8 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray15 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray19 = new float[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray15, floatArray19, (float) 100L);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
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
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", (int) (byte) 10, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
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
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray24, (java.lang.Object[]) serializableArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet48 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray47);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests49.ruleChain;
        org.junit.rules.RuleChain ruleChain51 = org.junit.rules.RuleChain.outerRule(testRule50);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray47, (java.lang.Object) testRule50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray47);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = kuromojiAnalysisTests0.getClass();
        java.lang.Object obj12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass11, obj12);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
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
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocValuesEquals("tests.failfast", 2, numericDocValues46, numericDocValues47);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        char[] charArray2 = new char[] { ' ', ' ' };
        char[] charArray6 = new char[] { ' ', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        char[] charArray5 = new char[] { ' ', ' ', 'a', ' ' };
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray5, charArray12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 1, (long) 4);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (short) -1);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 1);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
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
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet29 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests30.tearDown();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests30.assertTermsEquals("tests.failfast", indexReader33, terms34, terms35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests30.assertDocsSkippingEquals("tests.nightly", indexReader39, (int) (byte) -1, postingsEnum41, postingsEnum42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader46, (int) (short) -1, postingsEnum48, postingsEnum49);
        java.lang.String str51 = kuromojiAnalysisTests30.getTestName();
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray52 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests30 };
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet53 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) ruleChainArray27, (java.lang.Object[]) eSTestCaseArray52);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray11);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray17, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray17);
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
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
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader43, terms44, terms45, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues51 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.badapples", (int) (short) -1, numericDocValues51, numericDocValues52);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet8 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) throttlingArray3);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.slow", "tests.failfast", "tests.slow" };
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) strArray18);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
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
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        kuromojiAnalysisTests47.assertTermsEquals("tests.failfast", indexReader50, terms51, terms52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests47.assertDocsSkippingEquals("tests.nightly", indexReader56, (int) (byte) -1, postingsEnum58, postingsEnum59, false);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        kuromojiAnalysisTests47.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader63, (int) (short) -1, postingsEnum65, postingsEnum66);
        org.junit.rules.RuleChain ruleChain68 = kuromojiAnalysisTests47.failureAndSuccessEvents;
        java.lang.String str69 = kuromojiAnalysisTests47.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) postingsEnum44, (java.lang.Object) kuromojiAnalysisTests47);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        long[] longArray2 = new long[] { 10L };
        long[] longArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray2, longArray3);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) throttling2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) throttling2);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        java.lang.Object obj1 = null;
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", obj1, (java.lang.Object) serializableArray3);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 100L);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
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
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("enwiki.random.lines.txt", indexReader19, fields20, fields21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("", indexReader25, 1, postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.weekly", indexReader32, 1, postingsEnum34, postingsEnum35, false);
        kuromojiAnalysisTests16.resetCheckIndexStatus();
        kuromojiAnalysisTests16.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests16);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        float[] floatArray7 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray14 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray23 = new float[] { '#', (byte) -1, (byte) 100, 10L, (byte) -1, 0L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray23, 0.0f);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (-1));
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("hi!", indexReader9, (int) '4', postingsEnum11, postingsEnum12, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests16.ruleChain;
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests16);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests16.assertTermsEquals("random", indexReader21, terms22, terms23, false);
        kuromojiAnalysisTests16.ensureCheckIndexPassed();
        kuromojiAnalysisTests16.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.outerRule(testRule29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) postingsEnum11, (java.lang.Object) testRule29);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 4, (float) 100L, (float) 4);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests14.ruleChain;
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests14);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests14.assertTermsEquals("random", indexReader19, terms20, terms21, false);
        org.junit.rules.RuleChain ruleChain24 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement25 = null;
        org.junit.runner.Description description26 = null;
        org.junit.runners.model.Statement statement27 = ruleChain24.apply(statement25, description26);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain24;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("", (int) (byte) 100, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
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
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableSetArray14, (java.lang.Object[]) executorServiceArray27);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.weekly", indexReader7, 100, postingsEnum9, postingsEnum10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) postingsEnum10);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        char[] charArray0 = new char[] {};
        char[] charArray3 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        char[] charArray4 = new char[] { ' ', ' ', '#' };
        char[] charArray8 = new char[] { ' ', '4', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray4, charArray8);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) 4, (double) (byte) 1, (double) 100.0f);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 10, (double) (-1));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        short[] shortArray3 = new short[] { (short) 0, (byte) 100 };
        short[] shortArray5 = new short[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray3, shortArray5);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        java.util.Set[] setArray24 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray25 = (java.util.Set<java.io.Serializable>[]) setArray24;
        serializableSetArray25[0] = serializableSet14;
        serializableSetArray25[1] = serializableSet16;
        serializableSetArray25[2] = serializableSet18;
        serializableSetArray25[3] = serializableSet20;
        serializableSetArray25[4] = serializableSet22;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray25);
        java.util.List<java.util.Set<java.io.Serializable>> serializableSetList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, serializableSetArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) serializableSetArray25);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        short[] shortArray4 = new short[] { (short) 1, (short) -1, (short) -1, (byte) -1 };
        short[] shortArray10 = new short[] { (byte) 100, (short) 1, (byte) -1, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests15.assertTermsEquals("", indexReader17, terms18, terms19, false);
        kuromojiAnalysisTests15.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests15.assertDocsEnumEquals("<unknown>", postingsEnum24, postingsEnum25, false);
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests15.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) true, (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule(testRule1);
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain2);
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain2);
        java.lang.Object obj5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain2, obj5);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
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
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests17.ruleChain;
        kuromojiAnalysisTests17.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests17);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("tests.weekly", indexReader22, (int) (short) 1, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests27.assertTermsEquals("tests.failfast", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests27.assertDocsSkippingEquals("tests.nightly", indexReader36, (int) (byte) -1, postingsEnum38, postingsEnum39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader43, (int) (short) -1, postingsEnum45, postingsEnum46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests49.ruleChain;
        kuromojiAnalysisTests49.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests49);
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests49.failureAndSuccessEvents;
        kuromojiAnalysisTests27.failureAndSuccessEvents = ruleChain53;
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("tests.monster", indexReader57, (int) (byte) 1, postingsEnum59, postingsEnum60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) ruleChain15, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
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
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum85, postingsEnum86);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (byte) 100, (long) ' ');
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "tests.maxfailures" };
        java.util.Set<java.lang.CharSequence> charSequenceSet4 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests5.assertFieldsEquals("enwiki.random.lines.txt", indexReader8, fields9, fields10, true);
        kuromojiAnalysisTests5.setUp();
        kuromojiAnalysisTests5.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests5.assertFieldsEquals("enwiki.random.lines.txt", indexReader17, fields18, fields19, false);
        java.lang.String str22 = kuromojiAnalysisTests5.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) charSequenceSet4, (java.lang.Object) kuromojiAnalysisTests5);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        char[] charArray1 = new char[] {};
        char[] charArray4 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray1, charArray4);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
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
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.emptyRuleChain();
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule34 = kuromojiAnalysisTests33.ruleChain;
        kuromojiAnalysisTests33.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests33);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests33.assertTermsEquals("random", indexReader38, terms39, terms40, false);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement44 = null;
        org.junit.runner.Description description45 = null;
        org.junit.runners.model.Statement statement46 = ruleChain43.apply(statement44, description45);
        org.junit.runner.Description description47 = null;
        org.junit.runners.model.Statement statement48 = ruleChain28.apply(statement46, description47);
        org.junit.runner.Description description49 = null;
        org.junit.runners.model.Statement statement50 = ruleChain16.apply(statement46, description49);
        org.junit.runner.Description description51 = null;
        org.junit.runners.model.Statement statement52 = ruleChain15.apply(statement46, description51);
        org.junit.rules.RuleChain ruleChain53 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule56 = kuromojiAnalysisTests55.ruleChain;
        kuromojiAnalysisTests55.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests55);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        kuromojiAnalysisTests55.assertTermsEquals("random", indexReader60, terms61, terms62, false);
        org.junit.rules.RuleChain ruleChain65 = kuromojiAnalysisTests55.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement66 = null;
        org.junit.runner.Description description67 = null;
        org.junit.runners.model.Statement statement68 = ruleChain65.apply(statement66, description67);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests70 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule71 = kuromojiAnalysisTests70.ruleChain;
        kuromojiAnalysisTests70.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests70);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        kuromojiAnalysisTests70.assertTermsEquals("random", indexReader75, terms76, terms77, false);
        org.junit.rules.RuleChain ruleChain80 = kuromojiAnalysisTests70.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement81 = null;
        org.junit.runner.Description description82 = null;
        org.junit.runners.model.Statement statement83 = ruleChain80.apply(statement81, description82);
        org.junit.runner.Description description84 = null;
        org.junit.runners.model.Statement statement85 = ruleChain65.apply(statement83, description84);
        org.junit.runner.Description description86 = null;
        org.junit.runners.model.Statement statement87 = ruleChain53.apply(statement83, description86);
        org.junit.runner.Description description88 = null;
        org.junit.runners.model.Statement statement89 = ruleChain15.apply(statement83, description88);
        org.junit.rules.RuleChain ruleChain90 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain15);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain90);
        java.lang.Object obj92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain90, obj92);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 4);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), 1.0d, (double) (short) 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
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
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.weekly", 0, numericDocValues44, numericDocValues45);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule7 = kuromojiAnalysisTests6.ruleChain;
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests6);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests6.assertTermsEquals("random", indexReader11, terms12, terms13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement17 = null;
        org.junit.runner.Description description18 = null;
        org.junit.runners.model.Statement statement19 = ruleChain16.apply(statement17, description18);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests21);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests21.assertTermsEquals("random", indexReader26, terms27, terms28, false);
        org.junit.rules.RuleChain ruleChain31 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement32 = null;
        org.junit.runner.Description description33 = null;
        org.junit.runners.model.Statement statement34 = ruleChain31.apply(statement32, description33);
        org.junit.runner.Description description35 = null;
        org.junit.runners.model.Statement statement36 = ruleChain16.apply(statement34, description35);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain16;
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) throttling40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, 1.0f, (float) (short) 0);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        float[] floatArray7 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray14 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray25 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray32 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray25, floatArray32, (float) (byte) 100);
        float[] floatArray42 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray49 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray42, floatArray49, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray49, 1.0f);
        float[] floatArray61 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray68 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray61, floatArray68, (float) (byte) 100);
        float[] floatArray78 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray85 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray78, floatArray85, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray85, 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray32, floatArray85, (float) (-1));
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray85, 0.0f);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        long[] longArray7 = new long[] { (byte) 10, (short) 1, (byte) 1, 10, 1, (-1L) };
        long[] longArray11 = new long[] { (-1), (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray7, longArray11);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        char[] charArray3 = new char[] { ' ', '4', ' ' };
        char[] charArray9 = new char[] { 'a', 'a', ' ', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray9);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) 1, (float) 0, (float) (byte) -1);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.monster", postingsEnum10, postingsEnum11, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests22.assertTermsEquals("tests.failfast", indexReader25, terms26, terms27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests22.assertDocsSkippingEquals("tests.nightly", indexReader31, (int) (byte) -1, postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests22.assertDocsSkippingEquals("random", indexReader38, (int) ' ', postingsEnum40, postingsEnum41, true);
        kuromojiAnalysisTests22.tearDown();
        java.lang.Class<?> wildcardClass45 = kuromojiAnalysisTests22.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests22);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) (byte) 1, (double) 1);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0L, (long) 2);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        long[] longArray2 = new long[] { '#', 4 };
        long[] longArray7 = new long[] { (byte) 1, 100, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, 10.0f, (float) (byte) -1);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        char[] charArray6 = new char[] { '#', ' ', '4', 'a', '4', '#' };
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) terms12);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        float[] floatArray7 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray14 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray24 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray31 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray24, floatArray31, (float) (byte) 100);
        float[] floatArray41 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray48 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray41, floatArray48, (float) (byte) 100);
        float[] floatArray58 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray65 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray58, floatArray65, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray65, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray65, 10.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray31, (float) 4);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        long[] longArray1 = null;
        long[] longArray6 = new long[] { 3, 10, 0L, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray1, longArray6);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        long[] longArray2 = new long[] { (-1), 1L };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests30.tearDown();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests30.assertTermsEquals("tests.failfast", indexReader33, terms34, terms35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests30.assertDocsSkippingEquals("tests.nightly", indexReader39, (int) (byte) -1, postingsEnum41, postingsEnum42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader46, (int) (short) -1, postingsEnum48, postingsEnum49);
        java.lang.String str51 = kuromojiAnalysisTests30.getTestName();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        kuromojiAnalysisTests30.assertFieldsEquals("tests.badapples", indexReader53, fields54, fields55, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) ruleChainSet29, (java.lang.Object) false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.List<java.lang.Object> objList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, (java.lang.Object[]) executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray17);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray27);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray22);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray40);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) serializableArray50);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray45);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray56, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray56);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray56, (java.lang.Object[]) executorServiceArray64);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        java.io.Serializable[] serializableArray73 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet74 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray73);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet76 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray75);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray73, (java.lang.Object[]) serializableArray75);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray70, (java.lang.Object[]) serializableArray75);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        java.io.Serializable[] serializableArray83 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet84 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray83);
        java.io.Serializable[] serializableArray85 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet86 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray85);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray83, (java.lang.Object[]) serializableArray85);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray80, (java.lang.Object[]) serializableArray85);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray70, (java.lang.Object[]) serializableArray80);
        java.util.concurrent.ExecutorService[] executorServiceArray90 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean91 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray90);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray70, (java.lang.Object[]) executorServiceArray90);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray64);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray7);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray7);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) executorServiceArray12);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 0, (double) 100);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
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
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("", postingsEnum38, postingsEnum39, false);
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests44.ruleChain;
        kuromojiAnalysisTests44.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests44);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests44.assertPositionsSkippingEquals("tests.weekly", indexReader49, (int) (short) 1, postingsEnum51, postingsEnum52);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests54.tearDown();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        kuromojiAnalysisTests54.assertTermsEquals("tests.failfast", indexReader57, terms58, terms59, false);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        kuromojiAnalysisTests54.assertDocsSkippingEquals("tests.nightly", indexReader63, (int) (byte) -1, postingsEnum65, postingsEnum66, false);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        kuromojiAnalysisTests54.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader70, (int) (short) -1, postingsEnum72, postingsEnum73);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests76 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule77 = kuromojiAnalysisTests76.ruleChain;
        kuromojiAnalysisTests76.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests76);
        org.junit.rules.RuleChain ruleChain80 = kuromojiAnalysisTests76.failureAndSuccessEvents;
        kuromojiAnalysisTests54.failureAndSuccessEvents = ruleChain80;
        kuromojiAnalysisTests44.failureAndSuccessEvents = ruleChain80;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) testRule42, (java.lang.Object) ruleChain80);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (short) 1);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        java.lang.Object obj0 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', '#' };
        char[] charArray8 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray6, charArray8);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        char[] charArray3 = new char[] { '#', '4' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray4);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        short[] shortArray1 = new short[] {};
        short[] shortArray4 = new short[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray1, shortArray4);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10L, (double) 3);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) 1.0f, (-1.0d), (double) 5);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        short[] shortArray5 = new short[] { (byte) 0, (short) 10, (short) 1, (short) 1 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { (byte) 0 };
        long[] longArray4 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray2);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) 100, (double) (short) 100, (double) 100L);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        char[] charArray1 = new char[] { '4' };
        char[] charArray6 = new char[] { '4', 'a', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
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
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        char[] charArray5 = new char[] { ' ', '4', '4', '#', '#' };
        char[] charArray9 = new char[] { '4', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
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
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling21 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet23 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray22);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList24 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet27 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray22, (java.lang.Object[]) throttlingArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) throttlingArray26);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        char[] charArray6 = new char[] { '#', '4', 'a', ' ', ' ', ' ' };
        char[] charArray13 = new char[] { 'a', ' ', '#', ' ', ' ', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        short[] shortArray0 = new short[] {};
        short[] shortArray7 = new short[] { (short) -1, (byte) 10, (short) 100, (byte) 100, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray7);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
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
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures28);
        org.junit.rules.RuleChain ruleChain30 = ruleChain27.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling32 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet34 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray33);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling36 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet38 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray33, (java.lang.Object[]) throttlingArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain27, (java.lang.Object) throttlingArray37);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain27);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests5.assertTermsEquals("tests.failfast", indexReader8, terms9, terms10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests5.assertDocsSkippingEquals("tests.nightly", indexReader14, (int) (byte) -1, postingsEnum16, postingsEnum17, false);
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule21 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule21;
        org.junit.rules.RuleChain ruleChain23 = ruleChain20.around(testRule21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests25.ruleChain;
        kuromojiAnalysisTests25.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests25);
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule30 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain31 = org.junit.rules.RuleChain.outerRule(testRule30);
        org.junit.rules.RuleChain[] ruleChainArray32 = new org.junit.rules.RuleChain[] { ruleChain20, ruleChain29, ruleChain31 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet33 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray32);
        java.util.Set<org.junit.rules.TestRule> testRuleSet34 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray32);
        java.util.Set<org.junit.rules.TestRule> testRuleSet35 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) ruleChainArray32);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        long[] longArray0 = null;
        long[] longArray4 = new long[] { (byte) 0 };
        long[] longArray6 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
        long[] longArray9 = new long[] { (byte) 0 };
        long[] longArray11 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals("", longArray4, longArray11);
        long[] longArray16 = new long[] { (byte) 0 };
        long[] longArray18 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray16, longArray18);
        long[] longArray21 = new long[] { (byte) 0 };
        long[] longArray23 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray21, longArray23);
        org.junit.Assert.assertArrayEquals("", longArray16, longArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray4, longArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        float[] floatArray4 = new float[] { (byte) 0, 1.0f, 0.0f, 1.0f };
        float[] floatArray12 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray19 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray12, floatArray19, (float) (byte) 100);
        float[] floatArray29 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray36 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray29, floatArray36, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray36, 1.0f);
        float[] floatArray48 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray55 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray48, floatArray55, (float) (byte) 100);
        float[] floatArray65 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray72 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray65, floatArray72, (float) (byte) 100);
        float[] floatArray82 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray89 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray82, floatArray89, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray89, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray89, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray55, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray36, (float) (byte) 100);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.slow", postingsEnum10, postingsEnum11, false);
        java.lang.Object obj14 = null;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, obj14);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        short[] shortArray4 = new short[] { (byte) 100, (short) 0, (short) 0, (short) 100 };
        short[] shortArray9 = new short[] { (short) 10, (short) 100, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray9);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), 100.0d);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '4');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) (short) 10);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) '4');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray17, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray7, doubleArray12, (double) 4);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) '4');
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) (byte) -1);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray34, (double) 2);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) '4');
        double[] doubleArray44 = new double[] {};
        double[] doubleArray45 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray45, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray45, (double) (byte) -1);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray50, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray41, (double) (short) 0);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray34, (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray34, 0.0d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        short[] shortArray4 = new short[] { (short) 100, (byte) -1, (short) 100, (short) 10 };
        short[] shortArray10 = new short[] { (byte) 100, (short) 10, (short) -1, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.lang.Iterable[] iterableArray11 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray12 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray11;
        serializableIterableArray12[0] = serializableSet3;
        serializableIterableArray12[1] = serializableSet5;
        serializableIterableArray12[2] = serializableSet7;
        serializableIterableArray12[3] = serializableSet9;
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        java.lang.Iterable[] iterableArray30 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray31 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray30;
        serializableIterableArray31[0] = serializableSet22;
        serializableIterableArray31[1] = serializableSet24;
        serializableIterableArray31[2] = serializableSet26;
        serializableIterableArray31[3] = serializableSet28;
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        java.lang.Iterable[] iterableArray49 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray50 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray49;
        serializableIterableArray50[0] = serializableSet41;
        serializableIterableArray50[1] = serializableSet43;
        serializableIterableArray50[2] = serializableSet45;
        serializableIterableArray50[3] = serializableSet47;
        java.lang.Iterable[][] iterableArray60 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][] serializableIterableArray61 = (java.lang.Iterable<java.io.Serializable>[][]) iterableArray60;
        serializableIterableArray61[0] = serializableIterableArray12;
        serializableIterableArray61[1] = serializableIterableArray31;
        serializableIterableArray61[2] = serializableIterableArray50;
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, serializableIterableArray61);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests69 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests69.tearDown();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        kuromojiAnalysisTests69.assertTermsEquals("tests.failfast", indexReader72, terms73, terms74, false);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        kuromojiAnalysisTests69.assertDocsSkippingEquals("tests.nightly", indexReader78, (int) (byte) -1, postingsEnum80, postingsEnum81, false);
        org.junit.rules.RuleChain ruleChain84 = kuromojiAnalysisTests69.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain85 = kuromojiAnalysisTests69.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) serializableIterableArrayList68, (java.lang.Object) ruleChain85);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 100, (short) -1, (short) -1, (short) 0 };
        short[] shortArray12 = new short[] { (byte) 0, (byte) 0, (short) 10, (short) 0, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (byte) 1, 100.0d, (double) (short) 100);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '4');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray6, (double) (short) 10);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) '4');
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray16, (double) (byte) -1);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) '4');
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray26, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray21, (double) 100);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray1, doubleArray12, (double) 10.0f);
        double[] doubleArray35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray35, (double) 4);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        char[] charArray3 = new char[] { ' ', 'a', 'a' };
        char[] charArray10 = new char[] { '#', '4', 'a', '4', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray10);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) '4', (double) 'a', (double) '4');
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests1.setUp();
        java.lang.String str13 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.tearDown();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.failfast", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("tests.nightly", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (short) -1, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule37 = kuromojiAnalysisTests36.ruleChain;
        kuromojiAnalysisTests36.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests36);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        kuromojiAnalysisTests14.failureAndSuccessEvents = ruleChain40;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("tests.badapples", indexReader43, 0, postingsEnum45, postingsEnum46, true);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        kuromojiAnalysisTests14.assertTermsEquals("random", indexReader50, terms51, terms52, false);
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        java.lang.String str56 = kuromojiAnalysisTests14.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule59 = kuromojiAnalysisTests58.ruleChain;
        kuromojiAnalysisTests58.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests58);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        kuromojiAnalysisTests58.assertTermsEquals("random", indexReader63, terms64, terms65, false);
        org.junit.rules.RuleChain ruleChain68 = kuromojiAnalysisTests58.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement69 = null;
        org.junit.runner.Description description70 = null;
        org.junit.runners.model.Statement statement71 = ruleChain68.apply(statement69, description70);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests73 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule74 = kuromojiAnalysisTests73.ruleChain;
        kuromojiAnalysisTests73.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests73);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        kuromojiAnalysisTests73.assertTermsEquals("random", indexReader78, terms79, terms80, false);
        org.junit.rules.RuleChain ruleChain83 = kuromojiAnalysisTests73.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement84 = null;
        org.junit.runner.Description description85 = null;
        org.junit.runners.model.Statement statement86 = ruleChain83.apply(statement84, description85);
        org.junit.runner.Description description87 = null;
        org.junit.runners.model.Statement statement88 = ruleChain68.apply(statement86, description87);
        org.junit.rules.TestRule testRule89 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain90 = org.junit.rules.RuleChain.outerRule(testRule89);
        org.junit.rules.RuleChain ruleChain91 = ruleChain68.around(testRule89);
        kuromojiAnalysisTests14.failureAndSuccessEvents = ruleChain91;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) str13, (java.lang.Object) kuromojiAnalysisTests14);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '4');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) (byte) -1);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray11, (double) 2);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray22, (double) (byte) -1);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray27, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray18, (double) (short) 0);
        double[] doubleArray35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray11, doubleArray35, (double) (byte) 1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '4');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) (short) 10);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) '4');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray17, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray7, doubleArray12, (double) 4);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) '4');
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) (byte) -1);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray34, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray25, 0.0d);
        double[] doubleArray42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray25, doubleArray42, (double) 10.0f);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet7 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) throttlingArray6);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests9.ruleChain;
        kuromojiAnalysisTests9.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests9.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests9, (java.lang.Object) (-1));
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests32.ruleChain;
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests32);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests32.assertTermsEquals("random", indexReader37, terms38, terms39, false);
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement43 = null;
        org.junit.runner.Description description44 = null;
        org.junit.runners.model.Statement statement45 = ruleChain42.apply(statement43, description44);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule48 = kuromojiAnalysisTests47.ruleChain;
        kuromojiAnalysisTests47.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests47);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        kuromojiAnalysisTests47.assertTermsEquals("random", indexReader52, terms53, terms54, false);
        org.junit.rules.RuleChain ruleChain57 = kuromojiAnalysisTests47.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement58 = null;
        org.junit.runner.Description description59 = null;
        org.junit.runners.model.Statement statement60 = ruleChain57.apply(statement58, description59);
        org.junit.runner.Description description61 = null;
        org.junit.runners.model.Statement statement62 = ruleChain42.apply(statement60, description61);
        org.junit.rules.TestRule testRule63 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain64 = org.junit.rules.RuleChain.outerRule(testRule63);
        org.junit.rules.RuleChain ruleChain65 = ruleChain42.around(testRule63);
        org.junit.rules.RuleChain ruleChain66 = ruleChain30.around((org.junit.rules.TestRule) ruleChain65);
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain30;
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests9.assertPositionsSkippingEquals("", indexReader69, (int) (byte) 0, postingsEnum71, postingsEnum72);
        org.junit.rules.TestRule testRule74 = kuromojiAnalysisTests9.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttlingArray6, (java.lang.Object) testRule74);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        short[] shortArray2 = new short[] { (byte) 10 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray2, shortArray3);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        short[] shortArray1 = new short[] {};
        short[] shortArray6 = new short[] { (byte) 1, (byte) 100, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray6);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
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
        org.junit.rules.RuleChain ruleChain57 = kuromojiAnalysisTests42.failureAndSuccessEvents;
        kuromojiAnalysisTests42.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests42.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) terms38, (java.lang.Object) kuromojiAnalysisTests42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests42.assertPathHasBeenCleared("");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule6 = kuromojiAnalysisTests5.ruleChain;
        kuromojiAnalysisTests5.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests5);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests5.assertTermsEquals("random", indexReader10, terms11, terms12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement16 = null;
        org.junit.runner.Description description17 = null;
        org.junit.runners.model.Statement statement18 = ruleChain15.apply(statement16, description17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests20.ruleChain;
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests20);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests20.assertTermsEquals("random", indexReader25, terms26, terms27, false);
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement31 = null;
        org.junit.runner.Description description32 = null;
        org.junit.runners.model.Statement statement33 = ruleChain30.apply(statement31, description32);
        org.junit.runner.Description description34 = null;
        org.junit.runners.model.Statement statement35 = ruleChain15.apply(statement33, description34);
        org.junit.rules.TestRule testRule36 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.outerRule(testRule36);
        org.junit.rules.RuleChain ruleChain38 = ruleChain15.around(testRule36);
        org.junit.rules.RuleChain ruleChain39 = ruleChain3.around((org.junit.rules.TestRule) ruleChain15);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray41, (java.lang.Object[]) executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain39, (java.lang.Object) executorServiceArray46);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray10);
        long[] longArray15 = new long[] { (byte) 0 };
        long[] longArray17 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        long[] longArray20 = new long[] { (byte) 0 };
        long[] longArray22 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray20, longArray22);
        org.junit.Assert.assertArrayEquals("", longArray15, longArray22);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray3, longArray22);
        long[] longArray26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray26);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '4');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) (byte) -1);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) '4');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray17, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray12, (double) 100);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) '4');
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray30, (double) (short) 10);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) '4');
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray40, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray30, doubleArray35, (double) 4);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray3, doubleArray35, 0.0d);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) '4');
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray54, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("", doubleArray35, doubleArray54, (double) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray54);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
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
        java.lang.String str22 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (long) (byte) 1, (long) (short) 1);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 0, (double) 3, (double) 3);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("enwiki.random.lines.txt");
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
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests12.assertDocsSkippingEquals("tests.badapples", indexReader41, 0, postingsEnum43, postingsEnum44, true);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        kuromojiAnalysisTests12.assertTermsEquals("random", indexReader48, terms49, terms50, false);
        kuromojiAnalysisTests12.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain54 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain54);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.junit.rules.RuleChain ruleChain19 = ruleChain16.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures18);
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests22.assertTermsEquals("random", indexReader27, terms28, terms29, false);
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement33 = null;
        org.junit.runner.Description description34 = null;
        org.junit.runners.model.Statement statement35 = ruleChain32.apply(statement33, description34);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule38 = kuromojiAnalysisTests37.ruleChain;
        kuromojiAnalysisTests37.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests37);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests37.assertTermsEquals("random", indexReader42, terms43, terms44, false);
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests37.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement48 = null;
        org.junit.runner.Description description49 = null;
        org.junit.runners.model.Statement statement50 = ruleChain47.apply(statement48, description49);
        org.junit.runner.Description description51 = null;
        org.junit.runners.model.Statement statement52 = ruleChain32.apply(statement50, description51);
        org.junit.runner.Description description53 = null;
        org.junit.runners.model.Statement statement54 = ruleChain20.apply(statement50, description53);
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain19, (java.lang.Object) statement54);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray58, intArray59);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray62, intArray63);
        org.junit.Assert.assertArrayEquals(intArray59, intArray62);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray59, (java.lang.Object) 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) statement54, (java.lang.Object) intArray59);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) serializableArray19);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) serializableArray19);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray11, (java.lang.Object[]) serializableArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) serializableArray27);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        java.lang.Object obj14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests2, obj14);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '4');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) (byte) -1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) '4');
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray18, (double) (short) 10);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) '4');
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray28, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray18, doubleArray23, (double) 4);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) '4');
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray40, (double) (byte) -1);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray45, (double) 2);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) '4');
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray56, (double) (byte) -1);
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray61, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray52, (double) (short) 0);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray45, (double) (-1L));
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray45, (double) 3);
        double[] doubleArray74 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray3, doubleArray74, (double) (short) -1);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, 0L);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
        char[] charArray10 = new char[] { '4', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, 0L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0.0f, (float) (short) 1, (-1.0f));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        java.lang.Object[] objArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray1, (java.lang.Object[]) serializableArray25);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
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
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) serializableSetList26);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests28.tearDown();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests28.assertTermsEquals("tests.failfast", indexReader31, terms32, terms33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests28.assertDocsSkippingEquals("tests.nightly", indexReader37, (int) (byte) -1, postingsEnum39, postingsEnum40, false);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests28.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures44 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures44);
        org.junit.rules.RuleChain ruleChain46 = ruleChain43.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures45);
        org.junit.rules.RuleChain ruleChain47 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests49.ruleChain;
        kuromojiAnalysisTests49.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests49);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        kuromojiAnalysisTests49.assertTermsEquals("random", indexReader54, terms55, terms56, false);
        org.junit.rules.RuleChain ruleChain59 = kuromojiAnalysisTests49.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement60 = null;
        org.junit.runner.Description description61 = null;
        org.junit.runners.model.Statement statement62 = ruleChain59.apply(statement60, description61);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests64 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule65 = kuromojiAnalysisTests64.ruleChain;
        kuromojiAnalysisTests64.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests64);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        kuromojiAnalysisTests64.assertTermsEquals("random", indexReader69, terms70, terms71, false);
        org.junit.rules.RuleChain ruleChain74 = kuromojiAnalysisTests64.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement75 = null;
        org.junit.runner.Description description76 = null;
        org.junit.runners.model.Statement statement77 = ruleChain74.apply(statement75, description76);
        org.junit.runner.Description description78 = null;
        org.junit.runners.model.Statement statement79 = ruleChain59.apply(statement77, description78);
        org.junit.runner.Description description80 = null;
        org.junit.runners.model.Statement statement81 = ruleChain47.apply(statement77, description80);
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain46, (java.lang.Object) statement81);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableSetList26, (java.lang.Object) ruleChain46);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) ' ', 0.0f);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) 10, 100L);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100L, (double) 5, 1.0d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
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
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray1, shortArray4);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        short[] shortArray1 = new short[] {};
        short[] shortArray4 = new short[] { (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray4);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
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
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray49, 10.0f);
        float[] floatArray63 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray70 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray70, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray15, floatArray63, (float) (byte) 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) (-1L), (double) 5);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        short[] shortArray5 = new short[] { (byte) 1, (short) -1, (short) 10, (byte) 1 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray6);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", obj1, (java.lang.Object) 0.0f);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
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
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) executorServiceArray48);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray58, (java.lang.Object[]) serializableArray60);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray55, (java.lang.Object[]) serializableArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray52, (java.lang.Object[]) serializableArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableSetArray13, (java.lang.Object[]) serializableArray52);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        short[] shortArray6 = new short[] { (short) -1, (short) 1, (short) 10, (byte) 0, (byte) 10, (byte) 0 };
        short[] shortArray12 = new short[] { (short) 10, (byte) 0, (short) -1, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray12);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        java.lang.Object obj1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures8);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures9 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet11 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", obj1, (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray10);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) (short) 10);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
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
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) executorServiceArray24);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "tests.maxfailures" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) charSequenceArray29);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) (short) 100, 0.0f);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', 0L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
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
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests17.ruleChain;
        kuromojiAnalysisTests17.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests17);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests17.assertTermsEquals("random", indexReader22, terms23, terms24, false);
        kuromojiAnalysisTests17.ensureCheckIndexPassed();
        kuromojiAnalysisTests17.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests17.failureAndSuccessEvents;
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray33, intArray34);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray37, intArray38);
        org.junit.Assert.assertArrayEquals(intArray34, intArray37);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray34, (java.lang.Object) 100.0d);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray46, intArray47);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray50, intArray51);
        org.junit.Assert.assertArrayEquals(intArray47, intArray50);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray47, (java.lang.Object) 100.0d);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray57, intArray58);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray47, intArray57);
        org.junit.Assert.assertArrayEquals("random", intArray34, intArray47);
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray62);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain29, (java.lang.Object) intArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) intArray62);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        java.lang.Object obj1 = null;
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
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        java.lang.String str18 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", obj1, (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (byte) 0, (double) (-1), (double) 1);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 'a');
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (byte) 100);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, 0.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 10.0d, (double) '4');
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 100, (-1L));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100L, (long) 100);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
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
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) ' ');
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) ' ', (java.lang.Object) charArray41);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray21, charArray24);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
        org.junit.Assert.assertArrayEquals("random", charArray21, charArray28);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray28, charArray36);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals(charArray41, charArray44);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray49, charArray52);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray56, charArray59);
        org.junit.Assert.assertArrayEquals("random", charArray49, charArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray44, charArray56);
        org.junit.Assert.assertArrayEquals(charArray28, charArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) charArray28);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.monster", postingsEnum10, postingsEnum11, true);
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) ruleChain14);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain1;
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests39.ruleChain;
        kuromojiAnalysisTests39.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests39);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests39.assertTermsEquals("random", indexReader44, terms45, terms46, false);
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement50 = null;
        org.junit.runner.Description description51 = null;
        org.junit.runners.model.Statement statement52 = ruleChain49.apply(statement50, description51);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests54.ruleChain;
        kuromojiAnalysisTests54.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests54);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        kuromojiAnalysisTests54.assertTermsEquals("random", indexReader59, terms60, terms61, false);
        org.junit.rules.RuleChain ruleChain64 = kuromojiAnalysisTests54.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement65 = null;
        org.junit.runner.Description description66 = null;
        org.junit.runners.model.Statement statement67 = ruleChain64.apply(statement65, description66);
        org.junit.runner.Description description68 = null;
        org.junit.runners.model.Statement statement69 = ruleChain49.apply(statement67, description68);
        org.junit.runner.Description description70 = null;
        org.junit.runners.model.Statement statement71 = ruleChain37.apply(statement67, description70);
        org.junit.runner.Description description72 = null;
        org.junit.runners.model.Statement statement73 = ruleChain1.apply(statement71, description72);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests75 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule76 = kuromojiAnalysisTests75.ruleChain;
        kuromojiAnalysisTests75.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain78 = kuromojiAnalysisTests75.failureAndSuccessEvents;
        kuromojiAnalysisTests75.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) kuromojiAnalysisTests75);
        kuromojiAnalysisTests75.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) statement71, (java.lang.Object) kuromojiAnalysisTests75);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray47, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet8 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray7);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray18);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray23, (java.lang.Object[]) serializableArray28);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) executorServiceArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) throttlingArray7, (java.lang.Object[]) executorServiceArray33);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 100L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 10, (double) '4');
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 0L);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 10);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
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
        java.lang.String str17 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests39.ruleChain;
        kuromojiAnalysisTests39.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests39);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests39.assertTermsEquals("random", indexReader44, terms45, terms46, false);
        kuromojiAnalysisTests39.ensureCheckIndexPassed();
        kuromojiAnalysisTests39.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain51 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray55, intArray56);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray59, intArray60);
        org.junit.Assert.assertArrayEquals(intArray56, intArray59);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray56, (java.lang.Object) 100.0d);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray68, intArray69);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray72, intArray73);
        org.junit.Assert.assertArrayEquals(intArray69, intArray72);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray69, (java.lang.Object) 100.0d);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray79, intArray80);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray69, intArray79);
        org.junit.Assert.assertArrayEquals("random", intArray56, intArray69);
        int[] intArray84 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray69, intArray84);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain51, (java.lang.Object) intArray84);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray24, intArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) intArray84);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        double[] doubleArray1 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) '4');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (byte) -1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) '4');
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray18, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray13, (double) 100);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) '4');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray31, (double) (short) 10);
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) '4');
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray41, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray31, doubleArray36, (double) 4);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray4, doubleArray36, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray1, doubleArray36, 100.0d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 1L);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
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
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader45, (int) (short) 100, postingsEnum47, postingsEnum48);
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("", postingsEnum55, postingsEnum56);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) (short) 100);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        java.lang.Object[] objArray1 = null;
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray8);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) serializableArray3);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0.0f, (float) (short) 100, 1.0f);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
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
        org.junit.Assert.assertNotEquals((java.lang.Object) 2, (java.lang.Object) serializableArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) executorServiceArray27);
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
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray53, (java.lang.Object[]) serializableArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) serializableArray15, (java.lang.Object) serializableArray53);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (short) 10);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        java.lang.String str2 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", (int) (short) 10, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (-1));
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests7.assertTermsEquals("tests.failfast", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests7.assertDocsSkippingEquals("tests.nightly", indexReader16, (int) (byte) -1, postingsEnum18, postingsEnum19, false);
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests7.failureAndSuccessEvents;
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests39.ruleChain;
        kuromojiAnalysisTests39.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests39);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests39.assertTermsEquals("random", indexReader44, terms45, terms46, false);
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement50 = null;
        org.junit.runner.Description description51 = null;
        org.junit.runners.model.Statement statement52 = ruleChain49.apply(statement50, description51);
        org.junit.runner.Description description53 = null;
        org.junit.runners.model.Statement statement54 = ruleChain34.apply(statement52, description53);
        org.junit.rules.TestRule testRule55 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain56 = org.junit.rules.RuleChain.outerRule(testRule55);
        org.junit.rules.RuleChain ruleChain57 = ruleChain34.around(testRule55);
        org.junit.rules.RuleChain ruleChain58 = ruleChain22.around((org.junit.rules.TestRule) ruleChain57);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader61, (int) (byte) 0, postingsEnum63, postingsEnum64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) indexReader61);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) 0, (double) 5);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
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
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray30, intArray31);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray34, intArray35);
        org.junit.Assert.assertArrayEquals(intArray31, intArray34);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray31, (java.lang.Object) 100.0d);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray31, intArray41);
        org.junit.Assert.assertArrayEquals("random", intArray18, intArray31);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray5, intArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.weekly", indexReader17, 1, postingsEnum19, postingsEnum20, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", (java.lang.Object) indexReader17);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        float[] floatArray5 = new float[] { (-1), 1.0f, 'a', 1L };
        float[] floatArray12 = new float[] { 0L, (short) 100, ' ', (byte) -1, 0L, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray5, floatArray12, (float) 100L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) 100, (float) 100L);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        short[] shortArray1 = new short[] { (byte) 100 };
        short[] shortArray3 = new short[] { (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        short[] shortArray3 = new short[] { (short) -1, (short) 1 };
        short[] shortArray8 = new short[] { (short) -1, (short) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray3, shortArray8);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 0L, (double) (short) 10);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) 5, (double) 0.0f, (double) 100);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) '4');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (byte) -1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) '4');
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray18, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray13, (double) 100);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) '4');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray31, (double) (short) 10);
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) '4');
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray41, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray31, doubleArray36, (double) 4);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray4, doubleArray36, 0.0d);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) '4');
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray55, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray55, (double) 2);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) '4');
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray67, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray63, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray36);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests6.assertTermsEquals("tests.failfast", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests6.assertDocsSkippingEquals("tests.nightly", indexReader15, (int) (byte) -1, postingsEnum17, postingsEnum18, false);
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        kuromojiAnalysisTests23.assertTermsEquals("random", indexReader28, terms29, terms30, false);
        org.junit.rules.RuleChain ruleChain33 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement34 = null;
        org.junit.runner.Description description35 = null;
        org.junit.runners.model.Statement statement36 = ruleChain33.apply(statement34, description35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests38.ruleChain;
        kuromojiAnalysisTests38.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests38);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        kuromojiAnalysisTests38.assertTermsEquals("random", indexReader43, terms44, terms45, false);
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement49 = null;
        org.junit.runner.Description description50 = null;
        org.junit.runners.model.Statement statement51 = ruleChain48.apply(statement49, description50);
        org.junit.runner.Description description52 = null;
        org.junit.runners.model.Statement statement53 = ruleChain33.apply(statement51, description52);
        org.junit.rules.TestRule testRule54 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain55 = org.junit.rules.RuleChain.outerRule(testRule54);
        org.junit.rules.RuleChain ruleChain56 = ruleChain33.around(testRule54);
        org.junit.rules.RuleChain ruleChain57 = ruleChain21.around((org.junit.rules.TestRule) ruleChain56);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain21;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader60, (int) (byte) 0, postingsEnum62, postingsEnum63);
        org.junit.rules.TestRule testRule65 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule65);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        short[] shortArray1 = new short[] {};
        short[] shortArray4 = new short[] { (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray4);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1.0f);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests3.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests3.assertTermsEquals("", indexReader19, terms20, terms21, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("", (java.lang.Object) testRuleIgnoreAfterMaxFailures2, (java.lang.Object) indexReader19);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (short) 10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '4');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) (byte) -1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) '4');
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray18, (double) (short) 10);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) '4');
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray28, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray18, doubleArray23, (double) 4);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) '4');
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray40, (double) (byte) -1);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray45, (double) 2);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) '4');
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray56, (double) (byte) -1);
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray61, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray52, (double) (short) 0);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray45, (double) (-1L));
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray45, (double) 3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests73 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule74 = kuromojiAnalysisTests73.ruleChain;
        kuromojiAnalysisTests73.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests73.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests73, (java.lang.Object) (-1));
        kuromojiAnalysisTests73.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        kuromojiAnalysisTests73.assertDocsSkippingEquals("hi!", indexReader81, (int) '4', postingsEnum83, postingsEnum84, false);
        kuromojiAnalysisTests73.ensureCleanedUp();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) doubleArray3, (java.lang.Object) kuromojiAnalysisTests73);
        double[] doubleArray89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray89, (double) (byte) 1);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray4, strArray8, strArray12, strArray16 };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray34 = new java.lang.String[][] { strArray21, strArray25, strArray29, strArray33 };
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray51 = new java.lang.String[][] { strArray38, strArray42, strArray46, strArray50 };
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray68 = new java.lang.String[][] { strArray55, strArray59, strArray63, strArray67 };
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray85 = new java.lang.String[][] { strArray72, strArray76, strArray80, strArray84 };
        java.lang.String[][][] strArray86 = new java.lang.String[][][] { strArray17, strArray34, strArray51, strArray68, strArray85 };
        java.util.List<java.lang.String[][]> strArrayList87 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, strArray86);
        java.lang.Object[] objArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray86, objArray88);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray12, charArray15);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals("random", charArray12, charArray19);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray19, charArray27);
        org.junit.Assert.assertArrayEquals(charArray6, charArray27);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals(charArray41, charArray44);
        org.junit.Assert.assertArrayEquals("random", charArray34, charArray41);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray41, charArray49);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray27, charArray49);
        char[] charArray58 = new char[] { '#', ' ', '4', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray27, charArray58);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (byte) 1, (float) (short) 10, (float) (-1L));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short[] shortArray9 = new short[] { (short) 10, (byte) 0, (short) 10, (short) -1, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        org.junit.rules.TestRule testRule0 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule0;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule0, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '4');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) (byte) -1);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) '4');
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray16, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray11, (double) 100);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) '4');
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray29, (double) (short) 10);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) '4');
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray39, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray29, doubleArray34, (double) 4);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray2, doubleArray34, 0.0d);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests49.ruleChain;
        kuromojiAnalysisTests49.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests49);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        kuromojiAnalysisTests49.assertTermsEquals("random", indexReader54, terms55, terms56, false);
        kuromojiAnalysisTests49.ensureCleanedUp();
        kuromojiAnalysisTests49.ensureCleanedUp();
        kuromojiAnalysisTests49.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0.0d, (java.lang.Object) kuromojiAnalysisTests49);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10.0f, 0.0d, (double) 0.0f);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
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
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) ruleChainArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) objSet31);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 100L, 1L);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) byteArray7);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.List<java.lang.Object> objList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, (java.lang.Object[]) executorServiceArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) objList6);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray8);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
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
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) executorServiceArray25);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray29);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) serializableArray5);
        java.lang.Object obj44 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet48 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray47);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray47);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling50 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet52 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray47, (java.lang.Object[]) throttlingArray51);
        org.junit.Assert.assertNotEquals(obj44, (java.lang.Object) throttlingArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) throttlingArray47);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (short) -1);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) '4', (double) '#');
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) '#', 1.0f);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
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
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader43, terms44, terms45, true);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.badapples", postingsEnum49, postingsEnum50, true);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) -1);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.failfast");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), 0.0d, (double) 10L);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        short[] shortArray3 = new short[] { (short) 100, (short) -1 };
        short[] shortArray10 = new short[] { (short) 100, (short) -1, (byte) 100, (short) 0, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray3, shortArray10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        float[] floatArray7 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray14 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray17 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray17, (float) (short) 100);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.monster", indexReader12, fields13, fields14, false);
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 'a', 10L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (-1L), (-1.0d), (double) '#');
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
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
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray31);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray36);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray51, (java.lang.Object[]) serializableArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray53);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        java.io.Serializable[] serializableArray61 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet62 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray61);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray61, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray58, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray58);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet70 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray69);
        java.io.Serializable[] serializableArray71 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray71);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray69, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray69);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) serializableArray69);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) serializableArray69);
        java.lang.Object[] objArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray69, objArray78);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
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
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests25.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule26;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule26;
        org.junit.rules.RuleChain ruleChain29 = org.junit.rules.RuleChain.outerRule(testRule26);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests30.ruleChain;
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.outerRule(testRule31);
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain32);
        org.junit.rules.RuleChain ruleChain34 = ruleChain29.around((org.junit.rules.TestRule) ruleChain33);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain33;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule37 = kuromojiAnalysisTests36.ruleChain;
        kuromojiAnalysisTests36.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests36);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        kuromojiAnalysisTests36.assertTermsEquals("random", indexReader41, terms42, terms43, false);
        org.junit.rules.RuleChain ruleChain46 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement47 = null;
        org.junit.runner.Description description48 = null;
        org.junit.runners.model.Statement statement49 = ruleChain46.apply(statement47, description48);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule52 = kuromojiAnalysisTests51.ruleChain;
        kuromojiAnalysisTests51.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests51);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        kuromojiAnalysisTests51.assertTermsEquals("random", indexReader56, terms57, terms58, false);
        org.junit.rules.RuleChain ruleChain61 = kuromojiAnalysisTests51.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement62 = null;
        org.junit.runner.Description description63 = null;
        org.junit.runners.model.Statement statement64 = ruleChain61.apply(statement62, description63);
        org.junit.runner.Description description65 = null;
        org.junit.runners.model.Statement statement66 = ruleChain46.apply(statement64, description65);
        org.junit.runner.Description description67 = null;
        org.junit.runners.model.Statement statement68 = ruleChain0.apply(statement66, description67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) description67);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray10);
        long[] longArray15 = new long[] { (byte) 0 };
        long[] longArray17 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        long[] longArray20 = new long[] { (byte) 0 };
        long[] longArray22 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray20, longArray22);
        org.junit.Assert.assertArrayEquals(longArray15, longArray22);
        long[] longArray26 = new long[] { (byte) 0 };
        long[] longArray28 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray26, longArray28);
        long[] longArray31 = new long[] { (byte) 0 };
        long[] longArray33 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray31, longArray33);
        org.junit.Assert.assertArrayEquals(longArray26, longArray33);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray15, longArray26);
        org.junit.Assert.assertArrayEquals(longArray10, longArray15);
        long[] longArray38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray10, longArray38);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (-1L), (double) 1.0f);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 10L);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet7 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) throttlingArray6);
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray6, objArray9);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 100.0f);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.awaitsfix");
        java.lang.Object obj16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.awaitsfix", obj16);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (-1.0f), (double) (byte) 0);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        char[] charArray4 = new char[] { '4', 'a', '4' };
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray4, charArray5);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) ' ', 0.0d, 1.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
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
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests17.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule33 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule33;
        org.junit.rules.RuleChain ruleChain35 = ruleChain32.around(testRule33);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain32;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain32;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) ruleChain32);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
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
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray16, (java.lang.Object[]) executorServiceArray21);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) executorServiceArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling28 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet30 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray29);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling32 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet34 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray29, (java.lang.Object[]) throttlingArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) throttlingArray33);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        float[] floatArray2 = new float[] { (byte) 100 };
        float[] floatArray10 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray17 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray27 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray34 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray27, floatArray34, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray34, 1.0f);
        float[] floatArray46 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray53 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray46, floatArray53, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray53, (float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray2, floatArray34, (-1.0f));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) 1, 1.0d, (double) 10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.elasticsearch.test.ESTestCase[][] eSTestCaseArray1 = new org.elasticsearch.test.ESTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests3.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15, false);
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests3.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule19 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule19;
        org.junit.rules.RuleChain ruleChain21 = ruleChain18.around(testRule19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule28 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain29 = org.junit.rules.RuleChain.outerRule(testRule28);
        org.junit.rules.RuleChain[] ruleChainArray30 = new org.junit.rules.RuleChain[] { ruleChain18, ruleChain27, ruleChain29 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet31 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray30);
        java.util.Set<org.junit.rules.TestRule> testRuleSet32 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray30);
        java.util.Set<org.junit.rules.TestRule> testRuleSet33 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) eSTestCaseArray1, (java.lang.Object[]) ruleChainArray30);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), 1L);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
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
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests29.tearDown();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("enwiki.random.lines.txt", indexReader32, fields33, fields34, true);
        kuromojiAnalysisTests29.setUp();
        kuromojiAnalysisTests29.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests29);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("enwiki.random.lines.txt", indexReader41, fields42, fields43, true);
        org.junit.rules.RuleChain ruleChain46 = kuromojiAnalysisTests29.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests29);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) testRule11);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
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
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.monster", 2, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        short[] shortArray6 = new short[] { (short) -1, (byte) 100, (short) 10, (short) 100, (byte) 100, (short) 0 };
        short[] shortArray9 = new short[] { (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray5, byteArray9);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray15, byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray15);
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray9);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray29, byteArray30);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray33, byteArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray29, byteArray33);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray39, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray39, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray39);
        org.junit.Assert.assertArrayEquals("", byteArray26, byteArray33);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray53, byteArray54);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray57, byteArray58);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray53, byteArray57);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray63, byteArray64);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray63, byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray63);
        org.junit.Assert.assertArrayEquals("", byteArray50, byteArray57);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray75, byteArray76);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray79, byteArray80);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray75, byteArray79);
        byte[] byteArray85 = new byte[] {};
        byte[] byteArray86 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray85, byteArray86);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray89, byteArray90);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray85, byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray79, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray50);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 0L, (float) (byte) 1, (float) (byte) 0);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        float[] floatArray7 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray14 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray17, (float) '4');
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (-1.0f), (float) (byte) 10);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        float[] floatArray6 = new float[] { '4', 100, (-1), (-1), (short) -1 };
        float[] floatArray14 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray21 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray14, floatArray21, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray6, floatArray14, (float) (byte) 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray12, charArray15);
        org.junit.Assert.assertArrayEquals("random", charArray5, charArray12);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray12, charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals(charArray33, charArray36);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray40, charArray43);
        org.junit.Assert.assertArrayEquals("random", charArray33, charArray40);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray40, charArray48);
        org.junit.Assert.assertArrayEquals(charArray27, charArray48);
        org.junit.Assert.assertArrayEquals("", charArray12, charArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 1L);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '4');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) (byte) -1);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray11, (double) 2);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        org.junit.Assert.assertArrayEquals("", doubleArray11, doubleArray17, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1.0f, (java.lang.Object) "");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 0.0d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        short[] shortArray4 = new short[] { (short) 100, (byte) 100, (byte) -1 };
        short[] shortArray8 = new short[] { (short) 100, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray8);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), (double) 1.0f, (double) '#');
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 10.0d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
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
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray34);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray34);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray44);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) executorServiceArray49);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray54, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray29, (java.lang.Object[]) executorServiceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableSetArray13, (java.lang.Object[]) serializableArray29);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests3.assertTermsEquals("", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests3.ensureCleanedUp();
        kuromojiAnalysisTests3.ensureCheckIndexPassed();
        kuromojiAnalysisTests3.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests3.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests3.setIndexWriterMaxDocs((int) '4');
        kuromojiAnalysisTests3.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) "", (java.lang.Object) kuromojiAnalysisTests3);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests3.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
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
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) serializableSetArray13);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
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
        kuromojiAnalysisTests1.assertPathHasBeenCleared("random");
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 0.0f);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        short[] shortArray1 = new short[] {};
        short[] shortArray6 = new short[] { (short) 10, (short) 1, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray1, shortArray6);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
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
        kuromojiAnalysisTests0.assertTermsEquals("tests.nightly", indexReader36, terms37, terms38, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray4, (java.lang.Object) 100.0d);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray4, intArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests18.assertTermsEquals("", indexReader20, terms21, terms22, false);
        kuromojiAnalysisTests18.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests18.assertDocsEnumEquals("<unknown>", postingsEnum27, postingsEnum28, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray4, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray7);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray4, (java.lang.Object) executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) -1, 0L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader18, terms19, terms20, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 4, (float) 'a', (-1.0f));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, (double) (short) 1, (double) (short) 10);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 4, (double) '#');
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
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
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests41 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests41.ruleChain;
        kuromojiAnalysisTests41.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests41);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        kuromojiAnalysisTests41.assertTermsEquals("random", indexReader46, terms47, terms48, false);
        kuromojiAnalysisTests41.ensureCheckIndexPassed();
        kuromojiAnalysisTests41.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests41.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum54, postingsEnum55, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests41);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        float[] floatArray7 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray14 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray24 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray31 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray24, floatArray31, (float) (byte) 100);
        float[] floatArray41 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray48 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray41, floatArray48, (float) (byte) 100);
        float[] floatArray58 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray65 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray58, floatArray65, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray65, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray65, 10.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray31, (float) ' ');
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) 0L, (float) (short) 100, 1.0f);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) 0, (double) '4');
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum3, postingsEnum4);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) (short) -1, (double) (-1), (double) (short) 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) '#', (double) 1);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((-1));
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests14.ruleChain;
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests14);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests14.assertTermsEquals("random", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray30, intArray31);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray34, intArray35);
        org.junit.Assert.assertArrayEquals(intArray31, intArray34);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray31, (java.lang.Object) 100.0d);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray43, intArray44);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray47, intArray48);
        org.junit.Assert.assertArrayEquals(intArray44, intArray47);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray44, (java.lang.Object) 100.0d);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray54, intArray55);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray44, intArray54);
        org.junit.Assert.assertArrayEquals("random", intArray31, intArray44);
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain26, (java.lang.Object) intArray59);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests62.tearDown();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        kuromojiAnalysisTests62.assertTermsEquals("tests.failfast", indexReader65, terms66, terms67, false);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        kuromojiAnalysisTests62.assertTermsEquals("", indexReader71, terms72, terms73, false);
        org.junit.rules.RuleChain ruleChain76 = kuromojiAnalysisTests62.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain77 = ruleChain26.around((org.junit.rules.TestRule) ruleChain76);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain76;
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum81, postingsEnum82);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 10, (long) '#');
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray6, (java.lang.Object) 100.0d);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray18, intArray19);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray22, intArray23);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray19, (java.lang.Object) 100.0d);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray19, intArray29);
        org.junit.Assert.assertArrayEquals("random", intArray6, intArray19);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray36, intArray37);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray40, intArray41);
        org.junit.Assert.assertArrayEquals(intArray37, intArray40);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray37, (java.lang.Object) 100.0d);
        org.junit.Assert.assertArrayEquals(intArray19, intArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray19);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) 0L, 1.0f);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) (short) 100, (float) (byte) 0, (float) 'a');
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader6, (int) (short) 1, postingsEnum8, postingsEnum9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests11.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("tests.nightly", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests11.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader27, (int) (short) -1, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule34 = kuromojiAnalysisTests33.ruleChain;
        kuromojiAnalysisTests33.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests33);
        org.junit.rules.RuleChain ruleChain37 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        kuromojiAnalysisTests11.failureAndSuccessEvents = ruleChain37;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain37;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.monster", indexReader41, (int) (byte) 1, postingsEnum43, postingsEnum44);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum47, postingsEnum48);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray6);
        java.lang.Class<?> wildcardClass10 = serializableArray1.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("enwiki.random.lines.txt", indexReader14, fields15, fields16, true);
        kuromojiAnalysisTests11.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableArray1, (java.lang.Object) kuromojiAnalysisTests11);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1.0f, (double) 1);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
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
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.failfast", postingsEnum45, postingsEnum46, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests49.tearDown();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        kuromojiAnalysisTests49.assertFieldsEquals("enwiki.random.lines.txt", indexReader52, fields53, fields54, true);
        kuromojiAnalysisTests49.setUp();
        kuromojiAnalysisTests49.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        kuromojiAnalysisTests49.assertFieldsEquals("enwiki.random.lines.txt", indexReader61, fields62, fields63, false);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        kuromojiAnalysisTests49.assertPositionsSkippingEquals("tests.monster", indexReader67, (int) (byte) 1, postingsEnum69, postingsEnum70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum45, (java.lang.Object) kuromojiAnalysisTests49);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 3, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet8 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.tearDown();
        kuromojiAnalysisTests10.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests10.tearDown();
        kuromojiAnalysisTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests10.assertPositionsSkippingEquals("tests.nightly", indexReader16, (int) ' ', postingsEnum18, postingsEnum19);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray3, (java.lang.Object) kuromojiAnalysisTests10);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("enwiki.random.lines.txt", indexReader26, fields27, fields28, true);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests23.assertDocsSkippingEquals("", indexReader32, 1, postingsEnum34, postingsEnum35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests23.assertDocsSkippingEquals("tests.weekly", indexReader39, 1, postingsEnum41, postingsEnum42, false);
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        kuromojiAnalysisTests23.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests23.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule49 = kuromojiAnalysisTests48.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule49;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule49;
        org.junit.rules.RuleChain ruleChain52 = org.junit.rules.RuleChain.outerRule(testRule49);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule54 = kuromojiAnalysisTests53.ruleChain;
        org.junit.rules.RuleChain ruleChain55 = org.junit.rules.RuleChain.outerRule(testRule54);
        org.junit.rules.RuleChain ruleChain56 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain55);
        org.junit.rules.RuleChain ruleChain57 = ruleChain52.around((org.junit.rules.TestRule) ruleChain56);
        kuromojiAnalysisTests23.failureAndSuccessEvents = ruleChain56;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) throttlingEnumSet22, (java.lang.Object) ruleChain56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttlingEnumSet22);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        short[] shortArray5 = new short[] { (byte) 10, (short) 100, (short) 100, (short) 10, (short) 1 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0L, (long) (byte) 100);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        short[] shortArray5 = new short[] { (byte) -1, (short) 0, (byte) 1, (byte) 100 };
        short[] shortArray11 = new short[] { (byte) 10, (short) -1, (short) -1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray5, shortArray11);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) -1, (long) 2);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) (byte) 1, 1.0d, (double) (short) 10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) 0, (long) (short) 100);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet7 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) throttlingArray6);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests9.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, true);
        kuromojiAnalysisTests9.setUp();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests9.ensureCleanedUp();
        kuromojiAnalysisTests9.ensureCheckIndexPassed();
        kuromojiAnalysisTests9.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests9.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttlingArray6, (java.lang.Object) kuromojiAnalysisTests9);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
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
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray13);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests26.tearDown();
        kuromojiAnalysisTests26.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests26.tearDown();
        kuromojiAnalysisTests26.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests26.assertPositionsSkippingEquals("tests.nightly", indexReader32, (int) ' ', postingsEnum34, postingsEnum35);
        kuromojiAnalysisTests26.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) serializableSetArray13, (java.lang.Object) kuromojiAnalysisTests26);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
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
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.slow", indexReader13, terms14, terms15, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests18.ruleChain;
        kuromojiAnalysisTests18.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests18.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("tests.slow", indexReader23, fields24, fields25, true);
        kuromojiAnalysisTests18.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.slow", (java.lang.Object) kuromojiAnalysisTests18);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures8 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet10 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet11 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray21, (java.lang.Object[]) serializableArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray23);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) serializableArray15);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray30, (java.lang.Object[]) serializableArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray30, (java.lang.Object[]) executorServiceArray35);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray9, (java.lang.Object) executorServiceArray12);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 0, (double) (short) 1);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) executorServiceArray7);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) executorServiceArray7);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
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
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) serializableArray16);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray31, (java.lang.Object[]) executorServiceArray36);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean12, (java.lang.Object) executorServiceArray36);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.weekly", indexReader7, 100, postingsEnum9, postingsEnum10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests12.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule13;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule13;
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.outerRule(testRule13);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests17.ruleChain;
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.outerRule(testRule18);
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain19);
        org.junit.rules.RuleChain ruleChain21 = ruleChain16.around((org.junit.rules.TestRule) ruleChain20);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) ruleChain16, (java.lang.Object) 0L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
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
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests52.tearDown();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        kuromojiAnalysisTests52.assertTermsEquals("tests.failfast", indexReader55, terms56, terms57, false);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests52.assertDocsSkippingEquals("tests.nightly", indexReader61, (int) (byte) -1, postingsEnum63, postingsEnum64, false);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        kuromojiAnalysisTests52.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader68, (int) (short) -1, postingsEnum70, postingsEnum71);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests74 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule75 = kuromojiAnalysisTests74.ruleChain;
        kuromojiAnalysisTests74.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests74);
        org.junit.rules.RuleChain ruleChain78 = kuromojiAnalysisTests74.failureAndSuccessEvents;
        kuromojiAnalysisTests52.failureAndSuccessEvents = ruleChain78;
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        kuromojiAnalysisTests52.assertDocsSkippingEquals("tests.badapples", indexReader81, 0, postingsEnum83, postingsEnum84, true);
        kuromojiAnalysisTests52.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain17, (java.lang.Object) kuromojiAnalysisTests52);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests89 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule90 = kuromojiAnalysisTests89.ruleChain;
        org.junit.rules.RuleChain ruleChain91 = org.junit.rules.RuleChain.outerRule(testRule90);
        org.junit.rules.RuleChain ruleChain92 = ruleChain17.around(testRule90);
        org.junit.rules.RuleChain ruleChain93 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain93);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray6, byteArray10);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray16, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray16);
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray10);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray28, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray1, byteArray32);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        short[] shortArray1 = new short[] { (byte) 100 };
        short[] shortArray3 = new short[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
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
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray4, (java.lang.Object) "<unknown>");
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals(intArray38, intArray41);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray38, (java.lang.Object) 100.0d);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray50, intArray51);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray54, intArray55);
        org.junit.Assert.assertArrayEquals(intArray51, intArray54);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray51, (java.lang.Object) 100.0d);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray61, intArray62);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray51, intArray61);
        org.junit.Assert.assertArrayEquals("random", intArray38, intArray51);
        org.junit.Assert.assertArrayEquals(intArray4, intArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray51);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
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
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", 0, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray17 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray27 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray34 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray27, floatArray34, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray34, 1.0f);
        float[] floatArray46 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray53 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray46, floatArray53, (float) (byte) 100);
        float[] floatArray63 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray70 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray70, (float) (byte) 100);
        float[] floatArray80 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray87 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray80, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray87, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray87, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray53, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray2, floatArray53, (float) (byte) 100);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.lang.Iterable[] iterableArray11 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray12 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray11;
        serializableIterableArray12[0] = serializableSet3;
        serializableIterableArray12[1] = serializableSet5;
        serializableIterableArray12[2] = serializableSet7;
        serializableIterableArray12[3] = serializableSet9;
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        java.lang.Iterable[] iterableArray30 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray31 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray30;
        serializableIterableArray31[0] = serializableSet22;
        serializableIterableArray31[1] = serializableSet24;
        serializableIterableArray31[2] = serializableSet26;
        serializableIterableArray31[3] = serializableSet28;
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        java.lang.Iterable[] iterableArray49 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray50 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray49;
        serializableIterableArray50[0] = serializableSet41;
        serializableIterableArray50[1] = serializableSet43;
        serializableIterableArray50[2] = serializableSet45;
        serializableIterableArray50[3] = serializableSet47;
        java.lang.Iterable[][] iterableArray60 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][] serializableIterableArray61 = (java.lang.Iterable<java.io.Serializable>[][]) iterableArray60;
        serializableIterableArray61[0] = serializableIterableArray12;
        serializableIterableArray61[1] = serializableIterableArray31;
        serializableIterableArray61[2] = serializableIterableArray50;
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, serializableIterableArray61);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertNotEquals((java.lang.Object) 2, (java.lang.Object) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet79 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray78);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray78, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) serializableArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray75);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        float[] floatArray8 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray15 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray25 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray32 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray25, floatArray32, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray32, 1.0f);
        float[] floatArray44 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray51 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray44, floatArray51, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray15, floatArray44, (float) (short) 10);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.junit.rules.TestRule testRule0 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule0;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule0);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (short) 10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((-1));
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests14.ruleChain;
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests14);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests14.assertTermsEquals("random", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray30, intArray31);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray34, intArray35);
        org.junit.Assert.assertArrayEquals(intArray31, intArray34);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray31, (java.lang.Object) 100.0d);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray43, intArray44);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray47, intArray48);
        org.junit.Assert.assertArrayEquals(intArray44, intArray47);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray44, (java.lang.Object) 100.0d);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray54, intArray55);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray44, intArray54);
        org.junit.Assert.assertArrayEquals("random", intArray31, intArray44);
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain26, (java.lang.Object) intArray59);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests62.tearDown();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        kuromojiAnalysisTests62.assertTermsEquals("tests.failfast", indexReader65, terms66, terms67, false);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        kuromojiAnalysisTests62.assertTermsEquals("", indexReader71, terms72, terms73, false);
        org.junit.rules.RuleChain ruleChain76 = kuromojiAnalysisTests62.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain77 = ruleChain26.around((org.junit.rules.TestRule) ruleChain76);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain76;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain76);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, 100L);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
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
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray30);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) executorServiceArray45);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray55, (java.lang.Object[]) serializableArray57);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray52, (java.lang.Object[]) serializableArray57);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray49);
        java.lang.Object[] objArray64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray2, objArray64);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 5, (long) 2);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
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
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray34, intArray35);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray38, intArray39);
        org.junit.Assert.assertArrayEquals(intArray35, intArray38);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray35, (java.lang.Object) 100.0d);
        org.junit.Assert.assertArrayEquals(intArray17, intArray35);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray49, intArray50);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray50, intArray53);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray50, (java.lang.Object) 100.0d);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray62, intArray63);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray66, intArray67);
        org.junit.Assert.assertArrayEquals(intArray63, intArray66);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray63, (java.lang.Object) 100.0d);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray73, intArray74);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray63, intArray73);
        org.junit.Assert.assertArrayEquals("random", intArray50, intArray63);
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray78);
        int[] intArray81 = new int[] {};
        int[] intArray82 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray81, intArray82);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray63, intArray82);
        org.junit.Assert.assertArrayEquals(intArray17, intArray63);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests87 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests87.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests87, (java.lang.Object) "");
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        kuromojiAnalysisTests87.assertDocsEnumEquals("tests.nightly", postingsEnum92, postingsEnum93, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray17, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
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
        kuromojiAnalysisTests5.ensureCleanedUp();
        kuromojiAnalysisTests5.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.slow", postingsEnum10, postingsEnum11, false);
        java.lang.Object obj14 = null;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, obj14);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 2, 0.0d, (double) '4');
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
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
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) 'a', postingsEnum16, postingsEnum17);
        java.lang.Class<?> wildcardClass19 = kuromojiAnalysisTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass19);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.lang.Iterable[] iterableArray11 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray12 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray11;
        serializableIterableArray12[0] = serializableSet3;
        serializableIterableArray12[1] = serializableSet5;
        serializableIterableArray12[2] = serializableSet7;
        serializableIterableArray12[3] = serializableSet9;
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        java.lang.Iterable[] iterableArray30 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray31 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray30;
        serializableIterableArray31[0] = serializableSet22;
        serializableIterableArray31[1] = serializableSet24;
        serializableIterableArray31[2] = serializableSet26;
        serializableIterableArray31[3] = serializableSet28;
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        java.lang.Iterable[] iterableArray49 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray50 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray49;
        serializableIterableArray50[0] = serializableSet41;
        serializableIterableArray50[1] = serializableSet43;
        serializableIterableArray50[2] = serializableSet45;
        serializableIterableArray50[3] = serializableSet47;
        java.lang.Iterable[][] iterableArray60 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][] serializableIterableArray61 = (java.lang.Iterable<java.io.Serializable>[][]) iterableArray60;
        serializableIterableArray61[0] = serializableIterableArray12;
        serializableIterableArray61[1] = serializableIterableArray31;
        serializableIterableArray61[2] = serializableIterableArray50;
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, serializableIterableArray61);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        java.io.Serializable[] serializableArray73 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet74 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray73);
        java.io.Serializable[] serializableArray76 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet77 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray76);
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet79 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray78);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray76, (java.lang.Object[]) serializableArray78);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray73, (java.lang.Object[]) serializableArray78);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray70, (java.lang.Object[]) serializableArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) serializableIterableArray61, (java.lang.Object[]) serializableArray78);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
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
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) 'a', postingsEnum16, postingsEnum17);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("europarl.lines.txt.gz");
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray31);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) executorServiceArray46);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray56, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray53, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) executorServiceArray64);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests67 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests67.tearDown();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        kuromojiAnalysisTests67.assertTermsEquals("tests.failfast", indexReader70, terms71, terms72, false);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        kuromojiAnalysisTests67.assertDocsSkippingEquals("tests.nightly", indexReader76, (int) (byte) -1, postingsEnum78, postingsEnum79, false);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) serializableArray26, (java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) serializableArray26);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) (short) 1, (float) (-1L), (float) 1L);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 3, (double) (short) 100, (double) 10L);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray11, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray11, byteArray15);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray21, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray21);
        org.junit.Assert.assertArrayEquals("", byteArray8, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray5, byteArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray1, byteArray15);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1.0f), 0.0d, (double) '#');
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1L), (long) (short) 0);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) '#', (long) (short) -1);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (byte) 1, (float) '4', (float) 5);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
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
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.weekly", (int) ' ', numericDocValues40, numericDocValues41);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals("random", charArray4, charArray11);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray11, charArray19);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray32, charArray35);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray39, charArray42);
        org.junit.Assert.assertArrayEquals("random", charArray32, charArray39);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray27, charArray39);
        org.junit.Assert.assertArrayEquals(charArray11, charArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) charArray27);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) '#', (double) (byte) 0, (double) 'a');
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
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
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests1.ruleChain;
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) executorServiceArray22);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) executorServiceArray22);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.monster", postingsEnum10, postingsEnum11, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray17, (java.lang.Object[]) executorServiceArray22);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) executorServiceArray22);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.awaitsfix");
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("random", 4, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 0, 0.0d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 100, (float) 5, 10.0f);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 10.0d, (double) 10L);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
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
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '4');
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("hi!", (int) (short) 0, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
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
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests39.tearDown();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests39.assertTermsEquals("tests.failfast", indexReader42, terms43, terms44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests39.assertDocsSkippingEquals("tests.nightly", indexReader48, (int) (byte) -1, postingsEnum50, postingsEnum51, false);
        org.junit.rules.RuleChain ruleChain54 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests39.assertPositionsSkippingEquals("hi!", indexReader56, 4, postingsEnum58, postingsEnum59);
        kuromojiAnalysisTests39.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests39);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray10);
        long[] longArray15 = new long[] { (byte) 0 };
        long[] longArray17 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        long[] longArray20 = new long[] { (byte) 0 };
        long[] longArray22 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray20, longArray22);
        org.junit.Assert.assertArrayEquals(longArray15, longArray22);
        long[] longArray26 = new long[] { (byte) 0 };
        long[] longArray28 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray26, longArray28);
        long[] longArray31 = new long[] { (byte) 0 };
        long[] longArray33 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray31, longArray33);
        org.junit.Assert.assertArrayEquals(longArray26, longArray33);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray15, longArray26);
        org.junit.Assert.assertArrayEquals(longArray10, longArray15);
        long[] longArray39 = new long[] { (byte) 0 };
        long[] longArray41 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray39, longArray41);
        long[] longArray44 = new long[] { (byte) 0 };
        long[] longArray46 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray44, longArray46);
        org.junit.Assert.assertArrayEquals(longArray39, longArray46);
        org.junit.Assert.assertArrayEquals(longArray10, longArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) longArray39);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (short) -1, (double) 5);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 0, (double) (short) 1);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        float[] floatArray9 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray16 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray33 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray33, 1.0f);
        float[] floatArray45 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray52 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray45, floatArray52, (float) (byte) 100);
        float[] floatArray62 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray69 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray62, floatArray69, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray69, 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray16, floatArray69, (float) (-1));
        float[] floatArray77 = new float[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray16, floatArray77, (float) (short) 10);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
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
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain16);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) ruleChain16, (java.lang.Object) serializableArray22);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (-1L));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        short[] shortArray0 = null;
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray2);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) (short) -1, (double) 1, (double) (short) 10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
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
        kuromojiAnalysisTests1.setUp();
        java.lang.Object obj38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) kuromojiAnalysisTests1, obj38);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 100L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray7);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests11.ruleChain;
        kuromojiAnalysisTests11.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests11.tearDown();
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests31.ruleChain;
        kuromojiAnalysisTests31.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests31);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests31.assertTermsEquals("random", indexReader36, terms37, terms38, false);
        org.junit.rules.RuleChain ruleChain41 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement42 = null;
        org.junit.runner.Description description43 = null;
        org.junit.runners.model.Statement statement44 = ruleChain41.apply(statement42, description43);
        org.junit.runner.Description description45 = null;
        org.junit.runners.model.Statement statement46 = ruleChain26.apply(statement44, description45);
        kuromojiAnalysisTests11.failureAndSuccessEvents = ruleChain26;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.tearDown();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        kuromojiAnalysisTests48.assertTermsEquals("tests.failfast", indexReader51, terms52, terms53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        kuromojiAnalysisTests48.assertDocsSkippingEquals("tests.nightly", indexReader57, (int) (byte) -1, postingsEnum59, postingsEnum60, false);
        org.junit.rules.RuleChain ruleChain63 = kuromojiAnalysisTests48.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule64 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule64;
        org.junit.rules.RuleChain ruleChain66 = ruleChain63.around(testRule64);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule69 = kuromojiAnalysisTests68.ruleChain;
        kuromojiAnalysisTests68.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests68);
        org.junit.rules.RuleChain ruleChain72 = kuromojiAnalysisTests68.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule73 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain74 = org.junit.rules.RuleChain.outerRule(testRule73);
        org.junit.rules.RuleChain[] ruleChainArray75 = new org.junit.rules.RuleChain[] { ruleChain63, ruleChain72, ruleChain74 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet76 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray75);
        java.util.Set<org.junit.rules.TestRule> testRuleSet77 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray75);
        java.util.Set<java.lang.Object> objSet78 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) ruleChainArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests11, (java.lang.Object) ruleChainArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) ruleChainArray75);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (byte) 10, (double) 10L, (double) 0);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (-1));
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests9.assertTermsEquals("tests.failfast", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("tests.nightly", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader25, (int) (short) -1, postingsEnum27, postingsEnum28);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests31.ruleChain;
        kuromojiAnalysisTests31.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests31);
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain35;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("tests.badapples", indexReader38, 0, postingsEnum40, postingsEnum41, true);
        kuromojiAnalysisTests9.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        kuromojiAnalysisTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader46, fields47, fields48, false);
        kuromojiAnalysisTests9.setUp();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        kuromojiAnalysisTests9.assertPathHasBeenCleared("tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests9);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
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
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) '4');
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray23, (double) 4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) 4);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 10, (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        float[] floatArray0 = null;
        float[] floatArray8 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray15 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray25 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray32 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray25, floatArray32, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray32, 1.0f);
        float[] floatArray44 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray51 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray44, floatArray51, (float) (byte) 100);
        float[] floatArray61 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray68 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray61, floatArray68, (float) (byte) 100);
        float[] floatArray78 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray85 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray78, floatArray85, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray85, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray85, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray51, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray51, 100.0f);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 'a', (float) (-1L), (float) 10);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet5 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray4);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet9 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.tearDown();
        kuromojiAnalysisTests11.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests11.tearDown();
        kuromojiAnalysisTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests11.assertPositionsSkippingEquals("tests.nightly", indexReader17, (int) ' ', postingsEnum19, postingsEnum20);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray4, (java.lang.Object) kuromojiAnalysisTests11);
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
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests23.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader39, (int) (short) -1, postingsEnum41, postingsEnum42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule46 = kuromojiAnalysisTests45.ruleChain;
        kuromojiAnalysisTests45.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests45);
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests45.failureAndSuccessEvents;
        kuromojiAnalysisTests23.failureAndSuccessEvents = ruleChain49;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests23.assertDocsSkippingEquals("tests.badapples", indexReader52, 0, postingsEnum54, postingsEnum55, true);
        kuromojiAnalysisTests23.ensureCheckIndexPassed();
        kuromojiAnalysisTests23.ensureCheckIndexPassed();
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests11, (java.lang.Object) kuromojiAnalysisTests23);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray68);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray66, (java.lang.Object[]) serializableArray68);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) serializableArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests11, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        long[] longArray6 = new long[] { (-1), (byte) 100, (byte) 0, (short) 100, 'a', (byte) 100 };
        long[] longArray10 = new long[] { (byte) 0 };
        long[] longArray12 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray10, longArray12);
        long[] longArray15 = new long[] { (byte) 0 };
        long[] longArray17 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        org.junit.Assert.assertArrayEquals("", longArray10, longArray17);
        long[] longArray22 = new long[] { (byte) 0 };
        long[] longArray24 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray22, longArray24);
        long[] longArray27 = new long[] { (byte) 0 };
        long[] longArray29 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray27, longArray29);
        org.junit.Assert.assertArrayEquals("", longArray22, longArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray10, longArray29);
        long[] longArray35 = new long[] { (byte) 0 };
        long[] longArray37 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray35, longArray37);
        long[] longArray42 = new long[] { (byte) 0 };
        long[] longArray44 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray42, longArray44);
        long[] longArray47 = new long[] { (byte) 0 };
        long[] longArray49 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray47, longArray49);
        org.junit.Assert.assertArrayEquals("", longArray42, longArray49);
        long[] longArray54 = new long[] { (byte) 0 };
        long[] longArray56 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray54, longArray56);
        long[] longArray59 = new long[] { (byte) 0 };
        long[] longArray61 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray59, longArray61);
        org.junit.Assert.assertArrayEquals("", longArray54, longArray61);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray42, longArray61);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray35, longArray42);
        org.junit.Assert.assertArrayEquals(longArray10, longArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray42);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        long[] longArray4 = new long[] { (byte) -1, (-1L), 10L, (-1) };
        long[] longArray7 = new long[] { (byte) 0 };
        long[] longArray9 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray7, longArray9);
        long[] longArray12 = new long[] { (byte) 0 };
        long[] longArray14 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray12, longArray14);
        org.junit.Assert.assertArrayEquals(longArray7, longArray14);
        long[] longArray19 = new long[] { (byte) 0 };
        long[] longArray21 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray19, longArray21);
        long[] longArray24 = new long[] { (byte) 0 };
        long[] longArray26 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray24, longArray26);
        org.junit.Assert.assertArrayEquals(longArray19, longArray26);
        long[] longArray30 = new long[] { (byte) 0 };
        long[] longArray32 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray30, longArray32);
        long[] longArray35 = new long[] { (byte) 0 };
        long[] longArray37 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray35, longArray37);
        org.junit.Assert.assertArrayEquals(longArray30, longArray37);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray19, longArray30);
        org.junit.Assert.assertArrayEquals(longArray14, longArray30);
        long[] longArray43 = new long[] { (byte) 0 };
        long[] longArray45 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        long[] longArray48 = new long[] { (byte) 0 };
        long[] longArray50 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray48, longArray50);
        org.junit.Assert.assertArrayEquals(longArray43, longArray50);
        long[] longArray55 = new long[] { (byte) 0 };
        long[] longArray57 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray55, longArray57);
        long[] longArray60 = new long[] { (byte) 0 };
        long[] longArray62 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray60, longArray62);
        org.junit.Assert.assertArrayEquals(longArray55, longArray62);
        long[] longArray66 = new long[] { (byte) 0 };
        long[] longArray68 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray66, longArray68);
        long[] longArray71 = new long[] { (byte) 0 };
        long[] longArray73 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray71, longArray73);
        org.junit.Assert.assertArrayEquals(longArray66, longArray73);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray55, longArray66);
        org.junit.Assert.assertArrayEquals(longArray50, longArray66);
        org.junit.Assert.assertArrayEquals("hi!", longArray30, longArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray66);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.slow", "tests.failfast", "tests.slow" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray17);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) serializableArray9);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
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
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray53, (java.lang.Object[]) serializableArray55);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray55);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet66 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray65);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) serializableArray65);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray60);
        java.io.Serializable[] serializableArray71 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray71);
        java.io.Serializable[] serializableArray73 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet74 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray73);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray71, (java.lang.Object[]) serializableArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray71);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) serializableArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray6);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray13 = new java.util.concurrent.ExecutorService[][] { executorServiceArray11, executorServiceArray12 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 'a', (-1.0d));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 2);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 0L, (double) 1L);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
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
        java.lang.String str36 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum39, postingsEnum40);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.monster", postingsEnum10, postingsEnum11, true);
        java.lang.String str14 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.emptyRuleChain();
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests32.ruleChain;
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests32);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests32.assertTermsEquals("random", indexReader37, terms38, terms39, false);
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement43 = null;
        org.junit.runner.Description description44 = null;
        org.junit.runners.model.Statement statement45 = ruleChain42.apply(statement43, description44);
        org.junit.runner.Description description46 = null;
        org.junit.runners.model.Statement statement47 = ruleChain27.apply(statement45, description46);
        org.junit.runner.Description description48 = null;
        org.junit.runners.model.Statement statement49 = ruleChain15.apply(statement45, description48);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests50.tearDown();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        kuromojiAnalysisTests50.assertTermsEquals("tests.failfast", indexReader53, terms54, terms55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        kuromojiAnalysisTests50.assertDocsSkippingEquals("tests.nightly", indexReader59, (int) (byte) -1, postingsEnum61, postingsEnum62, false);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        kuromojiAnalysisTests50.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader66, (int) (short) -1, postingsEnum68, postingsEnum69);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests72 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule73 = kuromojiAnalysisTests72.ruleChain;
        kuromojiAnalysisTests72.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests72);
        org.junit.rules.RuleChain ruleChain76 = kuromojiAnalysisTests72.failureAndSuccessEvents;
        kuromojiAnalysisTests50.failureAndSuccessEvents = ruleChain76;
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        kuromojiAnalysisTests50.assertDocsSkippingEquals("tests.badapples", indexReader79, 0, postingsEnum81, postingsEnum82, true);
        kuromojiAnalysisTests50.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain15, (java.lang.Object) kuromojiAnalysisTests50);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests87 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule88 = kuromojiAnalysisTests87.ruleChain;
        org.junit.rules.RuleChain ruleChain89 = org.junit.rules.RuleChain.outerRule(testRule88);
        org.junit.rules.RuleChain ruleChain90 = ruleChain15.around(testRule88);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain90;
        kuromojiAnalysisTests1.assertPathHasBeenCleared("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
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
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) '4');
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray5, (double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray5);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100L, (double) 4);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule1;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule1;
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.outerRule(testRule1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule6 = kuromojiAnalysisTests5.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.outerRule(testRule6);
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain7);
        org.junit.rules.RuleChain ruleChain9 = ruleChain4.around((org.junit.rules.TestRule) ruleChain8);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests11.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("tests.nightly", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("random", indexReader27, (int) ' ', postingsEnum29, postingsEnum30, true);
        kuromojiAnalysisTests11.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain9, (java.lang.Object) kuromojiAnalysisTests11);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 2, (long) (short) 100);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 0, (double) 4);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.lang.Iterable[] iterableArray9 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray10 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray9;
        serializableIterableArray10[0] = serializableSet5;
        serializableIterableArray10[1] = serializableSet7;
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableIterableArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) serializableIterableArray10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.slow", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) 'a', numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
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
        kuromojiAnalysisTests2.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests20.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("enwiki.random.lines.txt", indexReader23, fields24, fields25, true);
        kuromojiAnalysisTests20.setUp();
        kuromojiAnalysisTests20.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests20.resetCheckIndexStatus();
        kuromojiAnalysisTests20.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests20.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests20.assertDocsEnumEquals("<unknown>", postingsEnum36, postingsEnum37, true);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests20.assertDocsEnumEquals("tests.failfast", postingsEnum41, postingsEnum42, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 0L);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 5, (double) (short) 10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 1, (long) 'a');
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), (float) 1L, (float) (byte) 1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
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
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) 'a', postingsEnum16, postingsEnum17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests20.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests20.assertTermsEquals("tests.failfast", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests20.assertDocsSkippingEquals("tests.nightly", indexReader29, (int) (byte) -1, postingsEnum31, postingsEnum32, false);
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures36);
        org.junit.rules.RuleChain ruleChain38 = ruleChain35.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling40 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet42 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray41);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling44 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet46 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray41, (java.lang.Object[]) throttlingArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain35, (java.lang.Object) throttlingArray45);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain35);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain35;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain35;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum53, postingsEnum54);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray2);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray14);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) executorServiceArray29);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) serializableArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) serializableArray9);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
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
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain42);
        org.junit.rules.RuleChain ruleChain44 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray46, throttlingArray47, throttlingArray48, throttlingArray49, throttlingArray50 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray52 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray57 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray52, throttlingArray53, throttlingArray54, throttlingArray55, throttlingArray56 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray58 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray62 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray63 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray58, throttlingArray59, throttlingArray60, throttlingArray61, throttlingArray62 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray51, throttlingArray57, throttlingArray63 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList65 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, throttlingArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain44, (java.lang.Object) throttlingArrayList65);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 1, 0L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (long) (short) 0, (long) (short) 0);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet8 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.tearDown();
        kuromojiAnalysisTests10.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests10.tearDown();
        kuromojiAnalysisTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests10.assertPositionsSkippingEquals("tests.nightly", indexReader16, (int) ' ', postingsEnum18, postingsEnum19);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray3, (java.lang.Object) kuromojiAnalysisTests10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests22.assertTermsEquals("tests.failfast", indexReader25, terms26, terms27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests22.assertDocsSkippingEquals("tests.nightly", indexReader31, (int) (byte) -1, postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, (int) (short) -1, postingsEnum40, postingsEnum41);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests44.ruleChain;
        kuromojiAnalysisTests44.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests44);
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests44.failureAndSuccessEvents;
        kuromojiAnalysisTests22.failureAndSuccessEvents = ruleChain48;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests22.assertDocsSkippingEquals("tests.badapples", indexReader51, 0, postingsEnum53, postingsEnum54, true);
        kuromojiAnalysisTests22.ensureCheckIndexPassed();
        kuromojiAnalysisTests22.ensureCheckIndexPassed();
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests10, (java.lang.Object) kuromojiAnalysisTests22);
        kuromojiAnalysisTests10.ensureCleanedUp();
        kuromojiAnalysisTests10.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests10);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray15);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray15);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) serializableArray7);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray4);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray1, (java.lang.Object) executorServiceArray4);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.Object[] objArray25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, objArray25);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        long[] longArray4 = new long[] { (byte) 0 };
        long[] longArray6 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
        long[] longArray9 = new long[] { (byte) 0 };
        long[] longArray11 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals("", longArray4, longArray11);
        long[] longArray16 = new long[] { (byte) 0 };
        long[] longArray18 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray16, longArray18);
        long[] longArray21 = new long[] { (byte) 0 };
        long[] longArray23 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray21, longArray23);
        org.junit.Assert.assertArrayEquals(longArray16, longArray23);
        long[] longArray28 = new long[] { (byte) 0 };
        long[] longArray30 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray28, longArray30);
        long[] longArray33 = new long[] { (byte) 0 };
        long[] longArray35 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray33, longArray35);
        org.junit.Assert.assertArrayEquals(longArray28, longArray35);
        long[] longArray39 = new long[] { (byte) 0 };
        long[] longArray41 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray39, longArray41);
        long[] longArray44 = new long[] { (byte) 0 };
        long[] longArray46 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray44, longArray46);
        org.junit.Assert.assertArrayEquals(longArray39, longArray46);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray28, longArray39);
        org.junit.Assert.assertArrayEquals(longArray23, longArray39);
        long[] longArray52 = new long[] { (byte) 0 };
        long[] longArray54 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray52, longArray54);
        long[] longArray57 = new long[] { (byte) 0 };
        long[] longArray59 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray57, longArray59);
        org.junit.Assert.assertArrayEquals(longArray52, longArray59);
        long[] longArray64 = new long[] { (byte) 0 };
        long[] longArray66 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray64, longArray66);
        long[] longArray69 = new long[] { (byte) 0 };
        long[] longArray71 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray69, longArray71);
        org.junit.Assert.assertArrayEquals(longArray64, longArray71);
        long[] longArray75 = new long[] { (byte) 0 };
        long[] longArray77 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray75, longArray77);
        long[] longArray80 = new long[] { (byte) 0 };
        long[] longArray82 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray80, longArray82);
        org.junit.Assert.assertArrayEquals(longArray75, longArray82);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray64, longArray75);
        org.junit.Assert.assertArrayEquals(longArray59, longArray75);
        org.junit.Assert.assertArrayEquals("hi!", longArray39, longArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray4, longArray39);
        long[] longArray89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray39, longArray89);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        int[] intArray4 = new int[] { 0, ' ', 1 };
        int[] intArray8 = new int[] { 0, ' ', 1 };
        int[][] intArray9 = new int[][] { intArray4, intArray8 };
        int[] intArray13 = new int[] { 0, ' ', 1 };
        int[] intArray17 = new int[] { 0, ' ', 1 };
        int[][] intArray18 = new int[][] { intArray13, intArray17 };
        int[][][] intArray19 = new int[][][] { intArray9, intArray18 };
        java.util.Set<int[][]> intArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(intArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) intArray19, (java.lang.Object[]) executorServiceArray22);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests14.ruleChain;
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests14);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests14.assertTermsEquals("random", indexReader19, terms20, terms21, false);
        org.junit.rules.RuleChain ruleChain24 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement25 = null;
        org.junit.runner.Description description26 = null;
        org.junit.runners.model.Statement statement27 = ruleChain24.apply(statement25, description26);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests29.ruleChain;
        kuromojiAnalysisTests29.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests29);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        kuromojiAnalysisTests29.assertTermsEquals("random", indexReader34, terms35, terms36, false);
        org.junit.rules.RuleChain ruleChain39 = kuromojiAnalysisTests29.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement40 = null;
        org.junit.runner.Description description41 = null;
        org.junit.runners.model.Statement statement42 = ruleChain39.apply(statement40, description41);
        org.junit.runner.Description description43 = null;
        org.junit.runners.model.Statement statement44 = ruleChain24.apply(statement42, description43);
        org.junit.runner.Description description45 = null;
        org.junit.runners.model.Statement statement46 = ruleChain12.apply(statement42, description45);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests47.tearDown();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        kuromojiAnalysisTests47.assertTermsEquals("tests.failfast", indexReader50, terms51, terms52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests47.assertDocsSkippingEquals("tests.nightly", indexReader56, (int) (byte) -1, postingsEnum58, postingsEnum59, false);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        kuromojiAnalysisTests47.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader63, (int) (short) -1, postingsEnum65, postingsEnum66);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests69 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule70 = kuromojiAnalysisTests69.ruleChain;
        kuromojiAnalysisTests69.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests69);
        org.junit.rules.RuleChain ruleChain73 = kuromojiAnalysisTests69.failureAndSuccessEvents;
        kuromojiAnalysisTests47.failureAndSuccessEvents = ruleChain73;
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        kuromojiAnalysisTests47.assertDocsSkippingEquals("tests.badapples", indexReader76, 0, postingsEnum78, postingsEnum79, true);
        kuromojiAnalysisTests47.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain12, (java.lang.Object) kuromojiAnalysisTests47);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests84 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule85 = kuromojiAnalysisTests84.ruleChain;
        org.junit.rules.RuleChain ruleChain86 = org.junit.rules.RuleChain.outerRule(testRule85);
        org.junit.rules.RuleChain ruleChain87 = ruleChain12.around(testRule85);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain12;
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum92, postingsEnum93);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) statement84);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0L, (long) ' ');
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader10, terms11, terms12, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms12);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        java.io.Serializable[] serializableArray0 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet1 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray0);
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.lang.Iterable[] iterableArray5 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray6 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray5;
        serializableIterableArray6[0] = serializableSet1;
        serializableIterableArray6[1] = serializableSet3;
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableIterableArray6);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableIterableArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray23, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray20, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) serializableArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray44);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray52, (java.lang.Object[]) serializableArray54);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray54);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray49);
        java.io.Serializable[] serializableArray61 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet62 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray61);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray64, (java.lang.Object[]) serializableArray66);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray61, (java.lang.Object[]) serializableArray66);
        java.io.Serializable[] serializableArray71 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray71);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet75 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray74);
        java.io.Serializable[] serializableArray76 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet77 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray76);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray74, (java.lang.Object[]) serializableArray76);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray71, (java.lang.Object[]) serializableArray76);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray61, (java.lang.Object[]) serializableArray71);
        java.io.Serializable[] serializableArray82 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet83 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray82);
        java.io.Serializable[] serializableArray84 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet85 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray84);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray82, (java.lang.Object[]) serializableArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray61, (java.lang.Object[]) serializableArray82);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) serializableArray82);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) serializableArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableIterableArray6, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
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
        kuromojiAnalysisTests1.assertPathHasBeenCleared("random");
        kuromojiAnalysisTests1.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests21.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests21.assertDocsEnumEquals("<unknown>", postingsEnum26, postingsEnum27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("hi!", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests21.assertDocsEnumEquals("random", postingsEnum37, postingsEnum38, false);
        kuromojiAnalysisTests21.ensureCleanedUp();
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule42);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) (short) 1, (float) (short) 100, (float) (byte) 10);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1.0f, (double) (short) 100, (double) 'a');
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule5 = kuromojiAnalysisTests4.ruleChain;
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.outerRule(testRule5);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray2, (java.lang.Object) testRule5);
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.outerRule(testRule5);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray13, intArray14);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray17, intArray18);
        org.junit.Assert.assertArrayEquals(intArray14, intArray17);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray14, (java.lang.Object) 100.0d);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray26, intArray27);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray30, intArray31);
        org.junit.Assert.assertArrayEquals(intArray27, intArray30);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray27, (java.lang.Object) 100.0d);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray27, intArray37);
        org.junit.Assert.assertArrayEquals("random", intArray14, intArray27);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray44, intArray45);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray48, intArray49);
        org.junit.Assert.assertArrayEquals(intArray45, intArray48);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray45, (java.lang.Object) 100.0d);
        org.junit.Assert.assertArrayEquals(intArray27, intArray45);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray56, intArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray27, intArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) ruleChain8, (java.lang.Object) intArray27);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, 0L);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray11);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray17, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray17);
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray2);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (-1));
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests9.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, true);
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests9.assertTermsEquals("tests.slow", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests9.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests9.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests9);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
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
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (short) -1);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
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
        org.junit.Assert.assertNotEquals((java.lang.Object) 2, (java.lang.Object) serializableArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) executorServiceArray27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests30.tearDown();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests30.assertFieldsEquals("enwiki.random.lines.txt", indexReader33, fields34, fields35, true);
        kuromojiAnalysisTests30.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        kuromojiAnalysisTests30.assertTermsEquals("tests.slow", indexReader40, terms41, terms42, false);
        kuromojiAnalysisTests30.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests30.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) serializableArray15, (java.lang.Object) kuromojiAnalysisTests30);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) (byte) 10, (float) 0L, (-1.0f));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
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
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 100.0d, (double) (short) 10, (double) (short) 0);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("<unknown>", true);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '4');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) '4');
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray12, (double) (byte) -1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) '4');
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray23, (double) (short) 10);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) '4');
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray33, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray23, doubleArray28, (double) 4);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) '4');
        double[] doubleArray44 = new double[] {};
        double[] doubleArray45 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray45, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray45, (double) (byte) -1);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray50, (double) 2);
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray57, (double) '4');
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray61, (double) (byte) -1);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray66, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray57, (double) (short) 0);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray50, (double) (-1L));
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray50, (double) 3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests78 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule79 = kuromojiAnalysisTests78.ruleChain;
        kuromojiAnalysisTests78.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests78.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests78, (java.lang.Object) (-1));
        kuromojiAnalysisTests78.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        kuromojiAnalysisTests78.assertDocsSkippingEquals("hi!", indexReader86, (int) '4', postingsEnum88, postingsEnum89, false);
        kuromojiAnalysisTests78.ensureCleanedUp();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) doubleArray8, (java.lang.Object) kuromojiAnalysisTests78);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray8, (double) (-1.0f));
        double[] doubleArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray96, (double) (byte) 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '4');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) (byte) -1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) '4');
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray18, (double) (short) 10);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) '4');
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray28, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray18, doubleArray23, (double) 4);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) '4');
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray40, (double) (byte) -1);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray45, (double) 2);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) '4');
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray56, (double) (byte) -1);
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray61, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray52, (double) (short) 0);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray45, (double) (-1L));
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray45, (double) 3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests73 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule74 = kuromojiAnalysisTests73.ruleChain;
        kuromojiAnalysisTests73.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests73.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests73, (java.lang.Object) (-1));
        kuromojiAnalysisTests73.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        kuromojiAnalysisTests73.assertDocsSkippingEquals("hi!", indexReader81, (int) '4', postingsEnum83, postingsEnum84, false);
        kuromojiAnalysisTests73.ensureCleanedUp();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) doubleArray3, (java.lang.Object) kuromojiAnalysisTests73);
        org.junit.rules.TestRule testRule89 = org.apache.lucene.util.LuceneTestCase.classRules;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests73, (java.lang.Object) testRule89);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (short) 1);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 100L, (long) (byte) 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain15);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, 0.0d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 1.0f, (float) ' ', (float) 0L);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule5 = kuromojiAnalysisTests4.ruleChain;
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests4);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests4.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.tearDown();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.failfast", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("tests.nightly", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (short) -1, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule37 = kuromojiAnalysisTests36.ruleChain;
        kuromojiAnalysisTests36.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests36);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        kuromojiAnalysisTests14.failureAndSuccessEvents = ruleChain40;
        kuromojiAnalysisTests4.failureAndSuccessEvents = ruleChain40;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests4.assertPositionsSkippingEquals("tests.monster", indexReader44, (int) (byte) 1, postingsEnum46, postingsEnum47);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests49.tearDown();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        kuromojiAnalysisTests49.assertFieldsEquals("enwiki.random.lines.txt", indexReader52, fields53, fields54, true);
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests49.assertDocsEnumEquals("tests.monster", postingsEnum58, postingsEnum59, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests62.tearDown();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        kuromojiAnalysisTests62.assertFieldsEquals("enwiki.random.lines.txt", indexReader65, fields66, fields67, true);
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests62.assertDocsEnumEquals("tests.monster", postingsEnum71, postingsEnum72, true);
        java.lang.String str75 = kuromojiAnalysisTests62.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray76 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests4, kuromojiAnalysisTests49, kuromojiAnalysisTests62 };
        java.util.List<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsList77 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, kuromojiAnalysisTestsArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray1, (java.lang.Object[]) kuromojiAnalysisTestsArray76);
    }
}

