import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests29.assertPositionsSkippingEquals("tests.failfast", indexReader37, 1, postingsEnum39, postingsEnum40);
        kuromojiAnalysisTests29.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("tests.slow", indexReader45, fields46, fields47, false);
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule51 = kuromojiAnalysisTests29.ruleChain;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) testRule51);
        org.junit.rules.TestRule[] testRuleArray53 = new org.junit.rules.TestRule[] { ruleChain22, testRule51 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet54 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) testRuleArray53);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) -1, (double) (short) 0);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        double[][] doubleArray2 = new double[][] {};
        double[][] doubleArray3 = new double[][] {};
        double[][] doubleArray4 = new double[][] {};
        double[][][] doubleArray5 = new double[][][] { doubleArray2, doubleArray3, doubleArray4 };
        java.util.List<double[][]> doubleArrayList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, doubleArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        double[] doubleArray23 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray28 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray23, doubleArray28, (double) (byte) 100);
        double[] doubleArray37 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray42 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray37, doubleArray42, (double) (byte) 100);
        double[] doubleArray50 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray55 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray50, doubleArray55, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray37, doubleArray50, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray37, (-1.0d));
        double[] doubleArray68 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray73 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray68, doubleArray73, (double) (byte) 100);
        double[] doubleArray81 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray86 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray81, doubleArray86, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray68, doubleArray81, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray23, doubleArray81, (double) 10.0f);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) executorServiceArray14, (java.lang.Object) "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) doubleArray5, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        java.lang.String str20 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str23 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader26, terms27, terms28, true);
        double[] doubleArray33 = new double[] { 100, (short) 100 };
        double[] doubleArray36 = new double[] { 100, (short) 100 };
        double[] doubleArray39 = new double[] { 100, (short) 100 };
        double[][] doubleArray40 = new double[][] { doubleArray33, doubleArray36, doubleArray39 };
        java.util.Set<double[]> doubleArraySet41 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) terms27, (java.lang.Object) doubleArray40);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests10.ensureCleanedUp();
        kuromojiAnalysisTests10.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests10);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader22, terms23, terms24, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests27.assertPositionsSkippingEquals("hi!", indexReader35, (int) (byte) 0, postingsEnum37, postingsEnum38);
        kuromojiAnalysisTests27.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests27.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        kuromojiAnalysisTests42.assertFieldsEquals("europarl.lines.txt.gz", indexReader44, fields45, fields46, false);
        kuromojiAnalysisTests42.ensureCleanedUp();
        kuromojiAnalysisTests42.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests42.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain52 = kuromojiAnalysisTests42.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests27, (java.lang.Object) kuromojiAnalysisTests42);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        kuromojiAnalysisTests42.assertFieldsEquals("tests.slow", indexReader55, fields56, fields57, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((java.lang.Object) terms24, (java.lang.Object) fields56);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        char[] charArray5 = new char[] { '4', '#', ' ', 'a', '#' };
        char[] charArray6 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.badapples", indexReader8, terms9, terms10, false);
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", obj1, (java.lang.Object) ruleChain13);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        long[] longArray1 = null;
        long[] longArray5 = new long[] { 1 };
        long[] longArray7 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray5, longArray7);
        long[] longArray11 = new long[] { 1 };
        long[] longArray13 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray7, longArray11);
        long[] longArray19 = new long[] { 1 };
        long[] longArray21 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray19, longArray21);
        long[] longArray26 = new long[] { 1 };
        long[] longArray28 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray26, longArray28);
        long[] longArray32 = new long[] { 1 };
        long[] longArray34 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray32, longArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray28, longArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray19, longArray32);
        org.junit.Assert.assertArrayEquals(longArray7, longArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray7);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        char[] charArray2 = new char[] { '4' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray2, charArray3);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        java.lang.Iterable[] iterableArray2 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[] localeIterableArray3 = (java.lang.Iterable<java.util.Locale>[]) iterableArray2;
        java.util.Set<java.lang.Iterable<java.util.Locale>> localeIterableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(localeIterableArray3);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        int[] intArray13 = new int[] { '#' };
        int[] intArray15 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray13, intArray15);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray8, intArray13);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        int[] intArray27 = new int[] { '#' };
        int[] intArray29 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray27, intArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray22, intArray27);
        int[] intArray34 = new int[] { '#' };
        int[] intArray36 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray34, intArray36);
        int[] intArray39 = new int[] { '#' };
        int[] intArray41 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray39, intArray41);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray34, intArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray22, intArray39);
        int[] intArray46 = new int[] { '#' };
        int[] intArray48 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray46, intArray48);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray22, intArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray13, intArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) localeIterableSet4, (java.lang.Object) intArray46);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.failfast", indexReader10, 1, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("tests.slow", indexReader16, fields17, fields18, true);
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", obj1, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        char[] charArray7 = new char[] { ' ', ' ', ' ', 'a', 'a', ' ' };
        char[] charArray9 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray7, charArray9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader17, (int) '#', postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader23, (int) (short) 10, postingsEnum25, postingsEnum26);
        java.lang.String str28 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        java.lang.String str30 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("tests.weekly", (int) (byte) -1, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) '#');
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 100, (long) 1);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", 100L, 100L);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (short) 0, (double) (short) 0, (double) '4');
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        char[] charArray0 = null;
        char[] charArray5 = new char[] { ' ', ' ', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 10L, (long) (byte) 1);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, 1.0d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, 0.0d, (double) (-1));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 10, (double) (short) 0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass5 = locale4.getClass();
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass8 = locale7.getClass();
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass11 = locale10.getClass();
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass14 = locale13.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray15 = new java.lang.reflect.AnnotatedElement[] { wildcardClass2, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet16 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray15);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray15, obj17);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray15, (java.lang.Object[]) executorServiceArray22);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (long) (short) 10, (long) (short) 10);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.failfast", indexReader10, 1, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", obj1, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, 10.0f, (float) (-1));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader16, 10, postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) 100);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale16, locale18, locale20, locale22, locale24 };
        java.util.Set<java.util.Locale> localeSet26 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray25);
        java.util.List<java.io.Serializable> serializableList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, false);
        kuromojiAnalysisTests29.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests29.failureAndSuccessEvents;
        kuromojiAnalysisTests29.setUp();
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale42, locale44, locale46, locale48, locale50 };
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale55, locale57, locale59, locale61, locale63 };
        java.util.Set<java.util.Locale> localeSet65 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray64);
        java.util.List<java.io.Serializable> serializableList66 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray51, (java.lang.Object[]) localeArray64);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale70, locale72, locale74, locale76, locale78 };
        java.util.Set<java.util.Locale> localeSet80 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray79);
        java.util.List<java.io.Serializable> serializableList81 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray79);
        java.util.Set<java.lang.Cloneable> cloneableSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray79);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray64, (java.lang.Object[]) localeArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests29, (java.lang.Object) localeArray79);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray79);
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        boolean boolean89 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) localeArray12, (java.lang.Object[]) executorServiceArray86);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader16, terms17, terms18, true);
        kuromojiAnalysisTests2.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.nightly", postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        kuromojiAnalysisTests27.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests38.assertPositionsSkippingEquals("hi!", indexReader46, (int) (byte) 0, postingsEnum48, postingsEnum49);
        kuromojiAnalysisTests38.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests2, kuromojiAnalysisTests27, kuromojiAnalysisTests38 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet53 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray52);
        java.util.Set<org.junit.Assert> assertSet54 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) kuromojiAnalysisTestsArray52);
        org.junit.rules.RuleChain[] ruleChainArray55 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray56 = new org.junit.rules.RuleChain[][] { ruleChainArray55 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet57 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray56);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTestsArray52, (java.lang.Object) ruleChainArray56);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray60);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray60);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray60);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) ruleChainArray56, (java.lang.Object[]) strArray60);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.weekly", indexReader14, (int) (short) 100, postingsEnum16, postingsEnum17, true);
        long[] longArray24 = new long[] { 1 };
        long[] longArray26 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray24, longArray26);
        long[] longArray30 = new long[] { 1 };
        long[] longArray32 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray30, longArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray26, longArray30);
        long[] longArray37 = new long[] { 1 };
        long[] longArray39 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray37, longArray39);
        org.junit.Assert.assertArrayEquals("hi!", longArray30, longArray37);
        long[] longArray45 = new long[] { 1 };
        long[] longArray47 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray45, longArray47);
        long[] longArray52 = new long[] { 1 };
        long[] longArray54 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray52, longArray54);
        long[] longArray58 = new long[] { 1 };
        long[] longArray60 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray58, longArray60);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray54, longArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray45, longArray58);
        org.junit.Assert.assertArrayEquals(longArray37, longArray45);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.weekly", (java.lang.Object) longArray45);
        long[] longArray66 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray45, longArray66);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("<unknown>", indexReader15, (int) '#', postingsEnum17, postingsEnum18);
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        kuromojiAnalysisTests22.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests22.ruleChain;
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests22.ruleChain;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests22.assertPositionsSkippingEquals("tests.slow", indexReader34, (int) (short) 1, postingsEnum36, postingsEnum37);
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests22.ruleChain;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        kuromojiAnalysisTests22.assertTermsEquals("", indexReader41, terms42, terms43, false);
        kuromojiAnalysisTests22.tearDown();
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain47);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 10, (long) 4);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        char[] charArray0 = new char[] {};
        char[] charArray3 = new char[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 0, (long) 'a');
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) -1, (long) (byte) 1);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray6, byteArray8);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.failfast", (int) (short) 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 0.0d, (double) 2);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        short[] shortArray4 = new short[] { (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
        short[] shortArray19 = new short[] { (short) 10 };
        short[] shortArray21 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray21);
        short[] shortArray25 = new short[] { (short) 10 };
        short[] shortArray27 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray21, shortArray27);
        short[] shortArray32 = new short[] { (short) 10 };
        short[] shortArray34 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray34);
        short[] shortArray39 = new short[] { (short) 10 };
        short[] shortArray41 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray39, shortArray41);
        short[] shortArray45 = new short[] { (short) 10 };
        short[] shortArray47 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray41, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray47);
        short[] shortArray54 = new short[] { (short) 10 };
        short[] shortArray56 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray54, shortArray56);
        short[] shortArray60 = new short[] { (short) 10 };
        short[] shortArray62 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray60, shortArray62);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray56, shortArray62);
        short[] shortArray68 = new short[] { (short) 10 };
        short[] shortArray70 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray68, shortArray70);
        short[] shortArray74 = new short[] { (short) 10 };
        short[] shortArray76 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray74, shortArray76);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray70, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray62);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray34);
        org.junit.Assert.assertArrayEquals("random", shortArray6, shortArray34);
        short[] shortArray88 = new short[] { (short) 10, (short) 1, (short) 100, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray34, shortArray88);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) '#');
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray2, byteArray9);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.nightly", postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests25.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests25);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain49;
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray59);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests61.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet60, (java.lang.Object) kuromojiAnalysisTests61);
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        kuromojiAnalysisTests61.assertDocsEnumEquals("tests.badapples", postingsEnum66, postingsEnum67, true);
        org.junit.rules.TestRule testRule70 = kuromojiAnalysisTests61.ruleChain;
        kuromojiAnalysisTests61.setUp();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        kuromojiAnalysisTests61.assertTermsEquals("tests.badapples", indexReader73, terms74, terms75, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) terms74);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        java.lang.String str13 = kuromojiAnalysisTests2.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.tearDown();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) kuromojiAnalysisTests2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        kuromojiAnalysisTests18.ensureCleanedUp();
        kuromojiAnalysisTests18.resetCheckIndexStatus();
        kuromojiAnalysisTests18.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests18);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        double[] doubleArray6 = new double[] { 1.0d, 10.0f, (byte) 100, (short) 1, 10 };
        double[] doubleArray12 = new double[] { 1.0d, 10.0f, (byte) 100, (short) 1, 10 };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray12 };
        double[] doubleArray19 = new double[] { 1.0d, 10.0f, (byte) 100, (short) 1, 10 };
        double[] doubleArray25 = new double[] { 1.0d, 10.0f, (byte) 100, (short) 1, 10 };
        double[][] doubleArray26 = new double[][] { doubleArray19, doubleArray25 };
        double[] doubleArray32 = new double[] { 1.0d, 10.0f, (byte) 100, (short) 1, 10 };
        double[] doubleArray38 = new double[] { 1.0d, 10.0f, (byte) 100, (short) 1, 10 };
        double[][] doubleArray39 = new double[][] { doubleArray32, doubleArray38 };
        double[] doubleArray45 = new double[] { 1.0d, 10.0f, (byte) 100, (short) 1, 10 };
        double[] doubleArray51 = new double[] { 1.0d, 10.0f, (byte) 100, (short) 1, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray45, doubleArray51 };
        double[][][] doubleArray53 = new double[][][] { doubleArray13, doubleArray26, doubleArray39, doubleArray52 };
        java.util.Set<double[][]> doubleArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray53);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        kuromojiAnalysisTests55.assertFieldsEquals("europarl.lines.txt.gz", indexReader57, fields58, fields59, false);
        kuromojiAnalysisTests55.ensureCleanedUp();
        kuromojiAnalysisTests55.resetCheckIndexStatus();
        kuromojiAnalysisTests55.ensureCleanedUp();
        java.lang.String str65 = kuromojiAnalysisTests55.getTestName();
        kuromojiAnalysisTests55.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule67 = kuromojiAnalysisTests55.ruleChain;
        kuromojiAnalysisTests55.setUp();
        kuromojiAnalysisTests55.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        kuromojiAnalysisTests55.assertDocsSkippingEquals("tests.failfast", indexReader71, 0, postingsEnum73, postingsEnum74, true);
        kuromojiAnalysisTests55.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule78 = kuromojiAnalysisTests55.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) doubleArraySet54, (java.lang.Object) testRule78);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.tearDown();
        java.lang.String str22 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.nightly", postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.slow", indexReader11, (int) '#', postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader24, fields25, fields26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) fields26, (java.lang.Object) 3);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "tests.weekly");
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader19, terms20, terms21, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader26, fields27, fields28, false);
        kuromojiAnalysisTests24.ensureCleanedUp();
        kuromojiAnalysisTests24.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        kuromojiAnalysisTests24.assertTermsEquals("", indexReader34, terms35, terms36, false);
        kuromojiAnalysisTests24.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests24.ruleChain;
        kuromojiAnalysisTests24.tearDown();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        kuromojiAnalysisTests24.assertTermsEquals("hi!", indexReader43, terms44, terms45, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms21, (java.lang.Object) kuromojiAnalysisTests24);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        int[][] intArray0 = new int[][] {};
        java.util.Set<int[]> intArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(intArray0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests2.ruleChain;
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.List<java.io.Serializable> serializableList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray29);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray29, (java.lang.Object) 0.0f);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale37, locale39, locale41, locale43, locale45 };
        java.util.Set<java.util.Locale> localeSet47 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray46);
        java.util.List<java.io.Serializable> serializableList48 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray46);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray46, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray29, (java.lang.Object[]) localeArray46);
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale53, locale55, locale57, locale59, locale61 };
        java.util.Set<java.util.Locale> localeSet63 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray62);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray29, (java.lang.Object[]) localeArray62);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) localeArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray0, (java.lang.Object[]) localeArray62);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray3, intArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("hi!", indexReader23, (int) (byte) 0, postingsEnum25, postingsEnum26);
        kuromojiAnalysisTests15.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests15, (java.lang.Object) kuromojiAnalysisTests29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests31.assertFieldsEquals("europarl.lines.txt.gz", indexReader33, fields34, fields35, false);
        kuromojiAnalysisTests31.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests31.ruleChain;
        kuromojiAnalysisTests31.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) "tests.slow", (java.lang.Object) kuromojiAnalysisTests31);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) "tests.badapples", (java.lang.Object) kuromojiAnalysisTests31);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 0, (double) 1.0f, (double) (-1.0f));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        int[] intArray20 = new int[] { '#' };
        int[] intArray22 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray15, intArray20);
        int[] intArray27 = new int[] { '#' };
        int[] intArray29 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray27, intArray29);
        int[] intArray32 = new int[] { '#' };
        int[] intArray34 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray32, intArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray27, intArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray15, intArray32);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        int[] intArray46 = new int[] { '#' };
        int[] intArray48 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray46, intArray48);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray41, intArray46);
        int[] intArray53 = new int[] { '#' };
        int[] intArray55 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray53, intArray55);
        int[] intArray58 = new int[] { '#' };
        int[] intArray60 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray58, intArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray53, intArray58);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray41, intArray58);
        org.junit.Assert.assertArrayEquals("random", intArray32, intArray41);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) intArray32);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        kuromojiAnalysisTests68.assertFieldsEquals("europarl.lines.txt.gz", indexReader70, fields71, fields72, false);
        kuromojiAnalysisTests68.ensureCleanedUp();
        kuromojiAnalysisTests68.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        kuromojiAnalysisTests68.assertPositionsSkippingEquals("hi!", indexReader78, 1, postingsEnum80, postingsEnum81);
        kuromojiAnalysisTests68.assertPathHasBeenCleared("europarl.lines.txt.gz");
        kuromojiAnalysisTests68.resetCheckIndexStatus();
        kuromojiAnalysisTests68.tearDown();
        kuromojiAnalysisTests68.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests68);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray1);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray1);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray1);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray17 = new java.util.Locale[] { locale8, locale10, locale12, locale14, locale16 };
        java.util.Set<java.util.Locale> localeSet18 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray17);
        java.util.List<java.io.Serializable> serializableList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray17);
        java.util.Set<java.lang.Cloneable> cloneableSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray17);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray17, (java.lang.Object) (byte) -1);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale25, locale27, locale29, locale31, locale33 };
        java.util.Set<java.util.Locale> localeSet35 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray34);
        java.util.List<java.io.Serializable> serializableList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray34);
        java.util.Set<java.lang.Cloneable> cloneableSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray34);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray34, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray17, (java.lang.Object[]) localeArray34);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests41 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        kuromojiAnalysisTests41.assertFieldsEquals("europarl.lines.txt.gz", indexReader43, fields44, fields45, false);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests41.assertPositionsSkippingEquals("tests.failfast", indexReader49, 1, postingsEnum51, postingsEnum52);
        kuromojiAnalysisTests41.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests41.ensureCleanedUp();
        kuromojiAnalysisTests41.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray34, (java.lang.Object) kuromojiAnalysisTests41);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray70 = new java.util.Locale[] { locale61, locale63, locale65, locale67, locale69 };
        java.util.Set<java.util.Locale> localeSet71 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray70);
        java.util.List<java.io.Serializable> serializableList72 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray70);
        java.util.Set<java.lang.Cloneable> cloneableSet73 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray70);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray70, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray34, (java.lang.Object[]) localeArray70);
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale87 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray88 = new java.util.Locale[] { locale79, locale81, locale83, locale85, locale87 };
        java.util.Set<java.util.Locale> localeSet89 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray88);
        java.util.List<java.io.Serializable> serializableList90 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray70, (java.lang.Object[]) localeArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) localeArray88);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests26.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests26);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        java.lang.Class<?> wildcardClass42 = kuromojiAnalysisTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 1L);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
        int[] intArray10 = new int[] { '#' };
        int[] intArray12 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray10, intArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray5, intArray10);
        int[] intArray17 = new int[] { '#' };
        int[] intArray19 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray17, intArray19);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray17, intArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray22);
        int[] intArray30 = new int[] { '#' };
        int[] intArray32 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray30, intArray32);
        int[] intArray35 = new int[] { '#' };
        int[] intArray37 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray35, intArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray30, intArray35);
        org.junit.Assert.assertArrayEquals("", intArray22, intArray35);
        int[] intArray43 = new int[] { '#' };
        int[] intArray45 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray43, intArray45);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray43, intArray48);
        int[] intArray54 = new int[] { '#' };
        int[] intArray56 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray54, intArray56);
        org.junit.Assert.assertArrayEquals(intArray48, intArray54);
        org.junit.Assert.assertArrayEquals(intArray35, intArray48);
        int[] intArray61 = new int[] { '#' };
        int[] intArray63 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray61, intArray63);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray35, intArray61);
        java.lang.Object obj67 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        kuromojiAnalysisTests68.assertFieldsEquals("europarl.lines.txt.gz", indexReader70, fields71, fields72, false);
        kuromojiAnalysisTests68.ensureCleanedUp();
        kuromojiAnalysisTests68.resetCheckIndexStatus();
        kuromojiAnalysisTests68.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", obj67, (java.lang.Object) kuromojiAnalysisTests68);
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        kuromojiAnalysisTests68.assertPositionsSkippingEquals("tests.nightly", indexReader81, (-1), postingsEnum83, postingsEnum84);
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.Fields fields88 = null;
        org.apache.lucene.index.Fields fields89 = null;
        kuromojiAnalysisTests68.assertFieldsEquals("<unknown>", indexReader87, fields88, fields89, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray61, (java.lang.Object) indexReader87);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray2 = new org.junit.rules.RuleChain[][] { ruleChainArray1 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray2);
        double[] doubleArray11 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray16 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray11, doubleArray16, (double) (byte) 100);
        double[] doubleArray25 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray30 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray30, (double) (byte) 100);
        double[] doubleArray38 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray43 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray38, doubleArray43, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray38, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray25, (-1.0d));
        double[] doubleArray56 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray61 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray56, doubleArray61, (double) (byte) 100);
        double[] doubleArray69 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray74 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray69, doubleArray74, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray56, doubleArray69, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray11, doubleArray69, (double) 10.0f);
        java.lang.String[] strArray87 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet88 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray87);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) doubleArray11, (java.lang.Object) strArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) ruleChainArray2, (java.lang.Object[]) strArray87);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        char[] charArray0 = new char[] {};
        char[] charArray2 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.awaitsfix", obj1);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        kuromojiAnalysisTests22.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain31 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        java.lang.String str33 = kuromojiAnalysisTests22.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests22);
        kuromojiAnalysisTests22.tearDown();
        kuromojiAnalysisTests22.setUp();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests22.assertPositionsSkippingEquals("", indexReader38, (int) '#', postingsEnum40, postingsEnum41);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests22.assertDocsSkippingEquals("<unknown>", indexReader45, (int) (byte) -1, postingsEnum47, postingsEnum48, false);
        org.junit.Assert.assertNotSame("", (java.lang.Object) kuromojiAnalysisTests11, (java.lang.Object) (byte) -1);
        kuromojiAnalysisTests11.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests11);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale5, locale7, locale9, locale11, locale13 };
        java.util.Set<java.util.Locale> localeSet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.List<java.io.Serializable> serializableList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray14);
        java.util.Set<java.lang.Cloneable> cloneableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray14);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray14, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray14);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale26, locale28, locale30, locale32, locale34 };
        java.util.Set<java.util.Locale> localeSet36 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray35);
        java.util.List<java.io.Serializable> serializableList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray35);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray35, (java.lang.Object) 0.0f);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale43, locale45, locale47, locale49, locale51 };
        java.util.Set<java.util.Locale> localeSet53 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray52);
        java.util.List<java.io.Serializable> serializableList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray52);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray52, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray35, (java.lang.Object[]) localeArray52);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale60, locale62, locale64, locale66, locale68 };
        java.util.Set<java.util.Locale> localeSet70 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray69);
        java.util.List<java.io.Serializable> serializableList71 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray69);
        java.util.Set<java.lang.Cloneable> cloneableSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray52, (java.lang.Object[]) localeArray69);
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale77, locale79, locale81, locale83, locale85 };
        java.util.Set<java.util.Locale> localeSet87 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray86);
        java.util.List<java.io.Serializable> serializableList88 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray86);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray86, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray52, (java.lang.Object[]) localeArray86);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) localeArray14, (java.lang.Object[]) localeArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) localeArray14);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader14, fields15, fields16, false);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests2.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) (-1.0d), (java.lang.Object) kuromojiAnalysisTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) (-1.0d));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader20, (int) ' ', postingsEnum22, postingsEnum23);
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain25;
        double[] doubleArray33 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray38 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray38, (double) (byte) 100);
        double[] doubleArray46 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray51 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray46, doubleArray51, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray46, (double) 0);
        double[] doubleArray61 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray66 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray61, doubleArray66, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray61, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain25, (java.lang.Object) 0.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) '4', (long) (byte) 100);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader12, (int) (short) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader19, terms20, terms21, false);
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale29, locale31, locale33, locale35, locale37 };
        java.util.Set<java.util.Locale> localeSet39 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray38);
        java.util.List<java.io.Serializable> serializableList40 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray38);
        java.util.Set<java.lang.Cloneable> cloneableSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray38);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray38, (java.lang.Object) (byte) -1);
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale46, locale48, locale50, locale52, locale54 };
        java.util.Set<java.util.Locale> localeSet56 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray55);
        java.util.List<java.io.Serializable> serializableList57 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray55);
        java.util.Set<java.lang.Cloneable> cloneableSet58 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray55);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray55, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray38, (java.lang.Object[]) localeArray55);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        kuromojiAnalysisTests62.assertFieldsEquals("europarl.lines.txt.gz", indexReader64, fields65, fields66, false);
        kuromojiAnalysisTests62.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain71 = kuromojiAnalysisTests62.failureAndSuccessEvents;
        kuromojiAnalysisTests62.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray38, (java.lang.Object) kuromojiAnalysisTests62);
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray85 = new java.util.Locale[] { locale76, locale78, locale80, locale82, locale84 };
        java.util.Set<java.util.Locale> localeSet86 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray85);
        java.util.List<java.io.Serializable> serializableList87 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray85);
        org.junit.Assert.assertNotNull((java.lang.Object) localeArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray38, (java.lang.Object[]) localeArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) localeArray38);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray2, charArray3);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1L, (long) (byte) 1);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        byte[] byteArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray8);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 1, (float) 0L, (float) 0L);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) (short) 1, 0.0f);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (-1), (float) (byte) 0, (float) 0L);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setUp();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale15, locale17, locale19, locale21, locale23 };
        java.util.Set<java.util.Locale> localeSet25 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray24);
        java.util.List<java.io.Serializable> serializableList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray24);
        java.util.Set<java.lang.Cloneable> cloneableSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray24);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray24, (java.lang.Object) (byte) -1);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale32, locale34, locale36, locale38, locale40 };
        java.util.Set<java.util.Locale> localeSet42 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray41);
        java.util.List<java.io.Serializable> serializableList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray41);
        java.util.Set<java.lang.Cloneable> cloneableSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray41);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray41, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray24, (java.lang.Object[]) localeArray41);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        kuromojiAnalysisTests48.assertFieldsEquals("europarl.lines.txt.gz", indexReader50, fields51, fields52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests48.assertPositionsSkippingEquals("tests.failfast", indexReader56, 1, postingsEnum58, postingsEnum59);
        kuromojiAnalysisTests48.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests48.ensureCleanedUp();
        kuromojiAnalysisTests48.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray41, (java.lang.Object) kuromojiAnalysisTests48);
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale68, locale70, locale72, locale74, locale76 };
        java.util.Set<java.util.Locale> localeSet78 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray77);
        java.util.List<java.io.Serializable> serializableList79 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray77);
        java.util.Set<java.lang.Cloneable> cloneableSet80 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray77);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray77, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray41, (java.lang.Object[]) localeArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) localeArray41);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", 0.0d, (double) (short) -1, (double) 10.0f);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0.0d, (double) 100.0f, (double) 10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray5, byteArray12);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) (byte) 10, (-1.0f), (float) (byte) 1);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray4, byteArray7);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 3);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) '4');
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        long[] longArray6 = new long[] { 1 };
        long[] longArray8 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray6, longArray8);
        long[] longArray13 = new long[] { 1 };
        long[] longArray15 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray13, longArray15);
        long[] longArray19 = new long[] { 1 };
        long[] longArray21 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray19, longArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray15, longArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray19);
        long[] longArray28 = new long[] { 1 };
        long[] longArray30 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray28, longArray30);
        long[] longArray34 = new long[] { 1 };
        long[] longArray36 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray34, longArray36);
        org.junit.Assert.assertArrayEquals("random", longArray30, longArray36);
        long[] longArray42 = new long[] { 1 };
        long[] longArray44 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray42, longArray44);
        long[] longArray49 = new long[] { 1 };
        long[] longArray51 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray49, longArray51);
        long[] longArray55 = new long[] { 1 };
        long[] longArray57 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray55, longArray57);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray51, longArray55);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray42, longArray55);
        org.junit.Assert.assertArrayEquals(longArray36, longArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray6, longArray36);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) longArray6);
        long[] longArray67 = new long[] { 1 };
        long[] longArray69 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray67, longArray69);
        long[] longArray73 = new long[] { 1 };
        long[] longArray75 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray73, longArray75);
        org.junit.Assert.assertArrayEquals("random", longArray69, longArray75);
        org.junit.Assert.assertArrayEquals("", longArray6, longArray69);
        long[] longArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray79);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        java.lang.String str13 = kuromojiAnalysisTests2.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.setUp();
        org.junit.rules.TestRule testRule16 = kuromojiAnalysisTests2.ruleChain;
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) ruleChain17);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        float[] floatArray43 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray50 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray43, floatArray50, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray43, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray43, (float) 1L);
        float[] floatArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray8, floatArray57, (float) (short) 100);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale16, locale18, locale20, locale22, locale24 };
        java.util.Set<java.util.Locale> localeSet26 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray25);
        java.util.List<java.io.Serializable> serializableList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray25);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale31, locale33, locale35, locale37, locale39 };
        java.util.Set<java.util.Locale> localeSet41 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray40);
        java.util.List<java.io.Serializable> serializableList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray40);
        java.util.Set<java.lang.Cloneable> cloneableSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray25, (java.lang.Object[]) localeArray40);
        java.util.List[] listArray47 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray48 = (java.util.List<java.io.Serializable>[]) listArray47;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray48);
        java.util.List<java.util.List<java.io.Serializable>> serializableListList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, serializableListArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray25, (java.lang.Object[]) serializableListArray48);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray3, byteArray8);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) 100L, 1.0f);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        java.lang.Object obj2 = new java.lang.Object();
        org.junit.Assert.assertNotNull("hi!", obj2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] { (short) 10 };
        short[] shortArray7 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray7);
        short[] shortArray11 = new short[] { (short) 10 };
        short[] shortArray13 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray13);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray13);
        short[] shortArray19 = new short[] { (short) 10 };
        short[] shortArray21 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray21);
        short[] shortArray25 = new short[] { (short) 10 };
        short[] shortArray27 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray21, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray13);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 0, 0L);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale34, locale36, locale38, locale40, locale42 };
        java.util.Set<java.util.Locale> localeSet44 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray43);
        java.util.List<java.io.Serializable> serializableList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray43);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale49, locale51, locale53, locale55, locale57 };
        java.util.Set<java.util.Locale> localeSet59 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray58);
        java.util.List<java.io.Serializable> serializableList60 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray58);
        java.util.Set<java.lang.Cloneable> cloneableSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray58);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray43, (java.lang.Object[]) localeArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray43);
        java.util.Set<java.lang.Cloneable> cloneableSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) localeArray13);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader11, 0, postingsEnum13, postingsEnum14, false);
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (-1.0d));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { '#' };
        int[] intArray6 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
        int[] intArray9 = new int[] { '#' };
        int[] intArray11 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray9, intArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray4, intArray9);
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        org.junit.Assert.assertArrayEquals(intArray9, intArray15);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        int[] intArray27 = new int[] { '#' };
        int[] intArray29 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray27, intArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray22, intArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray9, intArray27);
        int[] intArray36 = new int[] { '#' };
        int[] intArray38 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray36, intArray38);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray36, intArray41);
        int[] intArray47 = new int[] { '#' };
        int[] intArray49 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray47, intArray49);
        org.junit.Assert.assertArrayEquals(intArray41, intArray47);
        int[] intArray54 = new int[] { '#' };
        int[] intArray56 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray54, intArray56);
        int[] intArray59 = new int[] { '#' };
        int[] intArray61 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray59, intArray61);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray54, intArray59);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray41, intArray59);
        org.junit.Assert.assertArrayEquals(intArray27, intArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray41);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain36;
        org.junit.rules.RuleChain[] ruleChainArray38 = new org.junit.rules.RuleChain[] { ruleChain22, ruleChain36 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet39 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray38);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet40 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray38);
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChainArray38);
        int[][] intArray42 = new int[][] {};
        java.util.Set<int[]> intArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(intArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) ruleChainArray38, (java.lang.Object[]) intArray42);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray3, byteArray7);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, 0.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 3);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        java.util.List[] listArray2 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray3 = (java.util.List<java.io.Serializable>[]) listArray2;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray3);
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        double[] doubleArray22 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray27 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray22, doubleArray27, (double) (byte) 100);
        double[] doubleArray36 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray41 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray41, (double) (byte) 100);
        double[] doubleArray49 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray54 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray49, doubleArray54, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray49, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray36, (-1.0d));
        double[] doubleArray67 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray72 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray67, doubleArray72, (double) (byte) 100);
        double[] doubleArray80 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray85 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray80, doubleArray85, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray67, doubleArray80, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray22, doubleArray80, (double) 10.0f);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) executorServiceArray13, (java.lang.Object) "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) serializableListArray3, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        char[] charArray5 = new char[] { 'a', '#', 'a', 'a' };
        char[] charArray12 = new char[] { 'a', 'a', '4', 'a', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray5, charArray12);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        char[] charArray5 = new char[] { '#', '4', ' ', ' ', ' ' };
        char[] charArray12 = new char[] { 'a', '4', '#', '#', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray12);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader11, 0, postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader23, 0, postingsEnum25, postingsEnum26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader25, fields26, fields27, false);
        kuromojiAnalysisTests23.ensureCleanedUp();
        kuromojiAnalysisTests23.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests23.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests23.assertDocsSkippingEquals("tests.slow", indexReader34, (int) (short) -1, postingsEnum36, postingsEnum37, false);
        kuromojiAnalysisTests23.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain41 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain41);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        float[] floatArray9 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray16 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray26, (float) (-1));
        float[] floatArray45 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray52 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray45, floatArray52, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("", floatArray26, floatArray45, (float) (-1L));
        float[] floatArray64 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray71 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray64, floatArray71, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray71, (float) 0L);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.lang.String str12 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) '4');
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (byte) 10);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain36;
        org.junit.rules.RuleChain[] ruleChainArray38 = new org.junit.rules.RuleChain[] { ruleChain22, ruleChain36 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet39 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray38);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet40 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray38);
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChainArray38);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray43 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray43);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        kuromojiAnalysisTests45.assertFieldsEquals("europarl.lines.txt.gz", indexReader47, fields48, fields49, false);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests45.assertPositionsSkippingEquals("tests.failfast", indexReader53, 1, postingsEnum55, postingsEnum56);
        kuromojiAnalysisTests45.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests45.ensureCleanedUp();
        kuromojiAnalysisTests45.resetCheckIndexStatus();
        kuromojiAnalysisTests45.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        kuromojiAnalysisTests45.assertFieldsEquals("enwiki.random.lines.txt", indexReader64, fields65, fields66, false);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        kuromojiAnalysisTests45.assertDocsSkippingEquals("tests.weekly", indexReader70, (int) (byte) 0, postingsEnum72, postingsEnum73, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) genericDeclarationArray43, (java.lang.Object) "tests.weekly");
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray43, (java.lang.Object[]) executorServiceArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) ruleChainArray38, (java.lang.Object[]) genericDeclarationArray43);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, false);
        kuromojiAnalysisTests21.ensureCleanedUp();
        kuromojiAnalysisTests21.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain31 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        kuromojiAnalysisTests11.failureAndSuccessEvents = ruleChain31;
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet41, (java.lang.Object) kuromojiAnalysisTests42);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests42.assertDocsEnumEquals("tests.badapples", postingsEnum47, postingsEnum48, true);
        org.junit.rules.TestRule testRule51 = kuromojiAnalysisTests42.ruleChain;
        kuromojiAnalysisTests42.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests42.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests11, (java.lang.Object) kuromojiAnalysisTests42);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) (-1.0d), (java.lang.Object) kuromojiAnalysisTests1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        kuromojiAnalysisTests20.ensureCleanedUp();
        kuromojiAnalysisTests20.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests20.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests20.assertDocsSkippingEquals("tests.slow", indexReader31, (int) (short) -1, postingsEnum33, postingsEnum34, false);
        kuromojiAnalysisTests20.assertPathHasBeenCleared("tests.slow");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.ensureCleanedUp();
        kuromojiAnalysisTests39.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests39.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests39.assertDocsSkippingEquals("tests.slow", indexReader50, (int) (short) -1, postingsEnum52, postingsEnum53, false);
        kuromojiAnalysisTests39.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests39.assertDocsEnumEquals("", postingsEnum58, postingsEnum59, false);
        org.junit.rules.RuleChain ruleChain62 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        kuromojiAnalysisTests20.failureAndSuccessEvents = ruleChain62;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain62;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale5, locale7, locale9, locale11, locale13 };
        java.util.Set<java.util.Locale> localeSet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.List<java.io.Serializable> serializableList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray14);
        java.util.Set<java.lang.Cloneable> cloneableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray14);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray14, (java.lang.Object) (byte) -1);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale22, locale24, locale26, locale28, locale30 };
        java.util.Set<java.util.Locale> localeSet32 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray31);
        java.util.List<java.io.Serializable> serializableList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray31);
        java.util.Set<java.lang.Cloneable> cloneableSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray31);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray31, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray14, (java.lang.Object[]) localeArray31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests38.assertPositionsSkippingEquals("tests.failfast", indexReader46, 1, postingsEnum48, postingsEnum49);
        kuromojiAnalysisTests38.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests38.ensureCleanedUp();
        kuromojiAnalysisTests38.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray31, (java.lang.Object) kuromojiAnalysisTests38);
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray67 = new java.util.Locale[] { locale58, locale60, locale62, locale64, locale66 };
        java.util.Set<java.util.Locale> localeSet68 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray67);
        java.util.List<java.io.Serializable> serializableList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray67);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray31, (java.lang.Object[]) localeArray67);
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) localeArray31);
        int[][] intArray72 = new int[][] {};
        int[][][] intArray73 = new int[][][] { intArray72 };
        java.util.Set<int[][]> intArraySet74 = org.apache.lucene.util.LuceneTestCase.asSet(intArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) localeArray31, (java.lang.Object[]) intArray73);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        char[] charArray6 = new char[] { '4', '4', ' ', 'a', ' ' };
        char[] charArray8 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray6, charArray8);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        java.lang.String str14 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("<unknown>", indexReader19, (int) ' ', postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("random", postingsEnum26, postingsEnum27, true);
        kuromojiAnalysisTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        float[] floatArray43 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray50 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray43, floatArray50, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray43, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray43, (float) 1L);
        float[] floatArray64 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray71 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray64, floatArray71, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray8, floatArray71, 100.0f);
        float[] floatArray80 = new float[] { (-1.0f), '4', 10L, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray80, 100.0f);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        char[] charArray4 = new char[] { 'a', 'a', '#' };
        char[] charArray11 = new char[] { 'a', '#', '4', ' ', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray4, charArray11);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale6, locale8, locale10, locale12, locale14 };
        java.util.Set<java.util.Locale> localeSet16 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray15);
        java.util.List<java.io.Serializable> serializableList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray15);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray15, (java.lang.Object) 0.0f);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale23, locale25, locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.util.List<java.io.Serializable> serializableList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray32);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray32, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray15, (java.lang.Object[]) localeArray32);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale39, locale41, locale43, locale45, locale47 };
        java.util.Set<java.util.Locale> localeSet49 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray48);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray15, (java.lang.Object[]) localeArray48);
        java.lang.Object[] objArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) localeArray15, objArray51);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        char[] charArray2 = new char[] { ' ', ' ' };
        char[] charArray5 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', 10L);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 100, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray8);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray5, byteArray11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        double[][] doubleArray6 = new double[][] {};
        double[][] doubleArray7 = new double[][] {};
        double[][] doubleArray8 = new double[][] {};
        double[][][] doubleArray9 = new double[][][] { doubleArray6, doubleArray7, doubleArray8 };
        java.util.List<double[][]> doubleArrayList10 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, doubleArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) doubleArray9);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        java.lang.String[] strArray3 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        kuromojiAnalysisTests5.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests5.assertPositionsSkippingEquals("tests.failfast", indexReader13, 1, postingsEnum15, postingsEnum16);
        kuromojiAnalysisTests5.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests5.tearDown();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests5.ruleChain;
        kuromojiAnalysisTests5.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strComparableSet4, (java.lang.Object) kuromojiAnalysisTests5);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (short) 100);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain21;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests28.assertPositionsSkippingEquals("tests.failfast", indexReader36, 1, postingsEnum38, postingsEnum39);
        kuromojiAnalysisTests28.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        kuromojiAnalysisTests28.assertFieldsEquals("tests.slow", indexReader44, fields45, fields46, false);
        kuromojiAnalysisTests28.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests28.ruleChain;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) testRule50);
        org.junit.rules.TestRule[] testRuleArray52 = new org.junit.rules.TestRule[] { ruleChain21, testRule50 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet53 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleArray52, (java.lang.Object[]) executorServiceArray54);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests9.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("tests.maxfailures", indexReader20, (int) (byte) 100, postingsEnum22, postingsEnum23, false);
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        kuromojiAnalysisTests9.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests9.assertTermsEquals("hi!", indexReader29, terms30, terms31, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader36, fields37, fields38, false);
        kuromojiAnalysisTests34.tearDown();
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests9.assertDocValuesEquals("tests.weekly", (int) '#', numericDocValues47, numericDocValues48);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        float[] floatArray7 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray14 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray24 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray31 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray24, floatArray31, (float) (byte) 100);
        float[] floatArray42 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray49 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray42, floatArray49, (float) (byte) 100);
        float[] floatArray59 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray66 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray59, floatArray66, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray42, floatArray59, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray59, (float) 1L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray24, 1.0f);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) 'a', (float) (byte) 1, (float) (byte) -1);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (short) 100);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, 1L);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, 10.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 100.0f);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests10.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests10.ruleChain;
        kuromojiAnalysisTests10.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests10.assertTermsEquals("", indexReader22, terms23, terms24, false);
        kuromojiAnalysisTests10.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 10L, (java.lang.Object) kuromojiAnalysisTests10);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (-1.0d), (-1.0d));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests13.resetCheckIndexStatus();
        kuromojiAnalysisTests13.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests13.ruleChain;
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale31, locale33, locale35, locale37, locale39 };
        java.util.Set<java.util.Locale> localeSet41 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray40);
        java.util.List<java.io.Serializable> serializableList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray40);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray40, (java.lang.Object) 0.0f);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale48, locale50, locale52, locale54, locale56 };
        java.util.Set<java.util.Locale> localeSet58 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray57);
        java.util.List<java.io.Serializable> serializableList59 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray57);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray57, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray40, (java.lang.Object[]) localeArray57);
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale64, locale66, locale68, locale70, locale72 };
        java.util.Set<java.util.Locale> localeSet74 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray73);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray40, (java.lang.Object[]) localeArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests13, (java.lang.Object) localeArray73);
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale87 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray88 = new java.util.Locale[] { locale79, locale81, locale83, locale85, locale87 };
        java.util.Set<java.util.Locale> localeSet89 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray88);
        java.util.List<java.io.Serializable> serializableList90 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray88);
        java.util.Set<java.lang.Cloneable> cloneableSet91 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray73, (java.lang.Object[]) localeArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) localeArray88);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray1, byteArray8);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader25, fields26, fields27, false);
        kuromojiAnalysisTests23.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests23.ruleChain;
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests23.ruleChain;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests23.assertPositionsSkippingEquals("tests.slow", indexReader35, (int) (short) 1, postingsEnum37, postingsEnum38);
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests23.ruleChain;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests23.assertTermsEquals("", indexReader42, terms43, terms44, false);
        org.junit.rules.TestRule testRule47 = kuromojiAnalysisTests23.ruleChain;
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain48);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader25, fields26, fields27, false);
        kuromojiAnalysisTests23.ensureCleanedUp();
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        kuromojiAnalysisTests23.ensureCleanedUp();
        java.lang.String str33 = kuromojiAnalysisTests23.getTestName();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("<unknown>", indexReader35, fields36, fields37, true);
        kuromojiAnalysisTests23.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) 10, (java.lang.Object) kuromojiAnalysisTests23);
        kuromojiAnalysisTests23.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) kuromojiAnalysisTests11, (java.lang.Object) kuromojiAnalysisTests23);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) fields13);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 100L);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.List<java.io.Serializable> serializableList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray11);
        java.util.Set<java.lang.Cloneable> cloneableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass21 = locale20.getClass();
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass24 = locale23.getClass();
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass27 = locale26.getClass();
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass30 = locale29.getClass();
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass33 = locale32.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray34 = new java.lang.reflect.AnnotatedElement[] { wildcardClass21, wildcardClass24, wildcardClass27, wildcardClass30, wildcardClass33 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet35 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray34);
        java.lang.Object obj36 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray34, obj36);
        org.junit.Assert.assertNotEquals((java.lang.Object) boolean18, (java.lang.Object) annotatedElementArray34);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray11, (java.lang.Object[]) annotatedElementArray34);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.junit.rules.TestRule[] testRuleArray7 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures6 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet8 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader11, fields12, fields13, false);
        kuromojiAnalysisTests9.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests9.setUp();
        kuromojiAnalysisTests9.ensureCheckIndexPassed();
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) testRuleArray7, (java.lang.Object) kuromojiAnalysisTests9);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray22 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray22);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray22);
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray22);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet28 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray27);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet29 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray27);
        org.junit.Assert.assertNotEquals((java.lang.Object) 1, (java.lang.Object) genericDeclarationArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) genericDeclarationArray22, (java.lang.Object[]) genericDeclarationArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) testRuleArray7, (java.lang.Object[]) genericDeclarationArray27);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        long[] longArray2 = new long[] { '#' };
        long[] longArray4 = new long[] { '#' };
        long[][] longArray5 = new long[][] { longArray2, longArray4 };
        long[] longArray7 = new long[] { '#' };
        long[] longArray9 = new long[] { '#' };
        long[][] longArray10 = new long[][] { longArray7, longArray9 };
        long[][][] longArray11 = new long[][][] { longArray5, longArray10 };
        java.util.List<long[][]> longArrayList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, longArray11);
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale17, locale19, locale21, locale23, locale25 };
        java.util.Set<java.util.Locale> localeSet27 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray26);
        java.util.List<java.io.Serializable> serializableList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray26);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray26, (java.lang.Object) 0.0f);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale34, locale36, locale38, locale40, locale42 };
        java.util.Set<java.util.Locale> localeSet44 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray43);
        java.util.List<java.io.Serializable> serializableList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray43);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray43, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray26, (java.lang.Object[]) localeArray43);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale51, locale53, locale55, locale57, locale59 };
        java.util.Set<java.util.Locale> localeSet61 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray60);
        java.util.List<java.io.Serializable> serializableList62 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray60);
        java.util.Set<java.lang.Cloneable> cloneableSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray43, (java.lang.Object[]) localeArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) longArray11, (java.lang.Object[]) localeArray43);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 1L, (double) ' ');
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        float[] floatArray9 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray16 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, (float) (byte) 100);
        short[] shortArray22 = new short[] { (short) 10 };
        short[] shortArray24 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray22, shortArray24);
        short[] shortArray29 = new short[] { (short) 10 };
        short[] shortArray31 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray29, shortArray31);
        short[] shortArray35 = new short[] { (short) 10 };
        short[] shortArray37 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray35, shortArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray31, shortArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray22, shortArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (byte) 100, (java.lang.Object) shortArray22);
        short[] shortArray44 = new short[] { (short) 10 };
        short[] shortArray46 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray44, shortArray46);
        short[] shortArray50 = new short[] { (short) 10 };
        short[] shortArray52 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray50, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray22, shortArray46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        kuromojiAnalysisTests56.assertFieldsEquals("europarl.lines.txt.gz", indexReader58, fields59, fields60, false);
        kuromojiAnalysisTests56.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain65 = kuromojiAnalysisTests56.failureAndSuccessEvents;
        kuromojiAnalysisTests56.resetCheckIndexStatus();
        kuromojiAnalysisTests56.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule68 = kuromojiAnalysisTests56.ruleChain;
        kuromojiAnalysisTests56.ensureCleanedUp();
        kuromojiAnalysisTests56.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests56);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        long[] longArray6 = new long[] { 1 };
        long[] longArray8 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray6, longArray8);
        long[] longArray12 = new long[] { 1 };
        long[] longArray14 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray12, longArray14);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray8, longArray12);
        long[] longArray19 = new long[] { 1 };
        long[] longArray21 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray19, longArray21);
        org.junit.Assert.assertArrayEquals("hi!", longArray12, longArray19);
        long[] longArray27 = new long[] { 1 };
        long[] longArray29 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray27, longArray29);
        long[] longArray33 = new long[] { 1 };
        long[] longArray35 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray33, longArray35);
        org.junit.Assert.assertArrayEquals("random", longArray29, longArray35);
        long[] longArray41 = new long[] { 1 };
        long[] longArray43 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray41, longArray43);
        long[] longArray48 = new long[] { 1 };
        long[] longArray50 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray48, longArray50);
        long[] longArray54 = new long[] { 1 };
        long[] longArray56 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray54, longArray56);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray50, longArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray41, longArray54);
        org.junit.Assert.assertArrayEquals(longArray35, longArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray12, longArray35);
        java.lang.Iterable[] iterableArray64 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[] localeIterableArray65 = (java.lang.Iterable<java.util.Locale>[]) iterableArray64;
        java.lang.Iterable[] iterableArray67 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[] localeIterableArray68 = (java.lang.Iterable<java.util.Locale>[]) iterableArray67;
        java.lang.Iterable[] iterableArray70 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[] localeIterableArray71 = (java.lang.Iterable<java.util.Locale>[]) iterableArray70;
        java.lang.Iterable[] iterableArray73 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[] localeIterableArray74 = (java.lang.Iterable<java.util.Locale>[]) iterableArray73;
        java.lang.Iterable[][] iterableArray76 = new java.lang.Iterable[4][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[][] localeIterableArray77 = (java.lang.Iterable<java.util.Locale>[][]) iterableArray76;
        localeIterableArray77[0] = iterableArray64;
        localeIterableArray77[1] = iterableArray67;
        localeIterableArray77[2] = localeIterableArray71;
        localeIterableArray77[3] = localeIterableArray74;
        java.util.List<java.lang.Iterable<java.util.Locale>[]> localeIterableArrayList86 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, localeIterableArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) "tests.failfast", (java.lang.Object) localeIterableArrayList86);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        char[] charArray3 = new char[] { '#', '#' };
        char[] charArray9 = new char[] { '4', 'a', 'a', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray3, charArray9);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray9);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        java.lang.String[] strArray3 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests6.assertPositionsSkippingEquals("hi!", indexReader14, (int) (byte) 0, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests6.assertTermsEquals("random", indexReader20, terms21, terms22, true);
        kuromojiAnalysisTests6.setUp();
        kuromojiAnalysisTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("", indexReader28, fields29, fields30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        kuromojiAnalysisTests6.assertTermsEquals("", indexReader34, terms35, terms36, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        kuromojiAnalysisTests39.setUp();
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale52, locale54, locale56, locale58, locale60 };
        java.util.Set<java.util.Locale> localeSet62 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray61);
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale65, locale67, locale69, locale71, locale73 };
        java.util.Set<java.util.Locale> localeSet75 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray74);
        java.util.List<java.io.Serializable> serializableList76 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray61, (java.lang.Object[]) localeArray74);
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale86 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale88 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale80, locale82, locale84, locale86, locale88 };
        java.util.Set<java.util.Locale> localeSet90 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray89);
        java.util.List<java.io.Serializable> serializableList91 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray89);
        java.util.Set<java.lang.Cloneable> cloneableSet92 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray89);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray74, (java.lang.Object[]) localeArray89);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests39, (java.lang.Object) localeArray89);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) terms36, (java.lang.Object) localeArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) localeArray89);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader11, fields12, fields13, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests17.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields20, fields21, false);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet32, (java.lang.Object) kuromojiAnalysisTests33);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests33.assertDocsEnumEquals("tests.badapples", postingsEnum38, postingsEnum39, true);
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests33.ruleChain;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests33.assertDocsSkippingEquals("tests.maxfailures", indexReader44, (int) (byte) 100, postingsEnum46, postingsEnum47, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        kuromojiAnalysisTests50.assertFieldsEquals("europarl.lines.txt.gz", indexReader52, fields53, fields54, false);
        kuromojiAnalysisTests50.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain59 = kuromojiAnalysisTests50.failureAndSuccessEvents;
        kuromojiAnalysisTests33.failureAndSuccessEvents = ruleChain59;
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain59;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain59;
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests65 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        kuromojiAnalysisTests65.assertFieldsEquals("europarl.lines.txt.gz", indexReader67, fields68, fields69, false);
        kuromojiAnalysisTests65.ensureCleanedUp();
        kuromojiAnalysisTests65.resetCheckIndexStatus();
        kuromojiAnalysisTests65.ensureCleanedUp();
        kuromojiAnalysisTests65.ensureCheckIndexPassed();
        java.lang.String str76 = kuromojiAnalysisTests65.getTestName();
        java.lang.String str77 = kuromojiAnalysisTests65.getTestName();
        org.junit.rules.TestRule testRule78 = kuromojiAnalysisTests65.ruleChain;
        org.junit.rules.TestRule testRule79 = kuromojiAnalysisTests65.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "random", (java.lang.Object) testRule79);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 100.0f, (float) (byte) 1, (float) 0L);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) 0, (double) 10.0f);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, true);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("random", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.monster", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (byte) 100);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), (double) (short) 1, (double) '4');
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (byte) 100);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 0.0f, 1.0d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray12, (java.lang.Object) (byte) -1);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.List<java.io.Serializable> serializableList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray29);
        java.util.Set<java.lang.Cloneable> cloneableSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray29);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray29, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("tests.failfast", indexReader44, 1, postingsEnum46, postingsEnum47);
        kuromojiAnalysisTests36.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests36.ensureCleanedUp();
        kuromojiAnalysisTests36.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray29, (java.lang.Object) kuromojiAnalysisTests36);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale56, locale58, locale60, locale62, locale64 };
        java.util.Set<java.util.Locale> localeSet66 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray65);
        java.util.List<java.io.Serializable> serializableList67 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray65);
        java.util.Set<java.lang.Cloneable> cloneableSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray65);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray65, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray29, (java.lang.Object[]) localeArray65);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests73 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        kuromojiAnalysisTests73.assertFieldsEquals("europarl.lines.txt.gz", indexReader75, fields76, fields77, false);
        kuromojiAnalysisTests73.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain82 = kuromojiAnalysisTests73.failureAndSuccessEvents;
        kuromojiAnalysisTests73.resetCheckIndexStatus();
        java.lang.String str84 = kuromojiAnalysisTests73.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests73);
        kuromojiAnalysisTests73.tearDown();
        kuromojiAnalysisTests73.setUp();
        org.apache.lucene.index.IndexReader indexReader89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        kuromojiAnalysisTests73.assertPositionsSkippingEquals("", indexReader89, (int) '#', postingsEnum91, postingsEnum92);
        kuromojiAnalysisTests73.ensureCleanedUp();
        kuromojiAnalysisTests73.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) localeArray65, (java.lang.Object) kuromojiAnalysisTests73);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        byte[] byteArray8 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray8);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        float[] floatArray9 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray16 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray26, (float) (-1));
        float[] floatArray45 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray52 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray45, floatArray52, (float) (byte) 100);
        float[] floatArray63 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray70 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray63, floatArray70, (float) (byte) 100);
        float[] floatArray80 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray87 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray80, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray80, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray80, (float) 1L);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray26, floatArray80, (float) 'a');
        float[] floatArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray96, 1.0f);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray30, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests37.assertPositionsSkippingEquals("tests.failfast", indexReader45, 1, postingsEnum47, postingsEnum48);
        kuromojiAnalysisTests37.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests37.ensureCleanedUp();
        kuromojiAnalysisTests37.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray30, (java.lang.Object) kuromojiAnalysisTests37);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) localeArray30, (java.lang.Object[]) executorServiceArray55);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        java.lang.String str13 = kuromojiAnalysisTests2.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.tearDown();
        java.lang.String str17 = kuromojiAnalysisTests2.getTestName();
        java.lang.String str18 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.awaitsfix", indexReader21, (int) (short) 0, postingsEnum23, postingsEnum24);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.ensureCleanedUp();
        kuromojiAnalysisTests26.resetCheckIndexStatus();
        kuromojiAnalysisTests26.ensureCleanedUp();
        kuromojiAnalysisTests26.ensureCheckIndexPassed();
        kuromojiAnalysisTests26.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests26.assertDocsSkippingEquals("tests.slow", indexReader39, (-1), postingsEnum41, postingsEnum42, true);
        kuromojiAnalysisTests26.setUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests26.assertPositionsSkippingEquals("<unknown>", indexReader47, (int) (byte) -1, postingsEnum49, postingsEnum50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) postingsEnum49);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) -1, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests16.assertPositionsSkippingEquals("tests.failfast", indexReader24, 1, postingsEnum26, postingsEnum27);
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests16.tearDown();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests16.ruleChain;
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader11, (java.lang.Object) kuromojiAnalysisTests16);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) 10, (long) (short) 1);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.junit.rules.TestRule[] testRuleArray6 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures0, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet7 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray6);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests8.assertFieldsEquals("europarl.lines.txt.gz", indexReader10, fields11, fields12, false);
        kuromojiAnalysisTests8.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests8.setUp();
        kuromojiAnalysisTests8.ensureCheckIndexPassed();
        kuromojiAnalysisTests8.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) testRuleArray6, (java.lang.Object) kuromojiAnalysisTests8);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests8.assertDocValuesEquals("tests.weekly", (-1), numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray10);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests3.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, false);
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests3.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests10.ensureCleanedUp();
        kuromojiAnalysisTests10.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests10.tearDown();
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) kuromojiAnalysisTests10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray36);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests38.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet37, (java.lang.Object) kuromojiAnalysisTests38);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests38.assertDocsEnumEquals("tests.badapples", postingsEnum43, postingsEnum44, true);
        org.junit.rules.TestRule testRule47 = kuromojiAnalysisTests38.ruleChain;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests38.assertDocsSkippingEquals("tests.maxfailures", indexReader49, (int) (byte) 100, postingsEnum51, postingsEnum52, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        kuromojiAnalysisTests55.assertFieldsEquals("europarl.lines.txt.gz", indexReader57, fields58, fields59, false);
        kuromojiAnalysisTests55.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain64 = kuromojiAnalysisTests55.failureAndSuccessEvents;
        kuromojiAnalysisTests38.failureAndSuccessEvents = ruleChain64;
        kuromojiAnalysisTests22.failureAndSuccessEvents = ruleChain64;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests67 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        kuromojiAnalysisTests67.assertFieldsEquals("europarl.lines.txt.gz", indexReader69, fields70, fields71, false);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        kuromojiAnalysisTests67.assertPositionsSkippingEquals("hi!", indexReader75, (int) (byte) 0, postingsEnum77, postingsEnum78);
        kuromojiAnalysisTests67.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain64, (java.lang.Object) kuromojiAnalysisTests67);
        kuromojiAnalysisTests3.failureAndSuccessEvents = ruleChain64;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", obj1, (java.lang.Object) ruleChain64);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale15, locale17, locale19, locale21, locale23 };
        java.util.Set<java.util.Locale> localeSet25 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray24);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale28, locale30, locale32, locale34, locale36 };
        java.util.Set<java.util.Locale> localeSet38 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray37);
        java.util.List<java.io.Serializable> serializableList39 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray24, (java.lang.Object[]) localeArray37);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale43, locale45, locale47, locale49, locale51 };
        java.util.Set<java.util.Locale> localeSet53 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray52);
        java.util.List<java.io.Serializable> serializableList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray52);
        java.util.Set<java.lang.Cloneable> cloneableSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray52);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray37, (java.lang.Object[]) localeArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) 0.0f, (java.lang.Object) localeArray52);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale60, locale62, locale64, locale66, locale68 };
        java.util.Set<java.util.Locale> localeSet70 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray69);
        java.util.List<java.io.Serializable> serializableList71 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray69);
        java.util.Set<java.lang.Cloneable> cloneableSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray69);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray69, (java.lang.Object) (byte) -1);
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale77, locale79, locale81, locale83, locale85 };
        java.util.Set<java.util.Locale> localeSet87 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray86);
        java.util.List<java.io.Serializable> serializableList88 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray86);
        java.util.Set<java.lang.Cloneable> cloneableSet89 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray86);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray86, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray69, (java.lang.Object[]) localeArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray52, (java.lang.Object[]) localeArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) localeArray52);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests9.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("tests.maxfailures", indexReader20, (int) (byte) 100, postingsEnum22, postingsEnum23, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain35;
        kuromojiAnalysisTests9.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("tests.awaitsfix", indexReader39, (int) '#', postingsEnum41, postingsEnum42, true);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests9.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum46, postingsEnum47);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray3, intArray8);
        int[] intArray16 = new int[] { '#' };
        int[] intArray18 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray16, intArray18);
        int[] intArray21 = new int[] { '#' };
        int[] intArray23 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray21, intArray23);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray16, intArray21);
        int[] intArray28 = new int[] { '#' };
        int[] intArray30 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray28, intArray30);
        int[] intArray33 = new int[] { '#' };
        int[] intArray35 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray33, intArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray28, intArray33);
        int[] intArray39 = new int[] { '#' };
        int[] intArray41 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray39, intArray41);
        org.junit.Assert.assertArrayEquals(intArray33, intArray39);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray21, intArray33);
        org.junit.Assert.assertArrayEquals("", intArray8, intArray33);
        int[] intArray46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray8, intArray46);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        long[] longArray27 = new long[] { '#' };
        long[] longArray29 = new long[] { '#' };
        long[][] longArray30 = new long[][] { longArray27, longArray29 };
        long[] longArray32 = new long[] { '#' };
        long[] longArray34 = new long[] { '#' };
        long[][] longArray35 = new long[][] { longArray32, longArray34 };
        long[][][] longArray36 = new long[][][] { longArray30, longArray35 };
        java.util.List<long[][]> longArrayList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, longArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) longArray36);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader23, (int) (short) 0, postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("<unknown>", indexReader30, (int) (byte) 1, postingsEnum32, postingsEnum33);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        kuromojiAnalysisTests38.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        kuromojiAnalysisTests38.resetCheckIndexStatus();
        java.lang.String str49 = kuromojiAnalysisTests38.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests38);
        kuromojiAnalysisTests38.tearDown();
        kuromojiAnalysisTests38.setUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        kuromojiAnalysisTests38.assertPositionsSkippingEquals("", indexReader54, (int) '#', postingsEnum56, postingsEnum57);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests38.assertPositionsSkippingEquals("tests.weekly", indexReader60, (int) (short) 10, postingsEnum62, postingsEnum63);
        java.lang.String str65 = kuromojiAnalysisTests38.getTestName();
        org.junit.rules.RuleChain ruleChain66 = null;
        kuromojiAnalysisTests38.failureAndSuccessEvents = ruleChain66;
        kuromojiAnalysisTests38.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) 0, (java.lang.Object) kuromojiAnalysisTests38);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray4, byteArray6);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests4.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, false);
        kuromojiAnalysisTests4.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests4.failureAndSuccessEvents;
        kuromojiAnalysisTests4.resetCheckIndexStatus();
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule16 = kuromojiAnalysisTests4.ruleChain;
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale22, locale24, locale26, locale28, locale30 };
        java.util.Set<java.util.Locale> localeSet32 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray31);
        java.util.List<java.io.Serializable> serializableList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray31);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray31, (java.lang.Object) 0.0f);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale39, locale41, locale43, locale45, locale47 };
        java.util.Set<java.util.Locale> localeSet49 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray48);
        java.util.List<java.io.Serializable> serializableList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray48);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray48, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray31, (java.lang.Object[]) localeArray48);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale55, locale57, locale59, locale61, locale63 };
        java.util.Set<java.util.Locale> localeSet65 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray64);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray31, (java.lang.Object[]) localeArray64);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests4, (java.lang.Object) localeArray64);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale70, locale72, locale74, locale76, locale78 };
        java.util.Set<java.util.Locale> localeSet80 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray79);
        java.util.List<java.io.Serializable> serializableList81 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray79);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray64, (java.lang.Object[]) localeArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) localeArray79);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        short[] shortArray3 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray5);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        short[] shortArray16 = new short[] { (short) 10 };
        short[] shortArray18 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray12, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray18);
        short[] shortArray25 = new short[] { (short) 10 };
        short[] shortArray27 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray27);
        short[] shortArray31 = new short[] { (short) 10 };
        short[] shortArray33 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray27, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray33);
        short[] shortArray41 = new short[] { (short) 10 };
        short[] shortArray43 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray41, shortArray43);
        short[] shortArray47 = new short[] { (short) 10 };
        short[] shortArray49 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray43, shortArray49);
        short[] shortArray55 = new short[] { (short) 10 };
        short[] shortArray57 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray55, shortArray57);
        short[] shortArray61 = new short[] { (short) 10 };
        short[] shortArray63 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray61, shortArray63);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray57, shortArray63);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray43, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) shortArray5);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        short[] shortArray4 = new short[] { (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray6, shortArray12);
        short[] shortArray15 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray12, shortArray15);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 100);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests14.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, false);
        kuromojiAnalysisTests14.ensureCleanedUp();
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("", indexReader25, (int) (byte) 0, postingsEnum27, postingsEnum28);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests14);
        kuromojiAnalysisTests14.setUp();
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) kuromojiAnalysisTests14);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.failfast", indexReader10, 1, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests2.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("tests.slow", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("<unknown>", indexReader24, (int) 'a', postingsEnum26, postingsEnum27);
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.assertPathHasBeenCleared("enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) (short) 0, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0d, (double) (short) 10);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray17 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray27 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray34 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray27, floatArray34, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray27, (float) (-1));
        float[] floatArray47 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray54 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray47, floatArray54, (float) (byte) 100);
        float[] floatArray64 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray71 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray64, floatArray71, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray47, floatArray64, (float) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray10, floatArray47, (float) 10L);
        org.junit.Assert.assertNotNull((java.lang.Object) floatArray10);
        float[] floatArray86 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray93 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray86, floatArray93, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray10, floatArray93, (float) (byte) 1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), 100L);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (-1), numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule9);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (short) -1, postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.badapples");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale16, locale18, locale20, locale22, locale24 };
        java.util.Set<java.util.Locale> localeSet26 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray25);
        java.util.List<java.io.Serializable> serializableList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray25);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale31, locale33, locale35, locale37, locale39 };
        java.util.Set<java.util.Locale> localeSet41 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray40);
        java.util.List<java.io.Serializable> serializableList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray40);
        java.util.Set<java.lang.Cloneable> cloneableSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray25, (java.lang.Object[]) localeArray40);
        org.junit.Assert.assertNotSame((java.lang.Object) 0.0f, (java.lang.Object) localeArray40);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale48, locale50, locale52, locale54, locale56 };
        java.util.Set<java.util.Locale> localeSet58 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray57);
        java.util.List<java.io.Serializable> serializableList59 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray40, (java.lang.Object[]) localeArray57);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        kuromojiAnalysisTests61.assertFieldsEquals("europarl.lines.txt.gz", indexReader63, fields64, fields65, false);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests61.assertPositionsSkippingEquals("tests.failfast", indexReader69, 1, postingsEnum71, postingsEnum72);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        kuromojiAnalysisTests61.assertPositionsSkippingEquals("<unknown>", indexReader75, (int) '#', postingsEnum77, postingsEnum78);
        kuromojiAnalysisTests61.setUp();
        kuromojiAnalysisTests61.restoreIndexWriterMaxDocs();
        java.lang.String str82 = kuromojiAnalysisTests61.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) localeArray40, (java.lang.Object) str82);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray5, byteArray11);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray3 = new java.util.Locale[] { locale2 };
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray6 = new java.util.Locale[] { locale5 };
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale8 };
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale11 };
        java.util.Locale[][] localeArray13 = new java.util.Locale[][] { localeArray3, localeArray6, localeArray9, localeArray12 };
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale15 };
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale18 };
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale21 };
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale24 };
        java.util.Locale[][] localeArray26 = new java.util.Locale[][] { localeArray16, localeArray19, localeArray22, localeArray25 };
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale28 };
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale31 };
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale34 };
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale37 };
        java.util.Locale[][] localeArray39 = new java.util.Locale[][] { localeArray29, localeArray32, localeArray35, localeArray38 };
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale41 };
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale44 };
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale47 };
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale50 };
        java.util.Locale[][] localeArray52 = new java.util.Locale[][] { localeArray42, localeArray45, localeArray48, localeArray51 };
        java.util.Locale[][][] localeArray53 = new java.util.Locale[][][] { localeArray13, localeArray26, localeArray39, localeArray52 };
        java.util.Set<java.util.Locale[][]> localeArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray53);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        kuromojiAnalysisTests55.assertFieldsEquals("europarl.lines.txt.gz", indexReader57, fields58, fields59, false);
        kuromojiAnalysisTests55.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain64 = kuromojiAnalysisTests55.failureAndSuccessEvents;
        kuromojiAnalysisTests55.ensureAllSearchContextsReleased();
        java.lang.String str66 = kuromojiAnalysisTests55.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        kuromojiAnalysisTests55.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum68, postingsEnum69, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) localeArray53, (java.lang.Object) postingsEnum68);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale6, locale8, locale10, locale12, locale14 };
        java.util.Set<java.util.Locale> localeSet16 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray15);
        java.util.List<java.io.Serializable> serializableList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray15);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray15, (java.lang.Object) 0.0f);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale23, locale25, locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.util.List<java.io.Serializable> serializableList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray32);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray32, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray15, (java.lang.Object[]) localeArray32);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale39, locale41, locale43, locale45, locale47 };
        java.util.Set<java.util.Locale> localeSet49 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray48);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray15, (java.lang.Object[]) localeArray48);
        java.lang.Object obj51 = new java.lang.Object();
        org.junit.Assert.assertNotSame((java.lang.Object) localeArray15, obj51);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) localeArray15, (java.lang.Object[]) executorServiceArray53);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) (byte) 100, (float) (short) -1);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.slow", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("hi!", postingsEnum22, postingsEnum23, true);
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, false);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests44.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet43, (java.lang.Object) kuromojiAnalysisTests44);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests44.assertDocsEnumEquals("tests.badapples", postingsEnum49, postingsEnum50, true);
        org.junit.rules.TestRule testRule53 = kuromojiAnalysisTests44.ruleChain;
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        kuromojiAnalysisTests44.assertDocsSkippingEquals("tests.maxfailures", indexReader55, (int) (byte) 100, postingsEnum57, postingsEnum58, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        kuromojiAnalysisTests61.assertFieldsEquals("europarl.lines.txt.gz", indexReader63, fields64, fields65, false);
        kuromojiAnalysisTests61.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain70 = kuromojiAnalysisTests61.failureAndSuccessEvents;
        kuromojiAnalysisTests44.failureAndSuccessEvents = ruleChain70;
        kuromojiAnalysisTests28.failureAndSuccessEvents = ruleChain70;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests73 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        kuromojiAnalysisTests73.assertFieldsEquals("europarl.lines.txt.gz", indexReader75, fields76, fields77, false);
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        kuromojiAnalysisTests73.assertPositionsSkippingEquals("hi!", indexReader81, (int) (byte) 0, postingsEnum83, postingsEnum84);
        kuromojiAnalysisTests73.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain70, (java.lang.Object) kuromojiAnalysisTests73);
        java.lang.Class<?> wildcardClass88 = ruleChain70.getClass();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain70);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests12.ruleChain;
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests12.ruleChain;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("tests.slow", indexReader24, (int) (short) 1, postingsEnum26, postingsEnum27);
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests12.ruleChain;
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) testRule29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) testRule29);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        char[] charArray7 = new char[] { '4', 'a', 'a', '4', '#', '4' };
        char[] charArray14 = new char[] { '4', 'a', '4', '#', 'a', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray7, charArray14);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 0.0f, (double) 100.0f, (double) 4);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        int[] intArray1 = null;
        int[] intArray4 = new int[] { '#' };
        int[] intArray6 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
        int[] intArray9 = new int[] { '#' };
        int[] intArray11 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray9, intArray11);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray4, intArray9);
        int[] intArray17 = new int[] { '#' };
        int[] intArray19 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray17, intArray19);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray17, intArray22);
        int[] intArray29 = new int[] { '#' };
        int[] intArray31 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray29, intArray31);
        int[] intArray34 = new int[] { '#' };
        int[] intArray36 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray34, intArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray29, intArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray17, intArray34);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        org.junit.Assert.assertArrayEquals(intArray34, intArray43);
        org.junit.Assert.assertArrayEquals(intArray9, intArray34);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        kuromojiAnalysisTests47.assertFieldsEquals("europarl.lines.txt.gz", indexReader49, fields50, fields51, false);
        kuromojiAnalysisTests47.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests47.setUp();
        kuromojiAnalysisTests47.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) intArray9, (java.lang.Object) kuromojiAnalysisTests47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray1, intArray9);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("enwiki.random.lines.txt", indexReader5, terms6, terms7, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) (-1.0d), (java.lang.Object) indexReader5);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader17, (int) '#', postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader23, (int) (short) 10, postingsEnum25, postingsEnum26);
        java.lang.String str28 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 0, (double) 0.0f);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray2, byteArray7);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        char[] charArray6 = new char[] { ' ', ' ', 'a', '4', 'a', 'a' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        int[] intArray20 = new int[] { '#' };
        int[] intArray22 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray15, intArray20);
        int[] intArray27 = new int[] { '#' };
        int[] intArray29 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray27, intArray29);
        int[] intArray32 = new int[] { '#' };
        int[] intArray34 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray32, intArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray27, intArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray15, intArray32);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        int[] intArray46 = new int[] { '#' };
        int[] intArray48 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray46, intArray48);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray41, intArray46);
        int[] intArray53 = new int[] { '#' };
        int[] intArray55 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray53, intArray55);
        int[] intArray58 = new int[] { '#' };
        int[] intArray60 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray58, intArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray53, intArray58);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray41, intArray58);
        org.junit.Assert.assertArrayEquals("random", intArray32, intArray41);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) intArray32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests66 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        kuromojiAnalysisTests66.assertFieldsEquals("europarl.lines.txt.gz", indexReader68, fields69, fields70, false);
        kuromojiAnalysisTests66.ensureCleanedUp();
        kuromojiAnalysisTests66.resetCheckIndexStatus();
        kuromojiAnalysisTests66.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        kuromojiAnalysisTests66.assertPositionsSkippingEquals("", indexReader77, (int) (byte) 0, postingsEnum79, postingsEnum80);
        kuromojiAnalysisTests66.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        kuromojiAnalysisTests66.assertDocsSkippingEquals("<unknown>", indexReader84, (int) ' ', postingsEnum86, postingsEnum87, false);
        kuromojiAnalysisTests66.setUp();
        org.apache.lucene.index.IndexReader indexReader92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum94 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum95 = null;
        kuromojiAnalysisTests66.assertDocsSkippingEquals("tests.failfast", indexReader92, 1, postingsEnum94, postingsEnum95, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) indexReader92);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray0);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray0);
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray0);
        int[] intArray8 = new int[] { (byte) -1, ' ', 100, (short) 1 };
        int[] intArray13 = new int[] { (byte) -1, ' ', 100, (short) 1 };
        int[][] intArray14 = new int[][] { intArray8, intArray13 };
        java.util.Set<int[]> intArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(intArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) genericDeclarationArray0, (java.lang.Object[]) intArray14);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.weekly", indexReader13, fields14, fields15, true);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        java.lang.String str13 = kuromojiAnalysisTests2.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.tearDown();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocValuesEquals("tests.awaitsfix", 1, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        int[] intArray4 = new int[] { (byte) -1, ' ', 100, (short) 1 };
        int[] intArray9 = new int[] { (byte) -1, ' ', 100, (short) 1 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        java.util.Set<int[]> intArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(intArray10);
        long[] longArray14 = new long[] { '#' };
        long[] longArray16 = new long[] { '#' };
        long[][] longArray17 = new long[][] { longArray14, longArray16 };
        long[] longArray19 = new long[] { '#' };
        long[] longArray21 = new long[] { '#' };
        long[][] longArray22 = new long[][] { longArray19, longArray21 };
        long[][][] longArray23 = new long[][][] { longArray17, longArray22 };
        java.util.List<long[][]> longArrayList24 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, longArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray10, (java.lang.Object[]) longArray23);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray1);
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet7 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray6);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet8 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray6);
        org.junit.Assert.assertNotEquals((java.lang.Object) 1, (java.lang.Object) genericDeclarationArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) genericDeclarationArray1, (java.lang.Object[]) genericDeclarationArray6);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale15, locale17, locale19, locale21, locale23 };
        java.util.Set<java.util.Locale> localeSet25 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray24);
        java.util.List<java.io.Serializable> serializableList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray24);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray24, (java.lang.Object) 0.0f);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale32, locale34, locale36, locale38, locale40 };
        java.util.Set<java.util.Locale> localeSet42 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray41);
        java.util.List<java.io.Serializable> serializableList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray41);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray41, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray24, (java.lang.Object[]) localeArray41);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale49, locale51, locale53, locale55, locale57 };
        java.util.Set<java.util.Locale> localeSet59 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray58);
        java.util.List<java.io.Serializable> serializableList60 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray58);
        java.util.Set<java.lang.Cloneable> cloneableSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray41, (java.lang.Object[]) localeArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) genericDeclarationArray6, (java.lang.Object[]) localeArray41);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) -1, (double) 1L, (double) 0.0f);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        long[] longArray6 = new long[] { 1 };
        long[] longArray8 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray6, longArray8);
        long[] longArray13 = new long[] { 1 };
        long[] longArray15 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray13, longArray15);
        long[] longArray19 = new long[] { 1 };
        long[] longArray21 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray19, longArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray15, longArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray19);
        long[] longArray28 = new long[] { 1 };
        long[] longArray30 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray28, longArray30);
        long[] longArray34 = new long[] { 1 };
        long[] longArray36 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray34, longArray36);
        org.junit.Assert.assertArrayEquals("random", longArray30, longArray36);
        long[] longArray42 = new long[] { 1 };
        long[] longArray44 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray42, longArray44);
        long[] longArray49 = new long[] { 1 };
        long[] longArray51 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray49, longArray51);
        long[] longArray55 = new long[] { 1 };
        long[] longArray57 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray55, longArray57);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray51, longArray55);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray42, longArray55);
        org.junit.Assert.assertArrayEquals(longArray36, longArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray6, longArray36);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) longArray6);
        long[] longArray67 = new long[] { 1 };
        long[] longArray69 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray67, longArray69);
        long[] longArray73 = new long[] { 1 };
        long[] longArray75 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray73, longArray75);
        org.junit.Assert.assertArrayEquals("random", longArray69, longArray75);
        org.junit.Assert.assertArrayEquals("", longArray6, longArray69);
        long[] longArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray69, longArray79);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) 'a', (double) 100);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests9.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("tests.maxfailures", indexReader20, (int) (byte) 100, postingsEnum22, postingsEnum23, false);
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        kuromojiAnalysisTests9.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests9);
        kuromojiAnalysisTests9.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("tests.slow", indexReader31, (-1), postingsEnum33, postingsEnum34, false);
        java.lang.Object obj37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (-1), obj37);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures8);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures8 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList11 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, testRuleIgnoreAfterMaxFailuresArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) (byte) 0);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        java.lang.String str11 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("<unknown>", indexReader13, fields14, fields15, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        kuromojiAnalysisTests18.ensureCleanedUp();
        kuromojiAnalysisTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        kuromojiAnalysisTests18.assertTermsEquals("", indexReader28, terms29, terms30, false);
        kuromojiAnalysisTests18.resetCheckIndexStatus();
        kuromojiAnalysisTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests18.assertDocsEnumEquals("tests.monster", postingsEnum36, postingsEnum37, true);
        kuromojiAnalysisTests18.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) fields14, (java.lang.Object) kuromojiAnalysisTests18);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 4, (double) 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        java.lang.Object obj0 = null;
        short[] shortArray4 = new short[] { (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray6, shortArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) shortArray12);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, true);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("random", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) ' ', numericDocValues16, numericDocValues17);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        java.lang.String str12 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.resetCheckIndexStatus();
        kuromojiAnalysisTests15.ensureCleanedUp();
        java.lang.String str25 = kuromojiAnalysisTests15.getTestName();
        kuromojiAnalysisTests15.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests15.ruleChain;
        kuromojiAnalysisTests15.setUp();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests15.tearDown();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests15.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) testRule32);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '#', (double) '4', (double) (byte) -1);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader16, terms17, terms18, true);
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader30, terms31, terms32, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests35.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        kuromojiAnalysisTests35.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain44 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        kuromojiAnalysisTests35.setUp();
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale48, locale50, locale52, locale54, locale56 };
        java.util.Set<java.util.Locale> localeSet58 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray57);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray70 = new java.util.Locale[] { locale61, locale63, locale65, locale67, locale69 };
        java.util.Set<java.util.Locale> localeSet71 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray70);
        java.util.List<java.io.Serializable> serializableList72 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray57, (java.lang.Object[]) localeArray70);
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray85 = new java.util.Locale[] { locale76, locale78, locale80, locale82, locale84 };
        java.util.Set<java.util.Locale> localeSet86 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray85);
        java.util.List<java.io.Serializable> serializableList87 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray85);
        java.util.Set<java.lang.Cloneable> cloneableSet88 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray85);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray70, (java.lang.Object[]) localeArray85);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests35, (java.lang.Object) localeArray85);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) terms32, (java.lang.Object) localeArray85);
        java.lang.String[] strArray93 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet94 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray93);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet95 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) localeArray85, (java.lang.Object[]) strArray93);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", byteArray4, byteArray8);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 1, (long) (byte) 100);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("hi!", indexReader10, 10, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests16.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests16.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain29;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests31.assertFieldsEquals("europarl.lines.txt.gz", indexReader33, fields34, fields35, false);
        kuromojiAnalysisTests31.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        kuromojiAnalysisTests31.resetCheckIndexStatus();
        java.lang.String str42 = kuromojiAnalysisTests31.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests31);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 100, (double) (short) 10);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((-1));
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        kuromojiAnalysisTests22.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain31 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests34.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests34.assertTermsEquals("tests.weekly", indexReader38, terms39, terms40, true);
        kuromojiAnalysisTests34.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests34.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests34.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) ruleChain31, (java.lang.Object) kuromojiAnalysisTests34);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain31;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum50, postingsEnum51);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray8);
        int[] intArray14 = new int[] { '#' };
        int[] intArray16 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray14, intArray16);
        org.junit.Assert.assertArrayEquals(intArray8, intArray14);
        int[] intArray21 = new int[] { '#' };
        int[] intArray23 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray21, intArray23);
        int[] intArray26 = new int[] { '#' };
        int[] intArray28 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray26, intArray28);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray21, intArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray8, intArray26);
        int[] intArray35 = new int[] { '#' };
        int[] intArray37 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray35, intArray37);
        int[] intArray40 = new int[] { '#' };
        int[] intArray42 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray40, intArray42);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray35, intArray40);
        int[] intArray46 = new int[] { '#' };
        int[] intArray48 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray46, intArray48);
        org.junit.Assert.assertArrayEquals(intArray40, intArray46);
        int[] intArray53 = new int[] { '#' };
        int[] intArray55 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray53, intArray55);
        int[] intArray58 = new int[] { '#' };
        int[] intArray60 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray58, intArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray53, intArray58);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray40, intArray58);
        org.junit.Assert.assertArrayEquals(intArray26, intArray40);
        int[] intArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray26, intArray65);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests11.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule20);
        double[] doubleArray24 = new double[] { 100, (short) 100 };
        double[] doubleArray27 = new double[] { 100, (short) 100 };
        double[] doubleArray30 = new double[] { 100, (short) 100 };
        double[][] doubleArray31 = new double[][] { doubleArray24, doubleArray27, doubleArray30 };
        java.util.Set<double[]> doubleArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule20, (java.lang.Object) doubleArray31);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.monster");
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests20.assertPositionsSkippingEquals("hi!", indexReader28, (int) (byte) 0, postingsEnum30, postingsEnum31);
        kuromojiAnalysisTests20.ensureCheckIndexPassed();
        java.lang.Class<?> wildcardClass34 = kuromojiAnalysisTests20.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) wildcardClass34);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0L, (double) 10L, (double) 1);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale15, locale17, locale19, locale21, locale23 };
        java.util.Set<java.util.Locale> localeSet25 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray24);
        java.util.List<java.io.Serializable> serializableList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray11, (java.lang.Object[]) localeArray24);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale30, locale32, locale34, locale36, locale38 };
        java.util.Set<java.util.Locale> localeSet40 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray39);
        java.util.List<java.io.Serializable> serializableList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray39);
        java.util.Set<java.lang.Cloneable> cloneableSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray39);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray24, (java.lang.Object[]) localeArray39);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass46 = locale45.getClass();
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass49 = locale48.getClass();
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass52 = locale51.getClass();
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass55 = locale54.getClass();
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass58 = locale57.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray59 = new java.lang.reflect.AnnotatedElement[] { wildcardClass46, wildcardClass49, wildcardClass52, wildcardClass55, wildcardClass58 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet60 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray59);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet61 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray59);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray39, (java.lang.Object[]) annotatedElementArray59);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (byte) -1);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests11);
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        kuromojiAnalysisTests22.ensureCleanedUp();
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests22.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests22);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.ensureCleanedUp();
        kuromojiAnalysisTests13.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests13.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain23;
        java.lang.Object obj25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, obj25);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
        short[] shortArray17 = new short[] { (short) 10 };
        short[] shortArray19 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray19);
        short[] shortArray24 = new short[] { (short) 10 };
        short[] shortArray26 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray26);
        short[] shortArray30 = new short[] { (short) 10 };
        short[] shortArray32 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray32);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray26, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray32);
        short[] shortArray39 = new short[] { (short) 10 };
        short[] shortArray41 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray39, shortArray41);
        short[] shortArray45 = new short[] { (short) 10 };
        short[] shortArray47 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray47);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray47);
        short[] shortArray53 = new short[] { (short) 10 };
        short[] shortArray55 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray53, shortArray55);
        short[] shortArray59 = new short[] { (short) 10 };
        short[] shortArray61 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray59, shortArray61);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray55, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray47);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests11.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule20);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        int[] intArray0 = null;
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
        int[] intArray10 = new int[] { '#' };
        int[] intArray12 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray10, intArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray5, intArray10);
        int[] intArray17 = new int[] { '#' };
        int[] intArray19 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray17, intArray19);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray17, intArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray22);
        int[] intArray30 = new int[] { '#' };
        int[] intArray32 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray30, intArray32);
        int[] intArray35 = new int[] { '#' };
        int[] intArray37 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray35, intArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray30, intArray35);
        org.junit.Assert.assertArrayEquals("", intArray22, intArray35);
        int[] intArray44 = new int[] { '#' };
        int[] intArray46 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray44, intArray46);
        int[] intArray49 = new int[] { '#' };
        int[] intArray51 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray49, intArray51);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray44, intArray49);
        int[] intArray57 = new int[] { '#' };
        int[] intArray59 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray57, intArray59);
        int[] intArray62 = new int[] { '#' };
        int[] intArray64 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray62, intArray64);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray57, intArray62);
        int[] intArray69 = new int[] { '#' };
        int[] intArray71 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray69, intArray71);
        int[] intArray74 = new int[] { '#' };
        int[] intArray76 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray74, intArray76);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray69, intArray74);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray57, intArray74);
        int[] intArray81 = new int[] { '#' };
        int[] intArray83 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray81, intArray83);
        org.junit.Assert.assertArrayEquals(intArray74, intArray83);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray49, intArray83);
        org.junit.Assert.assertArrayEquals(intArray22, intArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray49);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        java.lang.Object[] objArray0 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet3 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) genericDeclarationArray1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 100L, (double) (byte) 100, (double) 1);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        char[] charArray1 = new char[] {};
        char[] charArray6 = new char[] { '#', ' ', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray1, charArray6);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (-1.0f), 1.0f);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (-1.0f));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        float[] floatArray1 = null;
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray17 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray28 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray35 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray28, floatArray35, (float) (byte) 100);
        float[] floatArray45 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray52 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray45, floatArray52, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray28, floatArray45, (float) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray10, floatArray28, (float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray1, floatArray10, (float) 1L);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) genericDeclarationArray1, (java.lang.Object[]) executorServiceArray4);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests17.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields20, fields21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("hi!", indexReader25, (int) (byte) 0, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests17.assertTermsEquals("random", indexReader31, terms32, terms33, true);
        kuromojiAnalysisTests17.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests17.assertDocsEnumEquals("tests.nightly", postingsEnum38, postingsEnum39, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        kuromojiAnalysisTests42.assertFieldsEquals("europarl.lines.txt.gz", indexReader44, fields45, fields46, false);
        kuromojiAnalysisTests42.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain51 = kuromojiAnalysisTests42.failureAndSuccessEvents;
        kuromojiAnalysisTests42.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        kuromojiAnalysisTests53.assertFieldsEquals("europarl.lines.txt.gz", indexReader55, fields56, fields57, false);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests53.assertPositionsSkippingEquals("hi!", indexReader61, (int) (byte) 0, postingsEnum63, postingsEnum64);
        kuromojiAnalysisTests53.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray67 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests17, kuromojiAnalysisTests42, kuromojiAnalysisTests53 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet68 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray67);
        java.util.Set<org.junit.Assert> assertSet69 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) kuromojiAnalysisTestsArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) assertSet69);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.setUp();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule15);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests26.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests26);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader43, (int) (short) 100, postingsEnum45, postingsEnum46);
        kuromojiAnalysisTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests35.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests35.assertPositionsSkippingEquals("hi!", indexReader43, (int) (byte) 0, postingsEnum45, postingsEnum46);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray48 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests1, kuromojiAnalysisTests28, kuromojiAnalysisTests35 };
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, eSTestCaseArray48);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet50 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) eSTestCaseArray48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling53 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList55 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray54);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttlingArray54);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet58 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTestCaseArray48, (java.lang.Object[]) throttlingArray54);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        short[] shortArray3 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray5);
        short[] shortArray9 = new short[] { (short) 10 };
        short[] shortArray11 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray11);
        short[] shortArray19 = new short[] { (short) 10 };
        short[] shortArray21 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray21);
        short[] shortArray26 = new short[] { (short) 10 };
        short[] shortArray28 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray26, shortArray28);
        short[] shortArray32 = new short[] { (short) 10 };
        short[] shortArray34 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray28, shortArray34);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray19, shortArray28);
        short[] shortArray40 = new short[] { (short) 10 };
        short[] shortArray42 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray40, shortArray42);
        short[] shortArray47 = new short[] { (short) 10 };
        short[] shortArray49 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray49);
        short[] shortArray53 = new short[] { (short) 10 };
        short[] shortArray55 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray53, shortArray55);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray49, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray55);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray19, shortArray42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests60 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        kuromojiAnalysisTests60.assertFieldsEquals("europarl.lines.txt.gz", indexReader62, fields63, fields64, false);
        kuromojiAnalysisTests60.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule69 = kuromojiAnalysisTests60.ruleChain;
        org.junit.rules.TestRule testRule70 = kuromojiAnalysisTests60.ruleChain;
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        kuromojiAnalysisTests60.assertPositionsSkippingEquals("tests.slow", indexReader72, (int) (short) 1, postingsEnum74, postingsEnum75);
        org.junit.rules.TestRule testRule77 = kuromojiAnalysisTests60.ruleChain;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) shortArray19, (java.lang.Object) kuromojiAnalysisTests60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests60);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        char[] charArray3 = new char[] { '#', '#' };
        char[] charArray9 = new char[] { '4', 'a', 'a', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray3, charArray9);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        float[] floatArray4 = new float[] { '#', (short) 1, 10L, 0 };
        float[] floatArray13 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray20 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray13, floatArray20, (float) (byte) 100);
        float[] floatArray30 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray37 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray30, floatArray37, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray13, floatArray30, (float) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray13, (float) (byte) 100);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100.0f, 0.0d, (double) 0L);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (-1L), (double) 100.0f);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) 1, (long) '4');
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
        double[] doubleArray6 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray19, (double) 0);
        double[] doubleArray34 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray39 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray39, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray34, 0.0d);
        double[] doubleArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray44, (double) 100.0f);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.monster");
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (byte) 10, (float) 0L);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 'a', 10.0d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) (byte) 100, (float) '4');
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.lang.String str10 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        kuromojiAnalysisTests18.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        kuromojiAnalysisTests18.resetCheckIndexStatus();
        java.lang.String str29 = kuromojiAnalysisTests18.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests18);
        kuromojiAnalysisTests18.tearDown();
        kuromojiAnalysisTests18.setUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests18.assertPositionsSkippingEquals("", indexReader34, (int) '#', postingsEnum36, postingsEnum37);
        org.junit.rules.RuleChain ruleChain39 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests18.assertDocsSkippingEquals("<unknown>", indexReader41, (int) (byte) -1, postingsEnum43, postingsEnum44, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.maxfailures", (java.lang.Object) indexReader41);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 0, (-1L));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests35.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests35.assertPositionsSkippingEquals("hi!", indexReader43, (int) (byte) 0, postingsEnum45, postingsEnum46);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray48 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests1, kuromojiAnalysisTests28, kuromojiAnalysisTests35 };
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, eSTestCaseArray48);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet50 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) eSTestCaseArray48);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures51 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures52 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures51);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures53 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures54 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures53);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures55 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures56 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures55);
        org.junit.rules.TestRule[] testRuleArray57 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures51, testRuleIgnoreAfterMaxFailures54, testRuleIgnoreAfterMaxFailures56 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet58 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray57);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) eSTestCaseArray48, (java.lang.Object[]) testRuleArray57);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray8);
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        int[] intArray20 = new int[] { '#' };
        int[] intArray22 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray15, intArray20);
        int[] intArray26 = new int[] { '#' };
        int[] intArray28 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray26, intArray28);
        org.junit.Assert.assertArrayEquals(intArray20, intArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray8, intArray20);
        int[] intArray35 = new int[] { '#' };
        int[] intArray37 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray35, intArray37);
        int[] intArray40 = new int[] { '#' };
        int[] intArray42 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray40, intArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray35, intArray40);
        int[] intArray47 = new int[] { '#' };
        int[] intArray49 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray47, intArray49);
        int[] intArray52 = new int[] { '#' };
        int[] intArray54 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray52, intArray54);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray47, intArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray35, intArray52);
        int[] intArray59 = new int[] { '#' };
        int[] intArray61 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray59, intArray61);
        org.junit.Assert.assertArrayEquals(intArray52, intArray61);
        org.junit.Assert.assertArrayEquals(intArray8, intArray52);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests65 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        kuromojiAnalysisTests65.assertFieldsEquals("europarl.lines.txt.gz", indexReader67, fields68, fields69, false);
        kuromojiAnalysisTests65.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain74 = kuromojiAnalysisTests65.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        kuromojiAnalysisTests65.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum76, postingsEnum77, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray8, (java.lang.Object) "europarl.lines.txt.gz");
        int[] intArray81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray8, intArray81);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0.0f, (double) (short) 0);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 0, (long) 'a');
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        char[] charArray5 = new char[] { '4', '#', 'a', '#' };
        char[] charArray6 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray5, charArray6);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 0);
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) 1, postingsEnum20, postingsEnum21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) (byte) 1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("", indexReader12, (int) (short) 1, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, false);
        java.lang.String str24 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests25.assertPositionsSkippingEquals("hi!", indexReader33, (int) (byte) 0, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        kuromojiAnalysisTests25.assertTermsEquals("random", indexReader39, terms40, terms41, true);
        kuromojiAnalysisTests25.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests25.assertDocsEnumEquals("tests.nightly", postingsEnum46, postingsEnum47, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        kuromojiAnalysisTests50.assertFieldsEquals("europarl.lines.txt.gz", indexReader52, fields53, fields54, false);
        kuromojiAnalysisTests50.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain59 = kuromojiAnalysisTests50.failureAndSuccessEvents;
        kuromojiAnalysisTests50.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        kuromojiAnalysisTests61.assertFieldsEquals("europarl.lines.txt.gz", indexReader63, fields64, fields65, false);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests61.assertPositionsSkippingEquals("hi!", indexReader69, (int) (byte) 0, postingsEnum71, postingsEnum72);
        kuromojiAnalysisTests61.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray75 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests25, kuromojiAnalysisTests50, kuromojiAnalysisTests61 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet76 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTestsSet76);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests79 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        kuromojiAnalysisTests79.assertFieldsEquals("europarl.lines.txt.gz", indexReader81, fields82, fields83, false);
        kuromojiAnalysisTests79.ensureCleanedUp();
        kuromojiAnalysisTests79.resetCheckIndexStatus();
        kuromojiAnalysisTests79.ensureCleanedUp();
        kuromojiAnalysisTests79.ensureCheckIndexPassed();
        java.lang.String str90 = kuromojiAnalysisTests79.getTestName();
        java.lang.String str91 = kuromojiAnalysisTests79.getTestName();
        org.junit.rules.TestRule testRule92 = kuromojiAnalysisTests79.ruleChain;
        org.junit.rules.TestRule testRule93 = kuromojiAnalysisTests79.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule93);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        long[] longArray4 = new long[] { 1 };
        long[] longArray6 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray4, longArray6);
        long[] longArray10 = new long[] { 1 };
        long[] longArray12 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray6, longArray10);
        long[] longArray17 = new long[] { 1 };
        long[] longArray19 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray17, longArray19);
        org.junit.Assert.assertArrayEquals("hi!", longArray10, longArray17);
        long[] longArray25 = new long[] { 1 };
        long[] longArray27 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray25, longArray27);
        long[] longArray32 = new long[] { 1 };
        long[] longArray34 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray32, longArray34);
        long[] longArray38 = new long[] { 1 };
        long[] longArray40 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray38, longArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray34, longArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray25, longArray38);
        org.junit.Assert.assertArrayEquals(longArray17, longArray25);
        long[] longArray45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray17, longArray45);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray7);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.awaitsfix");
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, true);
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests15.tearDown();
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests15.ruleChain;
        kuromojiAnalysisTests15.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        int[] intArray20 = new int[] { '#' };
        int[] intArray22 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray15, intArray20);
        int[] intArray27 = new int[] { '#' };
        int[] intArray29 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray27, intArray29);
        int[] intArray32 = new int[] { '#' };
        int[] intArray34 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray32, intArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray27, intArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray15, intArray32);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        int[] intArray46 = new int[] { '#' };
        int[] intArray48 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray46, intArray48);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray41, intArray46);
        int[] intArray53 = new int[] { '#' };
        int[] intArray55 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray53, intArray55);
        int[] intArray58 = new int[] { '#' };
        int[] intArray60 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray58, intArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray53, intArray58);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray41, intArray58);
        org.junit.Assert.assertArrayEquals("random", intArray32, intArray41);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) intArray32);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("random", indexReader69, 0, postingsEnum71, postingsEnum72);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests74 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        kuromojiAnalysisTests74.assertFieldsEquals("europarl.lines.txt.gz", indexReader76, fields77, fields78, false);
        kuromojiAnalysisTests74.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        kuromojiAnalysisTests74.assertPositionsSkippingEquals("tests.badapples", indexReader83, 10, postingsEnum85, postingsEnum86);
        org.apache.lucene.index.IndexReader indexReader89 = null;
        org.apache.lucene.index.Fields fields90 = null;
        org.apache.lucene.index.Fields fields91 = null;
        kuromojiAnalysisTests74.assertFieldsEquals("tests.nightly", indexReader89, fields90, fields91, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0, (java.lang.Object) kuromojiAnalysisTests74);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        double[] doubleArray6 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray19, (double) 0);
        double[] doubleArray34 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray39 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray39, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray34, 0.0d);
        double[] doubleArray45 = new double[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray45, (double) (byte) 1);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray17 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray27 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray34 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray27, floatArray34, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray27, (float) (-1));
        float[] floatArray47 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray54 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray47, floatArray54, (float) (byte) 100);
        float[] floatArray64 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray71 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray64, floatArray71, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray47, floatArray64, (float) (-1));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray27, floatArray64, 0.0f);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests80 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        kuromojiAnalysisTests80.assertFieldsEquals("europarl.lines.txt.gz", indexReader82, fields83, fields84, false);
        kuromojiAnalysisTests80.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain89 = kuromojiAnalysisTests80.failureAndSuccessEvents;
        kuromojiAnalysisTests80.resetCheckIndexStatus();
        java.lang.String str91 = kuromojiAnalysisTests80.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests80);
        kuromojiAnalysisTests80.tearDown();
        kuromojiAnalysisTests80.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests80.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) floatArray27, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.weekly", indexReader5, terms6, terms7, false);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray1, (java.lang.Object) indexReader5);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        double[] doubleArray22 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray27 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray22, doubleArray27, (double) (byte) 100);
        double[] doubleArray36 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray41 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray41, (double) (byte) 100);
        double[] doubleArray49 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray54 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray49, doubleArray54, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray49, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray36, (-1.0d));
        double[] doubleArray67 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray72 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray67, doubleArray72, (double) (byte) 100);
        double[] doubleArray80 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray85 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray80, doubleArray85, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray67, doubleArray80, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray22, doubleArray80, (double) 10.0f);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) executorServiceArray13, (java.lang.Object) "random");
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet15, (java.lang.Object) kuromojiAnalysisTests16);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests16.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests16.ruleChain;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.maxfailures", indexReader27, (int) (byte) 100, postingsEnum29, postingsEnum30, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, false);
        kuromojiAnalysisTests33.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain42;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum46, postingsEnum47, true);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 10);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.RuleChain[] ruleChainArray54 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray55 = new org.junit.rules.RuleChain[][] { ruleChainArray54 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet56 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray55);
        java.util.Set<org.junit.rules.TestRule[]> testRuleArraySet57 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[][]) ruleChainArray55);
        java.lang.Class<?> wildcardClass58 = testRuleArraySet57.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) testRuleArraySet57);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, 100.0d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) (-1.0d), (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, 0, postingsEnum23, postingsEnum24);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.tearDown();
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.slow", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader22, (int) 'a', postingsEnum24, postingsEnum25);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.lang.Object obj29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain28, obj29);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (short) -1, (long) 4);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        java.lang.String str14 = kuromojiAnalysisTests0.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests15.assertTermsEquals("", indexReader25, terms26, terms27, false);
        kuromojiAnalysisTests15.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) str14, (java.lang.Object) kuromojiAnalysisTests15);
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests15.assertDocValuesEquals("tests.slow", 4, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        java.lang.Object[] objArray0 = null;
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale5, locale7, locale9, locale11, locale13 };
        java.util.Set<java.util.Locale> localeSet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.List<java.io.Serializable> serializableList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray14);
        java.util.Set<java.lang.Cloneable> cloneableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray14);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray14, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray14);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale26, locale28, locale30, locale32, locale34 };
        java.util.Set<java.util.Locale> localeSet36 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray35);
        java.util.List<java.io.Serializable> serializableList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray35);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray35, (java.lang.Object) 0.0f);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale43, locale45, locale47, locale49, locale51 };
        java.util.Set<java.util.Locale> localeSet53 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray52);
        java.util.List<java.io.Serializable> serializableList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray52);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray52, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray35, (java.lang.Object[]) localeArray52);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale60, locale62, locale64, locale66, locale68 };
        java.util.Set<java.util.Locale> localeSet70 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray69);
        java.util.List<java.io.Serializable> serializableList71 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray69);
        java.util.Set<java.lang.Cloneable> cloneableSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray52, (java.lang.Object[]) localeArray69);
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale77, locale79, locale81, locale83, locale85 };
        java.util.Set<java.util.Locale> localeSet87 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray86);
        java.util.List<java.io.Serializable> serializableList88 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray86);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray86, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray52, (java.lang.Object[]) localeArray86);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) localeArray14, (java.lang.Object[]) localeArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) localeArray86);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        int[] intArray5 = new int[] { (byte) -1, ' ', 100, (short) 1 };
        int[] intArray10 = new int[] { (byte) -1, ' ', 100, (short) 1 };
        int[][] intArray11 = new int[][] { intArray5, intArray10 };
        java.util.Set<int[]> intArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(intArray11);
        int[][] intArray13 = new int[][] {};
        int[][] intArray14 = new int[][] {};
        int[][] intArray15 = new int[][] {};
        int[][] intArray16 = new int[][] {};
        int[][][] intArray17 = new int[][][] { intArray13, intArray14, intArray15, intArray16 };
        int[][] intArray18 = new int[][] {};
        int[][] intArray19 = new int[][] {};
        int[][] intArray20 = new int[][] {};
        int[][] intArray21 = new int[][] {};
        int[][][] intArray22 = new int[][][] { intArray18, intArray19, intArray20, intArray21 };
        int[][][][] intArray23 = new int[][][][] { intArray17, intArray22 };
        java.util.Set<int[][][]> intArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(intArray23);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) intArray11, (java.lang.Object[]) intArray23);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        byte[] byteArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray8);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 'a');
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray5);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests4.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests4.assertPositionsSkippingEquals("tests.failfast", indexReader12, 1, postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests4.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests4.ensureCleanedUp();
        kuromojiAnalysisTests4.resetCheckIndexStatus();
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests4.assertFieldsEquals("enwiki.random.lines.txt", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests4.assertDocsSkippingEquals("tests.weekly", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) genericDeclarationArray2, (java.lang.Object) "tests.weekly");
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray2, (java.lang.Object[]) executorServiceArray36);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale42, locale44, locale46, locale48, locale50 };
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        java.util.List<java.io.Serializable> serializableList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray51);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray51, (java.lang.Object) 0.0f);
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale59, locale61, locale63, locale65, locale67 };
        java.util.Set<java.util.Locale> localeSet69 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray68);
        java.util.List<java.io.Serializable> serializableList70 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray68);
        java.util.Set<java.lang.Cloneable> cloneableSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray68);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray68, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray51, (java.lang.Object[]) localeArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) genericDeclarationArray2, (java.lang.Object[]) localeArray51);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.weekly", indexReader13, (int) (short) 100, postingsEnum15, postingsEnum16, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) (short) 100, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) (byte) 100, (float) 3);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 100);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) (short) 100);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        int[] intArray4 = new int[] { '#' };
        int[] intArray6 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
        int[] intArray9 = new int[] { '#' };
        int[] intArray11 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray9, intArray11);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray4, intArray9);
        int[] intArray16 = new int[] { '#' };
        int[] intArray18 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray16, intArray18);
        int[] intArray21 = new int[] { '#' };
        int[] intArray23 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray21, intArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray16, intArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray21);
        int[] intArray31 = new int[] { '#' };
        int[] intArray33 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray31, intArray33);
        int[] intArray36 = new int[] { '#' };
        int[] intArray38 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray36, intArray38);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray31, intArray36);
        int[] intArray43 = new int[] { '#' };
        int[] intArray45 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray43, intArray45);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray43, intArray48);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray31, intArray48);
        int[] intArray56 = new int[] { '#' };
        int[] intArray58 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray56, intArray58);
        int[] intArray61 = new int[] { '#' };
        int[] intArray63 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray61, intArray63);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray56, intArray61);
        org.junit.Assert.assertArrayEquals("", intArray48, intArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray21, intArray48);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests69 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        kuromojiAnalysisTests69.assertFieldsEquals("europarl.lines.txt.gz", indexReader71, fields72, fields73, false);
        kuromojiAnalysisTests69.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain78 = kuromojiAnalysisTests69.failureAndSuccessEvents;
        kuromojiAnalysisTests69.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        kuromojiAnalysisTests69.assertFieldsEquals("enwiki.random.lines.txt", indexReader81, fields82, fields83, false);
        org.junit.rules.TestRule testRule86 = kuromojiAnalysisTests69.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) (-1.0d), (java.lang.Object) kuromojiAnalysisTests69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests69);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (-1), (-1.0d));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("hi!", indexReader23, (int) (byte) 0, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests15.assertTermsEquals("random", indexReader29, terms30, terms31, true);
        kuromojiAnalysisTests15.setUp();
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests15.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests15.ruleChain;
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) testRule39, (java.lang.Object) 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "random");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray12, (java.lang.Object) (byte) -1);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.List<java.io.Serializable> serializableList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray29);
        java.util.Set<java.lang.Cloneable> cloneableSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray29);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray29, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        kuromojiAnalysisTests36.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain45 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        kuromojiAnalysisTests36.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray12, (java.lang.Object) kuromojiAnalysisTests36);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests36.assertDocsEnumEquals("", postingsEnum49, postingsEnum50, true);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.badapples", indexReader54, 0, postingsEnum56, postingsEnum57, true);
        org.apache.lucene.index.NumericDocValues numericDocValues62 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues63 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests36.assertDocValuesEquals("tests.badapples", (int) '#', numericDocValues62, numericDocValues63);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 3);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 10);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader23, fields24, fields25, false);
        java.lang.String str28 = kuromojiAnalysisTests1.getTestName();
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass31 = locale30.getClass();
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass34 = locale33.getClass();
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass37 = locale36.getClass();
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass40 = locale39.getClass();
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass43 = locale42.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray44 = new java.lang.reflect.AnnotatedElement[] { wildcardClass31, wildcardClass34, wildcardClass37, wildcardClass40, wildcardClass43 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet45 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray44);
        java.lang.Object obj46 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray44, obj46);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) annotatedElementArray44);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum51, postingsEnum52);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 10.0d, (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale16, locale18, locale20, locale22, locale24 };
        java.util.Set<java.util.Locale> localeSet26 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray25);
        java.util.List<java.io.Serializable> serializableList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, false);
        kuromojiAnalysisTests29.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests29.failureAndSuccessEvents;
        kuromojiAnalysisTests29.setUp();
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale42, locale44, locale46, locale48, locale50 };
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale55, locale57, locale59, locale61, locale63 };
        java.util.Set<java.util.Locale> localeSet65 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray64);
        java.util.List<java.io.Serializable> serializableList66 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray51, (java.lang.Object[]) localeArray64);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale70, locale72, locale74, locale76, locale78 };
        java.util.Set<java.util.Locale> localeSet80 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray79);
        java.util.List<java.io.Serializable> serializableList81 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray79);
        java.util.Set<java.lang.Cloneable> cloneableSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray79);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray64, (java.lang.Object[]) localeArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests29, (java.lang.Object) localeArray79);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray79);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray86 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet87 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) localeArray12, (java.lang.Object[]) genericDeclarationArray86);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1.0f, 100.0d, (double) (byte) 0);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.slow", indexReader17, fields18, fields19, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) 0L, (float) '4');
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        int[] intArray0 = null;
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
        int[] intArray10 = new int[] { '#' };
        int[] intArray12 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray10, intArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray5, intArray10);
        int[] intArray17 = new int[] { '#' };
        int[] intArray19 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray17, intArray19);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray17, intArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray22);
        int[] intArray30 = new int[] { '#' };
        int[] intArray32 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray30, intArray32);
        int[] intArray35 = new int[] { '#' };
        int[] intArray37 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray35, intArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray30, intArray35);
        org.junit.Assert.assertArrayEquals("", intArray22, intArray35);
        int[] intArray43 = new int[] { '#' };
        int[] intArray45 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray43, intArray45);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray43, intArray48);
        int[] intArray54 = new int[] { '#' };
        int[] intArray56 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray54, intArray56);
        org.junit.Assert.assertArrayEquals(intArray48, intArray54);
        org.junit.Assert.assertArrayEquals(intArray35, intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray35);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 1, (double) (byte) -1, 100.0d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        double[] doubleArray6 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray19, (double) 0);
        double[] doubleArray34 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray39 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray39, (double) (byte) 100);
        double[] doubleArray48 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray53 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray48, doubleArray53, (double) (byte) 100);
        double[] doubleArray61 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray66 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray61, doubleArray66, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray48, doubleArray61, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray48, (-1.0d));
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray48, (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray19);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests6.assertTermsEquals("tests.weekly", indexReader8, terms9, terms10, false);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray4, (java.lang.Object) indexReader8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) genericDeclarationArray1, (java.lang.Object[]) strArray4);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray9);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.nightly", postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        kuromojiAnalysisTests25.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("hi!", indexReader44, (int) (byte) 0, postingsEnum46, postingsEnum47);
        kuromojiAnalysisTests36.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests0, kuromojiAnalysisTests25, kuromojiAnalysisTests36 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet51 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray50);
        java.util.Set<org.junit.Assert> assertSet52 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) kuromojiAnalysisTestsArray50);
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet53 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTestCase[]) kuromojiAnalysisTestsArray50);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray54 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray54);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray54);
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet57 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) kuromojiAnalysisTestsArray50, (java.lang.Object[]) genericDeclarationArray54);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        java.util.List[] listArray3 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray4 = (java.util.List<java.io.Serializable>[]) listArray3;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray4);
        java.util.List<java.util.List<java.io.Serializable>> serializableListList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, serializableListArray4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader11, fields12, fields13, false);
        kuromojiAnalysisTests9.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests9.failureAndSuccessEvents;
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        kuromojiAnalysisTests9.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests9.ruleChain;
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale27, locale29, locale31, locale33, locale35 };
        java.util.Set<java.util.Locale> localeSet37 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray36);
        java.util.List<java.io.Serializable> serializableList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray36);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray36, (java.lang.Object) 0.0f);
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale44, locale46, locale48, locale50, locale52 };
        java.util.Set<java.util.Locale> localeSet54 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray53);
        java.util.List<java.io.Serializable> serializableList55 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray53);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray53, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray36, (java.lang.Object[]) localeArray53);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale60, locale62, locale64, locale66, locale68 };
        java.util.Set<java.util.Locale> localeSet70 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray69);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray36, (java.lang.Object[]) localeArray69);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests9, (java.lang.Object) localeArray69);
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0d, (java.lang.Object) localeArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableListArray4, (java.lang.Object[]) localeArray69);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 1, 10.0d, (double) 1);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        int[][] intArray5 = new int[][] {};
        int[][][] intArray6 = new int[][][] { intArray5 };
        java.util.Set<int[][]> intArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(intArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) intArray6);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        double[] doubleArray3 = new double[] { 100, (short) 100 };
        double[] doubleArray6 = new double[] { 100, (short) 100 };
        double[] doubleArray9 = new double[] { 100, (short) 100 };
        double[][] doubleArray10 = new double[][] { doubleArray3, doubleArray6, doubleArray9 };
        java.util.Set<double[]> doubleArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray10);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale15, locale17, locale19, locale21, locale23 };
        java.util.Set<java.util.Locale> localeSet25 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray24);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale28, locale30, locale32, locale34, locale36 };
        java.util.Set<java.util.Locale> localeSet38 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray37);
        java.util.List<java.io.Serializable> serializableList39 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray24, (java.lang.Object[]) localeArray37);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale43, locale45, locale47, locale49, locale51 };
        java.util.Set<java.util.Locale> localeSet53 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray52);
        java.util.List<java.io.Serializable> serializableList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray52);
        java.util.Set<java.lang.Cloneable> cloneableSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray52);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray37, (java.lang.Object[]) localeArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) 0.0f, (java.lang.Object) localeArray52);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale60, locale62, locale64, locale66, locale68 };
        java.util.Set<java.util.Locale> localeSet70 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray69);
        java.util.List<java.io.Serializable> serializableList71 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray69);
        java.util.Set<java.lang.Cloneable> cloneableSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray69);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray69, (java.lang.Object) (byte) -1);
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale77, locale79, locale81, locale83, locale85 };
        java.util.Set<java.util.Locale> localeSet87 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray86);
        java.util.List<java.io.Serializable> serializableList88 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray86);
        java.util.Set<java.lang.Cloneable> cloneableSet89 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray86);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray86, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray69, (java.lang.Object[]) localeArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray52, (java.lang.Object[]) localeArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) doubleArray10, (java.lang.Object[]) localeArray86);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        kuromojiAnalysisTests26.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests37.assertPositionsSkippingEquals("hi!", indexReader45, (int) (byte) 0, postingsEnum47, postingsEnum48);
        kuromojiAnalysisTests37.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests1, kuromojiAnalysisTests26, kuromojiAnalysisTests37 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet52 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray51);
        java.util.Set<org.junit.Assert> assertSet53 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) kuromojiAnalysisTestsArray51);
        org.junit.rules.RuleChain[] ruleChainArray54 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray55 = new org.junit.rules.RuleChain[][] { ruleChainArray54 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet56 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray55);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTestsArray51, (java.lang.Object) ruleChainArray55);
        double[] doubleArray60 = new double[] { 100, (short) 100 };
        double[] doubleArray63 = new double[] { 100, (short) 100 };
        double[] doubleArray66 = new double[] { 100, (short) 100 };
        double[][] doubleArray67 = new double[][] { doubleArray60, doubleArray63, doubleArray66 };
        java.util.Set<double[]> doubleArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray67);
        java.util.Set<double[]> doubleArraySet69 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray67);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests71 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        kuromojiAnalysisTests71.assertFieldsEquals("europarl.lines.txt.gz", indexReader73, fields74, fields75, false);
        kuromojiAnalysisTests71.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain80 = kuromojiAnalysisTests71.failureAndSuccessEvents;
        kuromojiAnalysisTests71.resetCheckIndexStatus();
        java.lang.String str82 = kuromojiAnalysisTests71.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests71);
        kuromojiAnalysisTests71.tearDown();
        kuromojiAnalysisTests71.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain86 = kuromojiAnalysisTests71.failureAndSuccessEvents;
        java.lang.String str87 = kuromojiAnalysisTests71.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) doubleArray67, (java.lang.Object) str87);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) kuromojiAnalysisTestsArray51, (java.lang.Object[]) doubleArray67);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.slow", indexReader12, (int) (short) -1, postingsEnum14, postingsEnum15, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum21, postingsEnum22, false);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 4, (float) 2, (float) (byte) -1);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 2, (long) (short) 100);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 3, 10.0f, (float) 2);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        java.lang.String str13 = kuromojiAnalysisTests2.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.tearDown();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain18 = null;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain18;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests20.assertPositionsSkippingEquals("hi!", indexReader28, (int) (byte) 0, postingsEnum30, postingsEnum31);
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests20.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests35.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        kuromojiAnalysisTests35.ensureCleanedUp();
        kuromojiAnalysisTests35.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests35.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain45 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests20, (java.lang.Object) kuromojiAnalysisTests35);
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests20.assertDocsEnumEquals("tests.maxfailures", postingsEnum48, postingsEnum49, true);
        org.junit.rules.RuleChain ruleChain52 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain52;
        int[] intArray58 = new int[] { '#' };
        int[] intArray60 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray58, intArray60);
        int[] intArray63 = new int[] { '#' };
        int[] intArray65 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray63, intArray65);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray58, intArray63);
        int[] intArray70 = new int[] { '#' };
        int[] intArray72 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray70, intArray72);
        int[] intArray75 = new int[] { '#' };
        int[] intArray77 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray75, intArray77);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray70, intArray75);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray58, intArray75);
        int[] intArray82 = new int[] { '#' };
        int[] intArray84 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray82, intArray84);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray58, intArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) 10, 100.0f, 0.0f);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass12 = locale11.getClass();
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass15 = locale14.getClass();
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass18 = locale17.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray19 = new java.lang.reflect.AnnotatedElement[] { wildcardClass6, wildcardClass9, wildcardClass12, wildcardClass15, wildcardClass18 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet20 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray19);
        java.lang.Object obj21 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray19, obj21);
        org.junit.Assert.assertNotEquals((java.lang.Object) boolean3, (java.lang.Object) annotatedElementArray19);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray25 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests27.assertPositionsSkippingEquals("tests.failfast", indexReader35, 1, postingsEnum37, postingsEnum38);
        kuromojiAnalysisTests27.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests27.ensureCleanedUp();
        kuromojiAnalysisTests27.resetCheckIndexStatus();
        kuromojiAnalysisTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("enwiki.random.lines.txt", indexReader46, fields47, fields48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests27.assertDocsSkippingEquals("tests.weekly", indexReader52, (int) (byte) 0, postingsEnum54, postingsEnum55, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) genericDeclarationArray25, (java.lang.Object) "tests.weekly");
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray25, (java.lang.Object[]) executorServiceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray19, (java.lang.Object[]) genericDeclarationArray25);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 10);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray9);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        java.lang.String str13 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 3, 10L);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        char[] charArray3 = new char[] { ' ', ' ', '#' };
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) 0);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, 0L);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray3);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 'a', (double) (-1));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        char[] charArray0 = null;
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (byte) 100);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        double[] doubleArray5 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray10, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        double[] doubleArray33 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray38 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray38, (double) (byte) 100);
        double[] doubleArray46 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray51 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray46, doubleArray51, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray46, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray33, (-1.0d));
        double[] doubleArray64 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray69 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray64, doubleArray69, (double) (byte) 100);
        double[] doubleArray77 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray82 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray77, doubleArray82, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray64, doubleArray77, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray19, doubleArray77, (double) 10.0f);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray19, (double) 0);
        double[] doubleArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray91, (double) (byte) 1);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale2, locale4, locale6 };
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale9, locale11, locale13 };
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale16, locale18, locale20 };
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale23, locale25, locale27 };
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale30, locale32, locale34 };
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale37, locale39, locale41 };
        java.util.Locale[][] localeArray43 = new java.util.Locale[][] { localeArray7, localeArray14, localeArray21, localeArray28, localeArray35, localeArray42 };
        java.util.Set<java.util.Locale[]> localeArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray43);
        int[][][][][] intArray45 = new int[][][][][] {};
        java.util.Set<int[][][][]> intArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(intArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) localeArray43, (java.lang.Object[]) intArray45);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) ' ', (double) (-1.0f));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) '4');
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray30, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests37.assertPositionsSkippingEquals("tests.failfast", indexReader45, 1, postingsEnum47, postingsEnum48);
        kuromojiAnalysisTests37.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests37.ensureCleanedUp();
        kuromojiAnalysisTests37.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray30, (java.lang.Object) kuromojiAnalysisTests37);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65 };
        java.util.Set<java.util.Locale> localeSet67 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray66);
        java.util.List<java.io.Serializable> serializableList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray66);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray66);
        java.lang.Iterable[] iterableArray71 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[] localeIterableArray72 = (java.lang.Iterable<java.util.Locale>[]) iterableArray71;
        java.util.Set<java.lang.Iterable<java.util.Locale>> localeIterableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(localeIterableArray72);
        java.util.Set<java.lang.Iterable<java.util.Locale>> localeIterableSet74 = org.apache.lucene.util.LuceneTestCase.asSet(localeIterableArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray66, (java.lang.Object[]) localeIterableArray72);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) '4', (double) ' ');
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass17 = kuromojiAnalysisTests1.getClass();
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet26, (java.lang.Object) kuromojiAnalysisTests27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests31.assertFieldsEquals("europarl.lines.txt.gz", indexReader33, fields34, fields35, false);
        kuromojiAnalysisTests31.ensureCleanedUp();
        kuromojiAnalysisTests31.resetCheckIndexStatus();
        kuromojiAnalysisTests31.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests31.assertPositionsSkippingEquals("", indexReader42, (int) (byte) 0, postingsEnum44, postingsEnum45);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests31);
        kuromojiAnalysisTests31.setUp();
        kuromojiAnalysisTests31.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests31.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClass17, (java.lang.Object) kuromojiAnalysisTests31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        kuromojiAnalysisTests52.assertFieldsEquals("europarl.lines.txt.gz", indexReader54, fields55, fields56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests52.assertPositionsSkippingEquals("hi!", indexReader60, (int) (byte) 0, postingsEnum62, postingsEnum63);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        kuromojiAnalysisTests52.assertTermsEquals("random", indexReader66, terms67, terms68, true);
        kuromojiAnalysisTests52.setUp();
        kuromojiAnalysisTests52.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests52.assertPathHasBeenCleared("tests.monster");
        kuromojiAnalysisTests52.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) kuromojiAnalysisTests31, (java.lang.Object) kuromojiAnalysisTests52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests52);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
        short[] shortArray0 = null;
        short[] shortArray5 = new short[] { (short) 10 };
        short[] shortArray7 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray7);
        short[] shortArray12 = new short[] { (short) 10 };
        short[] shortArray14 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray14);
        short[] shortArray18 = new short[] { (short) 10 };
        short[] shortArray20 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray14, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray20);
        short[] shortArray27 = new short[] { (short) 10 };
        short[] shortArray29 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray29);
        short[] shortArray33 = new short[] { (short) 10 };
        short[] shortArray35 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray33, shortArray35);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray29, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray35);
        short[] shortArray43 = new short[] { (short) 10 };
        short[] shortArray45 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray45);
        short[] shortArray49 = new short[] { (short) 10 };
        short[] shortArray51 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray45, shortArray51);
        short[] shortArray57 = new short[] { (short) 10 };
        short[] shortArray59 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray59);
        short[] shortArray63 = new short[] { (short) 10 };
        short[] shortArray65 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray63, shortArray65);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray59, shortArray65);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray45, shortArray65);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray35, shortArray45);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests70 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        kuromojiAnalysisTests70.assertFieldsEquals("europarl.lines.txt.gz", indexReader72, fields73, fields74, false);
        kuromojiAnalysisTests70.ensureCleanedUp();
        kuromojiAnalysisTests70.resetCheckIndexStatus();
        kuromojiAnalysisTests70.ensureCleanedUp();
        kuromojiAnalysisTests70.ensureCheckIndexPassed();
        kuromojiAnalysisTests70.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        org.apache.lucene.index.Fields fields85 = null;
        kuromojiAnalysisTests70.assertFieldsEquals("tests.awaitsfix", indexReader83, fields84, fields85, true);
        kuromojiAnalysisTests70.tearDown();
        kuromojiAnalysisTests70.assertPathHasBeenCleared("tests.badapples");
        kuromojiAnalysisTests70.ensureCleanedUp();
        kuromojiAnalysisTests70.assertPathHasBeenCleared("tests.nightly");
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) shortArray35, (java.lang.Object) kuromojiAnalysisTests70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray35);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, 0.0d, (-1.0d));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 0, (long) '#');
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        short[] shortArray3 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray5);
        short[] shortArray9 = new short[] { (short) 10 };
        short[] shortArray11 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray11);
        short[] shortArray17 = new short[] { (short) 10 };
        short[] shortArray19 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray19);
        short[] shortArray23 = new short[] { (short) 10 };
        short[] shortArray25 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray25);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray19, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray19);
        short[] shortArray32 = new short[] { (short) 10 };
        short[] shortArray34 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray34);
        short[] shortArray38 = new short[] { (short) 10 };
        short[] shortArray40 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray40);
        short[] shortArray46 = new short[] { (short) 10 };
        short[] shortArray48 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray48);
        short[] shortArray52 = new short[] { (short) 10 };
        short[] shortArray54 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray54);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray48, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray48);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests60 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        kuromojiAnalysisTests60.assertFieldsEquals("europarl.lines.txt.gz", indexReader62, fields63, fields64, false);
        kuromojiAnalysisTests60.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain69 = kuromojiAnalysisTests60.failureAndSuccessEvents;
        kuromojiAnalysisTests60.resetCheckIndexStatus();
        java.lang.String str71 = kuromojiAnalysisTests60.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests60);
        kuromojiAnalysisTests60.tearDown();
        kuromojiAnalysisTests60.setUp();
        kuromojiAnalysisTests60.ensureCleanedUp();
        kuromojiAnalysisTests60.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray11, (java.lang.Object) kuromojiAnalysisTests60);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 1.0f, (float) 10L, 0.0f);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        double[] doubleArray11 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray16 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray11, doubleArray16, (double) (byte) 100);
        double[] doubleArray25 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray30 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray30, (double) (byte) 100);
        double[] doubleArray38 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray43 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray38, doubleArray43, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray38, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray25, (-1.0d));
        double[] doubleArray56 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray61 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray56, doubleArray61, (double) (byte) 100);
        double[] doubleArray69 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray74 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray69, doubleArray74, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray56, doubleArray69, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray11, doubleArray69, (double) 10.0f);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) executorServiceArray2, (java.lang.Object) "random");
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        int[][] intArray86 = new int[][] {};
        java.util.List<int[]> intArrayList87 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, intArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) intArray86);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 100);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        java.lang.String str14 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader16, 0, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        kuromojiAnalysisTests22.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain31 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        java.lang.String str33 = kuromojiAnalysisTests22.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests22);
        kuromojiAnalysisTests22.tearDown();
        kuromojiAnalysisTests22.setUp();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests22.assertPositionsSkippingEquals("", indexReader38, (int) '#', postingsEnum40, postingsEnum41);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests22);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray4 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        java.lang.String str10 = kuromojiAnalysisTests0.getTestName();
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray18);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests20.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet19, (java.lang.Object) kuromojiAnalysisTests20);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests20.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests20.ruleChain;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests20.assertDocsSkippingEquals("tests.maxfailures", indexReader31, (int) (byte) 100, postingsEnum33, postingsEnum34, false);
        kuromojiAnalysisTests20.resetCheckIndexStatus();
        kuromojiAnalysisTests20.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str10, (java.lang.Object) kuromojiAnalysisTests20);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("<unknown>", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.weekly", postingsEnum21, postingsEnum22, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.ensureCleanedUp();
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests25.tearDown();
        kuromojiAnalysisTests25.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests25.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        kuromojiAnalysisTests38.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        kuromojiAnalysisTests38.resetCheckIndexStatus();
        kuromojiAnalysisTests38.assertPathHasBeenCleared("random");
        java.lang.String str51 = kuromojiAnalysisTests38.getTestName();
        org.junit.rules.RuleChain ruleChain52 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        kuromojiAnalysisTests25.failureAndSuccessEvents = ruleChain52;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain52;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain52);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader21, (int) '4', postingsEnum23, postingsEnum24);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(100);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        kuromojiAnalysisTests20.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        kuromojiAnalysisTests20.resetCheckIndexStatus();
        java.lang.String str31 = kuromojiAnalysisTests20.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests20);
        kuromojiAnalysisTests20.tearDown();
        kuromojiAnalysisTests20.setUp();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests20.assertPositionsSkippingEquals("", indexReader36, (int) '#', postingsEnum38, postingsEnum39);
        kuromojiAnalysisTests20.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests20.assertDocsEnumEquals("tests.weekly", postingsEnum43, postingsEnum44, false);
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests20.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum48, postingsEnum49, true);
        kuromojiAnalysisTests20.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests20);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        java.lang.String[] strArray15 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) strArray15);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 2, (float) 0, (float) (byte) -1);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1L), (double) (byte) 1, (double) 100L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) '4', (float) (-1), (float) (short) 1);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.setUp();
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale14, locale16, locale18, locale20, locale22 };
        java.util.Set<java.util.Locale> localeSet24 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray23);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale27, locale29, locale31, locale33, locale35 };
        java.util.Set<java.util.Locale> localeSet37 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray36);
        java.util.List<java.io.Serializable> serializableList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray23, (java.lang.Object[]) localeArray36);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale42, locale44, locale46, locale48, locale50 };
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        java.util.List<java.io.Serializable> serializableList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray51);
        java.util.Set<java.lang.Cloneable> cloneableSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray36, (java.lang.Object[]) localeArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) localeArray51);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests57 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        kuromojiAnalysisTests57.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, false);
        kuromojiAnalysisTests57.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests57.failureAndSuccessEvents;
        kuromojiAnalysisTests57.resetCheckIndexStatus();
        kuromojiAnalysisTests57.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule69 = kuromojiAnalysisTests57.ruleChain;
        kuromojiAnalysisTests57.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests57);
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        kuromojiAnalysisTests57.assertDocsEnumEquals("tests.monster", postingsEnum73, postingsEnum74, false);
        org.apache.lucene.index.NumericDocValues numericDocValues79 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues80 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests57.assertDocValuesEquals("tests.slow", (int) '#', numericDocValues79, numericDocValues80);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.rules.TestRule testRule8 = kuromojiAnalysisTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.monster", indexReader10, terms11, terms12, true);
        kuromojiAnalysisTests2.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests16.assertPositionsSkippingEquals("hi!", indexReader24, (int) (byte) 0, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests16.assertTermsEquals("random", indexReader30, terms31, terms32, true);
        kuromojiAnalysisTests16.setUp();
        kuromojiAnalysisTests16.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        kuromojiAnalysisTests40.assertFieldsEquals("europarl.lines.txt.gz", indexReader42, fields43, fields44, false);
        kuromojiAnalysisTests40.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests40.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain49;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain49;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) ruleChain49);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray7, byteArray9);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) 100L, (float) 1);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) (byte) 0, 1.0d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) '4', numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 4);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray12, (java.lang.Object) "tests.monster");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests17.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields20, fields21, false);
        kuromojiAnalysisTests17.ensureCleanedUp();
        kuromojiAnalysisTests17.resetCheckIndexStatus();
        kuromojiAnalysisTests17.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests17.assertDocsEnumEquals("tests.awaitsfix", postingsEnum29, postingsEnum30, true);
        kuromojiAnalysisTests17.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) localeArray12, (java.lang.Object) kuromojiAnalysisTests17);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        double[] doubleArray6 = new double[] { '#', (short) 1, 2, 'a', 3 };
        double[] doubleArray13 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray18 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray13, doubleArray18, (double) (byte) 100);
        double[] doubleArray26 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray31 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray26, doubleArray31, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray13, doubleArray26, (double) 0);
        double[] doubleArray41 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray46 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray41, doubleArray46, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray41, 0.0d);
        double[] doubleArray57 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray62 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray57, doubleArray62, (double) (byte) 100);
        double[] doubleArray70 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray75 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray70, doubleArray75, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray57, doubleArray70, (double) 0);
        double[] doubleArray85 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray90 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray85, doubleArray90, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray85, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray70, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray6, doubleArray70, (double) ' ');
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (short) 10);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests11.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule20);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader26, fields27, fields28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("tests.failfast", indexReader32, 1, postingsEnum34, postingsEnum35);
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests24.tearDown();
        kuromojiAnalysisTests24.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests24.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader41, (int) ' ', postingsEnum43, postingsEnum44, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) indexReader41);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) 2, (double) (-1L), (double) ' ');
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader10, 1, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", 0, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, true);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.tearDown();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray1, byteArray7);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        double[] doubleArray1 = null;
        double[] doubleArray9 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray14 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray9, doubleArray14, (double) (byte) 100);
        double[] doubleArray23 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray28 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray23, doubleArray28, (double) (byte) 100);
        double[] doubleArray36 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray41 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray41, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray23, doubleArray36, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray23, (-1.0d));
        double[] doubleArray54 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray59 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray59, (double) (byte) 100);
        double[] doubleArray67 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray72 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray67, doubleArray72, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray67, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray9, doubleArray67, (double) 10.0f);
        double[] doubleArray84 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray89 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray84, doubleArray89, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray67, doubleArray84, (double) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray1, doubleArray84, (double) 100);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1.0f), (double) '4', 100.0d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) ' ');
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        short[] shortArray2 = new short[] { (short) 10 };
        short[] shortArray4 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray4);
        short[] shortArray8 = new short[] { (short) 10 };
        short[] shortArray10 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray8);
        short[] shortArray15 = new short[] { (short) 10 };
        short[] shortArray17 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray17);
        short[] shortArray22 = new short[] { (short) 10 };
        short[] shortArray24 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray22, shortArray24);
        short[] shortArray28 = new short[] { (short) 10 };
        short[] shortArray30 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray28, shortArray30);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray24, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray30);
        short[] shortArray37 = new short[] { (short) 10 };
        short[] shortArray39 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray37, shortArray39);
        short[] shortArray43 = new short[] { (short) 10 };
        short[] shortArray45 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray45);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray39, shortArray45);
        short[] shortArray51 = new short[] { (short) 10 };
        short[] shortArray53 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray53);
        short[] shortArray57 = new short[] { (short) 10 };
        short[] shortArray59 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray53, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray45);
        short[] shortArray69 = new short[] { (short) 10 };
        short[] shortArray71 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray69, shortArray71);
        short[] shortArray75 = new short[] { (short) 10 };
        short[] shortArray77 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray75, shortArray77);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray71, shortArray77);
        short[] shortArray83 = new short[] { (short) 10 };
        short[] shortArray85 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray83, shortArray85);
        short[] shortArray89 = new short[] { (short) 10 };
        short[] shortArray91 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray89, shortArray91);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray85, shortArray91);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray71, shortArray91);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray91);
        short[] shortArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray96);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", (int) (byte) 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray13);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests21.assertPositionsSkippingEquals("hi!", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests21.assertTermsEquals("random", indexReader35, terms36, terms37, true);
        kuromojiAnalysisTests21.setUp();
        kuromojiAnalysisTests21.tearDown();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("", indexReader43, fields44, fields45, false);
        java.lang.String str48 = kuromojiAnalysisTests21.getTestName();
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass51 = locale50.getClass();
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass54 = locale53.getClass();
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass57 = locale56.getClass();
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass60 = locale59.getClass();
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass63 = locale62.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray64 = new java.lang.reflect.AnnotatedElement[] { wildcardClass51, wildcardClass54, wildcardClass57, wildcardClass60, wildcardClass63 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet65 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray64);
        java.lang.Object obj66 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray64, obj66);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests21, (java.lang.Object) annotatedElementArray64);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray13, (java.lang.Object[]) annotatedElementArray64);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests11.assertPositionsSkippingEquals("hi!", indexReader19, (int) (byte) 0, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests11.assertTermsEquals("random", indexReader25, terms26, terms27, true);
        kuromojiAnalysisTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests11.assertPositionsSkippingEquals("tests.failfast", indexReader32, (int) '4', postingsEnum34, postingsEnum35);
        kuromojiAnalysisTests11.setIndexWriterMaxDocs(100);
        kuromojiAnalysisTests11.resetCheckIndexStatus();
        kuromojiAnalysisTests11.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests11);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0.0f, (double) '4', (double) 1L);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) 100, (double) '4');
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass16 = kuromojiAnalysisTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) -1, (double) (short) 1, (double) (byte) 1);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray6, byteArray12);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        int[] intArray2 = new int[] { '#' };
        int[] intArray4 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
        int[] intArray10 = new int[] { '#' };
        int[] intArray12 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray10, intArray12);
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray10, intArray15);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        int[] intArray27 = new int[] { '#' };
        int[] intArray29 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray27, intArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray22, intArray27);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray10, intArray27);
        int[] intArray36 = new int[] { '#' };
        int[] intArray38 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray36, intArray38);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray36, intArray41);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        int[] intArray53 = new int[] { '#' };
        int[] intArray55 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray53, intArray55);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray48, intArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray36, intArray53);
        org.junit.Assert.assertArrayEquals("random", intArray27, intArray36);
        org.junit.Assert.assertArrayEquals(intArray2, intArray36);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        kuromojiAnalysisTests61.assertFieldsEquals("europarl.lines.txt.gz", indexReader63, fields64, fields65, false);
        kuromojiAnalysisTests61.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests61.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests61.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        kuromojiAnalysisTests61.assertFieldsEquals("tests.nightly", indexReader73, fields74, fields75, true);
        kuromojiAnalysisTests61.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) intArray36, (java.lang.Object) kuromojiAnalysisTests61);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray6, charArray13);
        char[] charArray20 = new char[] { 'a', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray13, charArray20);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.nightly", postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests25.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests25);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain49;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        kuromojiAnalysisTests52.assertFieldsEquals("europarl.lines.txt.gz", indexReader54, fields55, fields56, false);
        kuromojiAnalysisTests52.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain61 = kuromojiAnalysisTests52.failureAndSuccessEvents;
        kuromojiAnalysisTests52.resetCheckIndexStatus();
        kuromojiAnalysisTests52.assertPathHasBeenCleared("random");
        java.lang.String str65 = kuromojiAnalysisTests52.getTestName();
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests52.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain66;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain66;
        org.apache.lucene.index.NumericDocValues numericDocValues71 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) 10, numericDocValues71, numericDocValues72);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, false);
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("hi!", (int) (short) -1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader13, 100, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.monster", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.ensureCleanedUp();
        kuromojiAnalysisTests25.resetCheckIndexStatus();
        kuromojiAnalysisTests25.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain36;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests14.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, false);
        kuromojiAnalysisTests14.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests14.ruleChain;
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests14.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) false, (java.lang.Object) kuromojiAnalysisTests14);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray8);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("<unknown>", indexReader15, (int) '#', postingsEnum17, postingsEnum18);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        java.lang.String str22 = kuromojiAnalysisTests1.getTestName();
        java.lang.String str23 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests31.assertFieldsEquals("europarl.lines.txt.gz", indexReader33, fields34, fields35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests31.assertPositionsSkippingEquals("hi!", indexReader39, (int) (byte) 0, postingsEnum41, postingsEnum42);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests31.assertTermsEquals("random", indexReader45, terms46, terms47, true);
        kuromojiAnalysisTests31.setUp();
        kuromojiAnalysisTests31.tearDown();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        kuromojiAnalysisTests31.assertFieldsEquals("", indexReader53, fields54, fields55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        kuromojiAnalysisTests31.assertTermsEquals("", indexReader59, terms60, terms61, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests65 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        kuromojiAnalysisTests65.assertFieldsEquals("europarl.lines.txt.gz", indexReader67, fields68, fields69, false);
        kuromojiAnalysisTests65.ensureCleanedUp();
        kuromojiAnalysisTests65.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests74 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        kuromojiAnalysisTests74.assertFieldsEquals("random", indexReader76, fields77, fields78, true);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) kuromojiAnalysisTests65, (java.lang.Object) fields77);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests31, (java.lang.Object) fields77);
        kuromojiAnalysisTests31.ensureCleanedUp();
        kuromojiAnalysisTests31.assertPathHasBeenCleared("tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) false, (java.lang.Object) kuromojiAnalysisTests31);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) 2);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, 0L);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests19.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests19.assertDocsSkippingEquals("tests.slow", indexReader30, (int) (short) -1, postingsEnum32, postingsEnum33, false);
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests19.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        kuromojiAnalysisTests39.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("enwiki.random.lines.txt", indexReader51, fields52, fields53, false);
        kuromojiAnalysisTests39.setIndexWriterMaxDocs((int) (byte) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        kuromojiAnalysisTests58.assertFieldsEquals("europarl.lines.txt.gz", indexReader60, fields61, fields62, false);
        kuromojiAnalysisTests58.ensureCleanedUp();
        kuromojiAnalysisTests58.resetCheckIndexStatus();
        kuromojiAnalysisTests58.ensureCleanedUp();
        kuromojiAnalysisTests58.ensureCheckIndexPassed();
        kuromojiAnalysisTests58.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests70 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        kuromojiAnalysisTests70.assertFieldsEquals("europarl.lines.txt.gz", indexReader72, fields73, fields74, false);
        kuromojiAnalysisTests70.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain79 = kuromojiAnalysisTests70.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain79;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain79;
        kuromojiAnalysisTests58.failureAndSuccessEvents = ruleChain79;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain79;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain79;
        kuromojiAnalysisTests39.failureAndSuccessEvents = ruleChain79;
        kuromojiAnalysisTests19.failureAndSuccessEvents = ruleChain79;
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests19);
        org.apache.lucene.index.NumericDocValues numericDocValues90 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests19.assertDocValuesEquals("tests.awaitsfix", 3, numericDocValues90, numericDocValues91);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[] localeIterableArray2 = (java.lang.Iterable<java.util.Locale>[]) iterableArray1;
        java.util.Set<java.lang.Iterable<java.util.Locale>> localeIterableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeIterableArray2);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale7, locale9, locale11, locale13, locale15 };
        java.util.Set<java.util.Locale> localeSet17 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.List<java.io.Serializable> serializableList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray16, (java.lang.Object[]) localeArray29);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale35, locale37, locale39, locale41, locale43 };
        java.util.Set<java.util.Locale> localeSet45 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray44);
        java.util.List<java.io.Serializable> serializableList46 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray44);
        java.util.Set<java.lang.Cloneable> cloneableSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray29, (java.lang.Object[]) localeArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) 0.0f, (java.lang.Object) localeArray44);
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale52, locale54, locale56, locale58, locale60 };
        java.util.Set<java.util.Locale> localeSet62 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray61);
        java.util.List<java.io.Serializable> serializableList63 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray44, (java.lang.Object[]) localeArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeIterableArray2, (java.lang.Object[]) localeArray61);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(10);
        org.junit.rules.RuleChain ruleChain19 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        kuromojiAnalysisTests20.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        kuromojiAnalysisTests20.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("enwiki.random.lines.txt", indexReader32, fields33, fields34, false);
        org.junit.rules.TestRule testRule37 = kuromojiAnalysisTests20.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        kuromojiAnalysisTests38.ensureCleanedUp();
        kuromojiAnalysisTests38.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests38.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader49, fields50, fields51, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests20, (java.lang.Object) "europarl.lines.txt.gz");
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray63);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests65 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests65.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet64, (java.lang.Object) kuromojiAnalysisTests65);
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        kuromojiAnalysisTests65.assertDocsEnumEquals("tests.badapples", postingsEnum70, postingsEnum71, true);
        org.junit.rules.TestRule testRule74 = kuromojiAnalysisTests65.ruleChain;
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        kuromojiAnalysisTests65.assertDocsSkippingEquals("tests.maxfailures", indexReader76, (int) (byte) 100, postingsEnum78, postingsEnum79, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests82 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Fields fields85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        kuromojiAnalysisTests82.assertFieldsEquals("europarl.lines.txt.gz", indexReader84, fields85, fields86, false);
        kuromojiAnalysisTests82.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain91 = kuromojiAnalysisTests82.failureAndSuccessEvents;
        kuromojiAnalysisTests65.failureAndSuccessEvents = ruleChain91;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain91;
        kuromojiAnalysisTests20.failureAndSuccessEvents = ruleChain91;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests20);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        int[] intArray2 = new int[] { '#' };
        int[] intArray4 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests6.assertPositionsSkippingEquals("hi!", indexReader14, (int) (byte) 0, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests6.assertTermsEquals("random", indexReader20, terms21, terms22, true);
        kuromojiAnalysisTests6.setUp();
        kuromojiAnalysisTests6.tearDown();
        kuromojiAnalysisTests6.tearDown();
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) intArray4, (java.lang.Object) kuromojiAnalysisTests6);
        int[] intArray32 = new int[] { '#' };
        int[] intArray34 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray32, intArray34);
        int[] intArray37 = new int[] { '#' };
        int[] intArray39 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray37, intArray39);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray32, intArray37);
        org.junit.Assert.assertArrayEquals(intArray4, intArray37);
        int[] intArray43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray37, intArray43);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.lang.Object[] objArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, objArray12);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        short[] shortArray0 = null;
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray17 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, (float) (byte) 100);
        short[] shortArray23 = new short[] { (short) 10 };
        short[] shortArray25 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray25);
        short[] shortArray30 = new short[] { (short) 10 };
        short[] shortArray32 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray32);
        short[] shortArray36 = new short[] { (short) 10 };
        short[] shortArray38 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray32, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray23, shortArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (byte) 100, (java.lang.Object) shortArray23);
        short[] shortArray45 = new short[] { (short) 10 };
        short[] shortArray47 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray47);
        short[] shortArray51 = new short[] { (short) 10 };
        short[] shortArray53 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray51);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray23, shortArray47);
        short[] shortArray59 = new short[] { (short) 10 };
        short[] shortArray61 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray59, shortArray61);
        short[] shortArray66 = new short[] { (short) 10 };
        short[] shortArray68 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray66, shortArray68);
        short[] shortArray72 = new short[] { (short) 10 };
        short[] shortArray74 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray72, shortArray74);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray68, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray74);
        short[] shortArray81 = new short[] { (short) 10 };
        short[] shortArray83 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray81, shortArray83);
        short[] shortArray87 = new short[] { (short) 10 };
        short[] shortArray89 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray87, shortArray89);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray83, shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray89);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray47);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 1, (double) (short) 0, (double) 3);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray30, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests37.assertPositionsSkippingEquals("tests.failfast", indexReader45, 1, postingsEnum47, postingsEnum48);
        kuromojiAnalysisTests37.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests37.ensureCleanedUp();
        kuromojiAnalysisTests37.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray30, (java.lang.Object) kuromojiAnalysisTests37);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65 };
        java.util.Set<java.util.Locale> localeSet67 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray66);
        java.util.List<java.io.Serializable> serializableList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray66);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray66);
        java.util.Set<java.io.Serializable> serializableSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) localeArray30);
        java.util.concurrent.ExecutorService[][][] executorServiceArray71 = new java.util.concurrent.ExecutorService[][][] {};
        java.util.concurrent.ExecutorService[][][] executorServiceArray72 = new java.util.concurrent.ExecutorService[][][] {};
        java.util.concurrent.ExecutorService[][][] executorServiceArray73 = new java.util.concurrent.ExecutorService[][][] {};
        java.util.concurrent.ExecutorService[][][] executorServiceArray74 = new java.util.concurrent.ExecutorService[][][] {};
        java.util.concurrent.ExecutorService[][][] executorServiceArray75 = new java.util.concurrent.ExecutorService[][][] {};
        java.util.concurrent.ExecutorService[][][][] executorServiceArray76 = new java.util.concurrent.ExecutorService[][][][] { executorServiceArray71, executorServiceArray72, executorServiceArray73, executorServiceArray74, executorServiceArray75 };
        java.util.Set<java.util.concurrent.ExecutorService[][][]> executorServiceArraySet77 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray76);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray30, (java.lang.Object[]) executorServiceArray76);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("", postingsEnum15, postingsEnum16, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) postingsEnum16);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray25 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray32 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray25, floatArray32, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray25, (float) (-1));
        float[] floatArray45 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray52 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray45, floatArray52, (float) (byte) 100);
        float[] floatArray63 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray70 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray63, floatArray70, (float) (byte) 100);
        float[] floatArray80 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray87 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray80, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray80, (float) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray45, floatArray63, (float) (byte) 0);
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray63, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray63);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) boolean6);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        byte[] byteArray6 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.nightly", indexReader16, terms17, terms18, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.nightly");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 10L);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) '4');
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.awaitsfix", indexReader13, fields14, fields15, true);
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.badapples");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale24, locale26, locale28, locale30, locale32 };
        java.util.Set<java.util.Locale> localeSet34 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray33);
        java.util.List<java.io.Serializable> serializableList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray33);
        java.util.Set<java.lang.Cloneable> cloneableSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray33);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray33, (java.lang.Object) (byte) -1);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale41, locale43, locale45, locale47, locale49 };
        java.util.Set<java.util.Locale> localeSet51 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray50);
        java.util.List<java.io.Serializable> serializableList52 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray50);
        java.util.Set<java.lang.Cloneable> cloneableSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray50);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray50, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray33, (java.lang.Object[]) localeArray50);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests57 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        kuromojiAnalysisTests57.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, false);
        kuromojiAnalysisTests57.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests57.failureAndSuccessEvents;
        kuromojiAnalysisTests57.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray33, (java.lang.Object) kuromojiAnalysisTests57);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        kuromojiAnalysisTests57.assertDocsSkippingEquals("tests.awaitsfix", indexReader70, 10, postingsEnum72, postingsEnum73, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests76 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        org.apache.lucene.index.Fields fields80 = null;
        kuromojiAnalysisTests76.assertFieldsEquals("europarl.lines.txt.gz", indexReader78, fields79, fields80, false);
        kuromojiAnalysisTests76.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) true, (java.lang.Object) kuromojiAnalysisTests76);
        kuromojiAnalysisTests76.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        kuromojiAnalysisTests76.assertDocsSkippingEquals("tests.awaitsfix", indexReader87, (int) (short) -1, postingsEnum89, postingsEnum90, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests76);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) 1.0f, 1.0d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray13, (java.lang.Object) 0.0f);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray30, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray37);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray37);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray30, (java.lang.Object[]) strArray37);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.awaitsfix");
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests15.tearDown();
        kuromojiAnalysisTests15.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests15.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests15);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests29.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests29.ensureCleanedUp();
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests29.assertTermsEquals("tests.badapples", indexReader35, terms36, terms37, false);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests29.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests29.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader42, 100, postingsEnum44, postingsEnum45, true);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests29);
        java.lang.Object obj49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) kuromojiAnalysisTests29, obj49);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        java.lang.Object[] objArray0 = null;
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale5, locale7, locale9, locale11, locale13 };
        java.util.Set<java.util.Locale> localeSet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.List<java.io.Serializable> serializableList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray14);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray14, (java.lang.Object) 0.0f);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale22, locale24, locale26, locale28, locale30 };
        java.util.Set<java.util.Locale> localeSet32 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray31);
        java.util.List<java.io.Serializable> serializableList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray31);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray31, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray14, (java.lang.Object[]) localeArray31);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale39, locale41, locale43, locale45, locale47 };
        java.util.Set<java.util.Locale> localeSet49 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray48);
        java.util.List<java.io.Serializable> serializableList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray48);
        java.util.Set<java.lang.Cloneable> cloneableSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray31, (java.lang.Object[]) localeArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) localeArray48);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) (short) 0, (double) (short) -1, (double) 100);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) ' ');
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (short) 1);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 100L, (float) (byte) 10, 1.0f);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 4, (-1.0f), (float) 1L);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0f, (float) (byte) 100, (float) '4');
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet15, (java.lang.Object) kuromojiAnalysisTests16);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests16.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests16.ruleChain;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.maxfailures", indexReader27, (int) (byte) 100, postingsEnum29, postingsEnum30, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, false);
        kuromojiAnalysisTests33.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain42;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum46, postingsEnum47, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray6 = new java.util.Locale[] { locale1, locale3, locale5 };
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale8, locale10, locale12 };
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale15, locale17, locale19 };
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray27 = new java.util.Locale[] { locale22, locale24, locale26 };
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale29, locale31, locale33 };
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale36, locale38, locale40 };
        java.util.Locale[][] localeArray42 = new java.util.Locale[][] { localeArray6, localeArray13, localeArray20, localeArray27, localeArray34, localeArray41 };
        java.util.Set<java.util.Locale[]> localeArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        kuromojiAnalysisTests44.assertFieldsEquals("europarl.lines.txt.gz", indexReader46, fields47, fields48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests44.assertPositionsSkippingEquals("tests.failfast", indexReader52, 1, postingsEnum54, postingsEnum55);
        kuromojiAnalysisTests44.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        kuromojiAnalysisTests44.assertFieldsEquals("tests.slow", indexReader60, fields61, fields62, false);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        kuromojiAnalysisTests44.assertPositionsSkippingEquals("<unknown>", indexReader66, (int) 'a', postingsEnum68, postingsEnum69);
        kuromojiAnalysisTests44.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain72 = kuromojiAnalysisTests44.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray42, (java.lang.Object) ruleChain72);
        java.util.Set<java.util.Locale[]> localeArraySet74 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray42);
        java.lang.Object[] objArray75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray42, objArray75);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) (-1L), 0.0f);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] { (short) 10 };
        short[] shortArray7 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray7);
        short[] shortArray12 = new short[] { (short) 10 };
        short[] shortArray14 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray14);
        short[] shortArray18 = new short[] { (short) 10 };
        short[] shortArray20 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray14, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray20);
        short[] shortArray27 = new short[] { (short) 10 };
        short[] shortArray29 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray29);
        short[] shortArray33 = new short[] { (short) 10 };
        short[] shortArray35 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray33, shortArray35);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray29, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray35);
        short[] shortArray43 = new short[] { (short) 10 };
        short[] shortArray45 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray45);
        short[] shortArray49 = new short[] { (short) 10 };
        short[] shortArray51 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray45, shortArray51);
        short[] shortArray57 = new short[] { (short) 10 };
        short[] shortArray59 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray59);
        short[] shortArray63 = new short[] { (short) 10 };
        short[] shortArray65 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray63, shortArray65);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray59, shortArray65);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray45, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray65);
        short[] shortArray72 = new short[] { (short) 10 };
        short[] shortArray74 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray72, shortArray74);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray65, shortArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray1, shortArray72);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray4);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", (int) '4', numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
        char[] charArray10 = new char[] { '4', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum2, postingsEnum3, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields9, fields10, false);
        kuromojiAnalysisTests6.ensureCleanedUp();
        kuromojiAnalysisTests6.resetCheckIndexStatus();
        kuromojiAnalysisTests6.ensureCleanedUp();
        kuromojiAnalysisTests6.ensureCheckIndexPassed();
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        kuromojiAnalysisTests18.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        kuromojiAnalysisTests6.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader36, fields37, fields38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests34.assertPositionsSkippingEquals("tests.failfast", indexReader42, 1, postingsEnum44, postingsEnum45);
        kuromojiAnalysisTests34.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("tests.slow", indexReader50, fields51, fields52, false);
        kuromojiAnalysisTests34.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule56 = kuromojiAnalysisTests34.ruleChain;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) testRule56);
        org.junit.rules.TestRule[] testRuleArray58 = new org.junit.rules.TestRule[] { ruleChain27, testRule56 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet59 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) testRuleArray58);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        double[] doubleArray5 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray10, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        double[] doubleArray32 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray37 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray32, doubleArray37, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray32, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray19, (-1.0d));
        double[] doubleArray50 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray55 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray50, doubleArray55, (double) (byte) 100);
        double[] doubleArray63 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray68 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray63, doubleArray68, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray50, doubleArray63, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray50, (double) (short) 1);
        double[] doubleArray80 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray85 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray80, doubleArray85, (double) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray85, (double) 4);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray30, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        kuromojiAnalysisTests37.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain46 = kuromojiAnalysisTests37.failureAndSuccessEvents;
        kuromojiAnalysisTests37.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray13, (java.lang.Object) kuromojiAnalysisTests37);
        int[][] intArray50 = new int[][] {};
        java.util.List<int[]> intArrayList51 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, intArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) localeArray13, (java.lang.Object[]) intArray50);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale17, locale19, locale21 };
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale24, locale26, locale28 };
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale31, locale33, locale35 };
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale38, locale40, locale42 };
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale45, locale47, locale49 };
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale52, locale54, locale56 };
        java.util.Locale[][] localeArray58 = new java.util.Locale[][] { localeArray22, localeArray29, localeArray36, localeArray43, localeArray50, localeArray57 };
        java.util.Set<java.util.Locale[]> localeArraySet59 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray58);
        java.util.List<java.util.Locale[]> localeArrayList60 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, localeArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray58);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("random", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader15, terms16, terms17, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) ' ', (double) (byte) -1);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0.0d, (double) (byte) 100);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass12 = locale11.getClass();
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass15 = locale14.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray16 = new java.lang.reflect.AnnotatedElement[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass12, wildcardClass15 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet17 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) annotatedElementArray16);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray2, executorServiceArray3, executorServiceArray4, executorServiceArray5, executorServiceArray6 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests10.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests10.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule19;
        java.lang.Class<?> wildcardClass21 = testRule19.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests22.assertPositionsSkippingEquals("hi!", indexReader30, (int) (byte) 0, postingsEnum32, postingsEnum33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests22.assertTermsEquals("random", indexReader36, terms37, terms38, true);
        kuromojiAnalysisTests22.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests22.assertPositionsSkippingEquals("tests.failfast", indexReader43, (int) '4', postingsEnum45, postingsEnum46);
        kuromojiAnalysisTests22.assertPathHasBeenCleared("tests.awaitsfix");
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass51 = kuromojiAnalysisTests22.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        kuromojiAnalysisTests52.assertFieldsEquals("europarl.lines.txt.gz", indexReader54, fields55, fields56, false);
        kuromojiAnalysisTests52.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests52.tearDown();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        kuromojiAnalysisTests52.assertTermsEquals("tests.weekly", indexReader63, terms64, terms65, true);
        java.lang.Class<?> wildcardClass68 = kuromojiAnalysisTests52.getClass();
        java.lang.Class[] classArray70 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray71 = (java.lang.Class<?>[]) classArray70;
        wildcardClassArray71[0] = wildcardClass21;
        wildcardClassArray71[1] = wildcardClass51;
        wildcardClassArray71[2] = wildcardClass68;
        java.util.List<java.lang.Class<?>> wildcardClassList78 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, wildcardClassArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) wildcardClassArray71);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray3, intArray8);
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        int[] intArray20 = new int[] { '#' };
        int[] intArray22 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray15, intArray20);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray3, intArray20);
        int[] intArray27 = new int[] { '#' };
        int[] intArray29 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray27, intArray29);
        org.junit.Assert.assertArrayEquals(intArray20, intArray29);
        int[] intArray34 = new int[] { '#' };
        int[] intArray36 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray34, intArray36);
        int[] intArray39 = new int[] { '#' };
        int[] intArray41 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray39, intArray41);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray34, intArray39);
        org.junit.Assert.assertArrayEquals(intArray20, intArray39);
        int[] intArray49 = new int[] { '#' };
        int[] intArray51 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray49, intArray51);
        int[] intArray54 = new int[] { '#' };
        int[] intArray56 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray54, intArray56);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray49, intArray54);
        int[] intArray61 = new int[] { '#' };
        int[] intArray63 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray61, intArray63);
        int[] intArray66 = new int[] { '#' };
        int[] intArray68 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray66, intArray68);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray61, intArray66);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray49, intArray66);
        int[] intArray74 = new int[] { '#' };
        int[] intArray76 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray74, intArray76);
        int[] intArray79 = new int[] { '#' };
        int[] intArray81 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray79, intArray81);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray74, intArray79);
        org.junit.Assert.assertArrayEquals("", intArray66, intArray79);
        org.junit.Assert.assertArrayEquals(intArray39, intArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray39);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 100L, (double) (byte) 1);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 10, (double) 4);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray1, byteArray5);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader16, terms17, terms18, true);
        kuromojiAnalysisTests2.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.nightly", postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        kuromojiAnalysisTests27.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests38.assertPositionsSkippingEquals("hi!", indexReader46, (int) (byte) 0, postingsEnum48, postingsEnum49);
        kuromojiAnalysisTests38.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests2, kuromojiAnalysisTests27, kuromojiAnalysisTests38 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet53 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray52);
        java.util.Set<org.junit.Assert> assertSet54 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) kuromojiAnalysisTestsArray52);
        org.junit.rules.RuleChain[] ruleChainArray55 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray56 = new org.junit.rules.RuleChain[][] { ruleChainArray55 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet57 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray56);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTestsArray52, (java.lang.Object) ruleChainArray56);
        int[][] intArray60 = new int[][] {};
        java.util.List<int[]> intArrayList61 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, intArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) kuromojiAnalysisTestsArray52, (java.lang.Object[]) intArray60);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader21, (int) '4', postingsEnum23, postingsEnum24);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule35 = kuromojiAnalysisTests26.ruleChain;
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests26.ruleChain;
        org.junit.rules.RuleChain ruleChain37 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests26.assertPositionsSkippingEquals("tests.nightly", indexReader39, (int) (short) 100, postingsEnum41, postingsEnum42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests26);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 0L, (double) (short) 0, 10.0d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet10, (java.lang.Object) kuromojiAnalysisTests11);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests11.assertDocsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17, true);
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests11.ruleChain;
        int[] intArray24 = new int[] { '#' };
        int[] intArray26 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray24, intArray26);
        int[] intArray29 = new int[] { '#' };
        int[] intArray31 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray29, intArray31);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray24, intArray29);
        int[] intArray37 = new int[] { '#' };
        int[] intArray39 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray37, intArray39);
        int[] intArray42 = new int[] { '#' };
        int[] intArray44 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray42, intArray44);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray37, intArray42);
        int[] intArray49 = new int[] { '#' };
        int[] intArray51 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray49, intArray51);
        int[] intArray54 = new int[] { '#' };
        int[] intArray56 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray54, intArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray49, intArray54);
        int[] intArray60 = new int[] { '#' };
        int[] intArray62 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray60, intArray62);
        org.junit.Assert.assertArrayEquals(intArray54, intArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray42, intArray54);
        org.junit.Assert.assertArrayEquals("", intArray29, intArray54);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) testRule20, (java.lang.Object) intArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.failfast");
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.slow", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader25, fields26, fields27, false);
        kuromojiAnalysisTests23.ensureCleanedUp();
        kuromojiAnalysisTests23.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests23.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests23.assertDocsSkippingEquals("tests.slow", indexReader34, (int) (short) -1, postingsEnum36, postingsEnum37, false);
        kuromojiAnalysisTests23.ensureCleanedUp();
        kuromojiAnalysisTests23.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests23.assertPathHasBeenCleared("random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "random");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray13, (java.lang.Object) 0.0f);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray30, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures39 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures38);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures40);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures42 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures42);
        org.junit.rules.TestRule[] testRuleArray44 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures38, testRuleIgnoreAfterMaxFailures41, testRuleIgnoreAfterMaxFailures43 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet45 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray44);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        kuromojiAnalysisTests46.assertFieldsEquals("europarl.lines.txt.gz", indexReader48, fields49, fields50, false);
        kuromojiAnalysisTests46.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests46.setUp();
        kuromojiAnalysisTests46.ensureCheckIndexPassed();
        kuromojiAnalysisTests46.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) testRuleArray44, (java.lang.Object) kuromojiAnalysisTests46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray13, (java.lang.Object[]) testRuleArray44);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        float[] floatArray7 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray14 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        float[] floatArray43 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray50 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray43, floatArray50, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray43, (float) (-1));
        float[] floatArray63 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray70 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray63, floatArray70, (float) (byte) 100);
        float[] floatArray80 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray87 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray80, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray80, (float) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray26, floatArray63, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray63, (float) 100L);
        float[] floatArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray96, (float) 3);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 1, (double) (-1L), 0.0d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests11);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests11.assertPositionsSkippingEquals("tests.slow", indexReader22, (-1), postingsEnum24, postingsEnum25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        kuromojiAnalysisTests27.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests27.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader39, 100, postingsEnum41, postingsEnum42, false);
        kuromojiAnalysisTests27.ensureCheckIndexPassed();
        kuromojiAnalysisTests27.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests27.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) indexReader22, (java.lang.Object) kuromojiAnalysisTests27);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray13, (java.lang.Object) "tests.monster");
        int[][] intArray18 = new int[][] {};
        int[][][] intArray19 = new int[][][] { intArray18 };
        java.util.Set<int[][]> intArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) localeArray13, (java.lang.Object[]) intArray19);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        long[] longArray5 = new long[] { 1 };
        long[] longArray7 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray5, longArray7);
        long[] longArray11 = new long[] { 1 };
        long[] longArray13 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray7, longArray11);
        long[] longArray19 = new long[] { 1 };
        long[] longArray21 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray19, longArray21);
        long[] longArray25 = new long[] { 1 };
        long[] longArray27 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray25, longArray27);
        org.junit.Assert.assertArrayEquals("random", longArray21, longArray27);
        long[] longArray34 = new long[] { 1 };
        long[] longArray36 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray34, longArray36);
        long[] longArray40 = new long[] { 1 };
        long[] longArray42 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray40, longArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray36, longArray40);
        long[] longArray47 = new long[] { 1 };
        long[] longArray49 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray47, longArray49);
        org.junit.Assert.assertArrayEquals("hi!", longArray40, longArray47);
        long[] longArray55 = new long[] { 1 };
        long[] longArray57 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray55, longArray57);
        long[] longArray61 = new long[] { 1 };
        long[] longArray63 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray61, longArray63);
        org.junit.Assert.assertArrayEquals("random", longArray57, longArray63);
        org.junit.Assert.assertArrayEquals(longArray47, longArray57);
        org.junit.Assert.assertArrayEquals(longArray21, longArray57);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray57);
        long[] longArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray57, longArray69);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100, (double) (-1L), (double) '4');
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        long[] longArray4 = new long[] { 1 };
        long[] longArray6 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray4, longArray6);
        long[] longArray10 = new long[] { 1 };
        long[] longArray12 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("random", longArray6, longArray12);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests15.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests15.assertDocsSkippingEquals("tests.slow", indexReader26, (int) (short) -1, postingsEnum28, postingsEnum29, false);
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests15.ensureCheckIndexPassed();
        kuromojiAnalysisTests15.resetCheckIndexStatus();
        kuromojiAnalysisTests15.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) "random", (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader12, (int) (short) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader20, terms21, terms22, true);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", 0, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.slow", indexReader11, (int) (short) -1, postingsEnum13, postingsEnum14, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (byte) 100);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests19.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests19.assertDocsSkippingEquals("tests.slow", indexReader30, (int) (short) -1, postingsEnum32, postingsEnum33, false);
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests19.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        kuromojiAnalysisTests39.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("enwiki.random.lines.txt", indexReader51, fields52, fields53, false);
        kuromojiAnalysisTests39.setIndexWriterMaxDocs((int) (byte) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        kuromojiAnalysisTests58.assertFieldsEquals("europarl.lines.txt.gz", indexReader60, fields61, fields62, false);
        kuromojiAnalysisTests58.ensureCleanedUp();
        kuromojiAnalysisTests58.resetCheckIndexStatus();
        kuromojiAnalysisTests58.ensureCleanedUp();
        kuromojiAnalysisTests58.ensureCheckIndexPassed();
        kuromojiAnalysisTests58.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests70 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        kuromojiAnalysisTests70.assertFieldsEquals("europarl.lines.txt.gz", indexReader72, fields73, fields74, false);
        kuromojiAnalysisTests70.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain79 = kuromojiAnalysisTests70.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain79;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain79;
        kuromojiAnalysisTests58.failureAndSuccessEvents = ruleChain79;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain79;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain79;
        kuromojiAnalysisTests39.failureAndSuccessEvents = ruleChain79;
        kuromojiAnalysisTests19.failureAndSuccessEvents = ruleChain79;
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests19);
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests19.assertDocsAndPositionsEnumEquals("random", postingsEnum89, postingsEnum90);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray13);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale25, locale27, locale29, locale31, locale33 };
        java.util.Set<java.util.Locale> localeSet35 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray34);
        java.util.List<java.io.Serializable> serializableList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray34);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray34, (java.lang.Object) 0.0f);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale42, locale44, locale46, locale48, locale50 };
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        java.util.List<java.io.Serializable> serializableList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray51);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray51, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray34, (java.lang.Object[]) localeArray51);
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale59, locale61, locale63, locale65, locale67 };
        java.util.Set<java.util.Locale> localeSet69 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray68);
        java.util.List<java.io.Serializable> serializableList70 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray68);
        java.util.Set<java.lang.Cloneable> cloneableSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray51, (java.lang.Object[]) localeArray68);
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray85 = new java.util.Locale[] { locale76, locale78, locale80, locale82, locale84 };
        java.util.Set<java.util.Locale> localeSet86 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray85);
        java.util.List<java.io.Serializable> serializableList87 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray85);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray85, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray51, (java.lang.Object[]) localeArray85);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray85);
        java.util.concurrent.ExecutorService executorService92 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray93 = new java.util.concurrent.ExecutorService[] { executorService92 };
        boolean boolean94 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray93);
        boolean boolean95 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray93);
        boolean boolean96 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) executorServiceArray93);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10 };
        byte[] byteArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray4);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 0.0f, (double) 10.0f);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        long[] longArray7 = new long[] { 1 };
        long[] longArray9 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray7, longArray9);
        long[] longArray13 = new long[] { 1 };
        long[] longArray15 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray13, longArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray9, longArray13);
        long[] longArray20 = new long[] { 1 };
        long[] longArray22 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray20, longArray22);
        org.junit.Assert.assertArrayEquals("hi!", longArray13, longArray20);
        long[] longArray28 = new long[] { 1 };
        long[] longArray30 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray28, longArray30);
        long[] longArray35 = new long[] { 1 };
        long[] longArray37 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray35, longArray37);
        long[] longArray41 = new long[] { 1 };
        long[] longArray43 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray41, longArray43);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray37, longArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray28, longArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray20, longArray28);
        long[] longArray50 = new long[] { 1 };
        long[] longArray52 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray50, longArray52);
        long[] longArray58 = new long[] { 1 };
        long[] longArray60 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray58, longArray60);
        long[] longArray64 = new long[] { 1 };
        long[] longArray66 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray64, longArray66);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray60, longArray64);
        long[] longArray71 = new long[] { 1 };
        long[] longArray73 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray71, longArray73);
        org.junit.Assert.assertArrayEquals("hi!", longArray64, longArray71);
        org.junit.Assert.assertArrayEquals(longArray52, longArray64);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray20, longArray52);
        long[] longArray83 = new long[] { (short) 100, '4', (short) 10, '#', 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray52, longArray83);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) (short) -1, 0.0f);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet16, (java.lang.Object) kuromojiAnalysisTests17);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests17.assertDocsEnumEquals("tests.badapples", postingsEnum22, postingsEnum23, true);
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests17.ruleChain;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("tests.maxfailures", indexReader28, (int) (byte) 100, postingsEnum30, postingsEnum31, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader36, fields37, fields38, false);
        kuromojiAnalysisTests34.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain43;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain43;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        kuromojiAnalysisTests46.assertFieldsEquals("europarl.lines.txt.gz", indexReader48, fields49, fields50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        kuromojiAnalysisTests46.assertPositionsSkippingEquals("hi!", indexReader54, (int) (byte) 0, postingsEnum56, postingsEnum57);
        kuromojiAnalysisTests46.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain43, (java.lang.Object) kuromojiAnalysisTests46);
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests46);
        java.lang.Class<?> wildcardClass62 = kuromojiAnalysisTests46.getClass();
        int[][][][][] intArray63 = new int[][][][][] {};
        java.util.Set<int[][][][]> intArraySet64 = org.apache.lucene.util.LuceneTestCase.asSet(intArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests46, (java.lang.Object) intArraySet64);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass12 = locale11.getClass();
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass15 = locale14.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray16 = new java.lang.reflect.AnnotatedElement[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass12, wildcardClass15 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet17 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray16);
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray16, obj18);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests21.assertPositionsSkippingEquals("tests.failfast", indexReader29, 1, postingsEnum31, postingsEnum32);
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests21.setUp();
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests21.assertPathHasBeenCleared("tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) executorServiceArray42);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) annotatedElementArray16, (java.lang.Object[]) executorServiceArray42);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (-1.0f), 0.0d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        int[] intArray1 = null;
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
        int[] intArray10 = new int[] { '#' };
        int[] intArray12 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray10, intArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray5, intArray10);
        int[] intArray16 = new int[] { '#' };
        int[] intArray18 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray16, intArray18);
        org.junit.Assert.assertArrayEquals(intArray10, intArray16);
        int[] intArray23 = new int[] { '#' };
        int[] intArray25 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray23, intArray25);
        int[] intArray28 = new int[] { '#' };
        int[] intArray30 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray28, intArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray23, intArray28);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray10, intArray28);
        int[] intArray37 = new int[] { '#' };
        int[] intArray39 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray37, intArray39);
        int[] intArray42 = new int[] { '#' };
        int[] intArray44 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray42, intArray44);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray37, intArray42);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        org.junit.Assert.assertArrayEquals(intArray42, intArray48);
        int[] intArray55 = new int[] { '#' };
        int[] intArray57 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray55, intArray57);
        int[] intArray60 = new int[] { '#' };
        int[] intArray62 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray60, intArray62);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray55, intArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray42, intArray60);
        org.junit.Assert.assertArrayEquals(intArray28, intArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray28);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        short[] shortArray2 = new short[] { (short) 10 };
        short[] shortArray4 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray4);
        short[] shortArray9 = new short[] { (short) 10 };
        short[] shortArray11 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray11);
        short[] shortArray15 = new short[] { (short) 10 };
        short[] shortArray17 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray11, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray17);
        short[] shortArray24 = new short[] { (short) 10 };
        short[] shortArray26 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray26);
        short[] shortArray30 = new short[] { (short) 10 };
        short[] shortArray32 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray32);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray26, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray32);
        short[] shortArray39 = new short[] { (short) 10 };
        short[] shortArray41 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray39, shortArray41);
        short[] shortArray45 = new short[] { (short) 10 };
        short[] shortArray47 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray41, shortArray47);
        short[] shortArray52 = new short[] { (short) 10 };
        short[] shortArray54 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray4);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        kuromojiAnalysisTests12.ensureCleanedUp();
        kuromojiAnalysisTests12.resetCheckIndexStatus();
        kuromojiAnalysisTests12.ensureCleanedUp();
        kuromojiAnalysisTests12.ensureCheckIndexPassed();
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader26, fields27, fields28, false);
        kuromojiAnalysisTests24.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain33 = kuromojiAnalysisTests24.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        kuromojiAnalysisTests12.failureAndSuccessEvents = ruleChain33;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        kuromojiAnalysisTests38.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain47;
        org.junit.rules.RuleChain[] ruleChainArray49 = new org.junit.rules.RuleChain[] { ruleChain33, ruleChain47 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet50 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray49);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet51 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray49);
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChainArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) ruleChainArray49);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        double[] doubleArray7 = new double[] { 10, 4, (-1.0d), (-1.0d), (byte) 100, 1.0d };
        double[] doubleArray14 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray19 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray14, doubleArray19, (double) (byte) 100);
        double[] doubleArray27 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray32 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray27, doubleArray32, (double) (byte) 100);
        double[] doubleArray41 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray46 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray41, doubleArray46, (double) (byte) 100);
        double[] doubleArray54 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray59 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray59, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray41, doubleArray54, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray41, (-1.0d));
        org.junit.Assert.assertArrayEquals("hi!", doubleArray14, doubleArray27, (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray7, doubleArray14, 100.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 0, (double) (short) 1);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain21;
        kuromojiAnalysisTests0.tearDown();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests29.assertTermsEquals("tests.weekly", indexReader31, terms32, terms33, false);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray27, (java.lang.Object) indexReader31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) strArray27);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray2, executorServiceArray3, executorServiceArray4, executorServiceArray5, executorServiceArray6 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray7);
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray7);
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray7);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray13);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("tests.failfast", indexReader23, 1, postingsEnum25, postingsEnum26);
        kuromojiAnalysisTests15.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.resetCheckIndexStatus();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("enwiki.random.lines.txt", indexReader34, fields35, fields36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests15.assertDocsSkippingEquals("tests.weekly", indexReader40, (int) (byte) 0, postingsEnum42, postingsEnum43, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) genericDeclarationArray13, (java.lang.Object) "tests.weekly");
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray13, (java.lang.Object[]) executorServiceArray47);
        java.util.List<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, genericDeclarationArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) genericDeclarationArray13);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        float[] floatArray1 = new float[] { 0.0f };
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray17 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray27 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray34 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray27, floatArray34, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray27, (float) (-1));
        float[] floatArray47 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray54 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray47, floatArray54, (float) (byte) 100);
        float[] floatArray64 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray71 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray64, floatArray71, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray47, floatArray64, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray64, (float) 1);
        float[] floatArray85 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray92 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray85, floatArray92, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray92, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray27, (float) (byte) 1);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray9);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (-1L));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (-1.0f));
    }
}

