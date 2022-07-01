import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5501");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1.0f), (float) (byte) 1, 1.0f);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) ' ', (double) 6);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5503");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (-1.0d));
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5504");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, (double) 3, (double) 10.0f);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5505");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (-1.0f));
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5506");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        byte[] byteArray5 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
        byte[] byteArray8 = new byte[] { (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        byte[] byteArray16 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray16);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        byte[] byteArray21 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray21);
        byte[] byteArray26 = new byte[] { (byte) 10 };
        byte[] byteArray28 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray28);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        byte[] byteArray33 = new byte[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray33);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray21, byteArray28);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests37.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("tests.badapples", indexReader40, fields41, fields42, true);
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests37.ruleChain;
        kuromojiAnalysisTests37.ensureCheckIndexPassed();
        kuromojiAnalysisTests37.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.resetCheckIndexStatus();
        kuromojiAnalysisTests48.setUp();
        kuromojiAnalysisTests48.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests52.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests52.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests52.setIndexWriterMaxDocs((int) (byte) 0);
        kuromojiAnalysisTests52.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests52.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray60 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests37, kuromojiAnalysisTests48, kuromojiAnalysisTests52 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet61 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray60);
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet62 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTestCase[]) kuromojiAnalysisTestsArray60);
        org.junit.Assert.assertNotEquals((java.lang.Object) byteArray28, (java.lang.Object) kuromojiAnalysisTestsArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTestsArray60);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5507");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 1L, 10L);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (short) 10);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5509");
        float[][][] floatArray0 = new float[][][] {};
        float[][][] floatArray1 = new float[][][] {};
        float[][][][] floatArray2 = new float[][][][] { floatArray0, floatArray1 };
        float[][][] floatArray3 = new float[][][] {};
        float[][][] floatArray4 = new float[][][] {};
        float[][][][] floatArray5 = new float[][][][] { floatArray3, floatArray4 };
        float[][][] floatArray6 = new float[][][] {};
        float[][][] floatArray7 = new float[][][] {};
        float[][][][] floatArray8 = new float[][][][] { floatArray6, floatArray7 };
        float[][][][][] floatArray9 = new float[][][][][] { floatArray2, floatArray5, floatArray8 };
        java.util.Set<float[][][][]> floatArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray17);
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
        org.junit.Assert.assertNotSame((java.lang.Object) strArray17, (java.lang.Object) executorServiceArray22);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) floatArray9, (java.lang.Object[]) executorServiceArray22);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5510");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) 100L);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5511");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(4);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.weekly", indexReader21, terms22, terms23, false);
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((int) ' ');
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.weekly", "tests.weekly", "tests.weekly", "tests.failfast" };
        java.lang.String[][] strArray44 = new java.lang.String[][] { strArray33, strArray38, strArray43 };
        java.util.List<java.lang.String[]> strArrayList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, strArray44);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests15, (java.lang.Object) strArrayList45);
        java.lang.String str47 = kuromojiAnalysisTests15.getTestName();
        java.lang.String str48 = kuromojiAnalysisTests15.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests15);
        kuromojiAnalysisTests15.setUp();
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((int) '#');
        java.lang.String str53 = kuromojiAnalysisTests15.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests15.assertDocValuesEquals("tests.badapples", 10, numericDocValues56, numericDocValues57);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 100.0d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5513");
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
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", (int) ' ', numericDocValues26, numericDocValues27);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5514");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (byte) 100);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5515");
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
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5516");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 6);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5517");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray1, longArray2);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray11, longArray12);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray15, longArray16);
        org.junit.Assert.assertArrayEquals(longArray12, longArray16);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray20, longArray21);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray16, longArray20);
        org.junit.Assert.assertArrayEquals(longArray2, longArray20);
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray25);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray31, longArray32);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray35, longArray36);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray36, longArray40);
        org.junit.Assert.assertArrayEquals("", longArray31, longArray36);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray46, longArray47);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray50, longArray51);
        org.junit.Assert.assertArrayEquals(longArray47, longArray51);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray55, longArray56);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray51, longArray55);
        org.junit.Assert.assertArrayEquals(longArray36, longArray51);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray62, longArray63);
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray66, longArray67);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray62, longArray66);
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
        org.junit.Assert.assertArrayEquals(longArray66, longArray81);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray36, longArray66);
        long[] longArray88 = new long[] {};
        long[] longArray89 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray88, longArray89);
        long[] longArray92 = new long[] {};
        long[] longArray93 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray92, longArray93);
        org.junit.Assert.assertArrayEquals(longArray89, longArray93);
        org.junit.Assert.assertArrayEquals("", longArray66, longArray93);
        org.junit.Assert.assertArrayEquals(longArray20, longArray66);
        long[] longArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray66, longArray98);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5518");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests6.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests6.ensureCheckIndexPassed();
        kuromojiAnalysisTests6.resetCheckIndexStatus();
        kuromojiAnalysisTests6.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain12;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain12;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) ruleChain12);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5519");
        org.junit.rules.RuleChain[] ruleChainArray0 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet1 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray0);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet2 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray0);
        java.util.Set<org.junit.rules.TestRule> testRuleSet3 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray0);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) executorServiceArray9, (java.lang.Object) "tests.slow");
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) executorServiceArray26, (java.lang.Object) "tests.slow");
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray38);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray26);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests45.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests45.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests45.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests45.assertDocsSkippingEquals("", indexReader51, (int) (short) 100, postingsEnum53, postingsEnum54, false);
        kuromojiAnalysisTests45.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests45, (java.lang.Object) 1.0f);
        kuromojiAnalysisTests45.setUp();
        kuromojiAnalysisTests45.setIndexWriterMaxDocs(0);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray9, (java.lang.Object) kuromojiAnalysisTests45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) ruleChainArray0, (java.lang.Object[]) executorServiceArray9);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5520");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray26);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray35);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray35, shortArray41);
        org.junit.Assert.assertArrayEquals("", shortArray26, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray35);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray48, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray48, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray53);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray59, shortArray60);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray63);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray63, shortArray69);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray53, shortArray69);
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("", shortArray53, shortArray73);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray77, shortArray78);
        short[] shortArray81 = new short[] {};
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray81, shortArray82);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray77, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray1, shortArray77);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5521");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 100, (long) (short) 10);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5522");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray13);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray23);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray23, shortArray29);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray33, shortArray34);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray38, shortArray39);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray42);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray42, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray23, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray34);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray57, shortArray58);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray61);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray67, shortArray68);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray71);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray76, shortArray77);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray71, shortArray77);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray61, shortArray77);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray83, shortArray84);
        short[] shortArray87 = new short[] {};
        short[] shortArray88 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray87, shortArray88);
        org.junit.Assert.assertArrayEquals(shortArray84, shortArray87);
        short[] shortArray92 = new short[] {};
        short[] shortArray93 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray92, shortArray93);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray87, shortArray93);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray61, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray87);
        short[] shortArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray87, shortArray98);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5523");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
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
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) executorServiceArray10);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray47);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray61);
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray61);
        long[] longArray76 = new long[] { (byte) -1, 3, (short) 100 };
        long[][] longArray77 = new long[][] { longArray76 };
        long[][][] longArray78 = new long[][][] { longArray77 };
        long[] longArray82 = new long[] { (byte) -1, 3, (short) 100 };
        long[][] longArray83 = new long[][] { longArray82 };
        long[][][] longArray84 = new long[][][] { longArray83 };
        long[][][][] longArray85 = new long[][][][] { longArray78, longArray84 };
        java.util.List<long[][][]> longArrayList86 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, longArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) longArray85);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) -1, (double) (-1));
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5525");
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
        java.lang.String str17 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5526");
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
        kuromojiAnalysisTests15.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("tests.nightly", indexReader37, fields38, fields39, false);
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray45, longArray46);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray49, longArray50);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray53, longArray54);
        org.junit.Assert.assertArrayEquals(longArray50, longArray54);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray59, longArray60);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray63, longArray64);
        org.junit.Assert.assertArrayEquals(longArray60, longArray64);
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray68, longArray69);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray64, longArray68);
        org.junit.Assert.assertArrayEquals(longArray50, longArray68);
        long[] longArray73 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray68, longArray73);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray46, longArray73);
        java.lang.Class<?> wildcardClass76 = longArray73.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests15, (java.lang.Object) longArray73);
    }
}

