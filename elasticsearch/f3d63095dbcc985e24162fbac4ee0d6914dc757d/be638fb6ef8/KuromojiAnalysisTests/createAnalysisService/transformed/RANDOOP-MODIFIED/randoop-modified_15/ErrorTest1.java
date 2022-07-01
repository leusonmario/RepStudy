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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader17, (int) (byte) 0, postingsEnum19, postingsEnum20, false);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain24 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("random", indexReader26, (int) (short) 0, postingsEnum28, postingsEnum29);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        int[] intArray7 = new int[] { (byte) 0, (short) 1, (short) 100, (byte) 0, 3, (byte) 1 };
        int[] intArray11 = new int[] { 'a', 1, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray7, intArray11);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (short) 100);
        kuromojiAnalysisTests2.setUp();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests27.assertTermsEquals("tests.failfast", indexReader30, terms31, terms32, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests27.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests27.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests27.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) ruleChain26, (java.lang.Object) kuromojiAnalysisTests27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) "tests.nightly", (java.lang.Object) kuromojiAnalysisTests27);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement21 = null;
        org.junit.runner.Description description22 = null;
        org.junit.runners.model.Statement statement23 = ruleChain20.apply(statement21, description22);
        org.junit.runner.Description description24 = null;
        org.junit.runners.model.Statement statement25 = ruleChain11.apply(statement23, description24);
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain28 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests29.ruleChain;
        org.junit.rules.RuleChain ruleChain31 = ruleChain28.around(testRule30);
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain31);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy35 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.rules.TestRule testRule36 = null;
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.outerRule(testRule36);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        org.junit.rules.TestRule testRule39 = null;
        org.junit.rules.RuleChain ruleChain40 = org.junit.rules.RuleChain.outerRule(testRule39);
        org.junit.rules.RuleChain ruleChain41 = ruleChain37.around((org.junit.rules.TestRule) ruleChain40);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy35, (java.lang.Object) ruleChain41);
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain44 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain43);
        org.junit.rules.RuleChain ruleChain45 = ruleChain41.around((org.junit.rules.TestRule) ruleChain43);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) "tests.badapples", (java.lang.Object) ruleChain41);
        org.junit.rules.RuleChain ruleChain47 = ruleChain32.around((org.junit.rules.TestRule) ruleChain41);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests49.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests49, (java.lang.Object) "");
        org.junit.rules.TestRule testRule54 = null;
        org.junit.rules.RuleChain ruleChain55 = org.junit.rules.RuleChain.outerRule(testRule54);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain55;
        org.junit.rules.TestRule testRule57 = null;
        org.junit.rules.RuleChain ruleChain58 = org.junit.rules.RuleChain.outerRule(testRule57);
        org.junit.rules.RuleChain ruleChain59 = ruleChain55.around((org.junit.rules.TestRule) ruleChain58);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain59;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain59);
        kuromojiAnalysisTests49.failureAndSuccessEvents = ruleChain59;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) ruleChain41, (java.lang.Object) kuromojiAnalysisTests49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) statement23, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 'a');
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests16.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) 'a', numericDocValues33, numericDocValues34);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10, (double) (-1), (double) 10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader20, (int) (short) 100, postingsEnum22, postingsEnum23);
        org.junit.rules.RuleChain ruleChain25 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain25);
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain28 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain27);
        org.junit.rules.RuleChain ruleChain29 = ruleChain26.around((org.junit.rules.TestRule) ruleChain28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain26);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.tearDown();
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.nightly");
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.junit.rules.RuleChain ruleChain0 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain1);
        org.junit.rules.RuleChain ruleChain3 = ruleChain0.around((org.junit.rules.TestRule) ruleChain2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain2);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        short[] shortArray3 = new short[] { (byte) -1, (short) 1, (short) 100 };
        short[] shortArray4 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        int[] intArray4 = new int[] { (short) 0, (byte) -1, (byte) -1, 100 };
        int[] intArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) (byte) 100, (float) 1L);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("random", indexReader16, fields17, fields18, false);
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', 0.0d, (double) 2);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.junit.rules.RuleChain ruleChain0 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain0);
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain2);
        org.junit.rules.RuleChain ruleChain4 = ruleChain1.around((org.junit.rules.TestRule) ruleChain3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests7.assertTermsEquals("tests.failfast", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests7.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests7.assertTermsEquals("hi!", indexReader17, terms18, terms19, true);
        kuromojiAnalysisTests7.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests7.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests7.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests26.tearDown();
        kuromojiAnalysisTests26.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests7, (java.lang.Object) kuromojiAnalysisTests26);
        org.junit.rules.TestRule testRule31 = null;
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.outerRule(testRule31);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain32;
        org.junit.rules.TestRule testRule34 = null;
        org.junit.rules.RuleChain ruleChain35 = org.junit.rules.RuleChain.outerRule(testRule34);
        org.junit.rules.RuleChain ruleChain36 = ruleChain32.around((org.junit.rules.TestRule) ruleChain35);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests7, (java.lang.Object) ruleChain32);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain32;
        java.lang.Object obj39 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) ruleChain32, obj39);
        org.junit.rules.RuleChain ruleChain41 = ruleChain4.around((org.junit.rules.TestRule) ruleChain32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.tearDown();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests42.assertTermsEquals("tests.failfast", indexReader45, terms46, terms47, false);
        kuromojiAnalysisTests42.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        kuromojiAnalysisTests42.assertTermsEquals("hi!", indexReader52, terms53, terms54, true);
        kuromojiAnalysisTests42.setUp();
        kuromojiAnalysisTests42.tearDown();
        kuromojiAnalysisTests42.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule60 = kuromojiAnalysisTests42.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain4, (java.lang.Object) kuromojiAnalysisTests42);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        short[] shortArray0 = new short[] {};
        short[] shortArray4 = new short[] { (byte) 100, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray4);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) throttlingArray5);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) throttlingArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray9);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) throttlingArray18);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) throttlingArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray29);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) throttlingArray34);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray29, (java.lang.Object[]) serializableArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) throttlingArray44);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray39, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray32, (java.lang.Object[]) throttlingArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray22, (java.lang.Object[]) throttlingArray39);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray22);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests51.tearDown();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        kuromojiAnalysisTests51.assertTermsEquals("tests.failfast", indexReader54, terms55, terms56, false);
        kuromojiAnalysisTests51.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests60 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests60.tearDown();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        kuromojiAnalysisTests60.assertTermsEquals("tests.failfast", indexReader63, terms64, terms65, false);
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        kuromojiAnalysisTests60.assertDocsEnumEquals("tests.weekly", postingsEnum69, postingsEnum70, true);
        kuromojiAnalysisTests60.setIndexWriterMaxDocs((int) ' ');
        kuromojiAnalysisTests60.setIndexWriterMaxDocs((int) ' ');
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests77 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests77.tearDown();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        kuromojiAnalysisTests77.assertTermsEquals("tests.failfast", indexReader80, terms81, terms82, false);
        kuromojiAnalysisTests77.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests77.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray88 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests51, kuromojiAnalysisTests60, kuromojiAnalysisTests77 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet89 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) kuromojiAnalysisTestsArray88);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        float[] floatArray7 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray13 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray13, (float) (byte) 100);
        float[] floatArray22 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray28 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray22, floatArray28, (float) (byte) 100);
        float[] floatArray37 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray43 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray37, floatArray43, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray37, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray22, (float) (short) 100);
        float[] floatArray56 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray62 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray56, floatArray62, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray7, floatArray62, (float) 2);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        int[] intArray4 = new int[] { 100, 2, (short) 100, 3 };
        int[] intArray8 = new int[] { (byte) 100, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray8);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray7);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        short[] shortArray1 = new short[] {};
        short[] shortArray5 = new short[] { (byte) -1, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray1, shortArray5);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests16.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.nightly", indexReader31, fields32, fields33, true);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("hi!", indexReader37, 3, postingsEnum39, postingsEnum40, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 1, (-1.0d));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.tearDown();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, false);
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests15.failureAndSuccessEvents;
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertPathHasBeenCleared("");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 100L);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1.0f), (float) 100, (float) (byte) 1);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        java.lang.String str6 = kuromojiAnalysisTests2.getTestName();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 100, (long) 10);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        long[] longArray4 = new long[] { '4', 10, (short) 10, 1L };
        long[] longArray9 = new long[] { 2, 10L, 0, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        int[] intArray4 = new int[] { 'a', 0, (short) 10, 100 };
        int[] intArray8 = new int[] { 1, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray8);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        org.junit.rules.TestRule testRule6 = null;
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.outerRule(testRule6);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain7;
        org.junit.rules.TestRule testRule9 = null;
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.outerRule(testRule9);
        org.junit.rules.RuleChain ruleChain11 = ruleChain7.around((org.junit.rules.TestRule) ruleChain10);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain11);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.weekly", postingsEnum16, postingsEnum17, true);
        kuromojiAnalysisTests1.setUp();
        org.junit.rules.RuleChain ruleChain21 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain22 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain23 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain22);
        org.junit.rules.RuleChain ruleChain24 = ruleChain21.around((org.junit.rules.TestRule) ruleChain23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain21);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests3.assertTermsEquals("hi!", indexReader13, terms14, terms15, true);
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests3.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests3.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        kuromojiAnalysisTests22.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) (byte) 0, (java.lang.Object) kuromojiAnalysisTests22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests22);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests12);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        byte[] byteArray8 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray7, byteArray8);
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
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10L, (double) ' ', (double) (byte) 1);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        java.lang.String str6 = kuromojiAnalysisTests2.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests7.assertTermsEquals("tests.failfast", indexReader10, terms11, terms12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests7.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement16 = null;
        org.junit.runner.Description description17 = null;
        org.junit.runners.model.Statement statement18 = ruleChain15.apply(statement16, description17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests19.assertTermsEquals("tests.failfast", indexReader22, terms23, terms24, false);
        kuromojiAnalysisTests19.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests19.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain30 = ruleChain15.around((org.junit.rules.TestRule) ruleChain29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.tearDown();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests32.assertTermsEquals("tests.failfast", indexReader35, terms36, terms37, false);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain40, (java.lang.Object) "tests.weekly");
        org.junit.rules.RuleChain ruleChain43 = ruleChain15.around((org.junit.rules.TestRule) ruleChain40);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain40;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        long[] longArray4 = new long[] { 0, '4', 100L };
        long[] longArray10 = new long[] { (byte) 100, (short) 100, '#', (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray4, longArray10);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        java.lang.String str6 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (short) 0);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests10.assertTermsEquals("tests.failfast", indexReader13, terms14, terms15, false);
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests10.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement19 = null;
        org.junit.runner.Description description20 = null;
        org.junit.runners.model.Statement statement21 = ruleChain18.apply(statement19, description20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests22.assertTermsEquals("tests.failfast", indexReader25, terms26, terms27, false);
        kuromojiAnalysisTests22.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain33 = ruleChain18.around((org.junit.rules.TestRule) ruleChain32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests35.tearDown();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests35.assertTermsEquals("tests.failfast", indexReader38, terms39, terms40, false);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain43, (java.lang.Object) "tests.weekly");
        org.junit.rules.RuleChain ruleChain46 = ruleChain18.around((org.junit.rules.TestRule) ruleChain43);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain46;
        org.junit.rules.TestRule testRule48 = kuromojiAnalysisTests2.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests49.tearDown();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        kuromojiAnalysisTests49.assertTermsEquals("tests.failfast", indexReader52, terms53, terms54, false);
        kuromojiAnalysisTests49.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        kuromojiAnalysisTests49.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum59, postingsEnum60, false);
        java.lang.String str63 = kuromojiAnalysisTests49.getTestName();
        org.junit.rules.RuleChain ruleChain64 = kuromojiAnalysisTests49.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) ruleChain64);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) throttlingArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray8);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) throttlingArray13);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray8, (java.lang.Object[]) serializableArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray21, (java.lang.Object[]) throttlingArray23);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray18, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray11, (java.lang.Object[]) throttlingArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests30.tearDown();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests30.assertTermsEquals("tests.failfast", indexReader33, terms34, terms35, false);
        kuromojiAnalysisTests30.tearDown();
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) kuromojiAnalysisTests30, (java.lang.Object) "tests.nightly");
        kuromojiAnalysisTests30.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests43.tearDown();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        kuromojiAnalysisTests43.assertTermsEquals("tests.failfast", indexReader46, terms47, terms48, false);
        kuromojiAnalysisTests43.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests43.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule54 = kuromojiAnalysisTests43.ruleChain;
        org.junit.rules.RuleChain ruleChain55 = kuromojiAnalysisTests43.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        kuromojiAnalysisTests43.assertPositionsSkippingEquals("", indexReader57, (int) '#', postingsEnum59, postingsEnum60);
        kuromojiAnalysisTests43.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests63 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests63.tearDown();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        kuromojiAnalysisTests63.assertTermsEquals("tests.failfast", indexReader66, terms67, terms68, false);
        kuromojiAnalysisTests63.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests63.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests63.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests63.ensureCheckIndexPassed();
        kuromojiAnalysisTests63.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain79 = kuromojiAnalysisTests63.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests80 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests80.tearDown();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.Terms terms84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        kuromojiAnalysisTests80.assertTermsEquals("tests.failfast", indexReader83, terms84, terms85, false);
        org.junit.rules.RuleChain ruleChain88 = kuromojiAnalysisTests80.failureAndSuccessEvents;
        kuromojiAnalysisTests80.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum94 = null;
        kuromojiAnalysisTests80.assertDocsSkippingEquals("hi!", indexReader91, (int) '4', postingsEnum93, postingsEnum94, true);
        org.junit.Assert[] assertArray97 = new org.junit.Assert[] { kuromojiAnalysisTests30, kuromojiAnalysisTests43, kuromojiAnalysisTests63, kuromojiAnalysisTests80 };
        java.util.Set<org.junit.Assert> assertSet98 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray97);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) assertArray97);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        long[] longArray5 = new long[] { (short) 0, (-1), (-1), (byte) 100 };
        long[] longArray8 = new long[] { 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray8);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 10, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, 10.0d, (double) (byte) 1);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) 1, (long) 'a');
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        long[] longArray4 = new long[] { (byte) 100, (byte) 0, ' ' };
        long[] longArray9 = new long[] { (byte) 0, 0L, 0, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray9);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 1L, (float) 100L, (-1.0f));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) 10, (double) (byte) 10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 10.0f);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 100);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.slow", false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray8);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) throttlingArray8);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) serializableArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) throttlingArray18);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray13, (java.lang.Object[]) serializableArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray6, (java.lang.Object[]) throttlingArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", objArray1, (java.lang.Object[]) serializableArray6);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) '#', (float) 10);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 2, (long) 100);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray1, charArray2);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setUp();
        kuromojiAnalysisTests9.tearDown();
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.maxfailures", postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests9.assertPositionsSkippingEquals("", indexReader19, (int) (byte) 1, postingsEnum21, postingsEnum22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray6, (java.lang.Object) postingsEnum21);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '#');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray5, (double) 3);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) '#');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray17, (double) 0.0f);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) '#');
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray27, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray12, doubleArray27, (double) 1);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray35, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray35, (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) (short) -1);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        org.junit.rules.TestRule testRule2 = null;
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.outerRule(testRule2);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        org.junit.rules.TestRule testRule5 = null;
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.outerRule(testRule5);
        org.junit.rules.RuleChain ruleChain7 = ruleChain3.around((org.junit.rules.TestRule) ruleChain6);
        org.junit.rules.TestRule testRule8 = null;
        org.junit.rules.RuleChain ruleChain9 = org.junit.rules.RuleChain.outerRule(testRule8);
        org.junit.rules.TestRule testRule10 = null;
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule(testRule10);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.rules.TestRule testRule13 = null;
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.outerRule(testRule13);
        org.junit.rules.RuleChain ruleChain15 = ruleChain11.around((org.junit.rules.TestRule) ruleChain14);
        org.junit.rules.TestRule testRule16 = null;
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.outerRule(testRule16);
        org.junit.rules.RuleChain[] ruleChainArray18 = new org.junit.rules.RuleChain[] { ruleChain3, ruleChain9, ruleChain11, ruleChain17 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, ruleChainArray18);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray21 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet22 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray21);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray21, (java.lang.Object[]) serializableArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) ruleChainArray18, (java.lang.Object[]) serializableArray24);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray1 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet2 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests4.assertTermsEquals("tests.failfast", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests4.assertTermsEquals("hi!", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests4.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests4.ensureCleanedUp();
        kuromojiAnalysisTests4.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) kuromojiAnalysisTests4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) luceneTestCaseArray1, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) throttlingArray4);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) throttlingArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) throttlingArray20);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray15, (java.lang.Object[]) serializableArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) throttlingArray30);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray25, (java.lang.Object[]) serializableArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray18, (java.lang.Object[]) throttlingArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray8, (java.lang.Object[]) throttlingArray25);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) throttlingArray40);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray46);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) throttlingArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray44);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray53);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray51, (java.lang.Object[]) throttlingArray53);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray59);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) throttlingArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray51, (java.lang.Object[]) serializableArray57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray64);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet68 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray67);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray69 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray69);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray67, (java.lang.Object[]) throttlingArray69);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray64, (java.lang.Object[]) serializableArray67);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray74 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray74);
        java.io.Serializable[] serializableArray77 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet78 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray77);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray79 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet80 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray79);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray77, (java.lang.Object[]) throttlingArray79);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray74, (java.lang.Object[]) serializableArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray67, (java.lang.Object[]) throttlingArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray57, (java.lang.Object[]) throttlingArray74);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) serializableArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray44);
        java.lang.Object[] objArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) serializableArray8, objArray87);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.awaitsfix");
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests18.assertTermsEquals("tests.failfast", indexReader21, terms22, terms23, false);
        kuromojiAnalysisTests18.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests18.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests18.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests18.tearDown();
        kuromojiAnalysisTests18.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests18);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 10L, (long) (byte) 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        java.lang.String str8 = kuromojiAnalysisTests2.getTestName();
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.slow", "tests.weekly" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) str8, (java.lang.Object) strSet12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) str8);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        long[] longArray6 = new long[] { '#', 0L, 'a', 100, (short) 0, (byte) 1 };
        long[] longArray11 = new long[] { (-1L), 4, 1L, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        java.lang.String str13 = kuromojiAnalysisTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", obj1, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) throttlingArray3);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray7);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray21, (java.lang.Object[]) serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray31, (java.lang.Object[]) serializableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray15);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) executorServiceArray44);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.awaitsfix");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests14.ruleChain;
        org.junit.rules.TestRule testRule16 = null;
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.outerRule(testRule16);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        org.junit.rules.TestRule testRule19 = null;
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.outerRule(testRule19);
        org.junit.rules.RuleChain ruleChain21 = ruleChain17.around((org.junit.rules.TestRule) ruleChain20);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        kuromojiAnalysisTests14.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests24.assertTermsEquals("tests.failfast", indexReader27, terms28, terms29, false);
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests24.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement33 = null;
        org.junit.runner.Description description34 = null;
        org.junit.runners.model.Statement statement35 = ruleChain32.apply(statement33, description34);
        org.junit.rules.RuleChain ruleChain36 = ruleChain17.around((org.junit.rules.TestRule) ruleChain32);
        org.junit.rules.TestRule testRule39 = null;
        org.junit.rules.RuleChain ruleChain40 = org.junit.rules.RuleChain.outerRule(testRule39);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        org.junit.rules.TestRule testRule42 = null;
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule(testRule42);
        org.junit.rules.RuleChain ruleChain44 = ruleChain40.around((org.junit.rules.TestRule) ruleChain43);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain43);
        org.junit.rules.TestRule testRule46 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain47 = ruleChain43.around(testRule46);
        org.junit.rules.RuleChain ruleChain48 = ruleChain36.around((org.junit.rules.TestRule) ruleChain43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain36);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        short[] shortArray1 = new short[] {};
        short[] shortArray8 = new short[] { (byte) 1, (byte) 0, (short) 1, (byte) 0, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray1, shortArray8);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.rules.TestRule testRule5 = kuromojiAnalysisTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) ' ', (float) (short) -1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.util.Set[] setArray8 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray9 = (java.util.Set<java.io.Serializable>[]) setArray8;
        serializableSetArray9[0] = serializableSet2;
        serializableSetArray9[1] = serializableSet4;
        serializableSetArray9[2] = serializableSet6;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) throttlingArray24);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray19, (java.lang.Object[]) serializableArray22);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) throttlingArray31);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray19, (java.lang.Object[]) serializableArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableSetArray9, (java.lang.Object[]) throttlingArray19);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(100);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", 3, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) throttlingArray4);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) throttlingArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray8);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) throttlingArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray22, (java.lang.Object[]) serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) throttlingArray37);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) serializableArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray32);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray16);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) throttlingArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) throttlingArray47);
        org.junit.rules.TestRule testRule52 = null;
        org.junit.rules.RuleChain ruleChain53 = org.junit.rules.RuleChain.outerRule(testRule52);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain53;
        org.junit.rules.TestRule testRule55 = null;
        org.junit.rules.RuleChain ruleChain56 = org.junit.rules.RuleChain.outerRule(testRule55);
        org.junit.rules.RuleChain ruleChain57 = ruleChain53.around((org.junit.rules.TestRule) ruleChain56);
        org.junit.rules.TestRule testRule58 = null;
        org.junit.rules.RuleChain ruleChain59 = org.junit.rules.RuleChain.outerRule(testRule58);
        org.junit.rules.TestRule testRule60 = null;
        org.junit.rules.RuleChain ruleChain61 = org.junit.rules.RuleChain.outerRule(testRule60);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain61;
        org.junit.rules.TestRule testRule63 = null;
        org.junit.rules.RuleChain ruleChain64 = org.junit.rules.RuleChain.outerRule(testRule63);
        org.junit.rules.RuleChain ruleChain65 = ruleChain61.around((org.junit.rules.TestRule) ruleChain64);
        org.junit.rules.TestRule testRule66 = null;
        org.junit.rules.RuleChain ruleChain67 = org.junit.rules.RuleChain.outerRule(testRule66);
        org.junit.rules.RuleChain[] ruleChainArray68 = new org.junit.rules.RuleChain[] { ruleChain53, ruleChain59, ruleChain61, ruleChain67 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, ruleChainArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) throttlingArray47, (java.lang.Object[]) ruleChainArray68);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray1, byteArray7);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        byte[] byteArray1 = null;
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray5);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10.0f, (double) 'a');
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) '#');
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray2, charArray3);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray12, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray16, charArray17);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray17, charArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray13, charArray17);
        org.junit.Assert.assertArrayEquals(charArray3, charArray13);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray27, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray28, charArray32);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray37, charArray38);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray41, charArray42);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray42, charArray46);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray38, charArray42);
        org.junit.Assert.assertArrayEquals(charArray28, charArray38);
        org.junit.Assert.assertArrayEquals(charArray13, charArray28);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray53, charArray54);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray54, charArray58);
        org.junit.Assert.assertArrayEquals(charArray13, charArray58);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling62 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling64 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling65 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling66 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray67 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling62, throttling63, throttling64, throttling65, throttling66 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet68 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) charArray58, (java.lang.Object) throttlingArray67);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray10);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        int[] intArray5 = new int[] { (short) 1, (short) 100, '#', 3 };
        int[] intArray11 = new int[] { (short) 10, (short) 1, 100, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray5, intArray11);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        short[] shortArray4 = new short[] { (short) 1, (short) -1, (short) -1, (byte) -1 };
        short[] shortArray10 = new short[] { (byte) 100, (short) 1, (byte) -1, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain29;
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.awaitsfix", indexReader33, fields34, fields35, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain29;
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 4, (long) (byte) 10);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        float[] floatArray7 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray13 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray13, (float) (byte) 100);
        float[] floatArray22 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray28 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray22, floatArray28, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray22, (float) (short) 1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.setUp();
        kuromojiAnalysisTests33.tearDown();
        kuromojiAnalysisTests33.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) floatArray7, (java.lang.Object) kuromojiAnalysisTests33);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) throttlingArray7);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) serializableArray5);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray14);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) throttlingArray14);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) serializableArray12);
        org.junit.rules.TestRule testRule19 = null;
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.outerRule(testRule19);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.junit.rules.TestRule testRule22 = null;
        org.junit.rules.RuleChain ruleChain23 = org.junit.rules.RuleChain.outerRule(testRule22);
        org.junit.rules.RuleChain ruleChain24 = ruleChain20.around((org.junit.rules.TestRule) ruleChain23);
        org.junit.rules.TestRule testRule25 = null;
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.outerRule(testRule25);
        org.junit.rules.TestRule testRule27 = null;
        org.junit.rules.RuleChain ruleChain28 = org.junit.rules.RuleChain.outerRule(testRule27);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain28;
        org.junit.rules.TestRule testRule30 = null;
        org.junit.rules.RuleChain ruleChain31 = org.junit.rules.RuleChain.outerRule(testRule30);
        org.junit.rules.RuleChain ruleChain32 = ruleChain28.around((org.junit.rules.TestRule) ruleChain31);
        org.junit.rules.TestRule testRule33 = null;
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.outerRule(testRule33);
        org.junit.rules.RuleChain[] ruleChainArray35 = new org.junit.rules.RuleChain[] { ruleChain20, ruleChain26, ruleChain28, ruleChain34 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, ruleChainArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.monster", (java.lang.Object) ruleChainArray35);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (-1L));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.badapples");
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.weekly");
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", 0, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray14 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray8, floatArray14, (float) (byte) 100);
        float[] floatArray23 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray29 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray23, floatArray29, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray23, (float) (short) 1);
        float[] floatArray40 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray46 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray40, floatArray46, (float) (byte) 100);
        float[] floatArray55 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray61 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray55, floatArray61, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray55, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray23, floatArray55, (float) 100L);
        float[] floatArray73 = new float[] { ' ', (byte) 100, 100, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray23, floatArray73, (float) (short) -1);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        long[] longArray7 = new long[] { (byte) 10, 'a', (byte) 100, 0, 10, 'a' };
        long[] longArray11 = new long[] { (short) 100, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray7, longArray11);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        short[] shortArray0 = new short[] {};
        short[] shortArray2 = new short[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray2);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        short[] shortArray4 = new short[] { (byte) 10, (short) 0, (short) -1 };
        short[] shortArray10 = new short[] { (byte) 10, (short) 0, (short) 1, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray10);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        short[] shortArray5 = new short[] { (byte) 0, (short) 10, (short) 1, (byte) 10, (byte) -1 };
        short[] shortArray10 = new short[] { (short) 100, (short) 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        short[] shortArray1 = new short[] { (short) 1 };
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray2, charArray3);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) charArray3, (java.lang.Object) locale11);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        java.lang.String str27 = kuromojiAnalysisTests13.getTestName();
        org.junit.rules.RuleChain ruleChain28 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain29 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain28);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests30.ruleChain;
        org.junit.rules.RuleChain ruleChain32 = ruleChain29.around(testRule31);
        kuromojiAnalysisTests13.failureAndSuccessEvents = ruleChain32;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain32);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) '#', (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.tearDown();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.failfast", indexReader17, terms18, terms19, false);
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("hi!", indexReader25, (int) '4', postingsEnum27, postingsEnum28, true);
        java.lang.String str31 = kuromojiAnalysisTests14.getTestName();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests14.ruleChain;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests14);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("random", 4, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.util.Set[] setArray8 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray9 = (java.util.Set<java.io.Serializable>[]) setArray8;
        serializableSetArray9[0] = serializableSet2;
        serializableSetArray9[1] = serializableSet4;
        serializableSetArray9[2] = serializableSet6;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray9);
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.io.Serializable>[]) serializableSetArray9);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray21);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray25);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) throttlingArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) throttlingArray44);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray39, (java.lang.Object[]) serializableArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray52, (java.lang.Object[]) throttlingArray54);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray49, (java.lang.Object[]) serializableArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray42, (java.lang.Object[]) throttlingArray49);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray33);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray62, (java.lang.Object[]) throttlingArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) serializableSetArray9, (java.lang.Object[]) throttlingArray64);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { '4', (byte) -1, (short) 0, 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray7);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        int[] intArray4 = new int[] { (short) 0, ' ', 4, (byte) 0 };
        int[] intArray10 = new int[] { 4, (-1), (short) 1, 4, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        short[] shortArray5 = new short[] { (byte) 1, (short) -1, (short) 0, (short) 1 };
        short[] shortArray9 = new short[] { (byte) 0, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray9);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 10.0f, (double) 100L);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) 10, (long) 1);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("hi!");
        org.junit.rules.RuleChain ruleChain5 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests9.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = ruleChain8.around(testRule10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) throttlingArray18);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray13, (java.lang.Object[]) serializableArray16);
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule10, (java.lang.Object) serializableArray16);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) throttlingArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray31);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) throttlingArray40);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray46);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) throttlingArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet52 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray51);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray56);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) throttlingArray56);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray51, (java.lang.Object[]) serializableArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray66 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray66);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray64, (java.lang.Object[]) throttlingArray66);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray61, (java.lang.Object[]) serializableArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray54, (java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray44, (java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray44);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) ruleChain5, (java.lang.Object) serializableArray44);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) 100);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) (short) -1, (float) (byte) 100, 1.0f);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (-1), (long) 0);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) (byte) 10, (float) 0);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.tearDown();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("random", (int) ' ', numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray1, byteArray4);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (byte) 10);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 2, (double) (short) -1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (byte) -1, (double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) 10L, (double) (short) -1);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray1, charArray2);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray6);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray15, charArray16);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray16, charArray20);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray25, charArray26);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray29, charArray30);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray30, charArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray26, charArray30);
        org.junit.Assert.assertArrayEquals(charArray16, charArray26);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray40, charArray41);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray41, charArray45);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray50, charArray51);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray54, charArray55);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray55, charArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray51, charArray55);
        org.junit.Assert.assertArrayEquals(charArray41, charArray51);
        org.junit.Assert.assertArrayEquals("hi!", charArray26, charArray41);
        org.junit.Assert.assertArrayEquals(charArray10, charArray41);
        org.junit.Assert.assertArrayEquals(charArray1, charArray10);
        char[] charArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray10, charArray67);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) throttlingArray3);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray7);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray21, (java.lang.Object[]) serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray31, (java.lang.Object[]) serializableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray15);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale45 };
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale48 };
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale51 };
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale54 };
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale57 };
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale60 };
        java.util.Locale[][] localeArray62 = new java.util.Locale[][] { localeArray46, localeArray49, localeArray52, localeArray55, localeArray58, localeArray61 };
        java.util.List<java.util.Locale[]> localeArrayList63 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, localeArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) localeArray62);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        double[] doubleArray3 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray6 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray9 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray12 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray13 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12 };
        double[] doubleArray16 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray19 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray22 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray25 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        double[] doubleArray29 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray32 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray35 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray38 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray39 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        double[] doubleArray42 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray45 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray48 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray51 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray52 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51 };
        double[][][] doubleArray53 = new double[][][] { doubleArray13, doubleArray26, doubleArray39, doubleArray52 };
        java.util.Set<double[][]> doubleArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray53);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        java.util.Set[] setArray62 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray63 = (java.util.Set<java.io.Serializable>[]) setArray62;
        serializableSetArray63[0] = serializableSet56;
        serializableSetArray63[1] = serializableSet58;
        serializableSetArray63[2] = serializableSet60;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet70 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) doubleArray53, (java.lang.Object[]) serializableSetArray63);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", 1.0d, (double) (byte) 0, (double) 3);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (byte) -1);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("hi!", indexReader16, (int) (byte) 1, postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("random", 4, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests5.assertTermsEquals("tests.failfast", indexReader8, terms9, terms10, false);
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain13, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain13);
        org.junit.rules.TestRule testRule19 = null;
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.outerRule(testRule19);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.junit.rules.TestRule testRule22 = null;
        org.junit.rules.RuleChain ruleChain23 = org.junit.rules.RuleChain.outerRule(testRule22);
        org.junit.rules.RuleChain ruleChain24 = ruleChain20.around((org.junit.rules.TestRule) ruleChain23);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain23);
        org.junit.rules.TestRule testRule26 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain27 = ruleChain23.around(testRule26);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) ruleChain13, (java.lang.Object) testRule26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule26);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        int[] intArray4 = new int[] { '4', 100, (short) 0, '4' };
        int[] intArray7 = new int[] { ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests5.assertTermsEquals("tests.failfast", indexReader8, terms9, terms10, false);
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain13, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain13);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.monster", postingsEnum18, postingsEnum19, true);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, 0L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        double[] doubleArray1 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '#');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray1, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        java.lang.Object obj10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests2, obj10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests16.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader36, terms37, terms38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("random", indexReader42, 1, postingsEnum44, postingsEnum45, true);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum49, postingsEnum50);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        org.junit.rules.TestRule testRule7 = null;
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.outerRule(testRule7);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        org.junit.rules.TestRule testRule10 = null;
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule(testRule10);
        org.junit.rules.RuleChain ruleChain12 = ruleChain8.around((org.junit.rules.TestRule) ruleChain11);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain12;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain12);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain12;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) ruleChain12);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        short[] shortArray4 = new short[] { (byte) 100, (short) 0, (short) 0, (short) 100 };
        short[] shortArray9 = new short[] { (short) 10, (short) 100, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray9);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 1L);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        org.junit.rules.RuleChain ruleChain5 = ruleChain2.around(testRule4);
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain5);
        org.junit.rules.TestRule testRule9 = null;
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.outerRule(testRule9);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        org.junit.rules.TestRule testRule12 = null;
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.outerRule(testRule12);
        org.junit.rules.RuleChain ruleChain14 = ruleChain10.around((org.junit.rules.TestRule) ruleChain13);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain13);
        org.junit.rules.TestRule testRule16 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain17 = ruleChain13.around(testRule16);
        org.junit.rules.RuleChain ruleChain18 = ruleChain5.around((org.junit.rules.TestRule) ruleChain17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests20.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests20.assertTermsEquals("tests.failfast", indexReader23, terms24, terms25, false);
        kuromojiAnalysisTests20.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests20.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests20.ruleChain;
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) ruleChain32);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain32;
        org.junit.rules.RuleChain ruleChain35 = ruleChain17.around((org.junit.rules.TestRule) ruleChain32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) ruleChain32);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) throttlingArray4);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) throttlingArray10);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray16);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) throttlingArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray14);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray8);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableArray2, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0d, (double) 1);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 100, (double) 10);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        short[] shortArray12 = new short[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray6, shortArray12);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray11 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures8, testRuleIgnoreAfterMaxFailures9 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet12 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray11);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) throttlingArray17);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray21, (java.lang.Object[]) throttlingArray23);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray29);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) throttlingArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray21, (java.lang.Object[]) serializableArray27);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray11, (java.lang.Object[]) serializableArray21);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) throttlingArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray8);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) throttlingArray13);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray8, (java.lang.Object[]) serializableArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray21, (java.lang.Object[]) throttlingArray23);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray18, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray11, (java.lang.Object[]) throttlingArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) serializableArray2);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (-1), (long) 'a');
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain10);
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain12);
        org.junit.rules.RuleChain ruleChain14 = ruleChain11.around((org.junit.rules.TestRule) ruleChain13);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain11;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.awaitsfix");
        kuromojiAnalysisTests16.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests31.tearDown();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        kuromojiAnalysisTests31.assertTermsEquals("tests.failfast", indexReader34, terms35, terms36, false);
        kuromojiAnalysisTests31.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests31.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests31.ruleChain;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests31.assertDocsSkippingEquals("tests.monster", indexReader44, (int) (byte) -1, postingsEnum46, postingsEnum47, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) postingsEnum47);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 100, (short) -1, (short) -1, (short) 0 };
        short[] shortArray12 = new short[] { (byte) 0, (byte) 0, (short) 10, (short) 0, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 4, (double) (short) 1, (double) (byte) 10);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) '#');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) 3);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) '#');
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray17, (double) 3);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray3, doubleArray13, (double) 1.0f);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) '#');
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) 3);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray13, doubleArray29, (double) 1.0f);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests39.tearDown();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests39.assertTermsEquals("tests.failfast", indexReader42, terms43, terms44, false);
        kuromojiAnalysisTests39.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests39.setIndexWriterMaxDocs((int) (short) 100);
        kuromojiAnalysisTests39.setUp();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests39);
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) '#');
        double[] doubleArray57 = new double[] {};
        double[] doubleArray58 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray58, (double) '#');
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray62, (double) 0.0f);
        double[] doubleArray67 = new double[] {};
        double[] doubleArray68 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray68, (double) '#');
        double[] doubleArray71 = new double[] {};
        double[] doubleArray72 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray72, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray72, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray57, doubleArray72, (double) 1);
        double[] doubleArray79 = new double[] {};
        double[] doubleArray80 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray80, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray80, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray72, 10.0d);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests39, (java.lang.Object) doubleArray52);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray13, doubleArray52, (double) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) '#');
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests2.ruleChain;
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) ruleChain14);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain14;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) ruleChain14);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) locale1, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain1);
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain3);
        org.junit.rules.RuleChain ruleChain5 = ruleChain2.around((org.junit.rules.TestRule) ruleChain4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests8.assertTermsEquals("tests.failfast", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests8.assertTermsEquals("hi!", indexReader18, terms19, terms20, true);
        kuromojiAnalysisTests8.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests8.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests8.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        kuromojiAnalysisTests27.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests8, (java.lang.Object) kuromojiAnalysisTests27);
        org.junit.rules.TestRule testRule32 = null;
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.outerRule(testRule32);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        org.junit.rules.TestRule testRule35 = null;
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.outerRule(testRule35);
        org.junit.rules.RuleChain ruleChain37 = ruleChain33.around((org.junit.rules.TestRule) ruleChain36);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests8, (java.lang.Object) ruleChain33);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        java.lang.Object obj40 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) ruleChain33, obj40);
        org.junit.rules.RuleChain ruleChain42 = ruleChain5.around((org.junit.rules.TestRule) ruleChain33);
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain44 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain43);
        org.junit.rules.RuleChain ruleChain45 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain46 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain45);
        org.junit.rules.RuleChain ruleChain47 = ruleChain44.around((org.junit.rules.TestRule) ruleChain46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests50.tearDown();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        kuromojiAnalysisTests50.assertTermsEquals("tests.failfast", indexReader53, terms54, terms55, false);
        kuromojiAnalysisTests50.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        kuromojiAnalysisTests50.assertTermsEquals("hi!", indexReader60, terms61, terms62, true);
        kuromojiAnalysisTests50.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests50.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests50.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests69 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests69.tearDown();
        kuromojiAnalysisTests69.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests50, (java.lang.Object) kuromojiAnalysisTests69);
        org.junit.rules.TestRule testRule74 = null;
        org.junit.rules.RuleChain ruleChain75 = org.junit.rules.RuleChain.outerRule(testRule74);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain75;
        org.junit.rules.TestRule testRule77 = null;
        org.junit.rules.RuleChain ruleChain78 = org.junit.rules.RuleChain.outerRule(testRule77);
        org.junit.rules.RuleChain ruleChain79 = ruleChain75.around((org.junit.rules.TestRule) ruleChain78);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests50, (java.lang.Object) ruleChain75);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain75;
        java.lang.Object obj82 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) ruleChain75, obj82);
        org.junit.rules.RuleChain ruleChain84 = ruleChain47.around((org.junit.rules.TestRule) ruleChain75);
        org.junit.rules.RuleChain ruleChain85 = ruleChain33.around((org.junit.rules.TestRule) ruleChain47);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests86 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests86.tearDown();
        org.apache.lucene.index.IndexReader indexReader89 = null;
        org.apache.lucene.index.Terms terms90 = null;
        org.apache.lucene.index.Terms terms91 = null;
        kuromojiAnalysisTests86.assertTermsEquals("tests.failfast", indexReader89, terms90, terms91, false);
        kuromojiAnalysisTests86.assertPathHasBeenCleared("enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) ruleChain47, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        int[] intArray5 = new int[] { (short) 0, (byte) 0, (byte) 100, 3, 100 };
        int[] intArray12 = new int[] { 2, (short) 10, (short) 0, ' ', (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) throttlingArray5);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray8 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet9 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray8);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) luceneTestCaseArray8);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) throttlingArray15);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) throttlingArray31);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray26, (java.lang.Object[]) serializableArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) throttlingArray41);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray36, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray29, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray36);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray47 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet48 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray47);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) luceneTestCaseArray47);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) luceneTestCaseArray8, (java.lang.Object[]) serializableArray19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests51.tearDown();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        kuromojiAnalysisTests51.assertTermsEquals("tests.failfast", indexReader54, terms55, terms56, false);
        kuromojiAnalysisTests51.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests51.setIndexWriterMaxDocs((int) (short) 100);
        kuromojiAnalysisTests51.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) kuromojiAnalysisTests51);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) ' ');
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader17, terms18, terms19, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 10, (long) 1);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) '#', 0.0d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) throttlingArray7);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) throttlingArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray11);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) throttlingArray30);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray25, (java.lang.Object[]) serializableArray28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) throttlingArray40);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray35, (java.lang.Object[]) serializableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray28, (java.lang.Object[]) throttlingArray35);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray19);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) throttlingArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray5, (java.lang.Object[]) throttlingArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) throttlingArray50);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 3, (double) (-1L));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) 3, (double) 1, (double) (short) 10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) ' ', (float) (-1L));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain10);
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain12);
        org.junit.rules.RuleChain ruleChain14 = ruleChain11.around((org.junit.rules.TestRule) ruleChain13);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain11;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.awaitsfix");
        kuromojiAnalysisTests16.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests16);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests16);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests16.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        short[] shortArray2 = new short[] { (byte) 10 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray2, shortArray3);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        long[] longArray9 = new long[] { 0, (short) 1, (-1L), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray2, longArray9);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("", true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader24, 0, postingsEnum26, postingsEnum27, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.tearDown();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.TestRule testRule14 = null;
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.outerRule(testRule14);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        org.junit.rules.TestRule testRule17 = null;
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.outerRule(testRule17);
        org.junit.rules.RuleChain ruleChain19 = ruleChain15.around((org.junit.rules.TestRule) ruleChain18);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain18);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain18;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.weekly", (int) (byte) -1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) (byte) 100, (double) (byte) 100, (double) 3);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        long[] longArray2 = new long[] { 1, '#' };
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 10);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        long[] longArray7 = new long[] { 0, 10L, (short) 0, (short) 1, 0, (byte) 0 };
        long[] longArray14 = new long[] { 100, '4', 1, (short) -1, 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray7, longArray14);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        java.lang.Object[] objArray1 = null;
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) throttlingArray5);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) throttlingArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", objArray1, (java.lang.Object[]) serializableArray9);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) 3);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        java.io.Serializable[] serializableArray0 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet1 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray0);
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.util.Set[] setArray7 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray8 = (java.util.Set<java.io.Serializable>[]) setArray7;
        serializableSetArray8[0] = serializableSet1;
        serializableSetArray8[1] = serializableSet3;
        serializableSetArray8[2] = serializableSet5;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray8);
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.io.Serializable>[]) serializableSetArray8);
        java.lang.Object obj17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) serializableIterableSet16, obj17);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100, (double) (short) 10);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 0, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        org.junit.rules.TestRule testRule1 = null;
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule(testRule1);
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain2);
        java.lang.Object obj4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) ruleChain2, obj4);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        int[] intArray2 = new int[] { '4', (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, 'a', 0, 10, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 4, (double) 0);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy10 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.rules.TestRule testRule11 = null;
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.outerRule(testRule11);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain12;
        org.junit.rules.TestRule testRule14 = null;
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.outerRule(testRule14);
        org.junit.rules.RuleChain ruleChain16 = ruleChain12.around((org.junit.rules.TestRule) ruleChain15);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy10, (java.lang.Object) ruleChain16);
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain18);
        org.junit.rules.RuleChain ruleChain20 = ruleChain16.around((org.junit.rules.TestRule) ruleChain18);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule9, (java.lang.Object) ruleChain16);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 100, (double) 4, (double) (short) 10);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', 0L);
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
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("hi!", indexReader11, terms12, terms13, true);
        java.lang.String str16 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("", indexReader18, (int) (byte) 0, postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.awaitsfix", indexReader25, fields26, fields27, true);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("<unknown>", postingsEnum31, postingsEnum32, false);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.util.Set[] setArray42 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray43 = (java.util.Set<java.io.Serializable>[]) setArray42;
        serializableSetArray43[0] = serializableSet36;
        serializableSetArray43[1] = serializableSet38;
        serializableSetArray43[2] = serializableSet40;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray43);
        java.util.Set<java.util.Collection<java.io.Serializable>> serializableCollectionSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.io.Serializable>[]) serializableSetArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) serializableSetArray43);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) -1, (double) ' ');
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) 1L, 0.0f);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        short[] shortArray3 = new short[] { (short) 0, (byte) -1, (byte) 0 };
        short[] shortArray10 = new short[] { (short) 10, (short) 10, (short) -1, (short) 1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader17, (int) (byte) 0, postingsEnum19, postingsEnum20, false);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain24 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("random", indexReader26, (int) (short) 0, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests31.ruleChain;
        org.junit.rules.TestRule testRule33 = null;
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.outerRule(testRule33);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain34;
        org.junit.rules.TestRule testRule36 = null;
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.outerRule(testRule36);
        org.junit.rules.RuleChain ruleChain38 = ruleChain34.around((org.junit.rules.TestRule) ruleChain37);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain34;
        kuromojiAnalysisTests31.failureAndSuccessEvents = ruleChain34;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests41 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests41.tearDown();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests41.assertTermsEquals("tests.failfast", indexReader44, terms45, terms46, false);
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests41.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement50 = null;
        org.junit.runner.Description description51 = null;
        org.junit.runners.model.Statement statement52 = ruleChain49.apply(statement50, description51);
        org.junit.rules.RuleChain ruleChain53 = ruleChain34.around((org.junit.rules.TestRule) ruleChain49);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain34;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) 1);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", obj1, (java.lang.Object) locale3);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        int[] intArray7 = new int[] { (byte) 100, '4', (short) 0, (byte) -1, (byte) 100, '#' };
        int[] intArray9 = new int[] { 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray7, intArray9);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray4);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        short[] shortArray1 = new short[] {};
        short[] shortArray3 = new short[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray3);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        short[] shortArray1 = new short[] {};
        short[] shortArray4 = new short[] { (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray4);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) '#');
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray14 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray8, floatArray14, (float) (byte) 100);
        float[] floatArray23 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray29 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray23, floatArray29, (float) (byte) 100);
        float[] floatArray38 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray44 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray38, floatArray44, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray38, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray38, (float) 1);
        float[] floatArray57 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray63 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray57, floatArray63, (float) (byte) 100);
        float[] floatArray72 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray78 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray72, floatArray78, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray72, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray38, floatArray57, (float) (byte) -1);
        float[] floatArray89 = new float[] { 1.0f, 100, (byte) 1, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray38, floatArray89, (float) (short) -1);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        short[] shortArray6 = new short[] { (byte) 10, (short) 100, (short) 0, (byte) 100, (short) 10, (short) 100 };
        short[] shortArray12 = new short[] { (short) 1, (byte) 0, (short) 10, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray12);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 10.0f, (double) (short) -1, 1.0d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        byte[] byteArray1 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray8);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 3, (double) 0.0f);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, 0L);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.junit.rules.TestRule testRule0 = null;
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.outerRule(testRule0);
        java.lang.Class<?> wildcardClass2 = ruleChain1.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests3.assertDocsEnumEquals("tests.weekly", postingsEnum12, postingsEnum13, true);
        kuromojiAnalysisTests3.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass2, (java.lang.Object) kuromojiAnalysisTests3);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        int[] intArray6 = new int[] { (short) 10, '4', (short) 10, (short) 100, 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray6, intArray7);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 100, (double) 2);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray9);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        java.lang.Object obj3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) locale2, obj3);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) locale1, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (-1.0f), (double) 10L);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.awaitsfix");
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        float[] floatArray24 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray30 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray24, floatArray30, (float) (byte) 100);
        float[] floatArray39 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray45 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray39, floatArray45, (float) (byte) 100);
        float[] floatArray54 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray60 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray54, floatArray60, (float) (byte) 100);
        float[] floatArray69 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray75 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray69, floatArray75, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray69, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray54, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray54, (float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) floatArray24);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) '4');
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule16 = kuromojiAnalysisTests15.ruleChain;
        org.junit.rules.TestRule testRule17 = null;
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.outerRule(testRule17);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        org.junit.rules.TestRule testRule20 = null;
        org.junit.rules.RuleChain ruleChain21 = org.junit.rules.RuleChain.outerRule(testRule20);
        org.junit.rules.RuleChain ruleChain22 = ruleChain18.around((org.junit.rules.TestRule) ruleChain21);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        kuromojiAnalysisTests15.failureAndSuccessEvents = ruleChain18;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests25.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        kuromojiAnalysisTests25.assertTermsEquals("tests.failfast", indexReader28, terms29, terms30, false);
        org.junit.rules.RuleChain ruleChain33 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement34 = null;
        org.junit.runner.Description description35 = null;
        org.junit.runners.model.Statement statement36 = ruleChain33.apply(statement34, description35);
        org.junit.rules.RuleChain ruleChain37 = ruleChain18.around((org.junit.rules.TestRule) ruleChain33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) "tests.badapples", (java.lang.Object) ruleChain37);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) 0, 0.0d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        short[] shortArray3 = new short[] { (short) 100, (byte) -1 };
        short[] shortArray6 = new short[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray6);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests12.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests12.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests12.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) ruleChain11, (java.lang.Object) kuromojiAnalysisTests12);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests27.assertTermsEquals("tests.failfast", indexReader30, terms31, terms32, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain37 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests38.tearDown();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        kuromojiAnalysisTests38.assertTermsEquals("tests.failfast", indexReader41, terms42, terms43, false);
        org.junit.rules.RuleChain ruleChain46 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement47 = null;
        org.junit.runner.Description description48 = null;
        org.junit.runners.model.Statement statement49 = ruleChain46.apply(statement47, description48);
        org.junit.runner.Description description50 = null;
        org.junit.runners.model.Statement statement51 = ruleChain37.apply(statement49, description50);
        org.junit.runner.Description description52 = null;
        org.junit.runners.model.Statement statement53 = ruleChain11.apply(statement49, description52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) statement49);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", (int) (byte) 10, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '#');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) '#');
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray11, (double) 3);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '#');
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray21, (double) 3);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray7, doubleArray17, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray3, doubleArray7, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) doubleArray3);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 10L, (float) (short) 1);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.TestRule testRule3 = null;
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.outerRule(testRule3);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain4;
        org.junit.rules.TestRule testRule6 = null;
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.outerRule(testRule6);
        org.junit.rules.RuleChain ruleChain8 = ruleChain4.around((org.junit.rules.TestRule) ruleChain7);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain4;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain4;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests11.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, false);
        org.junit.rules.RuleChain ruleChain19 = kuromojiAnalysisTests11.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement20 = null;
        org.junit.runner.Description description21 = null;
        org.junit.runners.model.Statement statement22 = ruleChain19.apply(statement20, description21);
        org.junit.rules.RuleChain ruleChain23 = ruleChain4.around((org.junit.rules.TestRule) ruleChain19);
        org.junit.rules.TestRule testRule26 = null;
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.outerRule(testRule26);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        org.junit.rules.TestRule testRule29 = null;
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.outerRule(testRule29);
        org.junit.rules.RuleChain ruleChain31 = ruleChain27.around((org.junit.rules.TestRule) ruleChain30);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain30);
        org.junit.rules.TestRule testRule33 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain34 = ruleChain30.around(testRule33);
        org.junit.rules.RuleChain ruleChain35 = ruleChain23.around((org.junit.rules.TestRule) ruleChain30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) ruleChain30);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (byte) 1);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) -1, (double) 100L);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) '4');
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain5);
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain7);
        org.junit.rules.RuleChain ruleChain9 = ruleChain6.around((org.junit.rules.TestRule) ruleChain8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests12.assertTermsEquals("hi!", indexReader22, terms23, terms24, true);
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests12.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests31.tearDown();
        kuromojiAnalysisTests31.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests12, (java.lang.Object) kuromojiAnalysisTests31);
        org.junit.rules.TestRule testRule36 = null;
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.outerRule(testRule36);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        org.junit.rules.TestRule testRule39 = null;
        org.junit.rules.RuleChain ruleChain40 = org.junit.rules.RuleChain.outerRule(testRule39);
        org.junit.rules.RuleChain ruleChain41 = ruleChain37.around((org.junit.rules.TestRule) ruleChain40);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests12, (java.lang.Object) ruleChain37);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        java.lang.Object obj44 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) ruleChain37, obj44);
        org.junit.rules.RuleChain ruleChain46 = ruleChain9.around((org.junit.rules.TestRule) ruleChain37);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain9;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader49, 0, postingsEnum51, postingsEnum52, true);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("", postingsEnum58, postingsEnum59);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        short[] shortArray5 = new short[] { (short) 0, (byte) 100, (short) 0, (byte) 0 };
        short[] shortArray10 = new short[] { (short) -1, (byte) -1, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray5, shortArray10);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        short[] shortArray3 = new short[] { (short) 100, (byte) 0 };
        short[] shortArray9 = new short[] { (short) 0, (byte) 1, (short) -1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 100L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10L, (double) 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) -1, (double) 1.0f);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        java.lang.Object[] objArray1 = null;
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) throttlingArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) throttlingArray15);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray10, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray10);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray21, (java.lang.Object[]) throttlingArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray10, (java.lang.Object[]) serializableArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", objArray1, (java.lang.Object[]) throttlingArray10);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.junit.rules.TestRule testRule3 = null;
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.outerRule(testRule3);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain4;
        org.junit.rules.TestRule testRule6 = null;
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.outerRule(testRule6);
        org.junit.rules.RuleChain ruleChain8 = ruleChain4.around((org.junit.rules.TestRule) ruleChain7);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain7);
        org.junit.rules.TestRule testRule10 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain11 = ruleChain7.around(testRule10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) ruleChain7);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (short) 0);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0f, (float) (short) 10, (float) 2);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (-1));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader5, 10, postingsEnum7, postingsEnum8, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray16);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) throttlingArray16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests20.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests20.assertTermsEquals("tests.failfast", indexReader23, terms24, terms25, false);
        kuromojiAnalysisTests20.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        kuromojiAnalysisTests20.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        kuromojiAnalysisTests20.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests34.tearDown();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests34.assertTermsEquals("tests.failfast", indexReader37, terms38, terms39, false);
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        kuromojiAnalysisTests34.ensureCleanedUp();
        kuromojiAnalysisTests34.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) kuromojiAnalysisTests20, (java.lang.Object) kuromojiAnalysisTests34);
        kuromojiAnalysisTests34.ensureCleanedUp();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) serializableArray14, (java.lang.Object) kuromojiAnalysisTests34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        long[] longArray4 = new long[] { 10, 0, 3, 'a' };
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain10);
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain12);
        org.junit.rules.RuleChain ruleChain14 = ruleChain11.around((org.junit.rules.TestRule) ruleChain13);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain11;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.awaitsfix");
        kuromojiAnalysisTests16.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.tearDown();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests32.assertTermsEquals("tests.failfast", indexReader35, terms36, terms37, false);
        kuromojiAnalysisTests32.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain41 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain41);
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain44 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain43);
        org.junit.rules.RuleChain ruleChain45 = ruleChain42.around((org.junit.rules.TestRule) ruleChain44);
        kuromojiAnalysisTests32.failureAndSuccessEvents = ruleChain42;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests47.tearDown();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        kuromojiAnalysisTests47.assertTermsEquals("tests.failfast", indexReader50, terms51, terms52, false);
        kuromojiAnalysisTests47.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain57 = kuromojiAnalysisTests47.failureAndSuccessEvents;
        kuromojiAnalysisTests47.assertPathHasBeenCleared("tests.awaitsfix");
        kuromojiAnalysisTests47.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests32, (java.lang.Object) kuromojiAnalysisTests47);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) kuromojiAnalysisTests16, (java.lang.Object) kuromojiAnalysisTests47);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader15, (int) '#', postingsEnum17, postingsEnum18);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        java.lang.String str21 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy23 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.rules.TestRule testRule24 = null;
        org.junit.rules.RuleChain ruleChain25 = org.junit.rules.RuleChain.outerRule(testRule24);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain25;
        org.junit.rules.TestRule testRule27 = null;
        org.junit.rules.RuleChain ruleChain28 = org.junit.rules.RuleChain.outerRule(testRule27);
        org.junit.rules.RuleChain ruleChain29 = ruleChain25.around((org.junit.rules.TestRule) ruleChain28);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy23, (java.lang.Object) ruleChain29);
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain32);
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain35 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain34);
        org.junit.rules.RuleChain ruleChain36 = ruleChain33.around((org.junit.rules.TestRule) ruleChain35);
        org.junit.Assert.assertNotEquals((java.lang.Object) 10L, (java.lang.Object) ruleChain33);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) ruleChain29, (java.lang.Object) ruleChain33);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain29;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests40.tearDown();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        kuromojiAnalysisTests40.assertTermsEquals("tests.failfast", indexReader43, terms44, terms45, false);
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests40.failureAndSuccessEvents;
        kuromojiAnalysisTests40.ensureCleanedUp();
        kuromojiAnalysisTests40.tearDown();
        kuromojiAnalysisTests40.tearDown();
        java.lang.String str52 = kuromojiAnalysisTests40.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) ruleChain29, (java.lang.Object) str52);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (short) 100, (double) (short) 1);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.weekly", indexReader12, fields13, fields14, true);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.monster", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) 10, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        int[] intArray6 = new int[] { (byte) 100, 4, (byte) 10, (byte) 100, (short) 0 };
        int[] intArray11 = new int[] { 'a', 1, (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray11);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        int[] intArray6 = new int[] { 1, 3, 100, (byte) 1, (short) 1, 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 0, (float) 100, (float) 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 'a', (double) 'a', (double) '#');
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, 100.0d, (double) 1);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("hi!", indexReader11, terms12, terms13, true);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) kuromojiAnalysisTests1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.monster");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1.0f), (double) 4, 1.0d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { 'a', 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray4);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) (-1L), (double) 10);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) 4, (float) 10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.weekly", indexReader13, fields14, fields15, true);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.monster", indexReader20, 0, postingsEnum22, postingsEnum23, true);
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray29 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet30 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray29);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) throttlingArray34);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray29, (java.lang.Object[]) serializableArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) throttlingArray44);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray39, (java.lang.Object[]) serializableArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray52, (java.lang.Object[]) throttlingArray54);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray49, (java.lang.Object[]) serializableArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray42, (java.lang.Object[]) throttlingArray49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray65 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet66 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray65);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) throttlingArray65);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray60, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray49, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule26, (java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) testRule26);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        float[] floatArray7 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray13 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray13, (float) (byte) 100);
        float[] floatArray22 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray28 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray22, floatArray28, (float) (byte) 100);
        float[] floatArray37 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray43 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray37, floatArray43, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray37, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray37, (float) 1);
        float[] floatArray50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray37, floatArray50, 10.0f);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray9);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        java.io.Serializable[] serializableArray0 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet1 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray0);
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.util.Set[] setArray7 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray8 = (java.util.Set<java.io.Serializable>[]) setArray7;
        serializableSetArray8[0] = serializableSet1;
        serializableSetArray8[1] = serializableSet3;
        serializableSetArray8[2] = serializableSet5;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray8);
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.io.Serializable>[]) serializableSetArray8);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray21);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray25);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) throttlingArray34);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) throttlingArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) throttlingArray50);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray45, (java.lang.Object[]) serializableArray48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray55);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray58, (java.lang.Object[]) throttlingArray60);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray55, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray48, (java.lang.Object[]) throttlingArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray38, (java.lang.Object[]) throttlingArray55);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableSetArray8, (java.lang.Object[]) serializableArray38);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0.0f, (double) '#');
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        int[] intArray7 = new int[] { (short) 1, 10, (short) -1, (short) 100, 2, ' ' };
        int[] intArray9 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray9);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum18, postingsEnum19, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray2, byteArray5);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        short[] shortArray7 = new short[] { (short) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        short[] shortArray10 = new short[] { (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(100);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 10, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        java.lang.String str5 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests6.assertTermsEquals("tests.failfast", indexReader9, terms10, terms11, false);
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement15 = null;
        org.junit.runner.Description description16 = null;
        org.junit.runners.model.Statement statement17 = ruleChain14.apply(statement15, description16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests18.assertTermsEquals("tests.failfast", indexReader21, terms22, terms23, false);
        kuromojiAnalysisTests18.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain29 = ruleChain14.around((org.junit.rules.TestRule) ruleChain28);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests31.tearDown();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        kuromojiAnalysisTests31.assertTermsEquals("tests.failfast", indexReader34, terms35, terms36, false);
        org.junit.rules.RuleChain ruleChain39 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain39, (java.lang.Object) "tests.weekly");
        org.junit.rules.RuleChain ruleChain42 = ruleChain14.around((org.junit.rules.TestRule) ruleChain39);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain39;
        org.junit.rules.RuleChain ruleChain44 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain45 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain44);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule47 = kuromojiAnalysisTests46.ruleChain;
        org.junit.rules.RuleChain ruleChain48 = ruleChain45.around(testRule47);
        org.junit.rules.RuleChain ruleChain49 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain48);
        org.junit.rules.TestRule testRule52 = null;
        org.junit.rules.RuleChain ruleChain53 = org.junit.rules.RuleChain.outerRule(testRule52);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain53;
        org.junit.rules.TestRule testRule55 = null;
        org.junit.rules.RuleChain ruleChain56 = org.junit.rules.RuleChain.outerRule(testRule55);
        org.junit.rules.RuleChain ruleChain57 = ruleChain53.around((org.junit.rules.TestRule) ruleChain56);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain56);
        org.junit.rules.TestRule testRule59 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain60 = ruleChain56.around(testRule59);
        org.junit.rules.RuleChain ruleChain61 = ruleChain48.around((org.junit.rules.TestRule) ruleChain60);
        org.junit.rules.TestRule testRule64 = null;
        org.junit.rules.RuleChain ruleChain65 = org.junit.rules.RuleChain.outerRule(testRule64);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain65;
        org.junit.rules.TestRule testRule67 = null;
        org.junit.rules.RuleChain ruleChain68 = org.junit.rules.RuleChain.outerRule(testRule67);
        org.junit.rules.RuleChain ruleChain69 = ruleChain65.around((org.junit.rules.TestRule) ruleChain68);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain68);
        org.junit.rules.TestRule testRule71 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain72 = ruleChain68.around(testRule71);
        org.junit.rules.RuleChain ruleChain73 = ruleChain48.around((org.junit.rules.TestRule) ruleChain72);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests74 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests74.tearDown();
        kuromojiAnalysisTests74.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests74.setUp();
        org.junit.rules.TestRule testRule79 = null;
        org.junit.rules.RuleChain ruleChain80 = org.junit.rules.RuleChain.outerRule(testRule79);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain80;
        org.junit.rules.TestRule testRule82 = null;
        org.junit.rules.RuleChain ruleChain83 = org.junit.rules.RuleChain.outerRule(testRule82);
        org.junit.rules.RuleChain ruleChain84 = ruleChain80.around((org.junit.rules.TestRule) ruleChain83);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain84;
        kuromojiAnalysisTests74.failureAndSuccessEvents = ruleChain84;
        org.junit.rules.RuleChain ruleChain87 = ruleChain48.around((org.junit.rules.TestRule) ruleChain84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain84);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        short[] shortArray1 = new short[] {};
        short[] shortArray4 = new short[] { (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray4);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (byte) -1);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray1, charArray2);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray6);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray15, charArray16);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray16, charArray20);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray25, charArray26);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray29, charArray30);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray30, charArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray26, charArray30);
        org.junit.Assert.assertArrayEquals(charArray16, charArray26);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray40, charArray41);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray41, charArray45);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray50, charArray51);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray54, charArray55);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray55, charArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray51, charArray55);
        org.junit.Assert.assertArrayEquals(charArray41, charArray51);
        org.junit.Assert.assertArrayEquals("hi!", charArray26, charArray41);
        org.junit.Assert.assertArrayEquals(charArray10, charArray41);
        org.junit.Assert.assertArrayEquals(charArray1, charArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray12);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) throttlingArray5);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) throttlingArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray9);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) throttlingArray28);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) serializableArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) throttlingArray38);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray33, (java.lang.Object[]) serializableArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray26, (java.lang.Object[]) throttlingArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray17);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray46, (java.lang.Object[]) throttlingArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) throttlingArray48);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray56);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray59, (java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray56, (java.lang.Object[]) serializableArray59);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) serializableArray53, (java.lang.Object[]) throttlingArray56);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) throttlingArray56);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) executorServiceArray68);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) (short) -1, 0.0f, (float) (byte) -1);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '#');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) 0.0f);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) '#');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray16, (double) 3);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) '#');
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray28, (double) 0.0f);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) '#');
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray38, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray23, doubleArray38, (double) 1);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray46, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray46, (double) (short) -1);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray7, doubleArray12, (double) (-1.0f));
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray57, (double) '#');
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray60, (double) 3);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) '#');
        double[] doubleArray70 = new double[] {};
        double[] doubleArray71 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray71, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray70, (double) 3);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray56, doubleArray66, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray66, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray12, (double) 'a');
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 2, (double) (short) 1);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        int[] intArray2 = new int[] { 3, ' ' };
        int[] intArray5 = new int[] { ' ', (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) ' ', (double) 10, (double) 'a');
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        org.junit.rules.TestRule testRule3 = null;
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.outerRule(testRule3);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain4;
        org.junit.rules.TestRule testRule6 = null;
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.outerRule(testRule6);
        org.junit.rules.RuleChain ruleChain8 = ruleChain4.around((org.junit.rules.TestRule) ruleChain7);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain7);
        org.junit.rules.TestRule testRule10 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain11 = ruleChain7.around(testRule10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) ruleChain11);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain1);
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain3);
        org.junit.rules.RuleChain ruleChain5 = ruleChain2.around((org.junit.rules.TestRule) ruleChain4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests8.assertTermsEquals("tests.failfast", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests8.assertTermsEquals("hi!", indexReader18, terms19, terms20, true);
        kuromojiAnalysisTests8.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests8.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests8.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        kuromojiAnalysisTests27.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests8, (java.lang.Object) kuromojiAnalysisTests27);
        org.junit.rules.TestRule testRule32 = null;
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.outerRule(testRule32);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        org.junit.rules.TestRule testRule35 = null;
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.outerRule(testRule35);
        org.junit.rules.RuleChain ruleChain37 = ruleChain33.around((org.junit.rules.TestRule) ruleChain36);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests8, (java.lang.Object) ruleChain33);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        java.lang.Object obj40 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) ruleChain33, obj40);
        org.junit.rules.RuleChain ruleChain42 = ruleChain5.around((org.junit.rules.TestRule) ruleChain33);
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain44 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain43);
        org.junit.rules.RuleChain ruleChain45 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain46 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain45);
        org.junit.rules.RuleChain ruleChain47 = ruleChain44.around((org.junit.rules.TestRule) ruleChain46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests50.tearDown();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        kuromojiAnalysisTests50.assertTermsEquals("tests.failfast", indexReader53, terms54, terms55, false);
        kuromojiAnalysisTests50.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        kuromojiAnalysisTests50.assertTermsEquals("hi!", indexReader60, terms61, terms62, true);
        kuromojiAnalysisTests50.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests50.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests50.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests69 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests69.tearDown();
        kuromojiAnalysisTests69.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests50, (java.lang.Object) kuromojiAnalysisTests69);
        org.junit.rules.TestRule testRule74 = null;
        org.junit.rules.RuleChain ruleChain75 = org.junit.rules.RuleChain.outerRule(testRule74);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain75;
        org.junit.rules.TestRule testRule77 = null;
        org.junit.rules.RuleChain ruleChain78 = org.junit.rules.RuleChain.outerRule(testRule77);
        org.junit.rules.RuleChain ruleChain79 = ruleChain75.around((org.junit.rules.TestRule) ruleChain78);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests50, (java.lang.Object) ruleChain75);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain75;
        java.lang.Object obj82 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) ruleChain75, obj82);
        org.junit.rules.RuleChain ruleChain84 = ruleChain47.around((org.junit.rules.TestRule) ruleChain75);
        org.junit.rules.RuleChain ruleChain85 = ruleChain33.around((org.junit.rules.TestRule) ruleChain47);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain33);
        org.junit.rules.RuleChain ruleChain87 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain87);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray7);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 0L, 1.0d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        double[] doubleArray6 = new double[] { '#', 3, 2, 100L, 100 };
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) '#');
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray13, (double) 0.0f);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) '#');
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray23, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray23, (double) 1);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray31, (double) 2);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) '#');
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray41, (double) 3);
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) '#');
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray51, (double) 3);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray37, doubleArray47, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray37, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray31, (double) 100.0f);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement9 = null;
        org.junit.runner.Description description10 = null;
        org.junit.runners.model.Statement statement11 = ruleChain8.apply(statement9, description10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain23 = ruleChain8.around((org.junit.rules.TestRule) ruleChain22);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.util.Set[] setArray31 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray32 = (java.util.Set<java.io.Serializable>[]) setArray31;
        serializableSetArray32[0] = serializableSet25;
        serializableSetArray32[1] = serializableSet27;
        serializableSetArray32[2] = serializableSet29;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray32);
        java.util.Set<java.util.Collection<java.io.Serializable>> serializableCollectionSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.io.Serializable>[]) serializableSetArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain22, (java.lang.Object) serializableSetArray32);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.slow", "tests.weekly" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray8);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) throttlingArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray8, (java.lang.Object[]) throttlingArray13);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray21);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) throttlingArray37);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) serializableArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray47);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) throttlingArray47);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray42, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray35, (java.lang.Object[]) throttlingArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray42);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray53 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet54 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray53);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) luceneTestCaseArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray13, (java.lang.Object[]) luceneTestCaseArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray3, (java.lang.Object[]) luceneTestCaseArray53);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        short[] shortArray2 = new short[] { (short) 0, (byte) 10 };
        short[] shortArray7 = new short[] { (byte) 10, (short) 1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray7);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        short[] shortArray6 = new short[] { (byte) -1, (short) -1, (byte) 100, (byte) 10, (byte) -1 };
        short[] shortArray9 = new short[] { (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray6, shortArray9);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) queryCachingPolicy1, (java.lang.Object) (short) 1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests4.assertTermsEquals("tests.failfast", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests4.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests4.ensureAllSearchContextsReleased();
        java.lang.String str15 = kuromojiAnalysisTests4.getTestName();
        kuromojiAnalysisTests4.assertPathHasBeenCleared("enwiki.random.lines.txt");
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain18);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests20.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = ruleChain19.around(testRule21);
        org.junit.rules.RuleChain ruleChain23 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain22);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy26 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.rules.TestRule testRule27 = null;
        org.junit.rules.RuleChain ruleChain28 = org.junit.rules.RuleChain.outerRule(testRule27);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain28;
        org.junit.rules.TestRule testRule30 = null;
        org.junit.rules.RuleChain ruleChain31 = org.junit.rules.RuleChain.outerRule(testRule30);
        org.junit.rules.RuleChain ruleChain32 = ruleChain28.around((org.junit.rules.TestRule) ruleChain31);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy26, (java.lang.Object) ruleChain32);
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain35 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain34);
        org.junit.rules.RuleChain ruleChain36 = ruleChain32.around((org.junit.rules.TestRule) ruleChain34);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) "tests.badapples", (java.lang.Object) ruleChain32);
        org.junit.rules.RuleChain ruleChain38 = ruleChain23.around((org.junit.rules.TestRule) ruleChain32);
        kuromojiAnalysisTests4.failureAndSuccessEvents = ruleChain23;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain23;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) queryCachingPolicy1, (java.lang.Object) ruleChain23);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 4);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        int[] intArray2 = new int[] { (byte) -1, (byte) 0 };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        short[] shortArray4 = new short[] { (short) -1, (short) -1, (short) 10 };
        short[] shortArray8 = new short[] { (byte) 10, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray4, shortArray8);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) 100L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 0, (short) 1, (byte) 10, (byte) -1 };
        short[] shortArray7 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray6, shortArray7);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.failfast");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        int[] intArray3 = new int[] { 'a', 100, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 0, '#', (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum6, postingsEnum7, false);
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests12.ruleChain;
        org.junit.rules.RuleChain ruleChain14 = ruleChain11.around(testRule13);
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain14);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain14;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader18, fields19, fields20, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests23.assertDocsEnumEquals("tests.failfast", postingsEnum25, postingsEnum26, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests29.ruleChain;
        kuromojiAnalysisTests29.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.tearDown();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests33.assertTermsEquals("tests.failfast", indexReader36, terms37, terms38, false);
        org.junit.rules.RuleChain ruleChain41 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain41, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests29, (java.lang.Object) ruleChain41);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum25, (java.lang.Object) kuromojiAnalysisTests29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) true, (java.lang.Object) kuromojiAnalysisTests29);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        short[] shortArray0 = new short[] {};
        short[] shortArray2 = new short[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray2);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        int[] intArray2 = new int[] { ' ', (short) -1 };
        int[] intArray8 = new int[] { 2, (short) 0, (byte) 100, '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray8);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        float[] floatArray6 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray12 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray6, floatArray12, (float) (byte) 100);
        float[] floatArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray15, (float) (-1L));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.badapples", 100, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain29;
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests12.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests12.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests12.ensureCheckIndexPassed();
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("random", 0, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 3, (long) 2);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        double[] doubleArray3 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray6 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray9 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray12 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray13 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12 };
        double[] doubleArray16 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray19 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray22 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray25 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        double[] doubleArray29 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray32 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray35 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray38 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray39 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        double[] doubleArray42 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray45 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray48 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray51 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray52 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51 };
        double[][][] doubleArray53 = new double[][][] { doubleArray13, doubleArray26, doubleArray39, doubleArray52 };
        java.util.Set<double[][]> doubleArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) doubleArraySet54);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        int[] intArray3 = new int[] { (byte) -1, 10, (short) 0 };
        int[] intArray10 = new int[] { (short) 0, (byte) 1, 10, '4', (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray10);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (-1));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests12.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests12.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests12.ensureCheckIndexPassed();
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum32, postingsEnum33, true);
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.lang.Object obj37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, obj37);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) throttlingArray3);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray7, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) -1);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain19);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain19;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain19;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule18, (java.lang.Object) ruleChain19);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (-1L));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { (byte) 100, 1, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray6);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) ' ');
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, (double) 0, (double) (short) 10);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) throttlingEnumSet2);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) '#', numericDocValues23, numericDocValues24);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        float[] floatArray1 = new float[] {};
        float[] floatArray4 = new float[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray4, (float) (-1L));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 10, (double) (byte) 100, (double) 4);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 'a', (long) '4');
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain14);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (short) 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        short[] shortArray3 = new short[] { (short) 10, (byte) 1, (byte) 0 };
        short[] shortArray4 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        byte[] byteArray8 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray7, byteArray8);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        org.junit.rules.RuleChain ruleChain4 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        java.lang.String str14 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader16, (int) (short) 100, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum22, postingsEnum23);
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
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement9 = null;
        org.junit.runner.Description description10 = null;
        org.junit.runners.model.Statement statement11 = ruleChain8.apply(statement9, description10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain23 = ruleChain8.around((org.junit.rules.TestRule) ruleChain22);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests25.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        kuromojiAnalysisTests25.assertTermsEquals("tests.failfast", indexReader28, terms29, terms30, false);
        kuromojiAnalysisTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests25.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum35, postingsEnum36, false);
        java.lang.String str39 = kuromojiAnalysisTests25.getTestName();
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain41 = ruleChain22.around((org.junit.rules.TestRule) ruleChain40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.tearDown();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests42.assertTermsEquals("tests.failfast", indexReader45, terms46, terms47, false);
        kuromojiAnalysisTests42.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests42.ensureCleanedUp();
        kuromojiAnalysisTests42.resetCheckIndexStatus();
        kuromojiAnalysisTests42.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests42.assertDocsEnumEquals("tests.failfast", postingsEnum55, postingsEnum56, true);
        java.lang.Class<?> wildcardClass59 = kuromojiAnalysisTests42.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain22, (java.lang.Object) wildcardClass59);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        byte[] byteArray0 = null;
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray5);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, 10.0d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray12, longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray13, longArray17);
        org.junit.Assert.assertArrayEquals(longArray4, longArray13);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray22, longArray23);
        org.junit.Assert.assertArrayEquals("random", longArray13, longArray22);
        long[] longArray28 = new long[] { 0L, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray13, longArray28);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (short) 1);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.TestRule testRule5 = null;
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.outerRule(testRule5);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain6;
        org.junit.rules.TestRule testRule8 = null;
        org.junit.rules.RuleChain ruleChain9 = org.junit.rules.RuleChain.outerRule(testRule8);
        org.junit.rules.RuleChain ruleChain10 = ruleChain6.around((org.junit.rules.TestRule) ruleChain9);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain10;
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray15 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray15);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) throttlingArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray15, (java.lang.Object[]) serializableArray18);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) throttlingArray30);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray34);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) throttlingArray43);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) throttlingArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray47);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray59);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) throttlingArray59);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray54, (java.lang.Object[]) serializableArray57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray64);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet68 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray67);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray69 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray69);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray67, (java.lang.Object[]) throttlingArray69);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray64, (java.lang.Object[]) serializableArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray57, (java.lang.Object[]) throttlingArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray47, (java.lang.Object[]) throttlingArray64);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) serializableArray34, (java.lang.Object) (byte) 100);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray82 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet83 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray82);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray80, (java.lang.Object[]) throttlingArray82);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray85 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet86 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray85);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) throttlingArray82, (java.lang.Object[]) luceneTestCaseArray85);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) luceneTestCaseArray85);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) luceneTestCaseArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain10, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        short[] shortArray5 = new short[] { (byte) -1, (byte) -1, (short) -1, (byte) 0 };
        short[] shortArray7 = new short[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray7);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 1, (double) 1L);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 4, (float) (-1L), 1.0f);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray14 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray8, floatArray14, (float) (byte) 100);
        float[] floatArray23 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray29 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray23, floatArray29, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray23, (float) (short) 1);
        float[] floatArray40 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray46 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray40, floatArray46, (float) (byte) 100);
        float[] floatArray55 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray61 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray55, floatArray61, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray55, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray23, floatArray55, (float) 100L);
        float[] floatArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray55, floatArray68, (float) '#');
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) 3, (float) (-1));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("hi!", indexReader11, terms12, terms13, true);
        java.lang.String str16 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("", indexReader18, (int) (byte) 0, postingsEnum20, postingsEnum21, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) postingsEnum20);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (byte) 1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader17, (int) (byte) 0, postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) boolean5);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) throttlingArray3);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray7);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray21, (java.lang.Object[]) serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray31, (java.lang.Object[]) serializableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray15);
        org.junit.rules.TestRule testRule44 = null;
        org.junit.rules.RuleChain ruleChain45 = org.junit.rules.RuleChain.outerRule(testRule44);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain45;
        org.junit.rules.TestRule testRule47 = null;
        org.junit.rules.RuleChain ruleChain48 = org.junit.rules.RuleChain.outerRule(testRule47);
        org.junit.rules.RuleChain ruleChain49 = ruleChain45.around((org.junit.rules.TestRule) ruleChain48);
        org.junit.rules.TestRule testRule50 = null;
        org.junit.rules.RuleChain ruleChain51 = org.junit.rules.RuleChain.outerRule(testRule50);
        org.junit.rules.TestRule testRule52 = null;
        org.junit.rules.RuleChain ruleChain53 = org.junit.rules.RuleChain.outerRule(testRule52);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain53;
        org.junit.rules.TestRule testRule55 = null;
        org.junit.rules.RuleChain ruleChain56 = org.junit.rules.RuleChain.outerRule(testRule55);
        org.junit.rules.RuleChain ruleChain57 = ruleChain53.around((org.junit.rules.TestRule) ruleChain56);
        org.junit.rules.TestRule testRule58 = null;
        org.junit.rules.RuleChain ruleChain59 = org.junit.rules.RuleChain.outerRule(testRule58);
        org.junit.rules.RuleChain[] ruleChainArray60 = new org.junit.rules.RuleChain[] { ruleChain45, ruleChain51, ruleChain53, ruleChain59 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList61 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, ruleChainArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray15, (java.lang.Object[]) ruleChainArray60);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) throttlingArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) throttlingArray7);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray16);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) throttlingArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray23, (java.lang.Object[]) throttlingArray25);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) serializableArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) throttlingArray35);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray30, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray23, (java.lang.Object[]) throttlingArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) serializableArray23);
        float[] floatArray49 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray55 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray49, floatArray55, (float) (byte) 100);
        float[] floatArray64 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray70 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray64, floatArray70, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray64, (float) (short) 1);
        float[] floatArray81 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray87 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray81, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray64, floatArray81, 0.0f);
        java.io.Serializable[] serializableArray92 = new java.io.Serializable[] { true, "", '#', "tests.maxfailures" };
        java.io.Serializable[][] serializableArray93 = new java.io.Serializable[][] { serializableArray92 };
        java.util.Set<java.io.Serializable[]> serializableArraySet94 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray93);
        java.util.Set<java.lang.Cloneable> cloneableSet95 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) serializableArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) serializableArray93);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests4, (java.lang.Object) "");
        java.lang.String str8 = kuromojiAnalysisTests4.getTestName();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests4, (java.lang.Object) "tests.nightly");
        kuromojiAnalysisTests4.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", obj1, (java.lang.Object) kuromojiAnalysisTests4);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        org.junit.rules.RuleChain ruleChain5 = ruleChain2.around(testRule4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray12 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray12);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) throttlingArray12);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray7, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule4, (java.lang.Object) serializableArray10);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray21);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray25);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) throttlingArray34);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) throttlingArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) throttlingArray50);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray45, (java.lang.Object[]) serializableArray48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray55);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray58, (java.lang.Object[]) throttlingArray60);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray55, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray48, (java.lang.Object[]) throttlingArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray38, (java.lang.Object[]) throttlingArray55);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray38);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray38);
        java.lang.Object[] objArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray10, objArray68);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        int[] intArray4 = new int[] { 1, (-1), (short) 10 };
        int[] intArray10 = new int[] { (short) 1, (byte) 1, 'a', 3, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray4, intArray10);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        int[] intArray3 = new int[] { (short) 10, '#', ' ' };
        int[] intArray9 = new int[] { (short) 0, 4, 'a', (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray9);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 0, (double) (-1L));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) (byte) 10, 100.0f, 1.0f);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) '#', (double) ' ', (double) (short) 100);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("random", indexReader15, fields16, fields17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader4, 10, postingsEnum6, postingsEnum7, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        java.lang.Class<?> wildcardClass11 = kuromojiAnalysisTests0.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests12.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("tests.weekly", indexReader24, fields25, fields26, true);
        kuromojiAnalysisTests12.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests12.assertDocsSkippingEquals("tests.monster", indexReader31, 0, postingsEnum33, postingsEnum34, true);
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests12.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass11, (java.lang.Object) kuromojiAnalysisTests12);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 1, (float) (short) -1, (float) 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 2);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        java.lang.String str5 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain6);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests8.ruleChain;
        org.junit.rules.RuleChain ruleChain10 = ruleChain7.around(testRule9);
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain10);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy14 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.rules.TestRule testRule15 = null;
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.outerRule(testRule15);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        org.junit.rules.TestRule testRule18 = null;
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.outerRule(testRule18);
        org.junit.rules.RuleChain ruleChain20 = ruleChain16.around((org.junit.rules.TestRule) ruleChain19);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy14, (java.lang.Object) ruleChain20);
        org.junit.rules.RuleChain ruleChain22 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain23 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain22);
        org.junit.rules.RuleChain ruleChain24 = ruleChain20.around((org.junit.rules.TestRule) ruleChain22);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) "tests.badapples", (java.lang.Object) ruleChain20);
        org.junit.rules.RuleChain ruleChain26 = ruleChain11.around((org.junit.rules.TestRule) ruleChain20);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain11;
        kuromojiAnalysisTests1.ensureCleanedUp();
        java.lang.String str29 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        java.lang.Object[] objArray1 = null;
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray12 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray12);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) throttlingArray12);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray7, (java.lang.Object[]) serializableArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray20, (java.lang.Object[]) throttlingArray22);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray17, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray10, (java.lang.Object[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) throttlingArray33);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray28, (java.lang.Object[]) serializableArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray17, (java.lang.Object[]) serializableArray31);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray31);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) throttlingArray42);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray48);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray46, (java.lang.Object[]) throttlingArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray46);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray56);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) throttlingArray56);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray65 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet66 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray65);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) throttlingArray65);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray60, (java.lang.Object[]) serializableArray63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray70 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray70);
        java.io.Serializable[] serializableArray73 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet74 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray73);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray75 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet76 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray75);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray73, (java.lang.Object[]) throttlingArray75);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray70, (java.lang.Object[]) serializableArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray63, (java.lang.Object[]) throttlingArray70);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray54);
        java.io.Serializable[] serializableArray83 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet84 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray83);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray85 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray85);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray83, (java.lang.Object[]) throttlingArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray40, (java.lang.Object[]) throttlingArray85);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) throttlingArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", objArray1, (java.lang.Object[]) serializableArray31);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (byte) 1);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 100, 1.0d, (double) (byte) 10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        short[] shortArray3 = new short[] { (byte) -1, (byte) -1 };
        short[] shortArray10 = new short[] { (short) 100, (byte) 1, (byte) 1, (short) -1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray10);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader16, (int) 'a', postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.nightly", indexReader23, terms24, terms25, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        java.lang.String str6 = kuromojiAnalysisTests2.getTestName();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "tests.nightly");
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocValuesEquals("tests.badapples", (int) '#', numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        long[] longArray3 = new long[] { ' ', (byte) 0, 1L };
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray5, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray6, longArray10);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray15, longArray19);
        org.junit.Assert.assertArrayEquals(longArray6, longArray15);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray15, longArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray15);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0L, (long) '#');
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", 0.0d, 1.0d, (double) ' ');
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        short[] shortArray1 = null;
        short[] shortArray8 = new short[] { (byte) 10, (short) 1, (byte) -1, (short) -1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray8);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        short[] shortArray5 = new short[] { (byte) -1, (short) 0, (byte) 1, (byte) 100 };
        short[] shortArray11 = new short[] { (byte) 10, (short) -1, (short) -1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray11);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) '4', (long) '#');
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray2, charArray3);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray12, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray16, charArray17);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray17, charArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray13, charArray17);
        org.junit.Assert.assertArrayEquals(charArray3, charArray17);
        char[] charArray28 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray17, charArray28);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, (short) 100, (byte) 0 };
        int[] intArray9 = new int[] { 0, (byte) 1, ' ', 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain2);
        org.junit.rules.RuleChain ruleChain4 = ruleChain1.around((org.junit.rules.TestRule) ruleChain3);
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests6.assertTermsEquals("tests.failfast", indexReader9, terms10, terms11, false);
        kuromojiAnalysisTests6.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests6.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests6.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests6.ensureCheckIndexPassed();
        java.lang.String str20 = kuromojiAnalysisTests6.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests6.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25);
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests6.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) ruleChain3, (java.lang.Object) testRule27);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        int[] intArray3 = new int[] { ' ', (byte) 10, (byte) 100 };
        int[] intArray6 = new int[] { '#', 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (short) -1, (float) (short) 1, (float) 0);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader16, (int) 'a', postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests0.tearDown();
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        java.util.Set[] setArray29 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray30 = (java.util.Set<java.io.Serializable>[]) setArray29;
        serializableSetArray30[0] = serializableSet23;
        serializableSetArray30[1] = serializableSet25;
        serializableSetArray30[2] = serializableSet27;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray30);
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray30);
        java.util.Set<java.util.Collection<java.io.Serializable>> serializableCollectionSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.io.Serializable>[]) serializableSetArray30);
        java.lang.Object[] objArray40 = new java.lang.Object[] { kuromojiAnalysisTests0, serializableSetArray30 };
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) throttlingArray46);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray49 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet50 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray49);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) throttlingArray46, (java.lang.Object[]) luceneTestCaseArray49);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray56);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) throttlingArray56);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray62 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray62);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) throttlingArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray60);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray67 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray67);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray72 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet73 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray72);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray70, (java.lang.Object[]) throttlingArray72);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray67, (java.lang.Object[]) serializableArray70);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray77 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet78 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray77);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray82 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet83 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray82);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray80, (java.lang.Object[]) throttlingArray82);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray77, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray70, (java.lang.Object[]) throttlingArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray60, (java.lang.Object[]) throttlingArray77);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray88 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet89 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray88);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) luceneTestCaseArray88);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) luceneTestCaseArray49, (java.lang.Object[]) serializableArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableSetArray30, (java.lang.Object[]) luceneTestCaseArray49);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) (byte) 1, (float) ' ', (float) (byte) -1);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 4, (long) (short) 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("hi!", indexReader11, (int) '4', postingsEnum13, postingsEnum14, true);
        java.lang.String str17 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.setUp();
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) boolean26);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray9);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) serializableArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray14);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) throttlingArray19);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray14, (java.lang.Object[]) serializableArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) throttlingArray30);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray25, (java.lang.Object[]) serializableArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray14, (java.lang.Object[]) serializableArray28);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray28);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale38, locale40, locale42, locale44 };
        java.util.Set<java.util.Locale> localeSet46 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray45);
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, (java.lang.Cloneable[]) localeArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableArray1, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) throttlingArray6);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray1, (java.lang.Object[]) throttlingArray6);
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale12, locale14, locale16, locale18 };
        java.util.Set<java.util.Locale> localeSet20 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray19);
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, (java.lang.Cloneable[]) localeArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray6, (java.lang.Object[]) localeArray19);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) throttlingArray7);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) serializableArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray12 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray12);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) throttlingArray17);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray12, (java.lang.Object[]) serializableArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray5, (java.lang.Object[]) throttlingArray12);
        java.lang.Object obj22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) throttlingArray12, obj22);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        java.lang.String str6 = kuromojiAnalysisTests2.getTestName();
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests9.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = ruleChain8.around(testRule10);
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain11);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy15 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.rules.TestRule testRule16 = null;
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.outerRule(testRule16);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        org.junit.rules.TestRule testRule19 = null;
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.outerRule(testRule19);
        org.junit.rules.RuleChain ruleChain21 = ruleChain17.around((org.junit.rules.TestRule) ruleChain20);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy15, (java.lang.Object) ruleChain21);
        org.junit.rules.RuleChain ruleChain23 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain24 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain23);
        org.junit.rules.RuleChain ruleChain25 = ruleChain21.around((org.junit.rules.TestRule) ruleChain23);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) "tests.badapples", (java.lang.Object) ruleChain21);
        org.junit.rules.RuleChain ruleChain27 = ruleChain12.around((org.junit.rules.TestRule) ruleChain21);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain12;
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) ruleChain30);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 3, (double) ' ', 0.0d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, 1.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests19.assertTermsEquals("tests.failfast", indexReader22, terms23, terms24, false);
        kuromojiAnalysisTests19.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests19.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests19.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("random", indexReader34, fields35, fields36, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) indexReader34);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (byte) -1, (float) 100, 0.0f);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.monster", indexReader5, 10, postingsEnum7, postingsEnum8, true);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", 0, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        int[] intArray6 = new int[] { 4, 4, (byte) 10, 4, 2 };
        int[] intArray13 = new int[] { (short) -1, (short) 100, (short) 10, 10, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray6, intArray13);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        java.lang.Object obj0 = null;
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray4, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray14, charArray15);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray18, charArray19);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray19, charArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray15, charArray19);
        org.junit.Assert.assertArrayEquals(charArray5, charArray15);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray29, charArray30);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray15, charArray29);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray34, charArray35);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray35, charArray39);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray29, charArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.nightly", indexReader13, fields14, fields15, false);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray21);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) throttlingArray37);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) serializableArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray47);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) throttlingArray47);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray42, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray35, (java.lang.Object[]) throttlingArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray42);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader13, (java.lang.Object) serializableArray25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests54.tearDown();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        kuromojiAnalysisTests54.assertTermsEquals("tests.failfast", indexReader57, terms58, terms59, false);
        kuromojiAnalysisTests54.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        kuromojiAnalysisTests54.assertTermsEquals("hi!", indexReader64, terms65, terms66, true);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        kuromojiAnalysisTests54.assertDocsSkippingEquals("hi!", indexReader70, (int) (byte) 1, postingsEnum72, postingsEnum73, false);
        org.junit.rules.RuleChain ruleChain76 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain77 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain76);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests78 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule79 = kuromojiAnalysisTests78.ruleChain;
        org.junit.rules.RuleChain ruleChain80 = ruleChain77.around(testRule79);
        kuromojiAnalysisTests54.failureAndSuccessEvents = ruleChain80;
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain80, (java.lang.Object) executorServiceArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) executorServiceArray83);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        short[] shortArray6 = new short[] { (byte) 10, (short) 0, (short) 0, (short) 10, (short) 1 };
        short[] shortArray11 = new short[] { (short) 1, (short) 100, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray6, shortArray11);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        double[] doubleArray4 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray7 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray10 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray13 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray14 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13 };
        double[] doubleArray17 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray20 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray23 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray26 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        double[] doubleArray30 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray33 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray36 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray39 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray40 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        double[] doubleArray43 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray46 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray49 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray52 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray53 = new double[][] { doubleArray43, doubleArray46, doubleArray49, doubleArray52 };
        double[][][] doubleArray54 = new double[][][] { doubleArray14, doubleArray27, doubleArray40, doubleArray53 };
        java.util.Set<double[][]> doubleArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) doubleArray54);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10L, (long) (short) 10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        short[] shortArray1 = new short[] { (short) 0 };
        short[] shortArray6 = new short[] { (byte) 1, (short) 10, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray6);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 100);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 4, (double) (byte) 1, (double) 100);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        short[] shortArray1 = new short[] { (short) 10 };
        short[] shortArray7 = new short[] { (short) 0, (short) 100, (short) -1, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray7);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) throttlingArray7);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) throttlingArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray21, (java.lang.Object[]) throttlingArray23);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray18, (java.lang.Object[]) serializableArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) throttlingArray33);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray28, (java.lang.Object[]) serializableArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray21, (java.lang.Object[]) throttlingArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray11, (java.lang.Object[]) throttlingArray28);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) throttlingArray42);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray48);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray46, (java.lang.Object[]) throttlingArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray46);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray53);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray58 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray58);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray56, (java.lang.Object[]) throttlingArray58);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray53, (java.lang.Object[]) serializableArray56);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray63 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray63);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray68 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray68);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray66, (java.lang.Object[]) throttlingArray68);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray63, (java.lang.Object[]) serializableArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray56, (java.lang.Object[]) throttlingArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray46, (java.lang.Object[]) throttlingArray63);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) throttlingArray28, (java.lang.Object[]) throttlingArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) throttlingArray63);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        short[] shortArray4 = new short[] { (short) 0, (short) 100, (short) -1 };
        short[] shortArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 3, (long) (short) -1);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) -1, (byte) 10, (short) 1, (byte) 1, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray9);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        int[] intArray3 = new int[] { (-1), 1, 0 };
        int[] intArray6 = new int[] { '4', 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.monster", indexReader20, fields21, fields22, true);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        int[] intArray5 = new int[] { (byte) 10, (-1), 4, (short) 1 };
        int[] intArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray5, intArray6);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray7 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet8 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray7);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray12 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray12);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) throttlingArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray7, (java.lang.Object[]) serializableArray10);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray20, (java.lang.Object[]) throttlingArray22);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) throttlingArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray20, (java.lang.Object[]) serializableArray26);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) throttlingArray35);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) throttlingArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray46);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet52 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray51);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) throttlingArray51);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray46, (java.lang.Object[]) serializableArray49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray56);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray59, (java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray56, (java.lang.Object[]) serializableArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray49, (java.lang.Object[]) throttlingArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray39, (java.lang.Object[]) throttlingArray56);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) serializableArray26, (java.lang.Object) (byte) 100);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray74 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray74);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray72, (java.lang.Object[]) throttlingArray74);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray77 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet78 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray77);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) throttlingArray74, (java.lang.Object[]) luceneTestCaseArray77);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) luceneTestCaseArray77);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) luceneTestCaseArray77);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) luceneTestCaseArray77);
        char[] charArray89 = new char[] { '4', '#', '4', '4', '4', ' ' };
        char[] charArray96 = new char[] { '4', '#', '4', '4', '4', ' ' };
        char[][] charArray97 = new char[][] { charArray89, charArray96 };
        java.util.Set<char[]> charArraySet98 = org.apache.lucene.util.LuceneTestCase.asSet(charArray97);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) luceneTestCaseArray77, (java.lang.Object[]) charArray97);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        int[] intArray0 = null;
        int[] intArray5 = new int[] { 10, (byte) 0, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) throttlingArray3);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray7);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray21, (java.lang.Object[]) serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray31, (java.lang.Object[]) serializableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray15);
        long[] longArray44 = new long[] { (byte) -1 };
        long[] longArray46 = new long[] { (byte) -1 };
        long[] longArray48 = new long[] { (byte) -1 };
        long[][] longArray49 = new long[][] { longArray44, longArray46, longArray48 };
        java.util.Set<long[]> longArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(longArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray15, (java.lang.Object[]) longArray49);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray2, charArray3);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray12, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray13, charArray17);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray22, charArray23);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray26, charArray27);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray30, charArray31);
        org.junit.Assert.assertArrayEquals(charArray27, charArray31);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray23, charArray27);
        org.junit.Assert.assertArrayEquals(charArray13, charArray23);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray37, charArray38);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray38, charArray42);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray47, charArray48);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray51, charArray52);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray48, charArray52);
        org.junit.Assert.assertArrayEquals(charArray38, charArray48);
        org.junit.Assert.assertArrayEquals("hi!", charArray23, charArray38);
        org.junit.Assert.assertArrayEquals(charArray7, charArray38);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        java.util.concurrent.ExecutorService[][] executorServiceArray71 = new java.util.concurrent.ExecutorService[][] { executorServiceArray64, executorServiceArray66, executorServiceArray68, executorServiceArray70 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet72 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) charArray7, (java.lang.Object) executorServiceArraySet72);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 4, (long) (byte) 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) 0, (float) (byte) -1);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.tearDown();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.TestRule testRule14 = null;
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.outerRule(testRule14);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        org.junit.rules.TestRule testRule17 = null;
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.outerRule(testRule17);
        org.junit.rules.RuleChain ruleChain19 = ruleChain15.around((org.junit.rules.TestRule) ruleChain18);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain18);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain18;
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", 10, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        long[] longArray0 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.monster", 10, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        int[] intArray5 = new int[] { 10, (byte) 100, (byte) 0, ' ' };
        int[] intArray8 = new int[] { (short) -1, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray5, intArray8);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.setUp();
        java.lang.String str4 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) '#', numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        long[] longArray0 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray13, longArray14);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray13);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray22, longArray23);
        org.junit.Assert.assertArrayEquals(longArray19, longArray23);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray27, longArray28);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray28, longArray32);
        org.junit.Assert.assertArrayEquals(longArray19, longArray28);
        org.junit.Assert.assertArrayEquals("random", longArray13, longArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray13);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) '#');
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray9, (double) 0.0f);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) '#');
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray18, (double) 3);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) '#');
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray30, (double) 0.0f);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) '#');
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray40, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray40, (double) 1);
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray48, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray48, (double) (short) -1);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray9, doubleArray14, (double) (-1.0f));
        double[] doubleArray58 = new double[] {};
        double[] doubleArray59 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray59, (double) '#');
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray62, (double) 3);
        double[] doubleArray68 = new double[] {};
        double[] doubleArray69 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray69, (double) '#');
        double[] doubleArray72 = new double[] {};
        double[] doubleArray73 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray73, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray72, (double) 3);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray58, doubleArray68, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray68, (double) ' ');
        double[] doubleArray82 = new double[] {};
        double[] doubleArray83 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray82, doubleArray83, (double) '#');
        double[] doubleArray86 = new double[] {};
        double[] doubleArray87 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray86, doubleArray87, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray82, doubleArray87, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray14, doubleArray87, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray1, doubleArray14, (double) 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 10L, (long) '4');
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        int[] intArray5 = new int[] { 3, (byte) 1, 100, 100, (byte) 10 };
        int[] intArray12 = new int[] { (short) 10, '#', (byte) 0, 4, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) throttlingArray3);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray7);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray21, (java.lang.Object[]) serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray31, (java.lang.Object[]) serializableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures44 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures43);
        org.junit.rules.RuleChain ruleChain45 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableArray1, (java.lang.Object) testRuleIgnoreAfterMaxFailures43);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests13.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) ruleChain12, (java.lang.Object) kuromojiAnalysisTests13);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests28.tearDown();
        kuromojiAnalysisTests28.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests28.setUp();
        org.junit.rules.TestRule testRule33 = null;
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.outerRule(testRule33);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain34;
        org.junit.rules.TestRule testRule36 = null;
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.outerRule(testRule36);
        org.junit.rules.RuleChain ruleChain38 = ruleChain34.around((org.junit.rules.TestRule) ruleChain37);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain38;
        kuromojiAnalysisTests28.failureAndSuccessEvents = ruleChain38;
        kuromojiAnalysisTests13.failureAndSuccessEvents = ruleChain38;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule44 = kuromojiAnalysisTests43.ruleChain;
        kuromojiAnalysisTests43.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests47.tearDown();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        kuromojiAnalysisTests47.assertTermsEquals("tests.failfast", indexReader50, terms51, terms52, false);
        org.junit.rules.RuleChain ruleChain55 = kuromojiAnalysisTests47.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain55, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests43, (java.lang.Object) ruleChain55);
        org.junit.rules.TestRule testRule61 = null;
        org.junit.rules.RuleChain ruleChain62 = org.junit.rules.RuleChain.outerRule(testRule61);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain62;
        org.junit.rules.TestRule testRule64 = null;
        org.junit.rules.RuleChain ruleChain65 = org.junit.rules.RuleChain.outerRule(testRule64);
        org.junit.rules.RuleChain ruleChain66 = ruleChain62.around((org.junit.rules.TestRule) ruleChain65);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain65);
        org.junit.rules.TestRule testRule68 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain69 = ruleChain65.around(testRule68);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) ruleChain55, (java.lang.Object) testRule68);
        org.junit.rules.RuleChain ruleChain71 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests13, (java.lang.Object) ruleChain55);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, 0, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray6);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.slow", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader24, (int) (byte) -1, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests31.tearDown();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        kuromojiAnalysisTests31.assertTermsEquals("tests.failfast", indexReader34, terms35, terms36, false);
        kuromojiAnalysisTests31.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests31.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests31.ruleChain;
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) ruleChain43);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests45.tearDown();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        kuromojiAnalysisTests45.assertTermsEquals("tests.failfast", indexReader48, terms49, terms50, false);
        kuromojiAnalysisTests45.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests45.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule56 = kuromojiAnalysisTests45.ruleChain;
        org.junit.rules.RuleChain ruleChain57 = kuromojiAnalysisTests45.failureAndSuccessEvents;
        java.lang.Object obj58 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain57, obj58);
        org.junit.rules.RuleChain ruleChain60 = ruleChain43.around((org.junit.rules.TestRule) ruleChain57);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain60;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        kuromojiAnalysisTests1.assertTermsEquals("<unknown>", indexReader63, terms64, terms65, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests68.tearDown();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        kuromojiAnalysisTests68.assertTermsEquals("tests.failfast", indexReader71, terms72, terms73, false);
        kuromojiAnalysisTests68.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        kuromojiAnalysisTests68.assertTermsEquals("hi!", indexReader78, terms79, terms80, true);
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        kuromojiAnalysisTests68.assertPositionsSkippingEquals("tests.slow", indexReader84, (int) 'a', postingsEnum86, postingsEnum87);
        kuromojiAnalysisTests68.tearDown();
        org.apache.lucene.index.IndexReader indexReader91 = null;
        org.apache.lucene.index.Terms terms92 = null;
        org.apache.lucene.index.Terms terms93 = null;
        kuromojiAnalysisTests68.assertTermsEquals("tests.nightly", indexReader91, terms92, terms93, false);
        kuromojiAnalysisTests68.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "<unknown>", (java.lang.Object) kuromojiAnalysisTests68);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100L, (double) (short) -1, (double) (byte) -1);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (-1L));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1L));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", (int) (short) 1, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.junit.rules.TestRule testRule0 = null;
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.outerRule(testRule0);
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) throttlingArray6);
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain2, (java.lang.Object) throttlingArray6);
        double[] doubleArray12 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray15 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray18 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray21 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray22 = new double[][] { doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        double[] doubleArray25 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray28 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray31 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray34 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        double[] doubleArray38 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray41 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray44 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray47 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray48 = new double[][] { doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        double[] doubleArray51 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray54 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray57 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray60 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray61 = new double[][] { doubleArray51, doubleArray54, doubleArray57, doubleArray60 };
        double[][][] doubleArray62 = new double[][][] { doubleArray22, doubleArray35, doubleArray48, doubleArray61 };
        java.util.Set<double[][]> doubleArraySet63 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray6, (java.lang.Object[]) doubleArray62);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures8);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures8 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet11 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.ALWAYS;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12, throttling13, throttling14, throttling15, throttling16 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet18 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray17);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray10, (java.lang.Object[]) throttlingArray17);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, (short) 100, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        java.lang.String str15 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests18.ruleChain;
        org.junit.rules.RuleChain ruleChain20 = ruleChain17.around(testRule19);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests23.assertTermsEquals("tests.failfast", indexReader26, terms27, terms28, false);
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests23.assertTermsEquals("hi!", indexReader33, terms34, terms35, true);
        java.lang.String str38 = kuromojiAnalysisTests23.getTestName();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests23.assertDocsSkippingEquals("", indexReader40, (int) (byte) 0, postingsEnum42, postingsEnum43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("tests.awaitsfix", indexReader47, fields48, fields49, true);
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests23.assertDocsEnumEquals("<unknown>", postingsEnum53, postingsEnum54, false);
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) ruleChain20, (java.lang.Object) kuromojiAnalysisTests23);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray9);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain10);
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain12);
        org.junit.rules.RuleChain ruleChain14 = ruleChain11.around((org.junit.rules.TestRule) ruleChain13);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain11;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.awaitsfix");
        kuromojiAnalysisTests16.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests16);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests16.assertPathHasBeenCleared("");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray4);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) ' ', (long) 100);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("hi!", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("hi!", indexReader17, (int) (byte) 1, postingsEnum19, postingsEnum20, false);
        org.junit.rules.RuleChain ruleChain23 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain24 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain23);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests25.ruleChain;
        org.junit.rules.RuleChain ruleChain27 = ruleChain24.around(testRule26);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain27, (java.lang.Object) executorServiceArray30);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray37, charArray38);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray38, charArray42);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray47, charArray48);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray51, charArray52);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray48, charArray52);
        org.junit.Assert.assertArrayEquals(charArray38, charArray48);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray62, charArray63);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray66, charArray67);
        org.junit.Assert.assertArrayEquals(charArray63, charArray67);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray72, charArray73);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray76, charArray77);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray80, charArray81);
        org.junit.Assert.assertArrayEquals(charArray77, charArray81);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray73, charArray77);
        org.junit.Assert.assertArrayEquals(charArray63, charArray73);
        org.junit.Assert.assertArrayEquals(charArray48, charArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) ruleChain27, (java.lang.Object) charArray48);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) throttlingArray11);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) throttlingArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray22, (java.lang.Object[]) serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) throttlingArray37);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) serializableArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray15, (java.lang.Object[]) throttlingArray32);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray47);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) throttlingArray47);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray53);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray51, (java.lang.Object[]) throttlingArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray45, (java.lang.Object[]) serializableArray51);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray58, (java.lang.Object[]) throttlingArray60);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray66 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray66);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray64, (java.lang.Object[]) throttlingArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray58, (java.lang.Object[]) serializableArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray71 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray71);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet75 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray74);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray76 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet77 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray76);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray74, (java.lang.Object[]) throttlingArray76);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray71, (java.lang.Object[]) serializableArray74);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray81 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray81);
        java.io.Serializable[] serializableArray84 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet85 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray84);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray86 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet87 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray86);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray84, (java.lang.Object[]) throttlingArray86);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray81, (java.lang.Object[]) serializableArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray74, (java.lang.Object[]) throttlingArray81);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray64, (java.lang.Object[]) throttlingArray81);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray51, (java.lang.Object[]) serializableArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray6, (java.lang.Object[]) serializableArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) throttlingArray6);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        short[] shortArray1 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 1, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray1, charArray2);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray11, charArray12);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray15, charArray16);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray16, charArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray12, charArray16);
        org.junit.Assert.assertArrayEquals(charArray2, charArray16);
        java.lang.Object obj25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray16, obj25);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) 10);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        int[] intArray2 = new int[] { (-1) };
        int[] intArray6 = new int[] { 2, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray2, intArray6);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray7, byteArray9);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) 0, (float) (short) 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (-1), (double) (-1L));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) throttlingArray5);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) throttlingArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray16);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray21);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray16, (java.lang.Object[]) serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) throttlingArray31);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray26, (java.lang.Object[]) serializableArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray9, (java.lang.Object[]) throttlingArray26);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) throttlingArray40);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray46);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) throttlingArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet52 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray51);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray56);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) throttlingArray56);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray51, (java.lang.Object[]) serializableArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray66 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray66);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray64, (java.lang.Object[]) throttlingArray66);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray61, (java.lang.Object[]) serializableArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray54, (java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray44, (java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) throttlingArray26, (java.lang.Object[]) throttlingArray61);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) throttlingArray61, (java.lang.Object[]) executorServiceArray74);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 2, (double) (short) 1);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) 1, (double) 'a');
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        short[] shortArray3 = new short[] { (byte) -1, (short) 10 };
        short[] shortArray6 = new short[] { (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray6);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 1L, (-1.0d));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 4, (double) (short) -1, (double) (-1L));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 10);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.badapples");
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        java.lang.String str12 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.RuleChain ruleChain13 = null;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain13;
        java.lang.Class<?> wildcardClass15 = kuromojiAnalysisTests0.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests16.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests16.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests16.ensureCheckIndexPassed();
        java.lang.String str30 = kuromojiAnalysisTests16.getTestName();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader32, (int) (short) 100, postingsEnum34, postingsEnum35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) postingsEnum35);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests2.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests11.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, false);
        kuromojiAnalysisTests11.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests11.assertTermsEquals("hi!", indexReader21, terms22, terms23, true);
        kuromojiAnalysisTests11.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests11.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests11.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests11);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        short[] shortArray2 = new short[] { (short) 10 };
        short[] shortArray8 = new short[] { (byte) 0, (short) 10, (short) -1, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray2, shortArray8);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 100.0f, 0.0f, (float) (byte) 1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain29;
        kuromojiAnalysisTests1.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.tearDown();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests32.assertTermsEquals("tests.failfast", indexReader35, terms36, terms37, false);
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests32.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests44.tearDown();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        kuromojiAnalysisTests44.assertTermsEquals("tests.failfast", indexReader47, terms48, terms49, false);
        kuromojiAnalysisTests44.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests44.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests44.setIndexWriterMaxDocs((int) (byte) 100);
        kuromojiAnalysisTests44.ensureCheckIndexPassed();
        kuromojiAnalysisTests44.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain60 = kuromojiAnalysisTests44.failureAndSuccessEvents;
        kuromojiAnalysisTests32.failureAndSuccessEvents = ruleChain60;
        org.junit.rules.TestRule testRule62 = kuromojiAnalysisTests32.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        kuromojiAnalysisTests32.assertDocsEnumEquals("<unknown>", postingsEnum64, postingsEnum65, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests2.ruleChain;
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) ruleChain14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests16.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        java.lang.Object obj29 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain28, obj29);
        org.junit.rules.RuleChain ruleChain31 = ruleChain14.around((org.junit.rules.TestRule) ruleChain28);
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain33);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests35.ruleChain;
        org.junit.rules.RuleChain ruleChain37 = ruleChain34.around(testRule36);
        org.junit.rules.RuleChain ruleChain38 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain37);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy41 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.rules.TestRule testRule42 = null;
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule(testRule42);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.junit.rules.TestRule testRule45 = null;
        org.junit.rules.RuleChain ruleChain46 = org.junit.rules.RuleChain.outerRule(testRule45);
        org.junit.rules.RuleChain ruleChain47 = ruleChain43.around((org.junit.rules.TestRule) ruleChain46);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy41, (java.lang.Object) ruleChain47);
        org.junit.rules.RuleChain ruleChain49 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain50 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain49);
        org.junit.rules.RuleChain ruleChain51 = ruleChain47.around((org.junit.rules.TestRule) ruleChain49);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) "tests.badapples", (java.lang.Object) ruleChain47);
        org.junit.rules.RuleChain ruleChain53 = ruleChain38.around((org.junit.rules.TestRule) ruleChain47);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests55.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests55, (java.lang.Object) "");
        org.junit.rules.TestRule testRule60 = null;
        org.junit.rules.RuleChain ruleChain61 = org.junit.rules.RuleChain.outerRule(testRule60);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain61;
        org.junit.rules.TestRule testRule63 = null;
        org.junit.rules.RuleChain ruleChain64 = org.junit.rules.RuleChain.outerRule(testRule63);
        org.junit.rules.RuleChain ruleChain65 = ruleChain61.around((org.junit.rules.TestRule) ruleChain64);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain65;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain65);
        kuromojiAnalysisTests55.failureAndSuccessEvents = ruleChain65;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) ruleChain47, (java.lang.Object) kuromojiAnalysisTests55);
        kuromojiAnalysisTests55.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) ruleChain31, (java.lang.Object) kuromojiAnalysisTests55);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        double[] doubleArray2 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray5 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray8 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray11 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        double[] doubleArray15 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray18 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray21 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray24 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray25 = new double[][] { doubleArray15, doubleArray18, doubleArray21, doubleArray24 };
        double[] doubleArray28 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray31 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray34 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray37 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray38 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37 };
        double[] doubleArray41 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray44 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray47 = new double[] { (short) 100, (short) 100 };
        double[] doubleArray50 = new double[] { (short) 100, (short) 100 };
        double[][] doubleArray51 = new double[][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        double[][][] doubleArray52 = new double[][][] { doubleArray12, doubleArray25, doubleArray38, doubleArray51 };
        java.util.Set<double[][]> doubleArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray52);
        java.util.Set<java.io.Serializable[]> serializableArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[][]) doubleArray52);
        org.junit.rules.RuleChain[][] ruleChainArray55 = new org.junit.rules.RuleChain[][] {};
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet56 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray52, (java.lang.Object[]) ruleChainArray55);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) '#', (float) (short) 10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '#', (long) (byte) 100);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        float[] floatArray7 = new float[] { (short) 10, (-1.0f), 'a', 1, 100.0f };
        float[] floatArray13 = new float[] { 10, (-1.0f), 0L, (-1.0f), 0 };
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray13, (float) (byte) 100);
        float[] floatArray19 = new float[] { 100, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray13, floatArray19, (float) 1L);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        org.junit.rules.RuleChain ruleChain0 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain0);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain0;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        org.junit.rules.TestRule testRule5 = null;
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.outerRule(testRule5);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain6;
        org.junit.rules.TestRule testRule8 = null;
        org.junit.rules.RuleChain ruleChain9 = org.junit.rules.RuleChain.outerRule(testRule8);
        org.junit.rules.RuleChain ruleChain10 = ruleChain6.around((org.junit.rules.TestRule) ruleChain9);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain6;
        kuromojiAnalysisTests3.failureAndSuccessEvents = ruleChain6;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement22 = null;
        org.junit.runner.Description description23 = null;
        org.junit.runners.model.Statement statement24 = ruleChain21.apply(statement22, description23);
        org.junit.rules.RuleChain ruleChain25 = ruleChain6.around((org.junit.rules.TestRule) ruleChain21);
        org.junit.rules.TestRule testRule28 = null;
        org.junit.rules.RuleChain ruleChain29 = org.junit.rules.RuleChain.outerRule(testRule28);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        org.junit.rules.TestRule testRule31 = null;
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.outerRule(testRule31);
        org.junit.rules.RuleChain ruleChain33 = ruleChain29.around((org.junit.rules.TestRule) ruleChain32);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain32);
        org.junit.rules.TestRule testRule35 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain36 = ruleChain32.around(testRule35);
        org.junit.rules.RuleChain ruleChain37 = ruleChain25.around((org.junit.rules.TestRule) ruleChain32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain0, (java.lang.Object) ruleChain25);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) throttlingArray7);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) serializableArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 'a', (float) 100, (float) 2);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) -1, (double) 1.0f, (double) (byte) -1);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) (byte) 1, (double) (-1.0f));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) 10L, 1.0d, (double) 100);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) '4');
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) throttlingArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) throttlingArray15);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray10, (java.lang.Object[]) serializableArray13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray23, (java.lang.Object[]) throttlingArray25);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) serializableArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray13, (java.lang.Object[]) throttlingArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray13);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) throttlingArray35);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) throttlingArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray39);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray48);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray46, (java.lang.Object[]) throttlingArray48);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray52, (java.lang.Object[]) throttlingArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray46, (java.lang.Object[]) serializableArray52);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray59);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray64);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray62, (java.lang.Object[]) throttlingArray64);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray59, (java.lang.Object[]) serializableArray62);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray69 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray69);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray74 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray74);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray72, (java.lang.Object[]) throttlingArray74);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray69, (java.lang.Object[]) serializableArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray62, (java.lang.Object[]) throttlingArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray52, (java.lang.Object[]) throttlingArray69);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray52);
        java.io.Serializable[] serializableArray83 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet84 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray83);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray85 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray85);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray83, (java.lang.Object[]) throttlingArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray52, (java.lang.Object[]) throttlingArray85);
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray52, (java.lang.Object[]) executorServiceArray89);
        boolean boolean92 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        java.lang.Object[] objArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray89, objArray94);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (-1), 1.0d, (double) 4);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.slow", "tests.weekly" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests6.assertTermsEquals("tests.failfast", indexReader9, terms10, terms11, false);
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests6.setIndexWriterMaxDocs((-1));
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) strSet5, (java.lang.Object) kuromojiAnalysisTests6);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests21.assertTermsEquals("tests.failfast", indexReader24, terms25, terms26, false);
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests21.assertTermsEquals("hi!", indexReader31, terms32, terms33, true);
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests21.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests21.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests40.tearDown();
        kuromojiAnalysisTests40.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests21, (java.lang.Object) kuromojiAnalysisTests40);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests40.assertDocsSkippingEquals("tests.nightly", indexReader46, (int) (short) 100, postingsEnum48, postingsEnum49, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests53.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests53, (java.lang.Object) "");
        java.lang.String str57 = kuromojiAnalysisTests53.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests40, (java.lang.Object) str57);
        kuromojiAnalysisTests40.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests40.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) kuromojiAnalysisTests6, (java.lang.Object) kuromojiAnalysisTests40);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.nightly", indexReader13, fields14, fields15, false);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) throttlingArray21);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) throttlingArray37);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) serializableArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray47);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) throttlingArray47);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray42, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray35, (java.lang.Object[]) throttlingArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray42);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader13, (java.lang.Object) serializableArray25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests54.tearDown();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        kuromojiAnalysisTests54.assertTermsEquals("tests.failfast", indexReader57, terms58, terms59, false);
        kuromojiAnalysisTests54.assertPathHasBeenCleared("tests.nightly");
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        kuromojiAnalysisTests54.assertDocsEnumEquals("random", postingsEnum65, postingsEnum66, true);
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        kuromojiAnalysisTests54.assertDocsEnumEquals("tests.maxfailures", postingsEnum70, postingsEnum71, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) indexReader13, (java.lang.Object) false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests4.assertTermsEquals("tests.failfast", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests4.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain12, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain12);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 0);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) throttlingArray28);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) serializableArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) throttlingArray38);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray33, (java.lang.Object[]) serializableArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray26, (java.lang.Object[]) throttlingArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) throttlingArray49);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray44, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray33, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertNotEquals((java.lang.Object) 0.0f, (java.lang.Object) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) executorServiceArray20);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        org.junit.rules.RuleChain ruleChain5 = ruleChain2.around(testRule4);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain2;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests7.assertTermsEquals("tests.failfast", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests7.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests7.ensureCleanedUp();
        kuromojiAnalysisTests7.resetCheckIndexStatus();
        java.lang.String str18 = kuromojiAnalysisTests7.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) ruleChain2, (java.lang.Object) str18);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain7 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule8);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray1, byteArray5);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 3, (float) ' ', (float) 1L);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, 0.0d, (double) (short) 1);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        int[] intArray1 = new int[] {};
        int[] intArray7 = new int[] { (short) 10, '#', (byte) 10, 3, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray7);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) -1, (double) (byte) 0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) (short) -1);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (short) 1);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) (short) 0, (double) 10);
    }
}

