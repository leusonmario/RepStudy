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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass3 = throttling2.getClass();
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) wildcardClass3);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", 0.0d, 0.0d, 0.0d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), (float) (short) 1, (float) (short) 0);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, (byte) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (byte) 1, (double) 1L, 100.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        char[] charArray1 = new char[] {};
        char[] charArray7 = new char[] { ' ', '4', '4', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray1, charArray7);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) strArray23);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        float[] floatArray3 = new float[] { 1, (short) 100 };
        float[] floatArray4 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray3, floatArray4, (float) (byte) 100);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        int[] intArray6 = new int[] { (byte) -1, 0, 2, 3, (short) -1 };
        int[] intArray9 = new int[] { 3, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray9);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        java.lang.String str10 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str13 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        kuromojiAnalysisTests14.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) str13, (java.lang.Object) kuromojiAnalysisTests14);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, 0.0d, (double) 2);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests10.assertTermsEquals("tests.weekly", indexReader14, terms15, terms16, false);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests10.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) str9, (java.lang.Object) kuromojiAnalysisTests10);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        float[] floatArray3 = new float[] { 0.0f, (short) 100 };
        float[] floatArray4 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray3, floatArray4, (float) 2);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        int[] intArray4 = new int[] { (short) 100, ' ', 2, (short) -1 };
        int[] intArray10 = new int[] { 5, 4, '4', 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) ' ');
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray19, strArray24, strArray29 };
        java.util.List<java.lang.String[]> strArrayList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray30);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) strArrayList31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray8, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) strArray21, (java.lang.Object) 5);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray14);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) 10L, 0.0d);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        long[] longArray3 = new long[] { (short) 10, (byte) -1 };
        long[] longArray8 = new long[] { 1, 10L, (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray8);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) 'a', (float) (byte) 10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.badapples", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray16 = new java.lang.String[] { "random", "enwiki.random.lines.txt", "tests.nightly", "tests.badapples", "hi!", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray16);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0L, (long) 5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        java.lang.Object obj1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClass11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", obj1, (java.lang.Object) wildcardClass11);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 0, (double) 0.0f);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("random", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6, false);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.maxfailures", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.failfast", (int) (short) 100, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        float[] floatArray5 = new float[] { 10.0f, (-1), 0L, (byte) 0 };
        float[] floatArray8 = new float[] { 4, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray5, floatArray8, (-1.0f));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        long[] longArray2 = new long[] { (byte) 100, ' ' };
        long[] longArray9 = new long[] { (byte) 100, (byte) 10, 2, 'a', 10L, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        long[] longArray1 = new long[] {};
        long[] longArray8 = new long[] { (byte) 100, '#', 10, 0, (short) 0, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray1, longArray8);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        char[] charArray1 = new char[] {};
        char[] charArray7 = new char[] { '4', 'a', '4', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray1, charArray7);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        long[] longArray7 = new long[] { '4', (short) 1, (byte) -1, '4', 0L, 1 };
        long[] longArray12 = new long[] { 5, 100, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray7, longArray12);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (-1.0f), (float) (short) 10, (float) (byte) 10);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.failfast", indexReader6, (int) (short) 0, postingsEnum8, postingsEnum9, false);
        java.lang.Object obj12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum9, obj12);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        java.lang.String str10 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain11 = null;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("<unknown>", indexReader14, (int) (byte) 100, postingsEnum16, postingsEnum17, false);
        double[] doubleArray22 = new double[] { (-1.0d) };
        double[] doubleArray24 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray24, (double) 2);
        double[] doubleArray28 = new double[] { (-1.0d) };
        double[] doubleArray30 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray30, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray22, doubleArray28, (double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) indexReader14, (java.lang.Object) (-1.0f));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) "hi!", obj2);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        double[] doubleArray3 = new double[] { (-1.0d) };
        double[] doubleArray5 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) 2);
        double[] doubleArray9 = new double[] { (-1.0d) };
        double[] doubleArray11 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray3, doubleArray9, (double) (-1.0f));
        double[] doubleArray16 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray3, doubleArray16, (double) (short) 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        float[] floatArray6 = new float[] { 5, 100, 0, 0, ' ' };
        float[] floatArray10 = new float[] { 100L, 10L, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray10, (float) 100);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        java.util.Collection[] collectionArray2 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray3 = (java.util.Collection<java.lang.String>[]) collectionArray2;
        java.util.Set<java.util.Collection<java.lang.String>> strCollectionSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.String>[]) collectionArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) collectionArray2, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("", intArray3, intArray6);
        int[] intArray11 = new int[] { 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray11);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        char[] charArray5 = new char[] { '#', ' ', ' ', '4', '#' };
        char[] charArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        float[] floatArray2 = new float[] { (short) 0, (byte) 0 };
        float[] floatArray8 = new float[] { 100L, (byte) 10, 10L, 2, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) (-1));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) boolean11, (java.lang.Object) "");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        float[] floatArray6 = new float[] { (-1L), 1L, 0.0f, (short) -1, 0, 3 };
        float[] floatArray7 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (-1L));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray3 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray3);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.weekly", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        char[] charArray2 = new char[] { '#', ' ' };
        char[] charArray6 = new char[] { '4', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        char[] charArray1 = new char[] {};
        char[] charArray6 = new char[] { 'a', '#', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray6);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        long[] longArray4 = new long[] { (short) 100, 1, (byte) 10, (short) 0 };
        long[] longArray10 = new long[] { '4', 10L, ' ', 10L, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        float[] floatArray4 = new float[] { 1L, 100.0f, (byte) 10, (byte) -1 };
        float[] floatArray11 = new float[] { (short) 1, 1, (byte) -1, (short) 10, 10.0f, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray11, (float) 'a');
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.monster", indexReader8, terms9, terms10, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) terms9);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray4, (java.lang.Object) executorServiceArray23);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) strArray50);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), 10.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray3, (java.lang.Object) executorServiceArray22);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests29.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests29.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests29.assertTermsEquals("tests.weekly", indexReader33, terms34, terms35, false);
        kuromojiAnalysisTests29.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests29.tearDown();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        kuromojiAnalysisTests29.assertTermsEquals("", indexReader41, terms42, terms43, true);
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean28, (java.lang.Object) kuromojiAnalysisTests29);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray8);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        char[] charArray4 = new char[] { '#', 'a', '4', '#' };
        char[] charArray9 = new char[] { ' ', '#', ' ', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        double[] doubleArray2 = new double[] { (-1.0d) };
        double[] doubleArray4 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) 2);
        double[] doubleArray8 = new double[] { (-1.0d) };
        double[] doubleArray10 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray2, doubleArray8, (double) (-1.0f));
        double[] doubleArray18 = new double[] { 'a', 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray18, (double) (short) 100);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, true);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests8.assertDocsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11, true);
        kuromojiAnalysisTests8.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests8);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        long[] longArray4 = new long[] { (byte) 1, (-1), 10L, (short) 1 };
        long[] longArray8 = new long[] { '4', (-1L), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        long[] longArray2 = new long[] { 4 };
        long[] longArray7 = new long[] { 10L, 0L, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray2, longArray7);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray2, floatArray3, (float) (short) 100);
        float[] floatArray9 = new float[] { (short) 10, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray9, (float) 100);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.util.Set[] setArray23 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray24 = (java.util.Set<java.lang.String>[]) setArray23;
        strSetArray24[0] = strSet5;
        strSetArray24[1] = strSet9;
        strSetArray24[2] = strSet13;
        strSetArray24[3] = strSet17;
        strSetArray24[4] = strSet21;
        java.util.List<java.util.Set<java.lang.String>> strSetList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray24);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        java.util.Set[] setArray58 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray59 = (java.util.Set<java.lang.String>[]) setArray58;
        strSetArray59[0] = strSet40;
        strSetArray59[1] = strSet44;
        strSetArray59[2] = strSet48;
        strSetArray59[3] = strSet52;
        strSetArray59[4] = strSet56;
        java.util.List<java.util.Set<java.lang.String>> strSetList70 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray24, (java.lang.Object[]) strSetArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) strSetArray24);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.weekly", indexReader8, terms9, terms10, false);
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray31 = new java.lang.String[][] { strArray20, strArray25, strArray30 };
        java.util.List<java.lang.String[]> strArrayList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray31);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) strArrayList32);
        java.lang.String str34 = kuromojiAnalysisTests2.getTestName();
        java.lang.String str35 = kuromojiAnalysisTests2.getTestName();
        java.lang.Object obj36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) str35, obj36);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 100, (double) 2);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain20;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) ruleChain20, (java.lang.Object) 1);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.badapples", obj1);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray2, shortArray3);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray11, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) shortArray3);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        char[] charArray4 = new char[] { 'a', '#', ' ', '#' };
        char[] charArray6 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray6);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        long[] longArray4 = new long[] { 5, 0L, 5, (byte) -1 };
        long[] longArray11 = new long[] { 10L, 4, (short) 100, 1L, 100, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1.0f), (double) 0, (double) (short) 100);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        char[] charArray3 = new char[] { '4', '4', '#' };
        char[] charArray8 = new char[] { '#', '4', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray8);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray3, (java.lang.Object) executorServiceArray22);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        java.util.Set[] setArray50 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray51 = (java.util.Set<java.lang.String>[]) setArray50;
        strSetArray51[0] = strSet32;
        strSetArray51[1] = strSet36;
        strSetArray51[2] = strSet40;
        strSetArray51[3] = strSet44;
        strSetArray51[4] = strSet48;
        java.util.List<java.util.Set<java.lang.String>> strSetList62 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) strSetArray51);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.Object[] objArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, objArray5);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("<unknown>", true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray2, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray1);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) -1 };
        byte[] byteArray4 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray4);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.slow", indexReader4, (int) (byte) 10, postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", 5, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        java.util.Collection[][] collectionArray1 = new java.util.Collection[][] {};
        java.util.Set<java.util.Collection[]> collectionArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(collectionArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray9);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray9, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) collectionArray1, (java.lang.Object[]) strArray9);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray3 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) 2);
        double[] doubleArray12 = new double[] { 0.0f, 5, 0, (byte) 1, 1L, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray12, (double) (-1));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray10 = new char[] { '#', '4', '4', '4', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray3, charArray10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        java.lang.String str10 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) 'a');
        kuromojiAnalysisTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 'a', (long) '4');
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        long[] longArray2 = new long[] { (byte) 1 };
        long[] longArray5 = new long[] { 10L, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray2, longArray5);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        int[] intArray6 = new int[] { (byte) 10, 100, (byte) 100, (-1), (byte) 1, (short) 100 };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray7, intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray10);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray2, shortArray3);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray11, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) shortArray17);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        char[] charArray0 = new char[] {};
        char[] charArray3 = new char[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 1, 0.0d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 5, (double) (short) 10);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) '4');
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) ' ');
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray19, strArray24, strArray29 };
        java.util.List<java.lang.String[]> strArrayList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray30);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) strArrayList31);
        java.lang.String str33 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray2 = (java.util.Collection<java.lang.String>[]) collectionArray1;
        java.util.Set<java.util.Collection<java.lang.String>> strCollectionSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.String>[]) collectionArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) collectionArray1, (java.lang.Object[]) strArray20);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("", indexReader8, (int) (short) 100, postingsEnum10, postingsEnum11, false);
        kuromojiAnalysisTests2.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("hi!", indexReader25, 0, postingsEnum27, postingsEnum28);
        kuromojiAnalysisTests15.setUp();
        kuromojiAnalysisTests15.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests15);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests34.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests34.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests34.assertTermsEquals("tests.weekly", indexReader38, terms39, terms40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests34.assertPositionsSkippingEquals("hi!", indexReader44, 0, postingsEnum46, postingsEnum47);
        kuromojiAnalysisTests34.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("", indexReader51, fields52, fields53, false);
        org.junit.rules.RuleChain ruleChain56 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) ruleChain56);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        int[] intArray6 = new int[] { 3, (byte) -1, (byte) 100, (short) 10, 2, (byte) 0 };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray7, intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 1, (double) (short) -1, (double) 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        long[] longArray1 = new long[] { (byte) 10 };
        long[] longArray4 = new long[] { (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) (-1L), (float) 10, (float) (short) 1);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        float[] floatArray4 = new float[] { (byte) 100, (byte) -1, '#', '#' };
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray6, floatArray7, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray7, (float) (byte) -1);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        long[] longArray4 = new long[] { (byte) 100, ' ', 1L };
        long[] longArray11 = new long[] { 100L, (byte) 0, (short) 100, 'a', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray4, longArray11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 'a', (float) 5);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100, (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray5, strArray10, strArray15 };
        java.util.List<java.lang.String[]> strArrayList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray34 = new java.lang.String[][] { strArray23, strArray28, strArray33 };
        java.util.List<java.lang.String[]> strArrayList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray34);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray52 = new java.lang.String[][] { strArray41, strArray46, strArray51 };
        java.util.List<java.lang.String[]> strArrayList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray52);
        java.util.List[] listArray55 = new java.util.List[3];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String[]>[] strArrayListArray56 = (java.util.List<java.lang.String[]>[]) listArray55;
        strArrayListArray56[0] = strArrayList17;
        strArrayListArray56[1] = strArrayList35;
        strArrayListArray56[2] = strArrayList53;
        java.util.Set<java.util.List<java.lang.String[]>> strArrayListSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArrayListArray56);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests64 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests64.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests64.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        kuromojiAnalysisTests64.assertTermsEquals("tests.weekly", indexReader68, terms69, terms70, false);
        java.lang.String str73 = kuromojiAnalysisTests64.getTestName();
        kuromojiAnalysisTests64.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule76 = kuromojiAnalysisTests64.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArrayListSet63, (java.lang.Object) kuromojiAnalysisTests64);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("random", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6, false);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.maxfailures", indexReader11, terms12, terms13, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.weekly", indexReader20, terms21, terms22, false);
        java.lang.String str25 = kuromojiAnalysisTests16.getTestName();
        java.lang.String str26 = kuromojiAnalysisTests16.getTestName();
        kuromojiAnalysisTests16.ensureCheckIndexPassed();
        kuromojiAnalysisTests16.setUp();
        kuromojiAnalysisTests16.assertPathHasBeenCleared("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader11, (java.lang.Object) "hi!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 100.0f, (float) 2, (float) (byte) 1);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) -1, (long) 1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray12);
        short[] shortArray20 = new short[] { (byte) 10, (byte) 1, (short) 100, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray20);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray3, floatArray4, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray1, floatArray4, (float) (short) -1);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.RuleChain ruleChain10 = null;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain10;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("<unknown>", indexReader13, (int) (byte) 100, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader20, fields21, fields22, true);
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", (int) (byte) 0, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.RuleChain ruleChain10 = null;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain10;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("<unknown>", indexReader13, (int) (byte) 100, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader20, fields21, fields22, true);
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", 3, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray13, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray23);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray28, shortArray29);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray32, shortArray38);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray32);
        java.lang.Object obj44 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj44, (java.lang.Object) kuromojiAnalysisTests45);
        org.junit.rules.TestRule testRule47 = kuromojiAnalysisTests45.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray3, (java.lang.Object) testRule47);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests49.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests49.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        kuromojiAnalysisTests49.assertTermsEquals("tests.weekly", indexReader53, terms54, terms55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        kuromojiAnalysisTests49.assertPositionsSkippingEquals("hi!", indexReader59, 0, postingsEnum61, postingsEnum62);
        kuromojiAnalysisTests49.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        kuromojiAnalysisTests49.assertFieldsEquals("", indexReader66, fields67, fields68, false);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        kuromojiAnalysisTests49.assertTermsEquals("tests.maxfailures", indexReader72, terms73, terms74, true);
        kuromojiAnalysisTests49.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        kuromojiAnalysisTests49.assertDocsSkippingEquals("<unknown>", indexReader79, (int) (short) 0, postingsEnum81, postingsEnum82, false);
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        kuromojiAnalysisTests49.assertDocsEnumEquals("tests.nightly", postingsEnum86, postingsEnum87, true);
        org.apache.lucene.index.IndexReader indexReader91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum94 = null;
        kuromojiAnalysisTests49.assertDocsSkippingEquals("tests.badapples", indexReader91, 0, postingsEnum93, postingsEnum94, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) shortArray3, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        float[] floatArray3 = new float[] { 100, (-1L) };
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray5, floatArray6, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray3, floatArray5, (float) 100);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray4, byteArray9);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray19);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray25);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray34);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray34, shortArray40);
        org.junit.Assert.assertArrayEquals("", shortArray25, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) shortArray5);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.maxfailures", indexReader24, terms25, terms26, true);
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("<unknown>", indexReader31, (int) (short) 0, postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader43, 0, postingsEnum45, postingsEnum46, true);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(4);
        org.apache.lucene.index.NumericDocValues numericDocValues55 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("tests.weekly", (int) '#', numericDocValues55, numericDocValues56);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.weekly", true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 0, (double) 0L, (double) (-1.0f));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray7, shortArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray7);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray3, byteArray4);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) 1L, (double) 4, (double) (byte) 100);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) -1, (long) (short) 1);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass1 = throttling0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass1);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.badapples", indexReader4, fields5, fields6, true);
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) testRule9);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.maxfailures", indexReader23, terms24, terms25, true);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 100, (long) 4);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) strArray7);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray21, (java.lang.Object) ruleChain26);
        java.lang.Class<?> wildcardClass28 = executorServiceArray21.getClass();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) wildcardClass28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttling31);
        org.junit.Assert.assertNotSame("", (java.lang.Object) wildcardClass28, (java.lang.Object) throttling31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests34.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests34.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests34.assertTermsEquals("tests.weekly", indexReader38, terms39, terms40, false);
        java.lang.String str43 = kuromojiAnalysisTests34.getTestName();
        java.lang.String str44 = kuromojiAnalysisTests34.getTestName();
        kuromojiAnalysisTests34.ensureCheckIndexPassed();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) throttling48, (java.lang.Object) (byte) 100);
        java.lang.Object obj52 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj52, (java.lang.Object) kuromojiAnalysisTests53);
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests53.ruleChain;
        kuromojiAnalysisTests53.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests53.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) throttling48, (java.lang.Object) kuromojiAnalysisTests53);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests34, (java.lang.Object) kuromojiAnalysisTests53);
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        kuromojiAnalysisTests53.assertDocsEnumEquals("tests.failfast", postingsEnum61, postingsEnum62, true);
        kuromojiAnalysisTests53.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttling31, (java.lang.Object) kuromojiAnalysisTests53);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray1 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList2 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, eSTestCaseArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) eSTestCaseArray1, (java.lang.Object[]) strArray24);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray2, shortArray3);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray11, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray26);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray3);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 5, (double) 1L, (double) 0L);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("", intArray14, intArray17);
        org.junit.Assert.assertArrayEquals(intArray9, intArray17);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray21, intArray25);
        org.junit.Assert.assertArrayEquals(intArray17, intArray21);
        org.junit.Assert.assertArrayEquals("random", intArray2, intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) intArray21);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray2, (float) (short) 100);
        float[] floatArray8 = new float[] { 10, (-1L), 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, 1.0f);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj1, (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.maxfailures", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("random", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray5, byteArray9);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        double[] doubleArray5 = new double[] { 10L, 0, '#', 3 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray5, doubleArray6, (double) ' ');
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray2);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray22);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray27, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray31);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray31, shortArray37);
        org.junit.Assert.assertArrayEquals("", shortArray22, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests43.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests43.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests43.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests43.assertDocsSkippingEquals("", indexReader49, (int) (short) 100, postingsEnum51, postingsEnum52, false);
        kuromojiAnalysisTests43.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests56.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests56.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        kuromojiAnalysisTests56.assertTermsEquals("tests.weekly", indexReader60, terms61, terms62, false);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        kuromojiAnalysisTests56.assertPositionsSkippingEquals("hi!", indexReader66, 0, postingsEnum68, postingsEnum69);
        kuromojiAnalysisTests56.setUp();
        kuromojiAnalysisTests56.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests43, (java.lang.Object) kuromojiAnalysisTests56);
        kuromojiAnalysisTests43.setUp();
        org.junit.rules.TestRule testRule76 = kuromojiAnalysisTests43.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests77 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests77.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests77.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests77.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.Terms terms84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        kuromojiAnalysisTests77.assertTermsEquals("tests.weekly", indexReader83, terms84, terms85, false);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests43, (java.lang.Object) terms85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray31, (java.lang.Object) terms85);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
        int[] intArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        char[] charArray5 = new char[] { 'a', 'a', '4', ' ', ' ' };
        char[] charArray8 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) '#', (double) (short) 10);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        char[] charArray6 = new char[] { '4', 'a', 'a', '4', '4', ' ' };
        char[] charArray9 = new char[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) executorServiceArray9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.weekly", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27);
        java.lang.String str29 = kuromojiAnalysisTests14.getTestName();
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests14.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests14);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.ensureCleanedUp();
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.util.Set[] setArray26 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray27 = (java.util.Set<java.lang.String>[]) setArray26;
        strSetArray27[0] = strSet8;
        strSetArray27[1] = strSet12;
        strSetArray27[2] = strSet16;
        strSetArray27[3] = strSet20;
        strSetArray27[4] = strSet24;
        java.util.List<java.util.Set<java.lang.String>> strSetList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) strSetList38);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray4, (java.lang.Object) executorServiceArray23);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests28.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        kuromojiAnalysisTests28.assertTermsEquals("tests.weekly", indexReader32, terms33, terms34, false);
        kuromojiAnalysisTests28.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests28.tearDown();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        kuromojiAnalysisTests28.assertTermsEquals("", indexReader40, terms41, terms42, true);
        java.lang.String str45 = kuromojiAnalysisTests28.getTestName();
        kuromojiAnalysisTests28.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests28, (java.lang.Object) "tests.weekly");
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests28.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) executorServiceArray23, (java.lang.Object) ruleChain49);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.weekly", indexReader5, (int) (short) 0, postingsEnum7, postingsEnum8, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) (short) 0);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        char[] charArray6 = new char[] { '#', '4', 'a', '4', 'a' };
        char[] charArray12 = new char[] { ' ', '#', '4', '#', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray6, charArray12);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray7, (java.lang.Object) executorServiceArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests24.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests24.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests24.assertDocsSkippingEquals("", indexReader30, (int) (short) 100, postingsEnum32, postingsEnum33, false);
        kuromojiAnalysisTests24.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests24.resetCheckIndexStatus();
        org.junit.rules.RuleChain[] ruleChainArray38 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet39 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray38);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests24, (java.lang.Object) ruleChainArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray7, (java.lang.Object[]) ruleChainArray38);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.weekly", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader12, 0, postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("", indexReader19, fields20, fields21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("tests.failfast", indexReader25, fields26, fields27, false);
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) 100, (java.lang.Object) testRule30);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray4, (java.lang.Object) executorServiceArray23);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests30.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests30.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests30.ensureCheckIndexPassed();
        kuromojiAnalysisTests30.resetCheckIndexStatus();
        kuromojiAnalysisTests30.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests30.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests30.assertTermsEquals("tests.slow", indexReader38, terms39, terms40, false);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) executorServiceArray23, (java.lang.Object) terms40);
        java.lang.Object[] objArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, objArray44);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.failfast", indexReader6, (int) (short) 0, postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.badapples", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 100);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 100, (java.lang.Object) locale21);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 100);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.nightly", postingsEnum2, postingsEnum3, true);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", (int) (short) 10, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        char[] charArray2 = new char[] { '#', '4' };
        char[] charArray7 = new char[] { 'a', '#', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray7);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        java.lang.Class<?> wildcardClass12 = kuromojiAnalysisTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) wildcardClass12);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (byte) 1);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.RuleChain ruleChain10 = null;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain10;
        java.lang.Object obj12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, obj12);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, 1.0d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        java.lang.String str10 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) 'a');
        kuromojiAnalysisTests1.setUp();
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) (byte) 100, (java.lang.Object) testRule14);
        java.lang.Class<?> wildcardClass16 = testRule14.getClass();
        java.lang.Object obj17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass16, obj17);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 'a', (double) 1, (double) 1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, 100.0d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        char[] charArray6 = new char[] { '#', ' ', ' ', '#', ' ' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray6, charArray7);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 10, (double) 0L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.util.Set[] setArray22 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray23 = (java.util.Set<java.lang.String>[]) setArray22;
        strSetArray23[0] = strSet4;
        strSetArray23[1] = strSet8;
        strSetArray23[2] = strSet12;
        strSetArray23[3] = strSet16;
        strSetArray23[4] = strSet20;
        java.util.List<java.util.Set<java.lang.String>> strSetList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray23);
        java.util.Set<java.util.Set<java.lang.String>> strSetSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray23);
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.String>[]) strSetArray23);
        java.lang.Object[] objArray38 = new java.lang.Object[] { 100.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strSetArray23, objArray38);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray6, byteArray8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.util.Set[] setArray23 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray24 = (java.util.Set<java.lang.String>[]) setArray23;
        strSetArray24[0] = strSet5;
        strSetArray24[1] = strSet9;
        strSetArray24[2] = strSet13;
        strSetArray24[3] = strSet17;
        strSetArray24[4] = strSet21;
        java.util.List<java.util.Set<java.lang.String>> strSetList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray24);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        java.util.Set[] setArray58 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray59 = (java.util.Set<java.lang.String>[]) setArray58;
        strSetArray59[0] = strSet40;
        strSetArray59[1] = strSet44;
        strSetArray59[2] = strSet48;
        strSetArray59[3] = strSet52;
        strSetArray59[4] = strSet56;
        java.util.List<java.util.Set<java.lang.String>> strSetList70 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray24, (java.lang.Object[]) strSetArray59);
        java.lang.String[] strArray74 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        java.lang.String[] strArray78 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet79 = org.apache.lucene.util.LuceneTestCase.asSet(strArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray74, (java.lang.Object[]) strArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strSetArray24, (java.lang.Object[]) strArray78);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100L, (double) 100.0f);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray12);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (byte) -1);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        short[] shortArray0 = null;
        short[] shortArray1 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        char[] charArray6 = new char[] { ' ', '4', '4', ' ', '4' };
        char[] charArray13 = new char[] { 'a', 'a', '#', '4', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray6, charArray13);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray10);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        char[] charArray3 = new char[] { ' ', '4' };
        char[] charArray10 = new char[] { 'a', '#', 'a', '4', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray10);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (-1L));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("", intArray6, intArray9);
        org.junit.Assert.assertArrayEquals(intArray1, intArray9);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals(intArray13, intArray17);
        org.junit.Assert.assertArrayEquals(intArray9, intArray13);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("", intArray26, intArray29);
        org.junit.Assert.assertArrayEquals(intArray21, intArray29);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals(intArray33, intArray37);
        org.junit.Assert.assertArrayEquals(intArray29, intArray33);
        org.junit.Assert.assertArrayEquals(intArray13, intArray29);
        int[] intArray48 = new int[] { '#', (short) 100, 100, (short) 1, (short) 10, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray29, intArray48);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray3, floatArray4, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray1, floatArray3, (float) (byte) -1);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("", indexReader8, (int) (short) 100, postingsEnum10, postingsEnum11, false);
        kuromojiAnalysisTests2.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("hi!", indexReader25, 0, postingsEnum27, postingsEnum28);
        kuromojiAnalysisTests15.setUp();
        kuromojiAnalysisTests15.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests15);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals(intArray38, intArray42);
        org.junit.Assert.assertArrayEquals(intArray36, intArray42);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("", intArray51, intArray54);
        org.junit.Assert.assertArrayEquals(intArray46, intArray54);
        org.junit.Assert.assertArrayEquals("", intArray42, intArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests15, (java.lang.Object) "");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, 10L);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '#', (long) 'a');
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        char[] charArray3 = new char[] { ' ', ' ', 'a' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray6, strArray11, strArray16 };
        java.util.List<java.lang.String[]> strArrayList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray17);
        java.util.List[] listArray20 = new java.util.List[1];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String[]>[] strArrayListArray21 = (java.util.List<java.lang.String[]>[]) listArray20;
        strArrayListArray21[0] = strArrayList18;
        java.util.List<java.util.List<java.lang.String[]>> strArrayListList24 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strArrayListArray21);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.failfast", "enwiki.random.lines.txt", "hi!", "tests.awaitsfix", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArrayListArray21, (java.lang.Object[]) strArray30);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray2 = (java.util.Collection<java.lang.String>[]) collectionArray1;
        java.util.Set<java.util.Collection<java.lang.String>> strCollectionSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.String>[]) collectionArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.util.Set[] setArray26 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray27 = (java.util.Set<java.lang.String>[]) setArray26;
        strSetArray27[0] = strSet8;
        strSetArray27[1] = strSet12;
        strSetArray27[2] = strSet16;
        strSetArray27[3] = strSet20;
        strSetArray27[4] = strSet24;
        java.util.List<java.util.Set<java.lang.String>> strSetList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) collectionArray1, (java.lang.Object[]) strSetArray27);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 1, (double) (-1), 0.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 5, (float) (short) 100, (float) 5);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) 3, (float) 10L, (float) 5);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.util.Set[] setArray23 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray24 = (java.util.Set<java.lang.String>[]) setArray23;
        strSetArray24[0] = strSet5;
        strSetArray24[1] = strSet9;
        strSetArray24[2] = strSet13;
        strSetArray24[3] = strSet17;
        strSetArray24[4] = strSet21;
        java.util.List<java.util.Set<java.lang.String>> strSetList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray24);
        java.util.Set<java.util.Set<java.lang.String>> strSetSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray24);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray43);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray43, (java.lang.Object) executorServiceArray48);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strSetArray24, (java.lang.Object[]) strArray43);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        char[] charArray2 = new char[] { '#' };
        char[] charArray6 = new char[] { '4', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray3, (java.lang.Object) executorServiceArray22);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) strArray54);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.failfast", true);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        float[] floatArray0 = null;
        float[] floatArray2 = new float[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, (float) '#');
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader12, terms13, terms14, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray1);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray1 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList2 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, eSTestCaseArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray9, (java.lang.Object) ruleChain14);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) executorServiceArray9, (java.lang.Object) 0L);
        java.lang.Object[] objArray18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray9, objArray18);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray3, floatArray4, (float) (short) 100);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray8, floatArray9, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) '#');
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray15, floatArray16, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray4, floatArray16, (float) 'a');
        float[] floatArray22 = new float[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray16, floatArray22, (float) 'a');
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray10, (java.lang.Object) ruleChain15);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) executorServiceArray10, (java.lang.Object) 0L);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray10);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals("", intArray25, intArray28);
        org.junit.Assert.assertArrayEquals(intArray20, intArray28);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray32, intArray36);
        org.junit.Assert.assertArrayEquals(intArray28, intArray32);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertArrayEquals("", intArray45, intArray48);
        org.junit.Assert.assertArrayEquals(intArray40, intArray48);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals(intArray52, intArray56);
        org.junit.Assert.assertArrayEquals(intArray48, intArray52);
        org.junit.Assert.assertArrayEquals(intArray32, intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) executorServiceArray10, (java.lang.Object) intArray48);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        char[] charArray4 = new char[] { '#', ' ', 'a' };
        char[] charArray6 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray4, charArray6);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        java.lang.Object obj6 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj6, (java.lang.Object) kuromojiAnalysisTests7);
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests7.ruleChain;
        kuromojiAnalysisTests7.assertPathHasBeenCleared("<unknown>");
        java.lang.String str12 = kuromojiAnalysisTests7.getTestName();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests7);
        kuromojiAnalysisTests7.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests7.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str7 = kuromojiAnalysisTests2.getTestName();
        java.lang.Class<?> wildcardClass8 = kuromojiAnalysisTests2.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests9.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("", indexReader15, (int) (short) 100, postingsEnum17, postingsEnum18, false);
        kuromojiAnalysisTests9.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests9, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) wildcardClass8, (java.lang.Object) kuromojiAnalysisTests9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 10, (java.lang.Object) kuromojiAnalysisTests9);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, 0.0d);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray13, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray17, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray7, shortArray23);
        short[] shortArray27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray27);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.util.Set[] setArray42 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray43 = (java.util.Set<java.lang.String>[]) setArray42;
        strSetArray43[0] = strSet24;
        strSetArray43[1] = strSet28;
        strSetArray43[2] = strSet32;
        strSetArray43[3] = strSet36;
        strSetArray43[4] = strSet40;
        java.util.List<java.util.Set<java.lang.String>> strSetList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray43);
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        java.lang.String[] strArray74 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        java.util.Set[] setArray77 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray78 = (java.util.Set<java.lang.String>[]) setArray77;
        strSetArray78[0] = strSet59;
        strSetArray78[1] = strSet63;
        strSetArray78[2] = strSet67;
        strSetArray78[3] = strSet71;
        strSetArray78[4] = strSet75;
        java.util.List<java.util.Set<java.lang.String>> strSetList89 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray43, (java.lang.Object[]) strSetArray78);
        java.util.List<java.util.Set<java.lang.String>> strSetList91 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strSetArray43);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (-1.0d));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet2 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.weekly", indexReader7, terms8, terms9, false);
        java.lang.String str12 = kuromojiAnalysisTests3.getTestName();
        kuromojiAnalysisTests3.setIndexWriterMaxDocs((int) 'a');
        kuromojiAnalysisTests3.setUp();
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests3.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) ruleChainArray1, (java.lang.Object) kuromojiAnalysisTests3);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        double[] doubleArray5 = new double[] { 10, (short) 1, '4', (short) 0, (byte) 1 };
        double[] doubleArray8 = new double[] { (-1.0d) };
        double[] doubleArray10 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) 2);
        double[] doubleArray14 = new double[] { (-1.0d) };
        double[] doubleArray16 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray16, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray8, doubleArray14, (double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray14, (double) '4');
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        char[] charArray2 = new char[] { ' ', 'a' };
        char[] charArray5 = new char[] { 'a', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        float[] floatArray1 = null;
        float[] floatArray6 = new float[] { 'a', 1, (-1), 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray6, (float) (byte) 0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        short[] shortArray4 = new short[] { (short) -1, (short) -1, (byte) -1 };
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray8);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray16, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray22);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray27, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray31);
        org.junit.Assert.assertArrayEquals("", shortArray8, shortArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray4, shortArray31);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("<unknown>", indexReader17, (int) (short) 0, postingsEnum19, postingsEnum20, false);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, 0.0f, (float) (short) 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray22);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray43, (java.lang.Object[]) strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray52);
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray61, (java.lang.Object[]) strArray65);
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        java.lang.String[] strArray74 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        java.lang.String[] strArray78 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet79 = org.apache.lucene.util.LuceneTestCase.asSet(strArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray74, (java.lang.Object[]) strArray78);
        java.lang.String[] strArray83 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet84 = org.apache.lucene.util.LuceneTestCase.asSet(strArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray78, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray70, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray83);
        java.lang.String[] strArray94 = new java.lang.String[] { "tests.failfast", "enwiki.random.lines.txt", "hi!", "tests.awaitsfix", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet95 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray83, (java.lang.Object[]) strArray94);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        java.lang.String[] strArray7 = new java.lang.String[] { "random", "enwiki.random.lines.txt", "tests.nightly", "tests.badapples", "hi!", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.util.Set[] setArray31 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray32 = (java.util.Set<java.lang.String>[]) setArray31;
        strSetArray32[0] = strSet13;
        strSetArray32[1] = strSet17;
        strSetArray32[2] = strSet21;
        strSetArray32[3] = strSet25;
        strSetArray32[4] = strSet29;
        java.util.List<java.util.Set<java.lang.String>> strSetList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray7, (java.lang.Object[]) strSetArray32);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
        long[] longArray10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray3, longArray10);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.junit.rules.RuleChain[] ruleChainArray0 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet1 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray0);
        java.lang.Object[] objArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray0, objArray2);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        float[] floatArray2 = new float[] { '4', (short) 100 };
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray4, floatArray5, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, 10.0f);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, 1L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests14.assertDocsEnumEquals("tests.nightly", postingsEnum16, postingsEnum17, true);
        kuromojiAnalysisTests14.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests14);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("tests.slow", 0, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 10);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        char[] charArray5 = new char[] { '#', ' ', '#', ' ', 'a' };
        char[] charArray8 = new char[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray6);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (byte) 0, (-1.0f), (float) 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (byte) 1, (double) 2, (double) 100L);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray26);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray32 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, eSTestCaseArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray26, (java.lang.Object[]) eSTestCaseArray32);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 0.0d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray11);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { strArray2, "tests.badapples" };
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) serializableSet16);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) strArray7);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.failfast", indexReader7, (int) (short) 0, postingsEnum9, postingsEnum10, false);
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) testRule13, (java.lang.Object) ' ');
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100, (double) 10L, (double) (byte) 100);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray7, shortArray13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray17, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("", intArray29, intArray32);
        org.junit.Assert.assertArrayEquals(intArray24, intArray32);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        org.junit.Assert.assertArrayEquals(intArray36, intArray40);
        org.junit.Assert.assertArrayEquals(intArray32, intArray36);
        org.junit.Assert.assertArrayEquals("random", intArray17, intArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) shortArray13, (java.lang.Object) "random");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        java.lang.Object obj0 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) 0.0f);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests4.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests4.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests4.assertDocsSkippingEquals("", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13, false);
        kuromojiAnalysisTests4.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests17.assertTermsEquals("tests.weekly", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("hi!", indexReader27, 0, postingsEnum29, postingsEnum30);
        kuromojiAnalysisTests17.setUp();
        kuromojiAnalysisTests17.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests4, (java.lang.Object) kuromojiAnalysisTests17);
        kuromojiAnalysisTests4.setUp();
        kuromojiAnalysisTests4.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0.0f, (java.lang.Object) kuromojiAnalysisTests4);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 1.0d, (double) ' ');
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 3, (double) (short) 100);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        java.lang.String str10 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray2, (float) (short) 100);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray6, floatArray7, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray6, (float) '#');
        float[] floatArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray12, 0.0f);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) '4', (float) (-1));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.nightly", postingsEnum2, postingsEnum3, true);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (byte) 0);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray37);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray37, (java.lang.Object) executorServiceArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray26, (java.lang.Object[]) executorServiceArray42);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) (-1), 100.0d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("", intArray6, intArray9);
        org.junit.Assert.assertArrayEquals(intArray1, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("", intArray15, intArray18);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray15);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        kuromojiAnalysisTests23.setUp();
        kuromojiAnalysisTests23.ensureAllSearchContextsReleased();
        java.lang.Object obj28 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj28, (java.lang.Object) kuromojiAnalysisTests29);
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests29.ruleChain;
        kuromojiAnalysisTests29.assertPathHasBeenCleared("<unknown>");
        java.lang.String str34 = kuromojiAnalysisTests29.getTestName();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23, (java.lang.Object) kuromojiAnalysisTests29);
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        kuromojiAnalysisTests29.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray15, (java.lang.Object) kuromojiAnalysisTests29);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        long[] longArray4 = new long[] { (byte) 0, (short) 1, (short) 10, (short) 1 };
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray7, longArray8);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray11, longArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray7, longArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (byte) 1, (double) (short) 1, (double) '#');
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100, (double) (-1.0f));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttling35);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) throttling35, (java.lang.Object) '#');
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttling44);
        org.junit.Assert.assertNotEquals((java.lang.Object) strSet42, (java.lang.Object) throttling44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests49.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests49.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        kuromojiAnalysisTests49.assertTermsEquals("tests.weekly", indexReader53, terms54, terms55, false);
        java.lang.String str58 = kuromojiAnalysisTests49.getTestName();
        org.junit.rules.RuleChain ruleChain59 = null;
        kuromojiAnalysisTests49.failureAndSuccessEvents = ruleChain59;
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        kuromojiAnalysisTests49.assertDocsSkippingEquals("<unknown>", indexReader62, (int) (byte) 100, postingsEnum64, postingsEnum65, false);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        kuromojiAnalysisTests49.assertFieldsEquals("", indexReader69, fields70, fields71, true);
        kuromojiAnalysisTests49.assertPathHasBeenCleared("tests.awaitsfix");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests77 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests77.resetCheckIndexStatus();
        kuromojiAnalysisTests77.setUp();
        kuromojiAnalysisTests77.ensureAllSearchContextsReleased();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling82 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttling82);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) kuromojiAnalysisTests77, (java.lang.Object) throttling82);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests49, (java.lang.Object) throttling82);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray86 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31, throttling32, throttling35, throttling44, throttling47, throttling82 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet87 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray4, (java.lang.Object[]) throttlingArray86);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray3 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) doubleArray1, (java.lang.Object) true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray2, floatArray3, (float) (short) 100);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray7, floatArray8, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) '#');
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray15, floatArray16, (float) (short) 100);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray20, floatArray21, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray20, (float) '#');
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray27, floatArray28, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray16, floatArray28, (float) 'a');
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray34, floatArray35, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray35, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray16, (float) 'a');
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray43, floatArray44, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray7, floatArray43, (float) 1L);
        float[] floatArray49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray49, (float) 2);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.weekly", indexReader5, (int) (short) 0, postingsEnum7, postingsEnum8, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests13.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("hi!", indexReader23, 0, postingsEnum25, postingsEnum26);
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("", indexReader30, fields31, fields32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.maxfailures", indexReader36, terms37, terms38, true);
        kuromojiAnalysisTests13.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests13.assertDocsSkippingEquals("<unknown>", indexReader43, (int) (short) 0, postingsEnum45, postingsEnum46, false);
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests13.assertDocsEnumEquals("tests.nightly", postingsEnum50, postingsEnum51, true);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        kuromojiAnalysisTests13.assertDocsSkippingEquals("tests.badapples", indexReader55, 0, postingsEnum57, postingsEnum58, true);
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) kuromojiAnalysisTests13);
        kuromojiAnalysisTests13.setIndexWriterMaxDocs(4);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests13);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray13, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray23);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray28, shortArray29);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray32, shortArray38);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray32);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray45, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray50);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray57, longArray58);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray61, longArray62);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray65, longArray66);
        org.junit.Assert.assertArrayEquals(longArray62, longArray66);
        org.junit.Assert.assertArrayEquals("", longArray57, longArray62);
        long[] longArray72 = new long[] {};
        long[] longArray73 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray72, longArray73);
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray76, longArray77);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray72, longArray76);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray57, longArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) shortArray50, (java.lang.Object) longArray57);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        char[] charArray3 = new char[] { ' ', 'a' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray3, charArray4);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str12 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader14, 100, postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", 100, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray7, longArray8);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray11, longArray12);
        org.junit.Assert.assertArrayEquals(longArray8, longArray12);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray8);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray18, longArray19);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray22, longArray23);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray18, longArray22);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray3, longArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray18);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, 0L);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray3, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray12, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray18);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray27);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests32.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests32.assertTermsEquals("tests.weekly", indexReader36, terms37, terms38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests32.assertPositionsSkippingEquals("hi!", indexReader42, 0, postingsEnum44, postingsEnum45);
        kuromojiAnalysisTests32.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        kuromojiAnalysisTests32.assertFieldsEquals("", indexReader49, fields50, fields51, false);
        org.junit.rules.RuleChain ruleChain54 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain54;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain54;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) shortArray4, (java.lang.Object) ruleChain54);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        java.lang.Object obj7 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj7, (java.lang.Object) kuromojiAnalysisTests8);
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests8.ruleChain;
        kuromojiAnalysisTests8.assertPathHasBeenCleared("<unknown>");
        java.lang.String str13 = kuromojiAnalysisTests8.getTestName();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests8);
        kuromojiAnalysisTests8.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests8);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (byte) 0);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray2, floatArray3, (float) (short) 100);
        float[] floatArray10 = new float[] { (byte) 0, 10.0f, (-1), 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray3, floatArray10, (-1.0f));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 1.0f, (double) (short) -1);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', 10L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray2 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 0L);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttling1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.slow");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, 0.0d, (double) 10.0f);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray0, executorServiceArray1, executorServiceArray2, executorServiceArray3, executorServiceArray4 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.lang.Class<?> wildcardClass12 = executorServiceArray8.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests13.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("hi!", indexReader23, 0, postingsEnum25, postingsEnum26);
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("", indexReader30, fields31, fields32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.maxfailures", indexReader36, terms37, terms38, true);
        kuromojiAnalysisTests13.ensureCleanedUp();
        java.lang.Class<?> wildcardClass42 = kuromojiAnalysisTests13.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests43.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests43.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        kuromojiAnalysisTests43.assertTermsEquals("tests.weekly", indexReader47, terms48, terms49, false);
        java.lang.String str52 = kuromojiAnalysisTests43.getTestName();
        kuromojiAnalysisTests43.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests43.ruleChain;
        java.lang.Class<?> wildcardClass56 = testRule55.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests57 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests57.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests57.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        kuromojiAnalysisTests57.assertTermsEquals("tests.weekly", indexReader61, terms62, terms63, false);
        kuromojiAnalysisTests57.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests57.ensureCheckIndexPassed();
        java.lang.Class<?> wildcardClass68 = kuromojiAnalysisTests57.getClass();
        java.lang.reflect.Type[] typeArray69 = new java.lang.reflect.Type[] { wildcardClass12, wildcardClass42, wildcardClass56, wildcardClass68 };
        java.util.Set<java.lang.reflect.Type> typeSet70 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) typeArray69);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.Collection[] collectionArray5 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray6 = (java.util.Collection<java.lang.String>[]) collectionArray5;
        java.util.Set<java.util.Collection<java.lang.String>> strCollectionSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.String>[]) collectionArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) collectionArray5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        java.lang.String str10 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, 10L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray17, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals(intArray24, intArray27);
        org.junit.Assert.assertArrayEquals("", intArray17, intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 10 };
        byte[] byteArray12 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray12);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        byte[] byteArray17 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray17);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        byte[] byteArray23 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray17, byteArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray21);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10, false);
        kuromojiAnalysisTests1.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) 1.0f);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) strArray41);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray56);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests60 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.RuleChain ruleChain61 = kuromojiAnalysisTests60.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray56, (java.lang.Object) ruleChain61);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) executorServiceArray56, (java.lang.Object) 0L);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) executorServiceArray56);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        java.lang.Object obj1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "random", "enwiki.random.lines.txt", "tests.nightly", "tests.badapples", "hi!", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.junit.Assert.assertNotEquals((java.lang.Object) strComparableSet9, (java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", obj1, (java.lang.Object) strComparableSet9);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.failfast", indexReader6, (int) (short) 0, postingsEnum8, postingsEnum9, false);
        java.lang.String str12 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.nightly", indexReader14, (int) (byte) 1, postingsEnum16, postingsEnum17);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray20, longArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum16, (java.lang.Object) longArray20);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) (short) 10, 0.0f);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray4 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) byteArray2);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1L, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 1.0f, (double) (byte) 1);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1.0f, (double) 100L, (double) 'a');
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) (short) -1, (float) 0);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray8, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) strArray46);
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray46, (java.lang.Object[]) strArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray51);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray51);
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray60, (java.lang.Object[]) strArray64);
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        java.lang.String[] strArray73 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet74 = org.apache.lucene.util.LuceneTestCase.asSet(strArray73);
        java.lang.String[] strArray77 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet78 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray73, (java.lang.Object[]) strArray77);
        java.lang.String[] strArray82 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet83 = org.apache.lucene.util.LuceneTestCase.asSet(strArray82);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray77, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray69, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray60, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray82);
        java.util.concurrent.ExecutorService executorService88 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] { executorService88 };
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray82, (java.lang.Object[]) executorServiceArray89);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        double[] doubleArray1 = null;
        double[] doubleArray6 = new double[] { (-1.0d) };
        double[] doubleArray8 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray8, (double) 2);
        double[] doubleArray12 = new double[] { (-1.0d) };
        double[] doubleArray14 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray14, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray6, doubleArray12, (double) (-1.0f));
        double[] doubleArray21 = new double[] { (-1.0d) };
        double[] doubleArray23 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray23, (double) 2);
        double[] doubleArray27 = new double[] { (-1.0d) };
        double[] doubleArray29 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray29, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray21, doubleArray27, (double) (-1.0f));
        org.junit.Assert.assertArrayEquals("random", doubleArray12, doubleArray27, (double) (byte) 1);
        double[] doubleArray39 = new double[] { (-1.0d) };
        double[] doubleArray41 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray41, (double) 2);
        double[] doubleArray45 = new double[] { (-1.0d) };
        double[] doubleArray47 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray47, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray39, doubleArray45, (double) (-1.0f));
        double[] doubleArray54 = new double[] { (-1.0d) };
        double[] doubleArray56 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray56, (double) 2);
        double[] doubleArray60 = new double[] { (-1.0d) };
        double[] doubleArray62 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray62, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray54, doubleArray60, (double) (-1.0f));
        org.junit.Assert.assertArrayEquals("random", doubleArray45, doubleArray60, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray60, 10.0d);
        double[] doubleArray73 = new double[] { (-1.0d) };
        double[] doubleArray75 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray75, (double) 2);
        double[] doubleArray79 = new double[] { (-1.0d) };
        double[] doubleArray81 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray81, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray73, doubleArray79, (double) (-1.0f));
        org.junit.Assert.assertArrayEquals("random", doubleArray60, doubleArray79, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray1, doubleArray60, (double) 2);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        java.lang.String str10 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain11 = null;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("<unknown>", indexReader14, (int) (byte) 100, postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.awaitsfix");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        kuromojiAnalysisTests29.setUp();
        kuromojiAnalysisTests29.ensureAllSearchContextsReleased();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttling34);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) kuromojiAnalysisTests29, (java.lang.Object) throttling34);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) throttling34);
        java.lang.Object obj39 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj39, (java.lang.Object) kuromojiAnalysisTests40);
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests40.ruleChain;
        kuromojiAnalysisTests40.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests40.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests40.assertDocsSkippingEquals("random", indexReader46, 10, postingsEnum48, postingsEnum49, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "random");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader3, terms4, terms5, true);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        byte[] byteArray4 = new byte[] { (byte) 10 };
        byte[] byteArray6 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray11);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        byte[] byteArray17 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray11, byteArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) 5, (java.lang.Object) byteArray11);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (-1.0f), (double) 2, (double) 0L);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 2, (double) 'a', (double) 2);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        char[] charArray0 = new char[] {};
        char[] charArray6 = new char[] { '#', '4', '4', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (byte) 10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str12 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        long[] longArray5 = new long[] { (byte) 1, 10, (byte) -1, (byte) 10 };
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray8, longArray9);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray12, longArray13);
        org.junit.Assert.assertArrayEquals(longArray9, longArray13);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray17, longArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray13, longArray17);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray22, longArray23);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray26, longArray27);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray27, longArray31);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray36, longArray37);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray37, longArray41);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray45, longArray46);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray41, longArray45);
        org.junit.Assert.assertArrayEquals(longArray27, longArray45);
        org.junit.Assert.assertArrayEquals(longArray23, longArray45);
        org.junit.Assert.assertArrayEquals(longArray13, longArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray5, longArray13);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray7, longArray8);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray11, longArray12);
        org.junit.Assert.assertArrayEquals(longArray8, longArray12);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray8);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray18, longArray19);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray22, longArray23);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray18, longArray22);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray3, longArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray3);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 'a');
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) '4', numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        char[] charArray2 = new char[] { 'a', 'a' };
        char[] charArray8 = new char[] { 'a', 'a', '4', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray8);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray13, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray23);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray28, shortArray29);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray32, shortArray38);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray32);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray45, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray50);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests54.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests54.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        kuromojiAnalysisTests54.assertTermsEquals("tests.weekly", indexReader58, terms59, terms60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        kuromojiAnalysisTests54.assertPositionsSkippingEquals("hi!", indexReader64, 0, postingsEnum66, postingsEnum67);
        kuromojiAnalysisTests54.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        kuromojiAnalysisTests54.assertFieldsEquals("", indexReader71, fields72, fields73, false);
        org.junit.rules.RuleChain ruleChain76 = kuromojiAnalysisTests54.failureAndSuccessEvents;
        kuromojiAnalysisTests54.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) shortArray32, (java.lang.Object) kuromojiAnalysisTests54);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray22);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray43, (java.lang.Object[]) strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray52);
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray61, (java.lang.Object[]) strArray65);
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        java.lang.String[] strArray74 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        java.lang.String[] strArray78 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet79 = org.apache.lucene.util.LuceneTestCase.asSet(strArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray74, (java.lang.Object[]) strArray78);
        java.lang.String[] strArray83 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet84 = org.apache.lucene.util.LuceneTestCase.asSet(strArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray78, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray70, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) strArray83);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 1, (-1L));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) 100L, (float) (byte) -1, 100.0f);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray2, charArray3);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests24.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray20, (java.lang.Object) ruleChain25);
        java.lang.Class<?> wildcardClass27 = executorServiceArray20.getClass();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) wildcardClass27);
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule29);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray7 = new char[] { ' ', '#', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray2, charArray7);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) (short) 100, (float) (byte) 0, (float) (short) 1);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        java.lang.Object obj0 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        double[] doubleArray6 = new double[] { (-1.0d) };
        double[] doubleArray8 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray8, (double) 2);
        double[] doubleArray12 = new double[] { (-1.0d) };
        double[] doubleArray14 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray14, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray6, doubleArray12, (double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) doubleArray6);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.badapples", indexReader4, fields5, fields6, true);
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests5.assertTermsEquals("tests.weekly", indexReader9, terms10, terms11, false);
        java.lang.String str14 = kuromojiAnalysisTests5.getTestName();
        kuromojiAnalysisTests5.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests5.assertDocsEnumEquals("tests.slow", postingsEnum18, postingsEnum19, true);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests5);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray56);
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray65, (java.lang.Object[]) strArray69);
        java.lang.String[] strArray74 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray69, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray61, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests5, (java.lang.Object) strArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray44);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0.0f, (java.lang.Object) 100);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (-1L));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray2, floatArray3, (float) (short) 100);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray7, floatArray8, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) '#');
        float[] floatArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray3, floatArray13, (-1.0f));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) locale15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) 1L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        char[] charArray5 = new char[] { '4', ' ', '4', '4', ' ' };
        char[] charArray10 = new char[] { ' ', ' ', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray3, floatArray4, (float) (short) 100);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray8, floatArray9, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) '#');
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray15, floatArray16, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray4, floatArray16, (float) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) (-1L));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.failfast", indexReader7, (int) (short) 0, postingsEnum9, postingsEnum10, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray13);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray23);
        org.junit.rules.RuleChain[] ruleChainArray27 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet28 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray23, (java.lang.Object[]) ruleChainArray27);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests25.resetCheckIndexStatus();
        kuromojiAnalysisTests25.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain22, (java.lang.Object) kuromojiAnalysisTests25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests25);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', 1.0f, 1.0f);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        double[] doubleArray4 = new double[] { 5, 10.0d, 10.0d };
        double[] doubleArray8 = new double[] { (-1.0d) };
        double[] doubleArray10 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) 2);
        double[] doubleArray14 = new double[] { (-1.0d) };
        double[] doubleArray16 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray16, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray8, doubleArray14, (double) (-1.0f));
        double[] doubleArray23 = new double[] { (-1.0d) };
        double[] doubleArray25 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) 2);
        double[] doubleArray29 = new double[] { (-1.0d) };
        double[] doubleArray31 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray31, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray23, doubleArray29, (double) (-1.0f));
        org.junit.Assert.assertArrayEquals("random", doubleArray14, doubleArray29, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray4, doubleArray29, (double) (short) 1);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 4, (double) 3);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader18, fields19, fields20, false);
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain23;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain23;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests26.resetCheckIndexStatus();
        kuromojiAnalysisTests26.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain23, (java.lang.Object) kuromojiAnalysisTests26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) kuromojiAnalysisTests26);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1L, (long) (byte) 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        char[] charArray6 = new char[] { '#', '#', '#', '4', '#', '4' };
        char[] charArray13 = new char[] { ' ', '4', ' ', '#', 'a', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 5, (long) 5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass18 = throttling17.getClass();
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        java.lang.Class<?> wildcardClass21 = locale20.getClass();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) wildcardClass18, (java.lang.Object) wildcardClass21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) wildcardClass21);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) executorServiceArray4, (java.lang.Object) "tests.slow");
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.resetCheckIndexStatus();
        kuromojiAnalysisTests21.setUp();
        kuromojiAnalysisTests21.setUp();
        kuromojiAnalysisTests21.ensureCleanedUp();
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests21);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        char[] charArray6 = new char[] { '4', ' ', '#', '4', '#', '4' };
        char[] charArray13 = new char[] { 'a', 'a', '4', '#', '4', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray11, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray11);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        java.util.Set[] setArray49 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray50 = (java.util.Set<java.lang.String>[]) setArray49;
        strSetArray50[0] = strSet31;
        strSetArray50[1] = strSet35;
        strSetArray50[2] = strSet39;
        strSetArray50[3] = strSet43;
        strSetArray50[4] = strSet47;
        java.util.List<java.util.Set<java.lang.String>> strSetList61 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray50);
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        java.lang.String[] strArray73 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet74 = org.apache.lucene.util.LuceneTestCase.asSet(strArray73);
        java.lang.String[] strArray77 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet78 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        java.lang.String[] strArray81 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strArray81);
        java.util.Set[] setArray84 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray85 = (java.util.Set<java.lang.String>[]) setArray84;
        strSetArray85[0] = strSet66;
        strSetArray85[1] = strSet70;
        strSetArray85[2] = strSet74;
        strSetArray85[3] = strSet78;
        strSetArray85[4] = strSet82;
        java.util.List<java.util.Set<java.lang.String>> strSetList96 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray50, (java.lang.Object[]) strSetArray85);
        org.junit.Assert.assertNotEquals((java.lang.Object) strArray11, (java.lang.Object) strSetArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray11);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) (-1.0f), (double) (byte) 0, (double) '#');
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.weekly", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader14, terms15, terms16, true);
        java.lang.String str19 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "tests.weekly");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests23.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests23.assertTermsEquals("tests.weekly", indexReader27, terms28, terms29, false);
        java.lang.String str32 = kuromojiAnalysisTests23.getTestName();
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        kuromojiAnalysisTests23.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain37 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests38.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests38.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests38.assertTermsEquals("tests.weekly", indexReader42, terms43, terms44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests38.assertPositionsSkippingEquals("hi!", indexReader48, 0, postingsEnum50, postingsEnum51);
        kuromojiAnalysisTests38.setUp();
        kuromojiAnalysisTests38.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests23, (java.lang.Object) kuromojiAnalysisTests38);
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests38.assertDocsEnumEquals("tests.failfast", postingsEnum58, postingsEnum59, false);
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests38.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum63, postingsEnum64);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) 0L, (double) 100L);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.badapples", indexReader4, fields5, fields6, true);
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.resetCheckIndexStatus();
        kuromojiAnalysisTests12.setUp();
        kuromojiAnalysisTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests16.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests16.setIndexWriterMaxDocs((int) (byte) 0);
        kuromojiAnalysisTests16.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests1, kuromojiAnalysisTests12, kuromojiAnalysisTests16 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet25 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTestsArray24);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.failfast", indexReader6, (int) (short) 0, postingsEnum8, postingsEnum9, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum8);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (short) 0);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (byte) 10, (float) '4', (float) (short) 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        byte[] byteArray4 = new byte[] { (byte) 10 };
        byte[] byteArray6 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        kuromojiAnalysisTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("tests.weekly", indexReader18, (int) (short) 0, postingsEnum20, postingsEnum21, false);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) byteArray6, (java.lang.Object) postingsEnum20);
        byte[] byteArray26 = new byte[] { (byte) 10 };
        byte[] byteArray28 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray28);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        byte[] byteArray33 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray33);
        byte[] byteArray38 = new byte[] { (byte) 10 };
        byte[] byteArray40 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray40);
        byte[] byteArray43 = new byte[] { (byte) 10 };
        byte[] byteArray45 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray45);
        byte[] byteArray49 = new byte[] { (byte) 10 };
        byte[] byteArray51 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray51);
        byte[] byteArray54 = new byte[] { (byte) 10 };
        byte[] byteArray56 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray56);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray45, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray45);
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray45);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests62.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests62.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests62.setIndexWriterMaxDocs((int) (byte) 0);
        kuromojiAnalysisTests62.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        kuromojiAnalysisTests62.assertTermsEquals("tests.monster", indexReader69, terms70, terms71, false);
        kuromojiAnalysisTests62.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) byteArray45, (java.lang.Object) kuromojiAnalysisTests62);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, 100L);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        java.util.Set[] setArray36 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray37 = (java.util.Set<java.lang.String>[]) setArray36;
        strSetArray37[0] = strSet18;
        strSetArray37[1] = strSet22;
        strSetArray37[2] = strSet26;
        strSetArray37[3] = strSet30;
        strSetArray37[4] = strSet34;
        java.util.List<java.util.Set<java.lang.String>> strSetList48 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray37);
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        java.lang.String[] strArray68 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray68);
        java.util.Set[] setArray71 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray72 = (java.util.Set<java.lang.String>[]) setArray71;
        strSetArray72[0] = strSet53;
        strSetArray72[1] = strSet57;
        strSetArray72[2] = strSet61;
        strSetArray72[3] = strSet65;
        strSetArray72[4] = strSet69;
        java.util.List<java.util.Set<java.lang.String>> strSetList83 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray37, (java.lang.Object[]) strSetArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strSetArray37);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        char[] charArray5 = new char[] { 'a', '4', '4', ' ' };
        char[] charArray11 = new char[] { '4', '#', ' ', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray5, charArray11);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        char[] charArray6 = new char[] { '#', 'a', 'a', '#', '#' };
        char[] charArray13 = new char[] { '#', '#', ' ', '4', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray6, charArray13);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        char[] charArray7 = new char[] { ' ', '4', '#', ' ', '#', 'a' };
        char[] charArray11 = new char[] { '#', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray7, charArray11);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("random", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests9.assertTermsEquals("tests.weekly", indexReader13, terms14, terms15, false);
        kuromojiAnalysisTests9.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests9.tearDown();
        kuromojiAnalysisTests9.ensureCleanedUp();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests9.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests22.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests22.ensureCheckIndexPassed();
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        kuromojiAnalysisTests22.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain28;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain28;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests32.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests32.assertTermsEquals("tests.weekly", indexReader36, terms37, terms38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests32.assertPositionsSkippingEquals("hi!", indexReader42, 0, postingsEnum44, postingsEnum45);
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain28, (java.lang.Object) kuromojiAnalysisTests32);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.maxfailures", indexReader24, terms25, terms26, true);
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.badapples", postingsEnum31, postingsEnum32, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 2, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) 5, (float) (-1L));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        char[] charArray6 = new char[] { '4', 'a', '#', '4', ' ', '#' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        char[] charArray3 = new char[] { '#', '#', '#' };
        char[] charArray5 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests18.assertTermsEquals("tests.weekly", indexReader22, terms23, terms24, false);
        kuromojiAnalysisTests18.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests18.tearDown();
        kuromojiAnalysisTests18.setIndexWriterMaxDocs(4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests31.assertDocsEnumEquals("tests.nightly", postingsEnum33, postingsEnum34, true);
        kuromojiAnalysisTests31.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) kuromojiAnalysisTests18, (java.lang.Object) kuromojiAnalysisTests31);
        org.junit.rules.RuleChain ruleChain39 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        kuromojiAnalysisTests31.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests31);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray4 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray9);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        byte[] byteArray16 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray16);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        byte[] byteArray21 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray21);
        byte[] byteArray25 = new byte[] { (byte) 10 };
        byte[] byteArray27 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray27);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        byte[] byteArray32 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray21, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray21);
        byte[] byteArray37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray9, byteArray37);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray4 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
        byte[] byteArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray6);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        java.lang.Object obj0 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests6.assertTermsEquals("tests.weekly", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests6.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests6.assertTermsEquals("", indexReader18, terms19, terms20, true);
        java.lang.String str23 = kuromojiAnalysisTests6.getTestName();
        kuromojiAnalysisTests6.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests6, (java.lang.Object) "tests.weekly");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests27.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests27.assertTermsEquals("tests.weekly", indexReader31, terms32, terms33, false);
        java.lang.String str36 = kuromojiAnalysisTests27.getTestName();
        kuromojiAnalysisTests27.resetCheckIndexStatus();
        kuromojiAnalysisTests27.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests6, (java.lang.Object) kuromojiAnalysisTests27);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain41 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests42.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        kuromojiAnalysisTests42.assertTermsEquals("tests.weekly", indexReader46, terms47, terms48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests42.assertPositionsSkippingEquals("hi!", indexReader52, 0, postingsEnum54, postingsEnum55);
        kuromojiAnalysisTests42.setUp();
        kuromojiAnalysisTests42.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests27, (java.lang.Object) kuromojiAnalysisTests42);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray68);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests72 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.RuleChain ruleChain73 = kuromojiAnalysisTests72.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray68, (java.lang.Object) ruleChain73);
        kuromojiAnalysisTests42.failureAndSuccessEvents = ruleChain73;
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) kuromojiAnalysisTests42);
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests42.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum78, postingsEnum79);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) 10.0f, (double) (short) 0, (double) 100L);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        char[] charArray3 = new char[] { ' ', '4', ' ' };
        char[] charArray5 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", 2, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) executorServiceArray5, (java.lang.Object) "tests.slow");
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests22.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests22.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        kuromojiAnalysisTests22.assertTermsEquals("tests.weekly", indexReader28, terms29, terms30, false);
        org.junit.Assert.assertNotSame("", (java.lang.Object) executorServiceArray17, (java.lang.Object) terms29);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray49);
        java.lang.Class<?> wildcardClass53 = strArray49.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray17, (java.lang.Object) strArray49);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray6, strArray11, strArray16 };
        java.util.List<java.lang.String[]> strArrayList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray24, strArray29, strArray34 };
        java.util.List<java.lang.String[]> strArrayList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray53 = new java.lang.String[][] { strArray42, strArray47, strArray52 };
        java.util.List<java.lang.String[]> strArrayList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray53);
        java.util.List[] listArray56 = new java.util.List[3];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String[]>[] strArrayListArray57 = (java.util.List<java.lang.String[]>[]) listArray56;
        strArrayListArray57[0] = strArrayList18;
        strArrayListArray57[1] = strArrayList36;
        strArrayListArray57[2] = strArrayList54;
        java.util.Set<java.util.List<java.lang.String[]>> strArrayListSet64 = org.apache.lucene.util.LuceneTestCase.asSet(strArrayListArray57);
        java.lang.Object[] objArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArrayListArray57, objArray65);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray14, shortArray15);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray18);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray18, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray8, shortArray24);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray1, shortArray8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) 4, (float) (short) -1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) executorServiceArray11);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests19, (java.lang.Object) executorServiceArray27);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray27);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray43);
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray48);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray39, (java.lang.Object) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray58);
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.failfast", "enwiki.random.lines.txt", "hi!", "tests.awaitsfix", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) strArray69);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        java.util.Collection[][] collectionArray1 = new java.util.Collection[][] {};
        java.util.Set<java.util.Collection[]> collectionArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(collectionArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray6, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) collectionArray1, (java.lang.Object[]) executorServiceArray25);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", 0.0d, (double) (short) 0, 0.0d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 2, (double) (short) 1);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass1 = throttling0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass1, (java.lang.Object) true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray6, strArray11, strArray16 };
        java.util.List<java.lang.String[]> strArrayList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests19.assertTermsEquals("tests.weekly", indexReader23, terms24, terms25, false);
        kuromojiAnalysisTests19.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests19.tearDown();
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests19.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) (short) 0, (java.lang.Object) kuromojiAnalysisTests19);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        java.lang.Object obj0 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray7, longArray8);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray11, longArray12);
        org.junit.Assert.assertArrayEquals(longArray8, longArray12);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray17, longArray18);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray21, longArray22);
        org.junit.Assert.assertArrayEquals(longArray18, longArray22);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray26, longArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray22, longArray26);
        org.junit.Assert.assertArrayEquals(longArray8, longArray26);
        org.junit.Assert.assertArrayEquals(longArray4, longArray26);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray33, longArray34);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray37, longArray38);
        org.junit.Assert.assertArrayEquals(longArray34, longArray38);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray43, longArray44);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray47, longArray48);
        org.junit.Assert.assertArrayEquals(longArray44, longArray48);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray52, longArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray48, longArray52);
        org.junit.Assert.assertArrayEquals(longArray34, longArray52);
        long[] longArray58 = new long[] {};
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray58, longArray59);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray62, longArray63);
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray66, longArray67);
        org.junit.Assert.assertArrayEquals(longArray63, longArray67);
        long[] longArray72 = new long[] {};
        long[] longArray73 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray72, longArray73);
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray76, longArray77);
        org.junit.Assert.assertArrayEquals(longArray73, longArray77);
        long[] longArray81 = new long[] {};
        long[] longArray82 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray81, longArray82);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray77, longArray81);
        org.junit.Assert.assertArrayEquals(longArray63, longArray81);
        org.junit.Assert.assertArrayEquals(longArray59, longArray81);
        org.junit.Assert.assertArrayEquals(longArray52, longArray59);
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) longArray59);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (short) 0);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.failfast", indexReader6, (int) (short) 0, postingsEnum8, postingsEnum9, false);
        java.lang.String str12 = kuromojiAnalysisTests0.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests13.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("hi!", indexReader23, 0, postingsEnum25, postingsEnum26);
        java.lang.String str28 = kuromojiAnalysisTests13.getTestName();
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests13.ruleChain;
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) str12, (java.lang.Object) kuromojiAnalysisTests13);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        char[] charArray4 = new char[] { '#', ' ', '#' };
        char[] charArray9 = new char[] { 'a', 'a', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray4, charArray9);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) executorServiceArray11);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests19, (java.lang.Object) executorServiceArray27);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray27);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray43);
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray48);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray39, (java.lang.Object) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray58);
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray71, (java.lang.Object[]) strArray75);
        java.lang.String[] strArray80 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray75, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray67, (java.lang.Object[]) strArray80);
        java.lang.String[] strArray86 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet87 = org.apache.lucene.util.LuceneTestCase.asSet(strArray86);
        java.lang.String[] strArray90 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet91 = org.apache.lucene.util.LuceneTestCase.asSet(strArray90);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray86, (java.lang.Object[]) strArray90);
        java.lang.String[] strArray95 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet96 = org.apache.lucene.util.LuceneTestCase.asSet(strArray95);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray86, (java.lang.Object[]) strArray95);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray80, (java.lang.Object[]) strArray95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) strArray95);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), 10.0d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader18, fields19, fields20, false);
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) 10, (java.lang.Object) kuromojiAnalysisTests1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.RuleChain ruleChain1 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("<unknown>", indexReader4, (int) (short) 1, postingsEnum6, postingsEnum7, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 1);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, 10.0d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (-1.0d) };
        double[] doubleArray5 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) 2);
        double[] doubleArray9 = new double[] { (-1.0d) };
        double[] doubleArray11 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray3, doubleArray9, (double) (-1.0f));
        double[] doubleArray18 = new double[] { (-1.0d) };
        double[] doubleArray20 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray20, (double) 2);
        double[] doubleArray24 = new double[] { (-1.0d) };
        double[] doubleArray26 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray26, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray18, doubleArray24, (double) (-1.0f));
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray24, (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray3, 1.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        float[] floatArray3 = new float[] { (short) 0, 1L, 2 };
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray5, floatArray6, (float) (short) 100);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray10, floatArray11, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray10, (float) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray10, (float) 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.weekly", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader14, terms15, terms16, true);
        java.lang.String str19 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "tests.weekly");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests23.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests23.assertTermsEquals("tests.weekly", indexReader27, terms28, terms29, false);
        java.lang.String str32 = kuromojiAnalysisTests23.getTestName();
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        kuromojiAnalysisTests23.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests39.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests39.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests39.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests39.assertDocsSkippingEquals("", indexReader45, (int) (short) 100, postingsEnum47, postingsEnum48, false);
        kuromojiAnalysisTests39.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests52.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests52.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        kuromojiAnalysisTests52.assertTermsEquals("tests.weekly", indexReader56, terms57, terms58, false);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        kuromojiAnalysisTests52.assertPositionsSkippingEquals("hi!", indexReader62, 0, postingsEnum64, postingsEnum65);
        kuromojiAnalysisTests52.setUp();
        kuromojiAnalysisTests52.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests39, (java.lang.Object) kuromojiAnalysisTests52);
        org.junit.rules.TestRule testRule71 = kuromojiAnalysisTests52.ruleChain;
        kuromojiAnalysisTests52.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) kuromojiAnalysisTests23, (java.lang.Object) kuromojiAnalysisTests52);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        long[] longArray1 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray1, longArray8);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) -1);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray21, intArray25);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertArrayEquals(intArray28, intArray31);
        org.junit.Assert.assertArrayEquals("", intArray21, intArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) (byte) -1, (java.lang.Object) "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        char[] charArray6 = new char[] { '4', '4', '#', ' ', ' ', ' ' };
        char[] charArray8 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.failfast", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray10);
        java.lang.Class<?> wildcardClass13 = strArray10.getClass();
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.Class<?> wildcardClass18 = strSet17.getClass();
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray25);
        java.lang.Class<?> wildcardClass28 = strArray25.getClass();
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClass28);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        java.lang.Class<?> wildcardClass32 = locale31.getClass();
        java.lang.Class[] classArray34 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass3;
        wildcardClassArray35[1] = wildcardClass13;
        wildcardClassArray35[2] = wildcardClass18;
        wildcardClassArray35[3] = wildcardClass28;
        wildcardClassArray35[4] = wildcardClass32;
        java.util.List<java.lang.Class<?>> wildcardClassList46 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, wildcardClassArray35);
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray51, (java.lang.Object[]) strArray55);
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray51, (java.lang.Object[]) strArray60);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray51, (java.lang.Object) executorServiceArray70);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests77 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests77.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests77.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests77.ensureCheckIndexPassed();
        kuromojiAnalysisTests77.resetCheckIndexStatus();
        kuromojiAnalysisTests77.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain83 = kuromojiAnalysisTests77.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        kuromojiAnalysisTests77.assertTermsEquals("tests.slow", indexReader85, terms86, terms87, false);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) executorServiceArray70, (java.lang.Object) terms87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray35, (java.lang.Object[]) executorServiceArray70);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 5, 0.0d, (double) 4);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 10L, (double) 10L);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray2);
        short[] shortArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        char[] charArray2 = new char[] { '#' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray2, charArray3);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) -1);
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) 0L, (float) (byte) -1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) 10, (float) 5);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.failfast", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17, true);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray42);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray51);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray51, shortArray57);
        org.junit.Assert.assertArrayEquals("", shortArray42, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray51);
        java.lang.Object obj63 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests64 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj63, (java.lang.Object) kuromojiAnalysisTests64);
        org.junit.rules.TestRule testRule66 = kuromojiAnalysisTests64.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray22, (java.lang.Object) testRule66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) 10, (java.lang.Object) testRule66);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("", indexReader8, (int) (short) 100, postingsEnum10, postingsEnum11, false);
        kuromojiAnalysisTests2.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("hi!", indexReader25, 0, postingsEnum27, postingsEnum28);
        kuromojiAnalysisTests15.setUp();
        kuromojiAnalysisTests15.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests15);
        org.junit.rules.TestRule testRule34 = kuromojiAnalysisTests15.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) testRule34);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 100.0f);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        char[] charArray5 = new char[] { '4', '4', ' ', ' ', 'a' };
        char[] charArray9 = new char[] { 'a', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        int[] intArray6 = new int[] { (short) 100, (short) -1, 'a', 0, (byte) 10, (byte) -1 };
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("", intArray13, intArray16);
        org.junit.Assert.assertArrayEquals(intArray8, intArray16);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals(intArray20, intArray24);
        org.junit.Assert.assertArrayEquals(intArray16, intArray20);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("", intArray33, intArray36);
        org.junit.Assert.assertArrayEquals(intArray28, intArray36);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals(intArray40, intArray44);
        org.junit.Assert.assertArrayEquals(intArray36, intArray40);
        org.junit.Assert.assertArrayEquals(intArray20, intArray36);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals(intArray49, intArray53);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray36, intArray49);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals(intArray57, intArray61);
        org.junit.Assert.assertArrayEquals(intArray36, intArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray57);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray26);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray26, (java.lang.Object[]) executorServiceArray32);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        java.util.Collection[] collectionArray3 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray4 = (java.util.Collection<java.lang.String>[]) collectionArray3;
        java.util.Set<java.util.Collection<java.lang.String>> strCollectionSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.String>[]) collectionArray3);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) collectionArray3, (java.lang.Object) (byte) -1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests10, (java.lang.Object) executorServiceArray18);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests26, (java.lang.Object) executorServiceArray34);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) collectionArray3, (java.lang.Object[]) executorServiceArray34);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray2 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList3 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, eSTestCaseArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) eSTestCaseArray2, (java.lang.Object[]) strArray24);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj2, (java.lang.Object) kuromojiAnalysisTests3);
        org.junit.rules.TestRule testRule5 = kuromojiAnalysisTests3.ruleChain;
        kuromojiAnalysisTests3.assertPathHasBeenCleared("<unknown>");
        kuromojiAnalysisTests3.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests3);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain7 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader9, terms10, terms11, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests14.assertDocsEnumEquals("tests.nightly", postingsEnum19, postingsEnum20, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) true, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 5, (double) 10);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        short[] shortArray7 = new short[] { (byte) -1, (short) 0, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray10, shortArray11);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray24, shortArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray14, shortArray30);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray7, shortArray35);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 1L, 1.0d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        char[] charArray3 = new char[] { '#', ' ', '#' };
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.weekly", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27);
        kuromojiAnalysisTests14.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests14.assertFieldsEquals("", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.maxfailures", indexReader37, terms38, terms39, true);
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests14);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) executorServiceArray5, (java.lang.Object) "tests.slow");
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray17);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.lang.Class<?> wildcardClass27 = strSet26.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray28 = new java.lang.reflect.AnnotatedElement[] { wildcardClass27 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet29 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray28);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) annotatedElementArray28);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray2, shortArray3);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray9);
        byte[] byteArray12 = new byte[] { (byte) 10 };
        byte[] byteArray14 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray14);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        byte[] byteArray21 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray21);
        byte[] byteArray24 = new byte[] { (byte) 10 };
        byte[] byteArray26 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray26);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        byte[] byteArray32 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray32);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        byte[] byteArray37 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray37);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray26, byteArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray14, byteArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) "tests.failfast", (java.lang.Object) byteArray14);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        double[] doubleArray4 = new double[] { ' ', 10.0f, 1L, (short) 10 };
        double[] doubleArray9 = new double[] { (-1.0d) };
        double[] doubleArray11 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) 2);
        double[] doubleArray15 = new double[] { (-1.0d) };
        double[] doubleArray17 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray17, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray9, doubleArray15, (double) (-1.0f));
        double[] doubleArray24 = new double[] { (-1.0d) };
        double[] doubleArray26 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray26, (double) 2);
        double[] doubleArray30 = new double[] { (-1.0d) };
        double[] doubleArray32 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray32, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray24, doubleArray30, (double) (-1.0f));
        org.junit.Assert.assertArrayEquals("random", doubleArray15, doubleArray30, (double) (byte) 1);
        double[] doubleArray42 = new double[] { (-1.0d) };
        double[] doubleArray44 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray44, (double) 2);
        double[] doubleArray48 = new double[] { (-1.0d) };
        double[] doubleArray50 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray50, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray42, doubleArray48, (double) (-1.0f));
        double[] doubleArray57 = new double[] { (-1.0d) };
        double[] doubleArray59 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray59, (double) 2);
        double[] doubleArray63 = new double[] { (-1.0d) };
        double[] doubleArray65 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray65, (double) 2);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray57, doubleArray63, (double) (-1.0f));
        org.junit.Assert.assertArrayEquals("random", doubleArray48, doubleArray63, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray63, 10.0d);
        double[] doubleArray75 = new double[] { (-1.0d) };
        double[] doubleArray77 = new double[] { 1.0f };
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray77, (double) 2);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray63, doubleArray77, (double) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray63, (double) 10.0f);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 1L);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        java.lang.String str10 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.badapples", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader20, terms21, terms22, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader20);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10L, (double) (short) 1, (double) 4);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray7);
        byte[] byteArray10 = new byte[] { (byte) 10 };
        byte[] byteArray12 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray12);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, (float) ' ', (float) (byte) 1);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) 1L, (float) 10L, (float) 1L);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotEquals("tests.badapples", obj1, (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.assertPathHasBeenCleared("<unknown>");
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.badapples", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests2.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.weekly", indexReader18, terms19, terms20, false);
        kuromojiAnalysisTests14.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        kuromojiAnalysisTests14.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests14.ensureCleanedUp();
        kuromojiAnalysisTests14.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests14);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 100, (-1.0d), (double) 10);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        char[] charArray5 = new char[] { 'a', 'a', '4', 'a', ' ' };
        char[] charArray7 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray7);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray11, longArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray7, longArray11);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray16, longArray17);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray20, longArray21);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray25);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray30, longArray31);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray34, longArray35);
        org.junit.Assert.assertArrayEquals(longArray31, longArray35);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray39, longArray40);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray35, longArray39);
        org.junit.Assert.assertArrayEquals(longArray21, longArray39);
        org.junit.Assert.assertArrayEquals(longArray17, longArray39);
        org.junit.Assert.assertArrayEquals(longArray7, longArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray7);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals("", intArray2, intArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray5);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0d, (double) (short) 100, (double) (byte) -1);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) '#', (double) 10);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray10);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        byte[] byteArray15 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray15);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray22 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray22);
        byte[] byteArray25 = new byte[] { (byte) 10 };
        byte[] byteArray27 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray27);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        byte[] byteArray33 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray33);
        byte[] byteArray36 = new byte[] { (byte) 10 };
        byte[] byteArray38 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray38);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray27, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray27);
        byte[] byteArray44 = new byte[] { (byte) 10 };
        byte[] byteArray46 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray46);
        byte[] byteArray49 = new byte[] { (byte) 10 };
        byte[] byteArray51 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray15, byteArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray15);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 1, (double) 0L, (double) (byte) -1);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1), 1.0d, (-1.0d));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", 0, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) executorServiceArray3, (java.lang.Object) "tests.slow");
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.lang.Class<?> wildcardClass22 = executorServiceArray18.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests23.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests23.assertTermsEquals("tests.weekly", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests23.assertPositionsSkippingEquals("hi!", indexReader33, 0, postingsEnum35, postingsEnum36);
        kuromojiAnalysisTests23.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("", indexReader40, fields41, fields42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        kuromojiAnalysisTests23.assertTermsEquals("tests.maxfailures", indexReader46, terms47, terms48, true);
        kuromojiAnalysisTests23.ensureCleanedUp();
        java.lang.Class<?> wildcardClass52 = kuromojiAnalysisTests23.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests53.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests53.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        kuromojiAnalysisTests53.assertTermsEquals("tests.weekly", indexReader57, terms58, terms59, false);
        java.lang.String str62 = kuromojiAnalysisTests53.getTestName();
        kuromojiAnalysisTests53.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule65 = kuromojiAnalysisTests53.ruleChain;
        java.lang.Class<?> wildcardClass66 = testRule65.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests67 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests67.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests67.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        kuromojiAnalysisTests67.assertTermsEquals("tests.weekly", indexReader71, terms72, terms73, false);
        kuromojiAnalysisTests67.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests67.ensureCheckIndexPassed();
        java.lang.Class<?> wildcardClass78 = kuromojiAnalysisTests67.getClass();
        java.lang.reflect.Type[] typeArray79 = new java.lang.reflect.Type[] { wildcardClass22, wildcardClass52, wildcardClass66, wildcardClass78 };
        java.util.Set<java.lang.reflect.Type> typeSet80 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) locale16, (java.lang.Object) typeArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) typeArray79);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (-1.0f), 1.0d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (-1));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray9 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList10 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, eSTestCaseArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) eSTestCaseArray9);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 2, (float) (-1), (float) (byte) 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        byte[] byteArray1 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray7);
        byte[] byteArray10 = new byte[] { (byte) 10 };
        byte[] byteArray12 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray12);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        byte[] byteArray18 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray18);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        byte[] byteArray23 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray23);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray12, byteArray23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        byte[] byteArray32 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray32);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        byte[] byteArray37 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray37);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests40.resetCheckIndexStatus();
        kuromojiAnalysisTests40.setUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests40.assertDocsSkippingEquals("tests.weekly", indexReader44, (int) (short) 0, postingsEnum46, postingsEnum47, false);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) byteArray32, (java.lang.Object) postingsEnum46);
        byte[] byteArray52 = new byte[] { (byte) 10 };
        byte[] byteArray54 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray54);
        byte[] byteArray57 = new byte[] { (byte) 10 };
        byte[] byteArray59 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray59);
        byte[] byteArray64 = new byte[] { (byte) 10 };
        byte[] byteArray66 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray66);
        byte[] byteArray69 = new byte[] { (byte) 10 };
        byte[] byteArray71 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray71);
        byte[] byteArray75 = new byte[] { (byte) 10 };
        byte[] byteArray77 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray77);
        byte[] byteArray80 = new byte[] { (byte) 10 };
        byte[] byteArray82 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray80, byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray82);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray71, byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray71);
        org.junit.Assert.assertArrayEquals("", byteArray32, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray12, byteArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray12);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) 10 };
        byte[] byteArray5 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
        byte[] byteArray8 = new byte[] { (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        byte[] byteArray17 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray17);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray22 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray22);
        byte[] byteArray26 = new byte[] { (byte) 10 };
        byte[] byteArray28 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray28);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        byte[] byteArray33 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray22, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray22);
        byte[] byteArray39 = new byte[] { (byte) 10 };
        byte[] byteArray41 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 10 };
        byte[] byteArray47 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray47);
        byte[] byteArray50 = new byte[] { (byte) 10 };
        byte[] byteArray52 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray52);
        byte[] byteArray56 = new byte[] { (byte) 10 };
        byte[] byteArray58 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray58);
        byte[] byteArray61 = new byte[] { (byte) 10 };
        byte[] byteArray63 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray63);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.RuleChain ruleChain1 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues4 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 0, numericDocValues4, numericDocValues5);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, 0.0d, (double) 'a');
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray48);
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray48, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) strArray33);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray4, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray42);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray54, (java.lang.Object[]) strArray58);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray58, (java.lang.Object) executorServiceArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) strArray58);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) -1, (long) (byte) 10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) strArray33);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray21, intArray24);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("", intArray33, intArray36);
        org.junit.Assert.assertArrayEquals(intArray28, intArray36);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals(intArray40, intArray44);
        org.junit.Assert.assertArrayEquals(intArray36, intArray40);
        org.junit.Assert.assertArrayEquals("random", intArray21, intArray40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests49.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests49.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        kuromojiAnalysisTests49.assertTermsEquals("tests.weekly", indexReader53, terms54, terms55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        kuromojiAnalysisTests49.assertPositionsSkippingEquals("hi!", indexReader59, 0, postingsEnum61, postingsEnum62);
        kuromojiAnalysisTests49.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        kuromojiAnalysisTests49.assertFieldsEquals("", indexReader66, fields67, fields68, false);
        org.junit.rules.RuleChain ruleChain71 = kuromojiAnalysisTests49.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain71;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain71;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests74 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests74.resetCheckIndexStatus();
        kuromojiAnalysisTests74.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain71, (java.lang.Object) kuromojiAnalysisTests74);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) intArray40, (java.lang.Object) ruleChain71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) 10L);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (-1L), (long) ' ');
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1), (double) (-1));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (-1), 1.0d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests13.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        kuromojiAnalysisTests13.resetCheckIndexStatus();
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain19 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain19;
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.failfast");
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", 1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.weekly", indexReader6, terms7, terms8, false);
        java.lang.String str11 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.slow", postingsEnum15, postingsEnum16, true);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests2);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray53);
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray62, (java.lang.Object[]) strArray66);
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray66, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray58, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) strArray41);
        java.lang.Object[] objArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray41, objArray78);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 1.0f, 1.0d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (byte) 1, (-1.0d));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), 1.0d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        char[] charArray4 = new char[] { 'a', ' ', ' ', '4' };
        char[] charArray9 = new char[] { '#', ' ', ' ', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray9);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.util.Set[] setArray22 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray23 = (java.util.Set<java.lang.String>[]) setArray22;
        strSetArray23[0] = strSet4;
        strSetArray23[1] = strSet8;
        strSetArray23[2] = strSet12;
        strSetArray23[3] = strSet16;
        strSetArray23[4] = strSet20;
        java.util.List<java.util.Set<java.lang.String>> strSetList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray23);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests35.assertDocsEnumEquals("tests.nightly", postingsEnum37, postingsEnum38, true);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        kuromojiAnalysisTests35.assertFieldsEquals("", indexReader42, fields43, fields44, false);
        kuromojiAnalysisTests35.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests49.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests49.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        kuromojiAnalysisTests49.assertTermsEquals("tests.weekly", indexReader53, terms54, terms55, false);
        java.lang.String str58 = kuromojiAnalysisTests49.getTestName();
        kuromojiAnalysisTests49.setIndexWriterMaxDocs((int) 'a');
        kuromojiAnalysisTests49.setUp();
        org.junit.rules.RuleChain ruleChain62 = kuromojiAnalysisTests49.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain62;
        kuromojiAnalysisTests35.failureAndSuccessEvents = ruleChain62;
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray73);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests77 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.RuleChain ruleChain78 = kuromojiAnalysisTests77.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray73, (java.lang.Object) ruleChain78);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) executorServiceArray73, (java.lang.Object) 0L);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain62, (java.lang.Object) executorServiceArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strSetArray23, (java.lang.Object[]) executorServiceArray73);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("", intArray6, intArray9);
        org.junit.Assert.assertArrayEquals(intArray1, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("", intArray15, intArray18);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray15);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests22.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests22.assertTermsEquals("tests.weekly", indexReader26, terms27, terms28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests22.assertPositionsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35);
        kuromojiAnalysisTests22.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests22.assertTermsEquals("tests.maxfailures", indexReader45, terms46, terms47, true);
        kuromojiAnalysisTests22.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests22.assertDocsSkippingEquals("<unknown>", indexReader52, (int) (short) 0, postingsEnum54, postingsEnum55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        kuromojiAnalysisTests22.assertTermsEquals("tests.nightly", indexReader59, terms60, terms61, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.badapples", (java.lang.Object) true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        int[] intArray0 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("", intArray7, intArray10);
        org.junit.Assert.assertArrayEquals(intArray2, intArray10);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals(intArray14, intArray18);
        org.junit.Assert.assertArrayEquals(intArray10, intArray14);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("", intArray27, intArray30);
        org.junit.Assert.assertArrayEquals(intArray22, intArray30);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals(intArray34, intArray38);
        org.junit.Assert.assertArrayEquals(intArray30, intArray34);
        org.junit.Assert.assertArrayEquals(intArray14, intArray30);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals(intArray43, intArray47);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray30, intArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray43);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.weekly", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader12, 0, postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("<unknown>", indexReader19, (int) (short) 0, postingsEnum21, postingsEnum22, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (short) 10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("", intArray6, intArray9);
        org.junit.Assert.assertArrayEquals(intArray1, intArray9);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals(intArray13, intArray17);
        org.junit.Assert.assertArrayEquals(intArray9, intArray13);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("", intArray27, intArray30);
        org.junit.Assert.assertArrayEquals(intArray22, intArray30);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("", intArray39, intArray42);
        org.junit.Assert.assertArrayEquals(intArray34, intArray42);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals(intArray46, intArray50);
        org.junit.Assert.assertArrayEquals(intArray42, intArray46);
        org.junit.Assert.assertArrayEquals("", intArray22, intArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray9, intArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray9);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) 1, (float) (short) 100, (float) (byte) 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.util.Set<java.lang.String[][]> strArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.failfast", "enwiki.random.lines.txt", "hi!", "tests.awaitsfix", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.junit.Assert.assertNotEquals((java.lang.Object) strArray7, (java.lang.Object) "tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray0, (java.lang.Object[]) strArray7);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, false);
        java.lang.String str24 = kuromojiAnalysisTests15.getTestName();
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests15.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule27);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 3, (float) '4', (float) (-1L));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.weekly");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests6.assertTermsEquals("tests.weekly", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests6.assertPositionsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests6.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("", indexReader23, fields24, fields25, false);
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain28;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain28;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests31.resetCheckIndexStatus();
        kuromojiAnalysisTests31.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain28, (java.lang.Object) kuromojiAnalysisTests31);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain28;
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader38, 3, postingsEnum40, postingsEnum41);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests43.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests43.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        kuromojiAnalysisTests43.assertTermsEquals("tests.weekly", indexReader47, terms48, terms49, false);
        java.lang.String str52 = kuromojiAnalysisTests43.getTestName();
        kuromojiAnalysisTests43.resetCheckIndexStatus();
        kuromojiAnalysisTests43.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests43.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) "tests.failfast", (java.lang.Object) testRule55);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests14.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("", indexReader20, (int) (short) 100, postingsEnum22, postingsEnum23, false);
        kuromojiAnalysisTests14.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests14, (java.lang.Object) 1.0f);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests14, (java.lang.Object) strArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) strArray54);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.weekly", indexReader5, (int) (short) 0, postingsEnum7, postingsEnum8, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) (-1), (float) 1L);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 100L, 1L);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        char[] charArray2 = new char[] { '#' };
        char[] charArray4 = new char[] { 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray2, charArray4);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader8, fields9, fields10, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, false);
        java.lang.String str24 = kuromojiAnalysisTests15.getTestName();
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((int) 'a');
        kuromojiAnalysisTests15.setUp();
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests15.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain28;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain28;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0.0d, (double) '#', (double) 10L);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) 5, 0.0f);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray2, floatArray3, (float) (short) 100);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray7, floatArray8, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) '#');
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray14, floatArray15, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray3, floatArray15, (float) 'a');
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray21, floatArray22, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray22, (float) (byte) 100);
        float[] floatArray30 = new float[] { 10L, 1, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray30, (float) 4);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        java.util.Collection[][] collectionArray1 = new java.util.Collection[][] {};
        java.util.Set<java.util.Collection[]> collectionArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(collectionArray1);
        java.util.Set<java.util.Collection[]> collectionArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(collectionArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray8, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray8, (java.lang.Object[]) strArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) strArray8, (java.lang.Object) executorServiceArray27);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray39);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray39, (java.lang.Object) executorServiceArray44);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) collectionArray1, (java.lang.Object[]) executorServiceArray44);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) 10L, (double) (short) 10, (double) 'a');
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setUp();
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray9, shortArray10);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray14, shortArray15);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray18);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray18, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray24);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray29, shortArray30);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray33);
        org.junit.Assert.assertArrayEquals("", shortArray10, shortArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) shortArray10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        char[] charArray6 = new char[] { '#', '#', '#', '#', 'a' };
        char[] charArray9 = new char[] { '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray6, charArray9);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray14 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, eSTestCaseArray14);
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) eSTestCaseArray14);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.junit.rules.RuleChain[] ruleChainArray0 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet1 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray0);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet2 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.Class<?> wildcardClass7 = strSet6.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray8 = new java.lang.reflect.AnnotatedElement[] { wildcardClass7 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet9 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray15);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray26);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray26, shortArray32);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray37, shortArray38);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray41);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray41, shortArray47);
        org.junit.Assert.assertArrayEquals("", shortArray32, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray41);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray54, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray58);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray58, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray58);
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray8, (java.lang.Object) shortArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) ruleChainArray0, (java.lang.Object[]) annotatedElementArray8);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) ' ', (double) 5, (double) (byte) 1);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, 10L);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 5, (float) (short) 1, (float) 0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) (short) 1);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 1, (double) 0L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) 1, (long) (short) 10);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10.0f, 0.0d, 0.0d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", obj1);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        char[] charArray0 = new char[] {};
        char[] charArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (-1.0d), (double) (short) -1);
    }
}

