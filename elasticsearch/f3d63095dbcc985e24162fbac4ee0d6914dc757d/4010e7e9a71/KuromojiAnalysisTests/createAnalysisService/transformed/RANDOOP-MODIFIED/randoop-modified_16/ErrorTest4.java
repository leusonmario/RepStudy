import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2001");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, 0.0d, (double) 3);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain5 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule7 = kuromojiAnalysisTests6.ruleChain;
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests6.failureAndSuccessEvents;
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
        org.junit.rules.TestRule testRule42 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule(testRule42);
        org.junit.rules.RuleChain ruleChain44 = ruleChain21.around(testRule42);
        org.junit.rules.RuleChain ruleChain45 = ruleChain9.around((org.junit.rules.TestRule) ruleChain21);
        org.junit.rules.RuleChain ruleChain46 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule49 = kuromojiAnalysisTests48.ruleChain;
        kuromojiAnalysisTests48.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests48);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        kuromojiAnalysisTests48.assertTermsEquals("random", indexReader53, terms54, terms55, false);
        org.junit.rules.RuleChain ruleChain58 = kuromojiAnalysisTests48.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement59 = null;
        org.junit.runner.Description description60 = null;
        org.junit.runners.model.Statement statement61 = ruleChain58.apply(statement59, description60);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests63 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule64 = kuromojiAnalysisTests63.ruleChain;
        kuromojiAnalysisTests63.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests63);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        kuromojiAnalysisTests63.assertTermsEquals("random", indexReader68, terms69, terms70, false);
        org.junit.rules.RuleChain ruleChain73 = kuromojiAnalysisTests63.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement74 = null;
        org.junit.runner.Description description75 = null;
        org.junit.runners.model.Statement statement76 = ruleChain73.apply(statement74, description75);
        org.junit.runner.Description description77 = null;
        org.junit.runners.model.Statement statement78 = ruleChain58.apply(statement76, description77);
        org.junit.runner.Description description79 = null;
        org.junit.runners.model.Statement statement80 = ruleChain46.apply(statement76, description79);
        org.junit.runner.Description description81 = null;
        org.junit.runners.model.Statement statement82 = ruleChain9.apply(statement80, description81);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) ruleChain5, (java.lang.Object) statement82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain5);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
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
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.maxfailures");
        org.junit.rules.TestRule testRule53 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("", indexReader55, 1, postingsEnum57, postingsEnum58, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests63 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        kuromojiAnalysisTests63.assertTermsEquals("", indexReader65, terms66, terms67, false);
        kuromojiAnalysisTests63.setUp();
        kuromojiAnalysisTests63.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests63.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        kuromojiAnalysisTests63.assertTermsEquals("tests.badapples", indexReader75, terms76, terms77, true);
        org.junit.rules.TestRule testRule80 = kuromojiAnalysisTests63.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule80);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, (-1.0f), (float) (byte) 10);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 100.0f, 1.0f, (-1.0f));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, 0.0d, (double) 100L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 0L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) serializableArray70);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray70);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray85 = new java.util.concurrent.ExecutorService[][] { executorServiceArray80, executorServiceArray81, executorServiceArray82, executorServiceArray83, executorServiceArray84 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet86 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray85);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 1L, (long) (short) 100);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 10L, (double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
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
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests24.assertTermsEquals("tests.failfast", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests24.assertTermsEquals("", indexReader33, terms34, terms35, false);
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests24.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests22, (java.lang.Object) kuromojiAnalysisTests24);
        kuromojiAnalysisTests22.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.junit.rules.TestRule testRule42 = kuromojiAnalysisTests22.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) testRule21, (java.lang.Object) testRule42);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, 0.0d, (double) 10L);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (short) 10);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
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
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.weekly", indexReader19, (int) (byte) 10, postingsEnum21, postingsEnum22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("", indexReader26, fields27, fields28, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertPathHasBeenCleared("");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests3.assertFieldsEquals("enwiki.random.lines.txt", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests3.assertDocsEnumEquals("tests.monster", postingsEnum12, postingsEnum13, true);
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        kuromojiAnalysisTests3.ensureCleanedUp();
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) executorServiceArray24);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray40);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
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
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader19, 4, postingsEnum21, postingsEnum22);
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("hi!", indexReader27, 10, postingsEnum29, postingsEnum30, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", obj1, (java.lang.Object) 10);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        char[] charArray1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests3.assertTermsEquals("", indexReader5, terms6, terms7, false);
        kuromojiAnalysisTests3.setUp();
        kuromojiAnalysisTests3.ensureAllSearchContextsReleased();
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray15, charArray18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray22, charArray25);
        org.junit.Assert.assertArrayEquals("random", charArray15, charArray22);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray22, charArray30);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) charArray22);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray36, charArray39);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray45, charArray48);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals(charArray52, charArray55);
        org.junit.Assert.assertArrayEquals("random", charArray45, charArray52);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray52, charArray60);
        org.junit.Assert.assertArrayEquals(charArray39, charArray60);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals(charArray67, charArray70);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals(charArray74, charArray77);
        org.junit.Assert.assertArrayEquals("random", charArray67, charArray74);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray74, charArray82);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray60, charArray82);
        org.junit.Assert.assertArrayEquals(charArray22, charArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray1, charArray60);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0f, (float) 3, (float) 1L);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (-1));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 0.0f);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 3, (float) ' ', (float) (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 3);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.nightly", postingsEnum7, postingsEnum8, true);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) ruleChain11);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.awaitsfix", obj1);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
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
        kuromojiAnalysisTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader13, terms14, terms15, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.tearDown();
        java.lang.String str21 = kuromojiAnalysisTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str21);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 5, 0.0d, (double) 10);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 2);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
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
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule48 = kuromojiAnalysisTests47.ruleChain;
        org.junit.rules.RuleChain ruleChain49 = org.junit.rules.RuleChain.outerRule(testRule48);
        org.junit.rules.RuleChain ruleChain50 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain49);
        org.junit.rules.RuleChain ruleChain51 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain49);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 3, 100.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) '4', (double) (byte) 10);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
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
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", 10, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        java.lang.String str2 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(3);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", (int) (byte) 0, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
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
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray29, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray33, intArray34);
        org.junit.Assert.assertArrayEquals(intArray30, intArray33);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray30, (java.lang.Object) 100.0d);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray30, intArray40);
        org.junit.Assert.assertArrayEquals("random", intArray17, intArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray4, intArray17);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray47, intArray48);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray54, intArray55);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray58, intArray59);
        org.junit.Assert.assertArrayEquals(intArray55, intArray58);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray55, (java.lang.Object) 100.0d);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray67, intArray68);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray71, intArray72);
        org.junit.Assert.assertArrayEquals(intArray68, intArray71);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray68, (java.lang.Object) 100.0d);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray78, intArray79);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray68, intArray78);
        org.junit.Assert.assertArrayEquals("random", intArray55, intArray68);
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray83);
        int[] intArray86 = new int[] {};
        int[] intArray87 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray86, intArray87);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray68, intArray87);
        org.junit.Assert.assertArrayEquals(intArray48, intArray68);
        int[] intArray92 = new int[] {};
        int[] intArray93 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray92, intArray93);
        org.junit.Assert.assertArrayEquals(intArray68, intArray92);
        org.junit.Assert.assertArrayEquals(intArray4, intArray68);
        int[] intArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray68, intArray97);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 1L);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 4, (double) (short) -1);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        long[] longArray1 = new long[] { (byte) 0 };
        long[] longArray3 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
        long[] longArray6 = new long[] { (byte) 0 };
        long[] longArray8 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
        long[] longArray11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray8, longArray11);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
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
        org.junit.rules.RuleChain ruleChain44 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain43);
        org.junit.rules.RuleChain ruleChain45 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) ruleChain43);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("random", indexReader20, fields21, fields22, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests25.ruleChain;
        kuromojiAnalysisTests25.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests30.ruleChain;
        kuromojiAnalysisTests30.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests30);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests30.assertTermsEquals("random", indexReader35, terms36, terms37, false);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests30.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement41 = null;
        org.junit.runner.Description description42 = null;
        org.junit.runners.model.Statement statement43 = ruleChain40.apply(statement41, description42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule46 = kuromojiAnalysisTests45.ruleChain;
        kuromojiAnalysisTests45.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests45);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        kuromojiAnalysisTests45.assertTermsEquals("random", indexReader50, terms51, terms52, false);
        org.junit.rules.RuleChain ruleChain55 = kuromojiAnalysisTests45.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement56 = null;
        org.junit.runner.Description description57 = null;
        org.junit.runners.model.Statement statement58 = ruleChain55.apply(statement56, description57);
        org.junit.runner.Description description59 = null;
        org.junit.runners.model.Statement statement60 = ruleChain40.apply(statement58, description59);
        org.junit.rules.TestRule testRule61 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain62 = org.junit.rules.RuleChain.outerRule(testRule61);
        org.junit.rules.RuleChain ruleChain63 = ruleChain40.around(testRule61);
        org.junit.rules.RuleChain ruleChain64 = ruleChain28.around((org.junit.rules.TestRule) ruleChain40);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain28;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests66 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests66.tearDown();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        kuromojiAnalysisTests66.assertFieldsEquals("enwiki.random.lines.txt", indexReader69, fields70, fields71, true);
        kuromojiAnalysisTests66.setUp();
        kuromojiAnalysisTests66.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        org.apache.lucene.index.Fields fields80 = null;
        kuromojiAnalysisTests66.assertFieldsEquals("enwiki.random.lines.txt", indexReader78, fields79, fields80, false);
        org.junit.rules.TestRule testRule83 = kuromojiAnalysisTests66.ruleChain;
        java.lang.String str84 = kuromojiAnalysisTests66.getTestName();
        org.junit.rules.RuleChain ruleChain85 = kuromojiAnalysisTests66.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain86 = ruleChain28.around((org.junit.rules.TestRule) ruleChain85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) "random", (java.lang.Object) ruleChain28);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 2, (double) 100, 10.0d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader6, 100, postingsEnum8, postingsEnum9);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.slow", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 100, (long) '#');
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (-1.0d), (double) (short) 0, (double) 10L);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10.0f, (double) 10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 5, (double) 1.0f);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        char[] charArray0 = null;
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray18, charArray21);
        org.junit.Assert.assertArrayEquals("random", charArray11, charArray18);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray18, charArray26);
        org.junit.Assert.assertArrayEquals(charArray5, charArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray26);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0.0f, (double) (-1L));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), 100.0d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader13, 3, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray14, byteArray18);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray24, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray24);
        org.junit.Assert.assertArrayEquals("", byteArray11, byteArray18);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray36, byteArray37);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray36, byteArray40);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray46, byteArray47);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray50, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray46, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray46);
        org.junit.Assert.assertArrayEquals("hi!", byteArray8, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray8);
        byte[] byteArray58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray58);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
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
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests16.assertTermsEquals("", indexReader18, terms19, terms20, false);
        kuromojiAnalysisTests16.setUp();
        kuromojiAnalysisTests16.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests16.ruleChain;
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests16, (java.lang.Object) locale27);
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale14, locale27 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableIterableArray7, (java.lang.Object[]) localeArray29);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
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
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests44.ruleChain;
        kuromojiAnalysisTests44.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests44);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        kuromojiAnalysisTests44.assertTermsEquals("random", indexReader49, terms50, terms51, false);
        org.junit.rules.RuleChain ruleChain54 = kuromojiAnalysisTests44.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement55 = null;
        org.junit.runner.Description description56 = null;
        org.junit.runners.model.Statement statement57 = ruleChain54.apply(statement55, description56);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests59 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule60 = kuromojiAnalysisTests59.ruleChain;
        kuromojiAnalysisTests59.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests59);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        kuromojiAnalysisTests59.assertTermsEquals("random", indexReader64, terms65, terms66, false);
        org.junit.rules.RuleChain ruleChain69 = kuromojiAnalysisTests59.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement70 = null;
        org.junit.runner.Description description71 = null;
        org.junit.runners.model.Statement statement72 = ruleChain69.apply(statement70, description71);
        org.junit.runner.Description description73 = null;
        org.junit.runners.model.Statement statement74 = ruleChain54.apply(statement72, description73);
        org.junit.rules.TestRule testRule75 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain76 = org.junit.rules.RuleChain.outerRule(testRule75);
        org.junit.rules.RuleChain ruleChain77 = ruleChain54.around(testRule75);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain77;
        org.junit.rules.TestRule testRule79 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain80 = org.junit.rules.RuleChain.outerRule(testRule79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule79);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader17, 4, postingsEnum19, postingsEnum20);
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray27, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray31);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray27, shortArray40);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray51);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray56, shortArray57);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray60);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray47, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray60);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray68, shortArray69);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray72);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray78, shortArray79);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray82, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray82);
        short[] shortArray87 = new short[] {};
        short[] shortArray88 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray87, shortArray88);
        short[] shortArray91 = new short[] {};
        short[] shortArray92 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray91, shortArray92);
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray91);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray78, shortArray91);
        org.junit.Assert.assertArrayEquals("", shortArray72, shortArray78);
        org.junit.Assert.assertArrayEquals("hi!", shortArray40, shortArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "hi!");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum6, postingsEnum7, true);
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 100, 0.0d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
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
        java.lang.String str16 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.failfast");
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("hi!", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 10.0f, (-1.0d));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
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
        long[] longArray27 = new long[] { (byte) 0 };
        long[] longArray29 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray27, longArray29);
        long[] longArray32 = new long[] { (byte) 0 };
        long[] longArray34 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray32, longArray34);
        org.junit.Assert.assertArrayEquals(longArray27, longArray34);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray16, longArray27);
        org.junit.Assert.assertArrayEquals(longArray4, longArray27);
        long[] longArray41 = new long[] { (byte) 0 };
        long[] longArray43 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray41, longArray43);
        long[] longArray46 = new long[] { (byte) 0 };
        long[] longArray48 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray46, longArray48);
        org.junit.Assert.assertArrayEquals("", longArray41, longArray48);
        long[] longArray53 = new long[] { (byte) 0 };
        long[] longArray55 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray53, longArray55);
        long[] longArray58 = new long[] { (byte) 0 };
        long[] longArray60 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray58, longArray60);
        org.junit.Assert.assertArrayEquals(longArray53, longArray60);
        long[] longArray64 = new long[] { (byte) 0 };
        long[] longArray66 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray64, longArray66);
        long[] longArray69 = new long[] { (byte) 0 };
        long[] longArray71 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray69, longArray71);
        org.junit.Assert.assertArrayEquals(longArray64, longArray71);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray53, longArray64);
        org.junit.Assert.assertArrayEquals(longArray48, longArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray27, longArray53);
        long[] longArray77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray53, longArray77);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
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
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
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
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray48);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) serializableArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) executorServiceArray56);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule62 = kuromojiAnalysisTests61.ruleChain;
        kuromojiAnalysisTests61.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests61.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests61, (java.lang.Object) (-1));
        kuromojiAnalysisTests61.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests61.assertDocsSkippingEquals("hi!", indexReader69, (int) '4', postingsEnum71, postingsEnum72, false);
        kuromojiAnalysisTests61.ensureCleanedUp();
        org.junit.rules.TestRule testRule76 = kuromojiAnalysisTests61.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray56, (java.lang.Object) kuromojiAnalysisTests61);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) '4', (long) (-1));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) serializableIterableArray90);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 'a', (double) 3, (double) 0L);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (short) 1, (float) 5, 0.0f);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.rules.RuleChain ruleChain6 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("", indexReader8, fields9, fields10, true);
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.monster", indexReader15, (int) ' ', postingsEnum17, postingsEnum18);
        org.junit.rules.RuleChain ruleChain20 = null;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain20;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray3, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray8, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray13, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray13, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray8, shortArray13);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray33, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray33);
        org.junit.Assert.assertArrayEquals("hi!", shortArray3, shortArray13);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray46, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray50);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray55, shortArray56);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray46, shortArray59);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray66, shortArray67);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray70, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray70);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray75, shortArray76);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray79, shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray79);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray66, shortArray79);
        org.junit.Assert.assertArrayEquals("", shortArray59, shortArray79);
        org.junit.Assert.assertArrayEquals("random", shortArray3, shortArray79);
        short[] shortArray86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray86);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
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
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.monster", indexReader16, 10, postingsEnum18, postingsEnum19, true);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray8, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray16, byteArray20);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray26, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray26, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray26);
        org.junit.Assert.assertArrayEquals("", byteArray13, byteArray20);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray38, byteArray39);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray38, byteArray42);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray48, byteArray49);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray52, byteArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray48, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray48);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray60, byteArray61);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray64, byteArray65);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray60, byteArray64);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray70, byteArray71);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray74, byteArray75);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray70, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray70);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray48, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray48);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray8);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray8);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
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
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray48, (float) 5);
        float[] floatArray55 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray55, (float) 2);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
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
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.lang.String str22 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests28.ruleChain;
        kuromojiAnalysisTests28.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests28);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests28.assertTermsEquals("random", indexReader33, terms34, terms35, false);
        kuromojiAnalysisTests28.ensureCheckIndexPassed();
        kuromojiAnalysisTests28.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests28.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule41 = kuromojiAnalysisTests28.ruleChain;
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.outerRule(testRule41);
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain42);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.index.NumericDocValues numericDocValues48 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", 3, numericDocValues48, numericDocValues49);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, 0L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray3, longArray10);
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
        org.junit.Assert.assertArrayEquals(longArray10, longArray26);
        long[] longArray40 = new long[] { (byte) 0 };
        long[] longArray42 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray40, longArray42);
        long[] longArray45 = new long[] { (byte) 0 };
        long[] longArray47 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray45, longArray47);
        org.junit.Assert.assertArrayEquals("", longArray40, longArray47);
        long[] longArray52 = new long[] { (byte) 0 };
        long[] longArray54 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray52, longArray54);
        long[] longArray57 = new long[] { (byte) 0 };
        long[] longArray59 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray57, longArray59);
        org.junit.Assert.assertArrayEquals(longArray52, longArray59);
        long[] longArray63 = new long[] { (byte) 0 };
        long[] longArray65 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray63, longArray65);
        long[] longArray68 = new long[] { (byte) 0 };
        long[] longArray70 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray68, longArray70);
        org.junit.Assert.assertArrayEquals(longArray63, longArray70);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray52, longArray63);
        org.junit.Assert.assertArrayEquals(longArray47, longArray52);
        org.junit.Assert.assertArrayEquals("", longArray26, longArray47);
        long[] longArray77 = new long[] { (byte) 0 };
        long[] longArray79 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray77, longArray79);
        org.junit.Assert.assertArrayEquals("random", longArray47, longArray77);
        long[] longArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray77, longArray82);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (short) 10);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 0L, (double) 10.0f);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '4');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) (short) 10);
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray12, (double) 10L);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) '4');
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray20, (double) (byte) -1);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray25, (double) 2);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray2, doubleArray25, 10.0d);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) '4');
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) '4');
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray44, (double) (short) 10);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) '4');
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray54, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray44, doubleArray49, (double) 4);
        org.junit.Assert.assertArrayEquals("random", doubleArray35, doubleArray49, (double) 0.0f);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray49, (double) 1);
        double[] doubleArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray49, doubleArray65, (double) 0L);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) 100, (float) (byte) 100);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
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
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 0);
        kuromojiAnalysisTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
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
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("<unknown>", postingsEnum43, postingsEnum44, true);
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum48, postingsEnum49);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, (double) 4, (double) 10L);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        char[] charArray1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests4.assertTermsEquals("tests.failfast", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests4.assertDocsSkippingEquals("tests.nightly", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests4.assertDocsSkippingEquals("random", indexReader20, (int) ' ', postingsEnum22, postingsEnum23, true);
        kuromojiAnalysisTests4.setUp();
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray30, charArray33);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray37, charArray40);
        org.junit.Assert.assertArrayEquals("random", charArray30, charArray37);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray37, charArray45);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) kuromojiAnalysisTests4, (java.lang.Object) charArray37);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals(charArray51, charArray54);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray58, charArray61);
        org.junit.Assert.assertArrayEquals("random", charArray51, charArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray37, charArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray51);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
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
        java.lang.Class<?> wildcardClass14 = kuromojiAnalysisTests2.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
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
        org.junit.rules.RuleChain ruleChain19 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("random", indexReader27, 10, postingsEnum29, postingsEnum30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader27);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (-1.0d));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests18.assertTermsEquals("tests.failfast", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests18.assertDocsSkippingEquals("tests.nightly", indexReader27, (int) (byte) -1, postingsEnum29, postingsEnum30, false);
        org.junit.rules.RuleChain ruleChain33 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule34 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule34;
        org.junit.rules.RuleChain ruleChain36 = ruleChain33.around(testRule34);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain33;
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.setUp();
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray45, byteArray49);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray55, byteArray56);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray55, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray55);
        org.junit.Assert.assertArrayEquals("", byteArray42, byteArray49);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray67, byteArray68);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray71, byteArray72);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray67, byteArray71);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray77, byteArray78);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray81, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray77, byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray77);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) byteArray77);
        java.lang.Object obj88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) byteArray77, obj88);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
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
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests39.ruleChain;
        org.junit.rules.RuleChain ruleChain41 = org.junit.rules.RuleChain.outerRule(testRule40);
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain41);
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain41);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 2, (float) (-1), (float) (byte) 1);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) 10, (float) (byte) -1, (float) 2);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
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
        java.lang.String str19 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule21 = null;
        org.junit.rules.RuleChain ruleChain22 = ruleChain20.around(testRule21);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray26, byteArray27);
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
        org.junit.Assert.assertArrayEquals("", byteArray26, byteArray35);
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
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        kuromojiAnalysisTests51.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader67, (int) (short) -1, postingsEnum69, postingsEnum70);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests73 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule74 = kuromojiAnalysisTests73.ruleChain;
        kuromojiAnalysisTests73.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests73);
        org.junit.rules.RuleChain ruleChain77 = kuromojiAnalysisTests73.failureAndSuccessEvents;
        kuromojiAnalysisTests51.failureAndSuccessEvents = ruleChain77;
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        kuromojiAnalysisTests51.assertDocsSkippingEquals("tests.badapples", indexReader80, 0, postingsEnum82, postingsEnum83, true);
        kuromojiAnalysisTests51.ensureCheckIndexPassed();
        kuromojiAnalysisTests51.ensureCheckIndexPassed();
        kuromojiAnalysisTests51.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests51.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) byteArray35, (java.lang.Object) kuromojiAnalysisTests51);
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        kuromojiAnalysisTests51.assertDocsEnumEquals("hi!", postingsEnum92, postingsEnum93, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) testRule21, (java.lang.Object) "hi!");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 5, (double) 0L);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("hi!", (int) (short) 10, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 'a', 1.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 1, (long) 1);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
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
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.rules.TestRule testRule38 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) throttling2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) throttling5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests8.assertTermsEquals("tests.failfast", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests8.assertDocsSkippingEquals("tests.nightly", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20, false);
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests8.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule24 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule24;
        org.junit.rules.RuleChain ruleChain26 = ruleChain23.around(testRule24);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain23;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling7, (java.lang.Object) ruleChain23);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests30.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests30, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling5, throttling7, throttling34 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray36 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray37 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList39 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, throttlingArray38);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) serializableArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) serializableArray49);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray38, (java.lang.Object[]) serializableArray49);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) 10, (double) 5, (double) 10L);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray7);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests12.ruleChain;
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests12);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("enwiki.random.lines.txt", indexReader22, fields23, fields24, true);
        kuromojiAnalysisTests19.setUp();
        kuromojiAnalysisTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests19.assertPositionsSkippingEquals("tests.slow", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33);
        org.junit.rules.TestRule testRule35 = null;
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.outerRule(testRule35);
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain36);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests39.ruleChain;
        kuromojiAnalysisTests39.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests39);
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.junit.rules.RuleChain ruleChain45 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain43);
        org.junit.rules.RuleChain ruleChain46 = ruleChain37.around((org.junit.rules.TestRule) ruleChain45);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        org.junit.Assert.assertNotEquals((java.lang.Object) postingsEnum32, (java.lang.Object) ruleChain46);
        org.junit.rules.RuleChain ruleChain49 = ruleChain16.around((org.junit.rules.TestRule) ruleChain46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) serializableArray7, (java.lang.Object) ruleChain46);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) ' ', 100L);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 1);
        kuromojiAnalysisTests0.tearDown();
        org.junit.rules.TestRule testRule7 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray14, intArray15);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray18, intArray19);
        org.junit.Assert.assertArrayEquals(intArray15, intArray18);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray15, (java.lang.Object) 100.0d);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray27, intArray28);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals(intArray28, intArray31);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray28, (java.lang.Object) 100.0d);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray38, intArray39);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray28, intArray38);
        org.junit.Assert.assertArrayEquals("random", intArray15, intArray28);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray45, intArray46);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray49, intArray50);
        org.junit.Assert.assertArrayEquals(intArray46, intArray49);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray46, (java.lang.Object) 100.0d);
        org.junit.Assert.assertArrayEquals(intArray28, intArray46);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray57, intArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray28, intArray57);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests61.tearDown();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        kuromojiAnalysisTests61.assertTermsEquals("tests.failfast", indexReader64, terms65, terms66, false);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        kuromojiAnalysisTests61.assertDocsSkippingEquals("tests.nightly", indexReader70, (int) (byte) -1, postingsEnum72, postingsEnum73, false);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        kuromojiAnalysisTests61.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader77, (int) (short) -1, postingsEnum79, postingsEnum80);
        java.lang.String str82 = kuromojiAnalysisTests61.getTestName();
        kuromojiAnalysisTests61.setUp();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) intArray57, (java.lang.Object) kuromojiAnalysisTests61);
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Fields fields87 = null;
        org.apache.lucene.index.Fields fields88 = null;
        kuromojiAnalysisTests61.assertFieldsEquals("tests.weekly", indexReader86, fields87, fields88, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) fields88);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
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
        java.util.Set<java.util.Collection<java.io.Serializable>> serializableCollectionSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.io.Serializable>[]) serializableSetArray13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures29);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures31);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures33);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray35 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures27, testRuleIgnoreAfterMaxFailures29, testRuleIgnoreAfterMaxFailures31, testRuleIgnoreAfterMaxFailures34 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet36 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray35);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet37 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray35);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet38 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) serializableSetArray13, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray35);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (-1), (double) '4');
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 'a', 0.0d, (double) ' ');
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
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
        org.junit.Assert.assertArrayEquals(intArray18, intArray63);
        int[] intArray81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray18, intArray81);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
        int[] intArray1 = null;
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (short) -1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests24.ruleChain;
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests24);
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests24.failureAndSuccessEvents;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.badapples", indexReader31, 0, postingsEnum33, postingsEnum34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader38, terms39, terms40, false);
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain44 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain45 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain44);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray47, intArray48);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray54, intArray55);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray58, intArray59);
        org.junit.Assert.assertArrayEquals(intArray55, intArray58);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray55, (java.lang.Object) 100.0d);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray67, intArray68);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray71, intArray72);
        org.junit.Assert.assertArrayEquals(intArray68, intArray71);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray68, (java.lang.Object) 100.0d);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray78, intArray79);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray68, intArray78);
        org.junit.Assert.assertArrayEquals("random", intArray55, intArray68);
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray83);
        int[] intArray86 = new int[] {};
        int[] intArray87 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray86, intArray87);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray68, intArray87);
        org.junit.Assert.assertArrayEquals(intArray48, intArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain45, (java.lang.Object) intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray48);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray14);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) serializableArray6);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
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
        kuromojiAnalysisTests0.assertDocsSkippingEquals("random", indexReader16, (int) ' ', postingsEnum18, postingsEnum19, true);
        kuromojiAnalysisTests0.tearDown();
        java.lang.Class<?> wildcardClass23 = kuromojiAnalysisTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass23, (java.lang.Object) 5);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 5, (long) 100);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 2, (long) 3);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 10, (double) 4, 1.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (byte) -1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2113");
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
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.slow", indexReader43, (int) '4', postingsEnum45, postingsEnum46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.tearDown();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        kuromojiAnalysisTests48.assertFieldsEquals("enwiki.random.lines.txt", indexReader51, fields52, fields53, true);
        kuromojiAnalysisTests48.resetCheckIndexStatus();
        kuromojiAnalysisTests48.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests59 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests59.tearDown();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        kuromojiAnalysisTests59.assertTermsEquals("tests.failfast", indexReader62, terms63, terms64, false);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        kuromojiAnalysisTests59.assertDocsSkippingEquals("tests.nightly", indexReader68, (int) (byte) -1, postingsEnum70, postingsEnum71, false);
        org.junit.rules.RuleChain ruleChain74 = kuromojiAnalysisTests59.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures75 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures76 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures75);
        org.junit.rules.RuleChain ruleChain77 = ruleChain74.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures76);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling79 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray80 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling79 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet81 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray80);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList82 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray80);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling83 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray84 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling83 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet85 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray80, (java.lang.Object[]) throttlingArray84);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain74, (java.lang.Object) throttlingArray84);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain74);
        kuromojiAnalysisTests48.failureAndSuccessEvents = ruleChain74;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain74;
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader93 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum95 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum96 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader93, (int) 'a', postingsEnum95, postingsEnum96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertPathHasBeenCleared("");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) '4', 10.0f);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 1, (long) 3);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (-1), (double) 4);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), 100.0d, (double) ' ');
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) (short) 100, 1.0f);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) 2, (float) 3);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) 100, (float) 10L);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2121");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.badapples", indexReader7, (int) ' ', postingsEnum9, postingsEnum10);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("<unknown>");
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum16, postingsEnum17, true);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum17, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2122");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 100, (float) (short) 0, (float) 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2123");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader6, 100, postingsEnum8, postingsEnum9);
        java.lang.String str11 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader13, (int) (short) 1, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests24.ruleChain;
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests24);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("tests.weekly", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests34.tearDown();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests34.assertTermsEquals("tests.failfast", indexReader37, terms38, terms39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests34.assertDocsSkippingEquals("tests.nightly", indexReader43, (int) (byte) -1, postingsEnum45, postingsEnum46, false);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests34.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader50, (int) (short) -1, postingsEnum52, postingsEnum53);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule57 = kuromojiAnalysisTests56.ruleChain;
        kuromojiAnalysisTests56.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests56);
        org.junit.rules.RuleChain ruleChain60 = kuromojiAnalysisTests56.failureAndSuccessEvents;
        kuromojiAnalysisTests34.failureAndSuccessEvents = ruleChain60;
        kuromojiAnalysisTests24.failureAndSuccessEvents = ruleChain60;
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("tests.monster", indexReader64, (int) (byte) 1, postingsEnum66, postingsEnum67);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests69 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule70 = kuromojiAnalysisTests69.ruleChain;
        kuromojiAnalysisTests69.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain72 = kuromojiAnalysisTests69.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) (byte) 1, (java.lang.Object) kuromojiAnalysisTests69);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        kuromojiAnalysisTests69.assertFieldsEquals("tests.failfast", indexReader75, fields76, fields77, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.failfast");
        java.lang.String str81 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues84 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("", (int) '4', numericDocValues84, numericDocValues85);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2124");
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
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 100, postingsEnum31, postingsEnum32);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) '#', numericDocValues37, numericDocValues38);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2125");
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
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2126");
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
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray20, (java.lang.Object[]) serializableArray22);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray22);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray30, (java.lang.Object[]) serializableArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) serializableArray32);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray27);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray38);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray38);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        kuromojiAnalysisTests46.assertTermsEquals("", indexReader48, terms49, terms50, false);
        kuromojiAnalysisTests46.ensureCleanedUp();
        kuromojiAnalysisTests46.ensureCheckIndexPassed();
        kuromojiAnalysisTests46.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests46.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests46.setIndexWriterMaxDocs((int) '4');
        kuromojiAnalysisTests46.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableArray1, (java.lang.Object) kuromojiAnalysisTests46);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2127");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1L), (long) (byte) -1);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2128");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray5 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy2, queryCachingPolicy3, queryCachingPolicy4 };
        java.util.List<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicyList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, queryCachingPolicyArray5);
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
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray43, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) executorServiceArray51);
        org.elasticsearch.test.ESTestCase[][] eSTestCaseArray54 = new org.elasticsearch.test.ESTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray54);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) eSTestCaseArray54);
        org.elasticsearch.test.ESTestCase[][] eSTestCaseArray57 = new org.elasticsearch.test.ESTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet58 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray57);
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet59 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray57);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) eSTestCaseArray54, (java.lang.Object[]) eSTestCaseArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) queryCachingPolicyArray5, (java.lang.Object[]) eSTestCaseArray57);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2129");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray3, longArray10);
        long[] longArray14 = new long[] { (byte) 0 };
        long[] longArray16 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray14, longArray16);
        long[] longArray19 = new long[] { (byte) 0 };
        long[] longArray21 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray19, longArray21);
        org.junit.Assert.assertArrayEquals(longArray14, longArray21);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray14);
        java.lang.Object obj25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) longArray14, obj25);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2130");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule5 = kuromojiAnalysisTests4.ruleChain;
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.outerRule(testRule5);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray2, (java.lang.Object) testRule5);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) serializableArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
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
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) serializableArray62);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray62);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet68 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray67);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray70, (java.lang.Object[]) serializableArray72);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray67, (java.lang.Object[]) serializableArray72);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray67);
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet79 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray78);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray78, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray78);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) serializableArray78);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) serializableArray78);
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2131");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) 0, (float) 3);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 2, (long) (byte) 10);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2133");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader14, terms15, terms16, false);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocValuesEquals("", (int) (byte) 100, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2134");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), 0L);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2135");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 100L, (float) 3, (float) (byte) 10);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2136");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.maxfailures", indexReader16, 10, postingsEnum18, postingsEnum19, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "hi!");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2137");
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
        org.junit.rules.TestRule testRule49 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain50 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain50);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2138");
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
        java.lang.String str42 = kuromojiAnalysisTests0.getTestName();
        java.lang.String str43 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.nightly", indexReader45, terms46, terms47, true);
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum51, postingsEnum52);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2139");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        java.lang.String str11 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests14.ruleChain;
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests14);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("tests.weekly", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22);
        java.lang.String str24 = kuromojiAnalysisTests14.getTestName();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests14.ruleChain;
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.outerRule(testRule25);
        org.junit.rules.RuleChain ruleChain27 = ruleChain12.around((org.junit.rules.TestRule) ruleChain26);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain12;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) ruleChain12);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2140");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray3);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray7, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray20);
        short[] shortArray26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray2, shortArray26);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2141");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        int[][] intArray8 = new int[][] {};
        java.util.Set<int[]> intArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(intArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) intArray8);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2142");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) (short) -1, (double) 1, (double) 5);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2143");
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
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader44, terms45, terms46, false);
        org.apache.lucene.index.NumericDocValues numericDocValues51 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", 1, numericDocValues51, numericDocValues52);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2144");
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
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.monster", indexReader20, 0, postingsEnum22, postingsEnum23);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) '#');
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2145");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(10);
        java.lang.Object obj12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) kuromojiAnalysisTests1, obj12);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2146");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) -1, (-1.0d));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2147");
        java.lang.Object obj1 = null;
        long[] longArray4 = new long[] { (byte) 0 };
        long[] longArray6 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
        long[] longArray9 = new long[] { (byte) 0 };
        long[] longArray11 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals("", longArray4, longArray11);
        long[] longArray15 = new long[] { (byte) 0 };
        long[] longArray17 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        long[] longArray20 = new long[] { (byte) 0 };
        long[] longArray22 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray20, longArray22);
        org.junit.Assert.assertArrayEquals(longArray15, longArray22);
        long[] longArray27 = new long[] { (byte) 0 };
        long[] longArray29 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray27, longArray29);
        long[] longArray32 = new long[] { (byte) 0 };
        long[] longArray34 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray32, longArray34);
        org.junit.Assert.assertArrayEquals(longArray27, longArray34);
        long[] longArray38 = new long[] { (byte) 0 };
        long[] longArray40 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        long[] longArray43 = new long[] { (byte) 0 };
        long[] longArray45 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        org.junit.Assert.assertArrayEquals(longArray38, longArray45);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray27, longArray38);
        org.junit.Assert.assertArrayEquals(longArray22, longArray38);
        org.junit.Assert.assertArrayEquals(longArray4, longArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", obj1, (java.lang.Object) longArray38);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2148");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 1, (-1L));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2149");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) 0.0d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2150");
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
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.nightly", indexReader20, 0, postingsEnum22, postingsEnum23);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", 0, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2151");
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
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader44, terms45, terms46, false);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader50, fields51, fields52, true);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader56, 5, postingsEnum58, postingsEnum59);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '#');
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests64 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule65 = kuromojiAnalysisTests64.ruleChain;
        kuromojiAnalysisTests64.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests64);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests64.assertPositionsSkippingEquals("tests.weekly", indexReader69, 100, postingsEnum71, postingsEnum72);
        java.lang.String str74 = kuromojiAnalysisTests64.getTestName();
        kuromojiAnalysisTests64.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests64);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2152");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule2;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule2;
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.outerRule(testRule2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule8 = kuromojiAnalysisTests7.ruleChain;
        kuromojiAnalysisTests7.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests7);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests7.assertTermsEquals("random", indexReader12, terms13, terms14, false);
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests7.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement18 = null;
        org.junit.runner.Description description19 = null;
        org.junit.runners.model.Statement statement20 = ruleChain17.apply(statement18, description19);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) testRule2, (java.lang.Object) description19);
        org.junit.rules.RuleChain ruleChain22 = org.junit.rules.RuleChain.outerRule(testRule2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests24.assertTermsEquals("tests.failfast", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests24.assertDocsSkippingEquals("tests.nightly", indexReader33, (int) (byte) -1, postingsEnum35, postingsEnum36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader40, (int) (short) -1, postingsEnum42, postingsEnum43);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule47 = kuromojiAnalysisTests46.ruleChain;
        kuromojiAnalysisTests46.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests46);
        org.junit.rules.RuleChain ruleChain50 = kuromojiAnalysisTests46.failureAndSuccessEvents;
        kuromojiAnalysisTests24.failureAndSuccessEvents = ruleChain50;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests24.assertDocsSkippingEquals("tests.badapples", indexReader53, 0, postingsEnum55, postingsEnum56, true);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        kuromojiAnalysisTests24.assertTermsEquals("random", indexReader60, terms61, terms62, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests65 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests65.tearDown();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        kuromojiAnalysisTests65.assertTermsEquals("tests.failfast", indexReader68, terms69, terms70, false);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        kuromojiAnalysisTests65.assertDocsSkippingEquals("tests.nightly", indexReader74, (int) (byte) -1, postingsEnum76, postingsEnum77, false);
        org.junit.rules.RuleChain ruleChain80 = kuromojiAnalysisTests65.failureAndSuccessEvents;
        kuromojiAnalysisTests65.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests65.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) terms61, (java.lang.Object) kuromojiAnalysisTests65);
        kuromojiAnalysisTests65.tearDown();
        kuromojiAnalysisTests65.tearDown();
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        kuromojiAnalysisTests65.assertDocsSkippingEquals("", indexReader87, (int) (short) 1, postingsEnum89, postingsEnum90, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain22, (java.lang.Object) kuromojiAnalysisTests65);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2153");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
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
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) serializableArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) serializableArray29);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) serializableArray34);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) serializableArray52);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) serializableArray62);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray62);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) serializableArray57);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray68);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray68, (java.lang.Object[]) serializableArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray47, (java.lang.Object[]) serializableArray68);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray68);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) serializableArray68);
        java.io.Serializable[] serializableArray77 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet78 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray77);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        java.io.Serializable[] serializableArray83 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet84 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray83);
        java.io.Serializable[] serializableArray85 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet86 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray85);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray83, (java.lang.Object[]) serializableArray85);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray80, (java.lang.Object[]) serializableArray85);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray77, (java.lang.Object[]) serializableArray85);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray68, (java.lang.Object[]) serializableArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray3, (java.lang.Object[]) serializableArray68);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2154");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 0.0f, (double) 1.0f, (double) (byte) -1);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (long) (short) 100, (long) (short) 100);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2156");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray3, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray17, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray8, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray3, shortArray21);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray29, shortArray30);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray33);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray38, shortArray39);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray29, shortArray42);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray49, shortArray50);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray53);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray58, shortArray59);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray62);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray49, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray3);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 1L, (long) (short) 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2158");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (byte) 0);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2159");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 3);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2160");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, 0.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2161");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) serializableArray70);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray70);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) executorServiceArray2);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2162");
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
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray11);
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
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray17);
        double[] doubleArray37 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray38 = new double[][] { doubleArray37 };
        double[] doubleArray45 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray46 = new double[][] { doubleArray45 };
        double[] doubleArray53 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray54 = new double[][] { doubleArray53 };
        double[] doubleArray61 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray62 = new double[][] { doubleArray61 };
        double[] doubleArray69 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray70 = new double[][] { doubleArray69 };
        double[][][] doubleArray71 = new double[][][] { doubleArray38, doubleArray46, doubleArray54, doubleArray62, doubleArray70 };
        java.util.Set<double[][]> doubleArraySet72 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray71);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) doubleArray71);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2163");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) ' ', (long) (byte) 100);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2164");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) 1, 0.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2165");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', 100.0f, (float) (short) 10);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2166");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2167");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, (double) (-1L), (-1.0d));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2168");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray3 = new byte[] { (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) -1 };
        byte[] byteArray11 = new byte[] { (byte) -1 };
        byte[][] byteArray12 = new byte[][] { byteArray1, byteArray3, byteArray5, byteArray7, byteArray9, byteArray11 };
        byte[] byteArray14 = new byte[] { (byte) -1 };
        byte[] byteArray16 = new byte[] { (byte) -1 };
        byte[] byteArray18 = new byte[] { (byte) -1 };
        byte[] byteArray20 = new byte[] { (byte) -1 };
        byte[] byteArray22 = new byte[] { (byte) -1 };
        byte[] byteArray24 = new byte[] { (byte) -1 };
        byte[][] byteArray25 = new byte[][] { byteArray14, byteArray16, byteArray18, byteArray20, byteArray22, byteArray24 };
        byte[] byteArray27 = new byte[] { (byte) -1 };
        byte[] byteArray29 = new byte[] { (byte) -1 };
        byte[] byteArray31 = new byte[] { (byte) -1 };
        byte[] byteArray33 = new byte[] { (byte) -1 };
        byte[] byteArray35 = new byte[] { (byte) -1 };
        byte[] byteArray37 = new byte[] { (byte) -1 };
        byte[][] byteArray38 = new byte[][] { byteArray27, byteArray29, byteArray31, byteArray33, byteArray35, byteArray37 };
        byte[] byteArray40 = new byte[] { (byte) -1 };
        byte[] byteArray42 = new byte[] { (byte) -1 };
        byte[] byteArray44 = new byte[] { (byte) -1 };
        byte[] byteArray46 = new byte[] { (byte) -1 };
        byte[] byteArray48 = new byte[] { (byte) -1 };
        byte[] byteArray50 = new byte[] { (byte) -1 };
        byte[][] byteArray51 = new byte[][] { byteArray40, byteArray42, byteArray44, byteArray46, byteArray48, byteArray50 };
        byte[] byteArray53 = new byte[] { (byte) -1 };
        byte[] byteArray55 = new byte[] { (byte) -1 };
        byte[] byteArray57 = new byte[] { (byte) -1 };
        byte[] byteArray59 = new byte[] { (byte) -1 };
        byte[] byteArray61 = new byte[] { (byte) -1 };
        byte[] byteArray63 = new byte[] { (byte) -1 };
        byte[][] byteArray64 = new byte[][] { byteArray53, byteArray55, byteArray57, byteArray59, byteArray61, byteArray63 };
        byte[] byteArray66 = new byte[] { (byte) -1 };
        byte[] byteArray68 = new byte[] { (byte) -1 };
        byte[] byteArray70 = new byte[] { (byte) -1 };
        byte[] byteArray72 = new byte[] { (byte) -1 };
        byte[] byteArray74 = new byte[] { (byte) -1 };
        byte[] byteArray76 = new byte[] { (byte) -1 };
        byte[][] byteArray77 = new byte[][] { byteArray66, byteArray68, byteArray70, byteArray72, byteArray74, byteArray76 };
        byte[][][] byteArray78 = new byte[][][] { byteArray12, byteArray25, byteArray38, byteArray51, byteArray64, byteArray77 };
        java.util.Set<byte[][]> byteArraySet79 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray78);
        java.lang.reflect.Type[][] typeArray80 = new java.lang.reflect.Type[][] {};
        java.util.Set<java.lang.reflect.Type[]> typeArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) byteArray78, (java.lang.Object[]) typeArray80);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2169");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 100.0f, (float) 10L, 0.0f);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 100L, (long) (byte) 10);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (byte) 100);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) '#');
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2173");
        float[] floatArray1 = null;
        float[] floatArray9 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray16 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray33 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray33, 1.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray1, floatArray33, (float) '4');
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2174");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 0, (double) ' ');
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2175");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray10, byteArray11);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray10, byteArray14);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray20, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray20);
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray14);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray32, byteArray33);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray32, byteArray36);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray42, byteArray43);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray42, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray42);
        org.junit.Assert.assertArrayEquals("hi!", byteArray4, byteArray7);
        byte[] byteArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray4, byteArray53);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2176");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (long) (short) 10, (long) 10);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2177");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.slow", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader18, (int) (byte) 10, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("enwiki.random.lines.txt", indexReader26, fields27, fields28, true);
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests23.assertTermsEquals("tests.slow", indexReader33, terms34, terms35, false);
        kuromojiAnalysisTests23.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals((java.lang.Object) postingsEnum21, (java.lang.Object) kuromojiAnalysisTests23);
        kuromojiAnalysisTests23.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests23);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2178");
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
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2179");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 3);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2180");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1.0f), (double) 0.0f, (double) 1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2181");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) (short) 1, (double) 1L);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2182");
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
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "tests.maxfailures");
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2183");
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
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("random", postingsEnum43, postingsEnum44, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests47.tearDown();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        kuromojiAnalysisTests47.assertTermsEquals("tests.failfast", indexReader50, terms51, terms52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        kuromojiAnalysisTests47.assertTermsEquals("", indexReader56, terms57, terms58, false);
        org.junit.rules.RuleChain ruleChain61 = kuromojiAnalysisTests47.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain62 = kuromojiAnalysisTests47.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) postingsEnum43, (java.lang.Object) kuromojiAnalysisTests47);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2184");
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
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray51, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray51, byteArray55);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray61, byteArray62);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray65, byteArray66);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray61, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray26);
        byte[] byteArray72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray9, byteArray72);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2185");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures0, testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures7 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet9 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) serializableArray13);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2186");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray14);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray14);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray14, (java.lang.Object[]) serializableArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray27);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) serializableArray27);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray18, (java.lang.Object[]) executorServiceArray22);
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
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) executorServiceArray59);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet70 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray69);
        java.io.Serializable[] serializableArray71 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray71);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray69, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray66, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) executorServiceArray77);
        org.elasticsearch.test.ESTestCase[][] eSTestCaseArray80 = new org.elasticsearch.test.ESTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray80);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) eSTestCaseArray80);
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        java.io.Serializable[] serializableArray87 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet88 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray87);
        java.io.Serializable[] serializableArray89 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet90 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray89);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray87, (java.lang.Object[]) serializableArray89);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray84, (java.lang.Object[]) serializableArray89);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) executorServiceArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray18);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2187");
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
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) executorServiceArray25);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) boolean30);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2188");
        long[] longArray2 = new long[] { (byte) 0 };
        long[] longArray4 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray7 = new long[] { (byte) 0 };
        long[] longArray9 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray7, longArray9);
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests12.ruleChain;
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests12.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("tests.slow", indexReader17, fields18, fields19, true);
        kuromojiAnalysisTests12.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests12.assertDocsEnumEquals("tests.awaitsfix", postingsEnum24, postingsEnum25, false);
        kuromojiAnalysisTests12.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) longArray2, (java.lang.Object) kuromojiAnalysisTests12);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2189");
        double[] doubleArray1 = null;
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
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) '4');
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray24, (double) (byte) -1);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray29, (double) 2);
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain18, (java.lang.Object) doubleArray20);
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) '4');
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray41, (double) (byte) -1);
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray46, (double) 2);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.List<java.lang.Object> objList58 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, (java.lang.Object[]) executorServiceArray54);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) doubleArray37, (java.lang.Object) boolean60);
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray37, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray1, doubleArray20, (double) (short) 100);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2190");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (short) -1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests24.ruleChain;
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests24);
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests24.failureAndSuccessEvents;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.badapples", indexReader31, 0, postingsEnum33, postingsEnum34, true);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
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
        org.junit.Assert.assertNotSame("", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) statement67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) statement67);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2191");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray6, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray7, intArray10);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray7, (java.lang.Object) 100.0d);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray19, intArray20);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray23, intArray24);
        org.junit.Assert.assertArrayEquals(intArray20, intArray23);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray20, (java.lang.Object) 100.0d);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray20, intArray30);
        org.junit.Assert.assertArrayEquals("random", intArray7, intArray20);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals(intArray38, intArray41);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray38, (java.lang.Object) 100.0d);
        org.junit.Assert.assertArrayEquals(intArray20, intArray38);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray20, intArray49);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests53.tearDown();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        kuromojiAnalysisTests53.assertTermsEquals("tests.failfast", indexReader56, terms57, terms58, false);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        kuromojiAnalysisTests53.assertDocsSkippingEquals("tests.nightly", indexReader62, (int) (byte) -1, postingsEnum64, postingsEnum65, false);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests53.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader69, (int) (short) -1, postingsEnum71, postingsEnum72);
        java.lang.String str74 = kuromojiAnalysisTests53.getTestName();
        kuromojiAnalysisTests53.setUp();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) intArray49, (java.lang.Object) kuromojiAnalysisTests53);
        kuromojiAnalysisTests53.ensureCheckIndexPassed();
        kuromojiAnalysisTests53.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests79 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule80 = kuromojiAnalysisTests79.ruleChain;
        kuromojiAnalysisTests79.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests79.tearDown();
        kuromojiAnalysisTests79.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests79.setUp();
        kuromojiAnalysisTests79.ensureCleanedUp();
        kuromojiAnalysisTests79.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        kuromojiAnalysisTests79.assertDocsEnumEquals("tests.slow", postingsEnum88, postingsEnum89, false);
        org.apache.lucene.index.IndexReader indexReader93 = null;
        org.apache.lucene.index.Terms terms94 = null;
        org.apache.lucene.index.Terms terms95 = null;
        kuromojiAnalysisTests79.assertTermsEquals("tests.failfast", indexReader93, terms94, terms95, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests53, (java.lang.Object) true);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2192");
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray6, shortArray19);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray26, shortArray27);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray30);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray26, shortArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray19, shortArray26);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray26, shortArray46);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray53, shortArray54);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray57);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray62, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray66);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray53, shortArray66);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray73, shortArray74);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray77);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray82, shortArray83);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray86, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray86);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray73, shortArray86);
        org.junit.Assert.assertArrayEquals("", shortArray66, shortArray86);
        short[] shortArray93 = new short[] {};
        short[] shortArray94 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray93, shortArray94);
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray93);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray46, shortArray93);
        short[] shortArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray46, shortArray98);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2193");
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
        org.junit.Assert.assertArrayEquals(intArray18, intArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) intArray18);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2194");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule17);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2195");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 1L);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2196");
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
        java.util.Set<java.util.Collection<java.io.Serializable>> serializableCollectionSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.io.Serializable>[]) serializableSetArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) serializableSetArray13);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2197");
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
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests56.tearDown();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        kuromojiAnalysisTests56.assertFieldsEquals("enwiki.random.lines.txt", indexReader59, fields60, fields61, true);
        kuromojiAnalysisTests56.setUp();
        kuromojiAnalysisTests56.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        kuromojiAnalysisTests56.assertFieldsEquals("enwiki.random.lines.txt", indexReader68, fields69, fields70, false);
        org.junit.rules.TestRule testRule73 = kuromojiAnalysisTests56.ruleChain;
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        kuromojiAnalysisTests56.assertDocsSkippingEquals("tests.weekly", indexReader75, 1, postingsEnum77, postingsEnum78, false);
        kuromojiAnalysisTests56.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        kuromojiAnalysisTests56.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum83, postingsEnum84, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) false);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) 100, (float) '4');
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2199");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray1, byteArray8);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (-1.0d));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2201");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 1, 0L);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) '4', (float) (byte) -1);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2203");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader5, fields6, fields7, true);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.monster", postingsEnum11, postingsEnum12, true);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.ensureCleanedUp();
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray18, (java.lang.Object[]) executorServiceArray23);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray29);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray43);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray43);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray51, (java.lang.Object[]) serializableArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray53);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) executorServiceArray58);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet66 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray63, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray38, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) serializableArray38);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling80 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray81 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling80 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet82 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray81);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList83 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray81);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling84 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray85 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling84 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet86 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray81, (java.lang.Object[]) throttlingArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) throttlingArray81);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2204");
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        org.junit.rules.RuleChain ruleChain52 = ruleChain15.around((org.junit.rules.TestRule) ruleChain16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests54.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule55;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule55;
        org.junit.rules.RuleChain ruleChain58 = org.junit.rules.RuleChain.outerRule(testRule55);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests60 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule61 = kuromojiAnalysisTests60.ruleChain;
        kuromojiAnalysisTests60.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests60);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        kuromojiAnalysisTests60.assertTermsEquals("random", indexReader65, terms66, terms67, false);
        org.junit.rules.RuleChain ruleChain70 = kuromojiAnalysisTests60.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement71 = null;
        org.junit.runner.Description description72 = null;
        org.junit.runners.model.Statement statement73 = ruleChain70.apply(statement71, description72);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) testRule55, (java.lang.Object) description72);
        org.junit.rules.RuleChain ruleChain75 = org.junit.rules.RuleChain.outerRule(testRule55);
        org.junit.rules.RuleChain ruleChain76 = ruleChain52.around((org.junit.rules.TestRule) ruleChain75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain76);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2205");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        short[][] shortArray10 = new short[][] {};
        short[][][] shortArray11 = new short[][][] { shortArray10 };
        java.util.Set<short[][]> shortArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) shortArraySet12);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 'a', 100L);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 1, (double) 1L);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2208");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray2, intArray3);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray8, intArray9);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray9, intArray12);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray9, (java.lang.Object) 100.0d);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals(intArray22, intArray25);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray22, (java.lang.Object) 100.0d);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray22, intArray32);
        org.junit.Assert.assertArrayEquals("random", intArray9, intArray22);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray39, intArray40);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray43, intArray44);
        org.junit.Assert.assertArrayEquals(intArray40, intArray43);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray40, (java.lang.Object) 100.0d);
        org.junit.Assert.assertArrayEquals(intArray22, intArray40);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray53, intArray54);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray57, intArray58);
        org.junit.Assert.assertArrayEquals(intArray54, intArray57);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray54, (java.lang.Object) 100.0d);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray64, intArray65);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray54, intArray64);
        org.junit.Assert.assertArrayEquals(intArray40, intArray64);
        org.junit.Assert.assertArrayEquals(intArray3, intArray40);
        int[] intArray70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray3, intArray70);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2209");
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
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.badapples");
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum58, postingsEnum59);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2210");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (-1), postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests1.setUp();
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain18);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2211");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 10, (double) 'a');
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2212");
        org.junit.rules.TestRule testRule0 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule0;
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule(testRule0);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain2;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests4.assertTermsEquals("", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests4.setUp();
        kuromojiAnalysisTests4.resetCheckIndexStatus();
        kuromojiAnalysisTests4.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests4.setUp();
        java.lang.String str16 = kuromojiAnalysisTests4.getTestName();
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain2, (java.lang.Object) kuromojiAnalysisTests4);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray24 = new java.util.concurrent.ExecutorService[][] { executorServiceArray19, executorServiceArray20, executorServiceArray21, executorServiceArray22, executorServiceArray23 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain2, (java.lang.Object) executorServiceArray24);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2213");
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
        float[] floatArray60 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray67 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray60, floatArray67, (float) (byte) 100);
        float[] floatArray77 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray84 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray77, floatArray84, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray84, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray84, (float) 0);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray84, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray7);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2214");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 10, (long) 100);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2215");
        float[] floatArray8 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray15 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray26 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray33 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray33, (float) (byte) 100);
        float[] floatArray43 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray50 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray43, floatArray50, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray50, 1.0f);
        float[] floatArray62 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray69 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray62, floatArray69, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray33, floatArray69, (float) (short) 10);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray8, floatArray33, (float) ' ');
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2216");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 1.0f, (float) (byte) 10, (float) 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2217");
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
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
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
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) serializableArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray32, (java.lang.Object[]) executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray46);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2218");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2219");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule2;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule2;
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.outerRule(testRule2);
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain5);
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
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray39);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) ruleChain5, (java.lang.Object) intArray39);
        int[] intArray42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray39, intArray42);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2220");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (-1), postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.awaitsfix", indexReader19, terms20, terms21, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests25.ruleChain;
        kuromojiAnalysisTests25.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests25.tearDown();
        kuromojiAnalysisTests25.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests25.setUp();
        kuromojiAnalysisTests25.ensureCleanedUp();
        kuromojiAnalysisTests25.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests25.assertDocsEnumEquals("tests.slow", postingsEnum34, postingsEnum35, false);
        java.lang.Object obj38 = null;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests25, obj38);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests25.assertDocsEnumEquals("tests.slow", postingsEnum41, postingsEnum42, false);
        kuromojiAnalysisTests25.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests25);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2221");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
        java.lang.Class<?> wildcardClass10 = shortArray2.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests11.assertTermsEquals("", indexReader13, terms14, terms15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests11.assertDocsEnumEquals("tests.slow", postingsEnum20, postingsEnum21, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) shortArray2, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2222");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 0L, (double) '4', (double) (byte) 1);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 1.0f);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 4, (double) 10);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, 10L);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2226");
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
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
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain32);
        org.junit.rules.RuleChain ruleChain37 = ruleChain15.around((org.junit.rules.TestRule) ruleChain36);
        org.junit.rules.RuleChain ruleChain38 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) ruleChain38);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (float) (short) -1, 0.0f);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2228");
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
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        java.lang.String str45 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum48, postingsEnum49);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2229");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.slow", indexReader5, fields6, fields7, true);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2230");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) ' ', (double) 3);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2231");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.monster", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15, true);
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 0);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) '#');
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2234");
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
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.monster", indexReader19, (int) (byte) 1, postingsEnum21, postingsEnum22);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.slow", indexReader27, terms28, terms29, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) indexReader27);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 2, 0L);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2236");
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
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum54, postingsEnum55);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2237");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0.0d, (double) 10L);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2238");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) 100);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2239");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) statement54);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2240");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray3, longArray10);
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
        org.junit.Assert.assertArrayEquals(longArray10, longArray26);
        long[] longArray39 = new long[] { (byte) 0 };
        long[] longArray41 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray39, longArray41);
        long[] longArray44 = new long[] { (byte) 0 };
        long[] longArray46 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray44, longArray46);
        org.junit.Assert.assertArrayEquals(longArray39, longArray46);
        long[] longArray51 = new long[] { (byte) 0 };
        long[] longArray53 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray51, longArray53);
        long[] longArray56 = new long[] { (byte) 0 };
        long[] longArray58 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray56, longArray58);
        org.junit.Assert.assertArrayEquals(longArray51, longArray58);
        long[] longArray62 = new long[] { (byte) 0 };
        long[] longArray64 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray62, longArray64);
        long[] longArray67 = new long[] { (byte) 0 };
        long[] longArray69 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray67, longArray69);
        org.junit.Assert.assertArrayEquals(longArray62, longArray69);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray51, longArray62);
        org.junit.Assert.assertArrayEquals(longArray46, longArray62);
        org.junit.Assert.assertArrayEquals("hi!", longArray26, longArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) "hi!");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2241");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) '4');
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests14.ruleChain;
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests14.failureAndSuccessEvents;
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
        org.junit.rules.TestRule testRule50 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain51 = org.junit.rules.RuleChain.outerRule(testRule50);
        org.junit.rules.RuleChain ruleChain52 = ruleChain29.around(testRule50);
        org.junit.rules.RuleChain ruleChain53 = ruleChain17.around((org.junit.rules.TestRule) ruleChain29);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests55.tearDown();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        kuromojiAnalysisTests55.assertFieldsEquals("enwiki.random.lines.txt", indexReader58, fields59, fields60, true);
        kuromojiAnalysisTests55.setUp();
        kuromojiAnalysisTests55.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        kuromojiAnalysisTests55.assertFieldsEquals("enwiki.random.lines.txt", indexReader67, fields68, fields69, false);
        org.junit.rules.TestRule testRule72 = kuromojiAnalysisTests55.ruleChain;
        java.lang.String str73 = kuromojiAnalysisTests55.getTestName();
        org.junit.rules.RuleChain ruleChain74 = kuromojiAnalysisTests55.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain75 = ruleChain17.around((org.junit.rules.TestRule) ruleChain74);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain17;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", obj1, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2242");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", 0, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2243");
        float[] floatArray3 = new float[] { 10.0f, 1, 1L };
        float[] floatArray12 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray19 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray12, floatArray19, (float) (byte) 100);
        float[] floatArray29 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray36 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray29, floatArray36, (float) (byte) 100);
        float[] floatArray46 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray53 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray46, floatArray53, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray53, 1.0f);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray19, floatArray36, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray36, 1.0f);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2244");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 5, (float) 0L, (float) (-1));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2245");
        double[] doubleArray1 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '4');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) 4);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) '4');
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) '4');
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray23, (double) (byte) -1);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) '4');
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray33, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray28, (double) 100);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) '4');
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray46, (double) (short) 10);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) '4');
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray56, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray46, doubleArray51, (double) 4);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray19, doubleArray51, 0.0d);
        double[] doubleArray65 = new double[] {};
        double[] doubleArray66 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray66, (double) '4');
        double[] doubleArray69 = new double[] {};
        double[] doubleArray70 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray70, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray70, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("", doubleArray51, doubleArray70, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray51, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray51, (double) 0);
        double[] doubleArray81 = new double[] {};
        double[] doubleArray82 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray81, doubleArray82, (double) '4');
        double[] doubleArray85 = new double[] {};
        double[] doubleArray86 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray85, doubleArray86, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray82, doubleArray86, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray86, (double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray1, doubleArray86, (-1.0d));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2246");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests2.ruleChain;
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) locale13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 1);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2248");
        int[] intArray3 = new int[] { (-1), 1, 2 };
        int[] intArray7 = new int[] { (-1), 1, 2 };
        int[] intArray11 = new int[] { (-1), 1, 2 };
        int[] intArray15 = new int[] { (-1), 1, 2 };
        int[] intArray19 = new int[] { (-1), 1, 2 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        java.util.Set<int[]> intArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(intArray20);
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
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("", indexReader52, fields53, fields54, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArraySet21, (java.lang.Object) false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2249");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests9.assertTermsEquals("tests.failfast", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests9.assertTermsEquals("", indexReader18, terms19, terms20, false);
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests9.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain24 = kuromojiAnalysisTests9.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) boolean8, (java.lang.Object) kuromojiAnalysisTests9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests27, (java.lang.Object) "");
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests27.assertDocsEnumEquals("tests.nightly", postingsEnum32, postingsEnum33, true);
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        kuromojiAnalysisTests27.restoreIndexWriterMaxDocs();
        java.lang.Class<?> wildcardClass38 = kuromojiAnalysisTests27.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) kuromojiAnalysisTests9, (java.lang.Object) kuromojiAnalysisTests27);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2250");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader6, 0, postingsEnum8, postingsEnum9);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) "hi!");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2251");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests8.ruleChain;
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.outerRule(testRule9);
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule(testRule9);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain11;
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
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests13.assertDocsSkippingEquals("tests.badapples", indexReader42, 0, postingsEnum44, postingsEnum45, true);
        kuromojiAnalysisTests13.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests13.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum50, postingsEnum51, true);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("hi!", indexReader55, 0, postingsEnum57, postingsEnum58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain11, (java.lang.Object) postingsEnum57);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2252");
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) ruleChain16);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) 10, (double) 10.0f, (double) (short) -1);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2254");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) 0, (long) 1);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2255");
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
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray32, charArray35);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals(charArray41, charArray44);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals(charArray48, charArray51);
        org.junit.Assert.assertArrayEquals("random", charArray41, charArray48);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray48, charArray56);
        org.junit.Assert.assertArrayEquals(charArray35, charArray56);
        org.junit.Assert.assertArrayEquals(charArray6, charArray56);
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray6, charArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) charArray61);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2256");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule7 = kuromojiAnalysisTests6.ruleChain;
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain9;
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests13.ruleChain;
        kuromojiAnalysisTests13.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests13);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests13.assertTermsEquals("random", indexReader18, terms19, terms20, false);
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement24 = null;
        org.junit.runner.Description description25 = null;
        org.junit.runners.model.Statement statement26 = ruleChain23.apply(statement24, description25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests28.ruleChain;
        kuromojiAnalysisTests28.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests28);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests28.assertTermsEquals("random", indexReader33, terms34, terms35, false);
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests28.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement39 = null;
        org.junit.runner.Description description40 = null;
        org.junit.runners.model.Statement statement41 = ruleChain38.apply(statement39, description40);
        org.junit.runner.Description description42 = null;
        org.junit.runners.model.Statement statement43 = ruleChain23.apply(statement41, description42);
        org.junit.runner.Description description44 = null;
        org.junit.runners.model.Statement statement45 = ruleChain11.apply(statement41, description44);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests46.tearDown();
        kuromojiAnalysisTests46.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests46.tearDown();
        kuromojiAnalysisTests46.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule52 = kuromojiAnalysisTests51.ruleChain;
        kuromojiAnalysisTests51.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain54 = kuromojiAnalysisTests51.failureAndSuccessEvents;
        kuromojiAnalysisTests46.failureAndSuccessEvents = ruleChain54;
        org.junit.rules.RuleChain ruleChain56 = ruleChain11.around((org.junit.rules.TestRule) ruleChain54);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain56;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum59, postingsEnum60, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) postingsEnum60);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2257");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests24.assertTermsEquals("", indexReader26, terms27, terms28, false);
        kuromojiAnalysisTests24.ensureCleanedUp();
        kuromojiAnalysisTests24.ensureCheckIndexPassed();
        kuromojiAnalysisTests24.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests24.setUp();
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 100, (java.lang.Object) kuromojiAnalysisTests24);
        kuromojiAnalysisTests24.tearDown();
        kuromojiAnalysisTests24.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests24);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2258");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0L, (long) 5);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2259");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) boolean3);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2260");
        java.lang.Object[] objArray0 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet8 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray7);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) throttlingArray7);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2261");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.outerRule(testRule2);
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain3);
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests9.assertTermsEquals("tests.failfast", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests9.assertTermsEquals("", indexReader18, terms19, terms20, false);
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests9.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests7, (java.lang.Object) kuromojiAnalysisTests9);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests9.assertTermsEquals("tests.awaitsfix", indexReader27, terms28, terms29, true);
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain74;
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain74;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) ruleChain3, (java.lang.Object) ruleChain74);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2262");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2263");
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
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) ' ');
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        java.lang.Object obj22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests2, obj22);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2264");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (byte) 10);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2265");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 3);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2266");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) ' ', (double) ' ', (double) ' ');
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2267");
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
        kuromojiAnalysisTests1.assertTermsEquals("tests.nightly", indexReader37, terms38, terms39, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests44.tearDown();
        kuromojiAnalysisTests44.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests44.ensureCleanedUp();
        org.junit.rules.TestRule testRule48 = kuromojiAnalysisTests44.ruleChain;
        kuromojiAnalysisTests44.setIndexWriterMaxDocs((int) (short) 10);
        kuromojiAnalysisTests44.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests44.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum53, postingsEnum54, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests44);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2268");
        char[] charArray1 = null;
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
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray28);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray49, charArray52);
        org.junit.Assert.assertArrayEquals("random", charArray42, charArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray37, charArray49);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray59, charArray62);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals(charArray67, charArray70);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals(charArray74, charArray77);
        org.junit.Assert.assertArrayEquals("random", charArray67, charArray74);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray62, charArray74);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray37, charArray62);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray28, charArray37);
        org.junit.Assert.assertArrayEquals(charArray20, charArray37);
        char[] charArray85 = new char[] {};
        char[] charArray86 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray85, charArray86);
        char[] charArray88 = new char[] {};
        char[] charArray89 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray88, charArray89);
        org.junit.Assert.assertArrayEquals(charArray86, charArray89);
        org.junit.Assert.assertArrayEquals(charArray20, charArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray1, charArray86);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2269");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) -1, (double) 0L);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2270");
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) serializableArray10);
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
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) serializableArray32);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
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
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) serializableArray50);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) executorServiceArray47);
        java.lang.Object[] objArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray10, objArray68);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2271");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray4, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray9, shortArray10);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray15);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray18);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray14, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray9, shortArray14);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray34);
        org.junit.Assert.assertArrayEquals("hi!", shortArray4, shortArray14);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray51);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray56, shortArray57);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray47, shortArray60);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray67, shortArray68);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray71);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray76, shortArray77);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray80);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray67, shortArray80);
        org.junit.Assert.assertArrayEquals("", shortArray60, shortArray80);
        org.junit.Assert.assertArrayEquals("random", shortArray4, shortArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray4);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2272");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 0, (long) ' ');
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (-1.0f));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2274");
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.util.Set<java.lang.reflect.Type[]> typeArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray1);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) typeArraySet2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests4.assertTermsEquals("", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests4.setUp();
        kuromojiAnalysisTests4.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests4.ruleChain;
        kuromojiAnalysisTests4.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests4.assertDocsSkippingEquals("tests.monster", indexReader16, (int) (short) 10, postingsEnum18, postingsEnum19, true);
        kuromojiAnalysisTests4.tearDown();
        java.lang.Class<?> wildcardClass23 = kuromojiAnalysisTests4.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) typeArraySet2, (java.lang.Object) kuromojiAnalysisTests4);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) (short) -1);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2276");
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
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.lang.String str22 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) 'a', postingsEnum27, postingsEnum28, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests31.assertTermsEquals("", indexReader33, terms34, terms35, false);
        kuromojiAnalysisTests31.setUp();
        kuromojiAnalysisTests31.resetCheckIndexStatus();
        kuromojiAnalysisTests31.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests31.setUp();
        kuromojiAnalysisTests31.ensureCheckIndexPassed();
        kuromojiAnalysisTests31.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum28, (java.lang.Object) kuromojiAnalysisTests31);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2277");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("enwiki.random.lines.txt");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("enwiki.random.lines.txt", indexReader14, fields15, fields16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("", indexReader20, 1, postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("tests.weekly", indexReader27, 1, postingsEnum29, postingsEnum30, false);
        java.lang.Class<?> wildcardClass33 = kuromojiAnalysisTests11.getClass();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests11);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2278");
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
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("random", (int) (byte) 0, numericDocValues38, numericDocValues39);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2279");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, 0.0d, 0.0d);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 3, (-1.0f), (float) 0L);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2281");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 5, (double) (byte) 100, (double) 1);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0L, (long) '#');
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2283");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) (-1));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2284");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests31.tearDown();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        kuromojiAnalysisTests31.assertTermsEquals("tests.failfast", indexReader34, terms35, terms36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests31.assertDocsSkippingEquals("tests.nightly", indexReader40, (int) (byte) -1, postingsEnum42, postingsEnum43, false);
        org.junit.rules.RuleChain ruleChain46 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain47;
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests0.failureAndSuccessEvents;
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
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        kuromojiAnalysisTests50.assertTermsEquals("random", indexReader86, terms87, terms88, false);
        kuromojiAnalysisTests50.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule92 = kuromojiAnalysisTests50.ruleChain;
        kuromojiAnalysisTests50.setIndexWriterMaxDocs(0);
        java.lang.String str95 = kuromojiAnalysisTests50.getTestName();
        kuromojiAnalysisTests50.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests50);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2285");
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
        org.apache.lucene.util.LuceneTestCase.classRules = testRule12;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule12, (java.lang.Object) 100);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (byte) 1);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2287");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.lang.Object[] objArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, objArray3);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10, (double) 100L);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2289");
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
        org.junit.rules.TestRule testRule49 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.maxfailures");
        java.lang.String str52 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests54.ruleChain;
        kuromojiAnalysisTests54.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain57 = kuromojiAnalysisTests54.failureAndSuccessEvents;
        kuromojiAnalysisTests54.setIndexWriterMaxDocs((int) (short) 1);
        kuromojiAnalysisTests54.ensureCheckIndexPassed();
        kuromojiAnalysisTests54.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests54);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2290");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) 5);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2291");
        short[] shortArray0 = null;
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray6, shortArray19);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray26, shortArray27);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray30);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray26, shortArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray19, shortArray26);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray26, shortArray46);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray53, shortArray54);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray57);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray62, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray66);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray53, shortArray66);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray73, shortArray74);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray77);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray82, shortArray83);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray86, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray86);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray73, shortArray86);
        org.junit.Assert.assertArrayEquals("", shortArray66, shortArray86);
        short[] shortArray93 = new short[] {};
        short[] shortArray94 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray93, shortArray94);
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray93);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray46, shortArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray93);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2292");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", obj1);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) (-1), (float) 0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2294");
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
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray15, floatArray32, (float) 100);
        float[] floatArray63 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray70 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray70, (float) (byte) 100);
        float[] floatArray80 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray87 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray80, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray87, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray70, (float) (byte) 100);
        float[] floatArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray94, (float) (short) 100);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (byte) 100);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2296");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 5);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2297");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests4.assertTermsEquals("tests.failfast", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests4.assertTermsEquals("", indexReader13, terms14, terms15, false);
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests4.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests4);
        kuromojiAnalysisTests4.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests4.assertDocsEnumEquals("<unknown>", postingsEnum22, postingsEnum23, false);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests4.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests27.assertTermsEquals("", indexReader29, terms30, terms31, false);
        kuromojiAnalysisTests27.ensureCleanedUp();
        kuromojiAnalysisTests27.ensureCheckIndexPassed();
        kuromojiAnalysisTests27.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests38.tearDown();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        kuromojiAnalysisTests38.assertTermsEquals("tests.failfast", indexReader41, terms42, terms43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests38.assertDocsSkippingEquals("tests.nightly", indexReader47, (int) (byte) -1, postingsEnum49, postingsEnum50, false);
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures54 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures55 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures54);
        org.junit.rules.RuleChain ruleChain56 = ruleChain53.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures55);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling58 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet60 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray59);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList61 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray59);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling62 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray63 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling62 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet64 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray59, (java.lang.Object[]) throttlingArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain53, (java.lang.Object) throttlingArray63);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain53);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain53;
        kuromojiAnalysisTests27.failureAndSuccessEvents = ruleChain53;
        org.junit.rules.RuleChain ruleChain70 = ruleChain26.around((org.junit.rules.TestRule) ruleChain53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", obj1, (java.lang.Object) ruleChain53);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2298");
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
        java.lang.String str19 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.tearDown();
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests21.ensureCleanedUp();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain20, (java.lang.Object) kuromojiAnalysisTests21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests29.ruleChain;
        kuromojiAnalysisTests29.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests29.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests29, (java.lang.Object) (-1));
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
        org.junit.rules.RuleChain ruleChain50 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule53 = kuromojiAnalysisTests52.ruleChain;
        kuromojiAnalysisTests52.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests52);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        kuromojiAnalysisTests52.assertTermsEquals("random", indexReader57, terms58, terms59, false);
        org.junit.rules.RuleChain ruleChain62 = kuromojiAnalysisTests52.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement63 = null;
        org.junit.runner.Description description64 = null;
        org.junit.runners.model.Statement statement65 = ruleChain62.apply(statement63, description64);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests67 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule68 = kuromojiAnalysisTests67.ruleChain;
        kuromojiAnalysisTests67.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests67);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        kuromojiAnalysisTests67.assertTermsEquals("random", indexReader72, terms73, terms74, false);
        org.junit.rules.RuleChain ruleChain77 = kuromojiAnalysisTests67.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement78 = null;
        org.junit.runner.Description description79 = null;
        org.junit.runners.model.Statement statement80 = ruleChain77.apply(statement78, description79);
        org.junit.runner.Description description81 = null;
        org.junit.runners.model.Statement statement82 = ruleChain62.apply(statement80, description81);
        org.junit.rules.TestRule testRule83 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain84 = org.junit.rules.RuleChain.outerRule(testRule83);
        org.junit.rules.RuleChain ruleChain85 = ruleChain62.around(testRule83);
        org.junit.rules.RuleChain ruleChain86 = ruleChain50.around((org.junit.rules.TestRule) ruleChain85);
        kuromojiAnalysisTests29.failureAndSuccessEvents = ruleChain50;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) kuromojiAnalysisTests21, (java.lang.Object) kuromojiAnalysisTests29);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2299");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader5, fields6, fields7, true);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.monster", postingsEnum11, postingsEnum12, true);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.ensureCleanedUp();
        java.lang.String str17 = kuromojiAnalysisTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) str17);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2300");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.nightly", "europarl.lines.txt.gz", "tests.maxfailures", "tests.badapples", "tests.failfast" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
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
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) executorServiceArray32);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray44);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) serializableArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) executorServiceArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) serializableArray12);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2301");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) (short) -1, (float) (byte) 1);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2302");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.Class<?> wildcardClass3 = executorServiceArray1.getClass();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) wildcardClass3);
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
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests5.assertPositionsSkippingEquals("tests.monster", indexReader23, (int) (byte) 1, postingsEnum25, postingsEnum26);
        kuromojiAnalysisTests5.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests5.assertTermsEquals("tests.slow", indexReader31, terms32, terms33, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass3, (java.lang.Object) kuromojiAnalysisTests5);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2303");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray2, shortArray12);
        short[] shortArray17 = new short[] { (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2304");
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
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray31);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray31);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray44);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) serializableArray44);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray35, (java.lang.Object[]) executorServiceArray39);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests52.tearDown();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        kuromojiAnalysisTests52.assertFieldsEquals("enwiki.random.lines.txt", indexReader55, fields56, fields57, true);
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        kuromojiAnalysisTests52.assertDocsEnumEquals("tests.monster", postingsEnum61, postingsEnum62, true);
        kuromojiAnalysisTests52.resetCheckIndexStatus();
        kuromojiAnalysisTests52.ensureCleanedUp();
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray68);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray68, (java.lang.Object[]) serializableArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray68, (java.lang.Object[]) executorServiceArray73);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests52, (java.lang.Object) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray79);
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray85);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray79, (java.lang.Object[]) executorServiceArray85);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableSetArray12, (java.lang.Object[]) executorServiceArray85);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2305");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        java.lang.String str3 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests4.assertTermsEquals("tests.failfast", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests4.assertDocsSkippingEquals("tests.nightly", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (short) -1, postingsEnum22, postingsEnum23);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests26.ruleChain;
        kuromojiAnalysisTests26.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests26);
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        kuromojiAnalysisTests4.failureAndSuccessEvents = ruleChain30;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests4.assertDocsSkippingEquals("tests.badapples", indexReader33, 0, postingsEnum35, postingsEnum36, true);
        kuromojiAnalysisTests4.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests4.assertDocsEnumEquals("", postingsEnum41, postingsEnum42, false);
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests4.ruleChain;
        kuromojiAnalysisTests4.resetCheckIndexStatus();
        kuromojiAnalysisTests4.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) str3, (java.lang.Object) kuromojiAnalysisTests4);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2306");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2307");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 5, 0L);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2308");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) (-1), (float) (short) 1);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2309");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1.0f), (double) (byte) 0);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2310");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2311");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray8);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray15);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray18);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray27);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray14, shortArray27);
        org.junit.Assert.assertArrayEquals("", shortArray8, shortArray14);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals("", shortArray36, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray1, shortArray39);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 5, (double) (byte) 10, (double) 'a');
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2313");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, 0.0d);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, 10.0f, (float) (short) 1);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2315");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray7);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray15, byteArray19);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray25, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray25);
        org.junit.Assert.assertArrayEquals("", byteArray12, byteArray19);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray37, byteArray38);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray37, byteArray41);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray47, byteArray48);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray47, byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) byteArray7);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2316");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 0L);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2317");
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
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet32 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray28);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray35, (java.lang.Object[]) executorServiceArray40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests46.tearDown();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        kuromojiAnalysisTests46.assertFieldsEquals("enwiki.random.lines.txt", indexReader49, fields50, fields51, true);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests46.assertDocsEnumEquals("tests.monster", postingsEnum55, postingsEnum56, true);
        kuromojiAnalysisTests46.resetCheckIndexStatus();
        kuromojiAnalysisTests46.ensureCleanedUp();
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray62, (java.lang.Object[]) serializableArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray62, (java.lang.Object[]) executorServiceArray67);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests46, (java.lang.Object) executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray79);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) ruleChainArray28, (java.lang.Object[]) executorServiceArray40);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2318");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests3);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests3.assertTermsEquals("random", indexReader8, terms9, terms10, false);
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests3.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", obj1, (java.lang.Object) ruleChain13);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2319");
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
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests45.tearDown();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        kuromojiAnalysisTests45.assertTermsEquals("tests.failfast", indexReader48, terms49, terms50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        kuromojiAnalysisTests45.assertDocsSkippingEquals("tests.nightly", indexReader54, (int) (byte) -1, postingsEnum56, postingsEnum57, false);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        kuromojiAnalysisTests45.assertTermsEquals("", indexReader61, terms62, terms63, true);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        kuromojiAnalysisTests45.assertDocsSkippingEquals("<unknown>", indexReader67, (int) (byte) 100, postingsEnum69, postingsEnum70, false);
        kuromojiAnalysisTests45.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule75 = kuromojiAnalysisTests45.ruleChain;
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        kuromojiAnalysisTests45.assertTermsEquals("hi!", indexReader77, terms78, terms79, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) true);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2320");
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
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray54, (double) '4');
        double[] doubleArray66 = new double[] { 10L, 10, 1.0d, '#', (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray35, doubleArray66, (double) (byte) 0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2321");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray5);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) genericDeclarationArray5);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests8.assertFieldsEquals("enwiki.random.lines.txt", indexReader11, fields12, fields13, true);
        kuromojiAnalysisTests8.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests8.assertTermsEquals("tests.slow", indexReader18, terms19, terms20, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) terms20);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 3, 0.0d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2323");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 1.0f, (double) (-1L), (double) (byte) -1);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2324");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader18, 4, postingsEnum20, postingsEnum21);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.awaitsfix", indexReader25, terms26, terms27, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.failfast");
        java.lang.String[] strArray36 = new java.lang.String[] { "enwiki.random.lines.txt", "tests.maxfailures", "<unknown>", "tests.maxfailures" };
        java.lang.String[][] strArray37 = new java.lang.String[][] { strArray36 };
        java.lang.String[] strArray42 = new java.lang.String[] { "enwiki.random.lines.txt", "tests.maxfailures", "<unknown>", "tests.maxfailures" };
        java.lang.String[][] strArray43 = new java.lang.String[][] { strArray42 };
        java.lang.String[] strArray48 = new java.lang.String[] { "enwiki.random.lines.txt", "tests.maxfailures", "<unknown>", "tests.maxfailures" };
        java.lang.String[][] strArray49 = new java.lang.String[][] { strArray48 };
        java.lang.String[] strArray54 = new java.lang.String[] { "enwiki.random.lines.txt", "tests.maxfailures", "<unknown>", "tests.maxfailures" };
        java.lang.String[][] strArray55 = new java.lang.String[][] { strArray54 };
        java.lang.String[][][] strArray56 = new java.lang.String[][][] { strArray37, strArray43, strArray49, strArray55 };
        java.lang.String[][][][] strArray57 = new java.lang.String[][][][] { strArray56 };
        java.util.Set<java.lang.String[][][]> strArraySet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) strArraySet58);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2325");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.test.ESTestCase[][] eSTestCaseArray12 = new org.elasticsearch.test.ESTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) eSTestCaseArraySet13);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) 2);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 0.0d, (double) 0L);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2328");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (-1.0f), (float) 10, (float) 10);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2329");
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
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader44, terms45, terms46, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests51.tearDown();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        kuromojiAnalysisTests51.assertFieldsEquals("enwiki.random.lines.txt", indexReader54, fields55, fields56, true);
        kuromojiAnalysisTests51.setUp();
        kuromojiAnalysisTests51.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        kuromojiAnalysisTests51.assertFieldsEquals("enwiki.random.lines.txt", indexReader63, fields64, fields65, false);
        kuromojiAnalysisTests51.assertPathHasBeenCleared("random");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) throttling71);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) "random", (java.lang.Object) throttling71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "random");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (-1L));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2331");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.nightly", "europarl.lines.txt.gz", "tests.maxfailures", "tests.badapples", "tests.failfast" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray15);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray11, shortArray24);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray41, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray32, shortArray45);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray52, shortArray53);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray56);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray61, shortArray62);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray65);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray52, shortArray65);
        org.junit.Assert.assertArrayEquals("", shortArray45, shortArray65);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArray5, (java.lang.Object) shortArray65);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 4, (double) 10L, (double) 0.0f);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2333");
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
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.slow", indexReader43, (int) '4', postingsEnum45, postingsEnum46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.tearDown();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        kuromojiAnalysisTests48.assertFieldsEquals("enwiki.random.lines.txt", indexReader51, fields52, fields53, true);
        kuromojiAnalysisTests48.resetCheckIndexStatus();
        kuromojiAnalysisTests48.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests59 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests59.tearDown();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        kuromojiAnalysisTests59.assertTermsEquals("tests.failfast", indexReader62, terms63, terms64, false);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        kuromojiAnalysisTests59.assertDocsSkippingEquals("tests.nightly", indexReader68, (int) (byte) -1, postingsEnum70, postingsEnum71, false);
        org.junit.rules.RuleChain ruleChain74 = kuromojiAnalysisTests59.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures75 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures76 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures75);
        org.junit.rules.RuleChain ruleChain77 = ruleChain74.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures76);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling79 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray80 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling79 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet81 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray80);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList82 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray80);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling83 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray84 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling83 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet85 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray80, (java.lang.Object[]) throttlingArray84);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain74, (java.lang.Object) throttlingArray84);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain74);
        kuromojiAnalysisTests48.failureAndSuccessEvents = ruleChain74;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain74;
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2334");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = kuromojiAnalysisTests1.failureAndSuccessEvents;
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
        org.junit.rules.TestRule testRule37 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain38 = org.junit.rules.RuleChain.outerRule(testRule37);
        org.junit.rules.RuleChain ruleChain39 = ruleChain16.around(testRule37);
        org.junit.rules.RuleChain ruleChain40 = ruleChain4.around((org.junit.rules.TestRule) ruleChain16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests41 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests41.tearDown();
        kuromojiAnalysisTests41.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests41.tearDown();
        kuromojiAnalysisTests41.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests41.assertDocsEnumEquals("<unknown>", postingsEnum47, postingsEnum48, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain16, (java.lang.Object) postingsEnum47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) ruleChain16);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2335");
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
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("", indexReader45, fields46, fields47, true);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.weekly", indexReader51, (int) '#', postingsEnum53, postingsEnum54);
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum57, postingsEnum58);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) '4', (double) 10.0f);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2337");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("tests.weekly", indexReader7, fields8, fields9, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 'a');
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2339");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 1, (long) (byte) 10);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2340");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 1L, (double) 1L);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '4', (double) 5, (double) 4);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2342");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, 0.0f, (-1.0f));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, 0.0d, 0.0d);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2344");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet27 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray26);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling29 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet31 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray26, (java.lang.Object[]) throttlingArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.tearDown();
        kuromojiAnalysisTests33.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests33.tearDown();
        kuromojiAnalysisTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests33.assertPositionsSkippingEquals("tests.nightly", indexReader39, (int) ' ', postingsEnum41, postingsEnum42);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray26, (java.lang.Object) kuromojiAnalysisTests33);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) throttlingArray26);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2345");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) '4', (double) 10.0f);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2346");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray10, byteArray11);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray10, byteArray14);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray20, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray20);
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray14);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray32, byteArray33);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray32, byteArray36);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray42, byteArray43);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray42, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray42);
        org.junit.Assert.assertArrayEquals("hi!", byteArray4, byteArray7);
        byte[] byteArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray7, byteArray53);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2347");
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
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader44, terms45, terms46, true);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        java.lang.Object obj51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) kuromojiAnalysisTests1, obj51);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2348");
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
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("", postingsEnum39, postingsEnum40, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader45, terms46, terms47, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) true);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2349");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.badapples", indexReader12, terms13, terms14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader18, 1, postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader25, terms26, terms27, false);
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.weekly", 10, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 100, 100L);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) 1);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 'a');
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2353");
        int[][] intArray2 = new int[][] {};
        java.util.Set<int[]> intArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(intArray2);
        java.util.List<int[]> intArrayList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, intArray2);
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule8 = kuromojiAnalysisTests7.ruleChain;
        kuromojiAnalysisTests7.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests7);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests7.assertTermsEquals("random", indexReader12, terms13, terms14, false);
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests7.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement18 = null;
        org.junit.runner.Description description19 = null;
        org.junit.runners.model.Statement statement20 = ruleChain17.apply(statement18, description19);
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
        org.junit.runner.Description description36 = null;
        org.junit.runners.model.Statement statement37 = ruleChain17.apply(statement35, description36);
        org.junit.runner.Description description38 = null;
        org.junit.runners.model.Statement statement39 = ruleChain5.apply(statement35, description38);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests40.tearDown();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        kuromojiAnalysisTests40.assertTermsEquals("tests.failfast", indexReader43, terms44, terms45, false);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests40.assertDocsSkippingEquals("tests.nightly", indexReader49, (int) (byte) -1, postingsEnum51, postingsEnum52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests40.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader56, (int) (short) -1, postingsEnum58, postingsEnum59);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule63 = kuromojiAnalysisTests62.ruleChain;
        kuromojiAnalysisTests62.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests62);
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests62.failureAndSuccessEvents;
        kuromojiAnalysisTests40.failureAndSuccessEvents = ruleChain66;
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests40.assertDocsSkippingEquals("tests.badapples", indexReader69, 0, postingsEnum71, postingsEnum72, true);
        kuromojiAnalysisTests40.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain5, (java.lang.Object) kuromojiAnalysisTests40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests77 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule78 = kuromojiAnalysisTests77.ruleChain;
        org.junit.rules.RuleChain ruleChain79 = org.junit.rules.RuleChain.outerRule(testRule78);
        org.junit.rules.RuleChain ruleChain80 = ruleChain5.around(testRule78);
        org.junit.rules.RuleChain ruleChain81 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain5);
        org.junit.rules.RuleChain ruleChain82 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) (byte) 0, (java.lang.Object) ruleChain82);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2354");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) 4);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2355");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (byte) 0);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0f, (float) (short) 1, (-1.0f));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2357");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (short) 10, (float) (-1L));
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2358");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader5, fields6, fields7, true);
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("", indexReader18, 0, postingsEnum20, postingsEnum21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) "");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) 0L, (float) 1);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2360");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 4, 100.0d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2361");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) serializableIterableArray61);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2362");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 100, (-1.0d), (double) 10.0f);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2363");
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray12);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray20, (java.lang.Object[]) serializableArray22);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray22);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) executorServiceArray27);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) executorServiceArray45);
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
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) serializableArray7, (java.lang.Object) false);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) serializableArray7);
        java.lang.Object obj65 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling67 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray68 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling67 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet69 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray68);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList70 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray68);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray72 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling71 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet73 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray68, (java.lang.Object[]) throttlingArray72);
        org.junit.Assert.assertNotEquals(obj65, (java.lang.Object) throttlingArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray68);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 10, 1.0d);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2365");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2366");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2367");
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
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24);
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
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        double[] doubleArray44 = new double[] {};
        double[] doubleArray45 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray45, (double) '4');
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray49, (double) (byte) -1);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray54, (double) 2);
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain43, (java.lang.Object) doubleArray45);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) '4');
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray67, (double) (byte) -1);
        double[] doubleArray72 = new double[] {};
        double[] doubleArray73 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray73, (double) '4');
        double[] doubleArray76 = new double[] {};
        double[] doubleArray77 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray76, doubleArray77, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray77, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray63, doubleArray77, (-1.0d));
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray77, (double) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests86 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule87 = kuromojiAnalysisTests86.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule87;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule87;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray45, (java.lang.Object) testRule87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2368");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, 0L);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2369");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.weekly", indexReader7, (int) (short) 1, postingsEnum9, postingsEnum10);
        java.lang.String str12 = kuromojiAnalysisTests2.getTestName();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("", indexReader16, fields17, fields18, false);
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests41 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests41.tearDown();
        kuromojiAnalysisTests41.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests41.ensureCleanedUp();
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests41.ruleChain;
        kuromojiAnalysisTests41.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain40, (java.lang.Object) kuromojiAnalysisTests41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) fields17, (java.lang.Object) ruleChain40);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2370");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (-1), 0.0d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2371");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10.0f, (double) (byte) -1);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2372");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 10, (double) 0L);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2373");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '4');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray6, (double) (short) 10);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) '4');
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray18, (double) (byte) -1);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) '4');
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray28, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray23, (double) 100);
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) '4');
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray41, (double) (short) 10);
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) '4');
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray51, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray41, doubleArray46, (double) 4);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray14, doubleArray46, 0.0d);
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) '4');
        double[] doubleArray64 = new double[] {};
        double[] doubleArray65 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray65, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray65, (double) (short) 10);
        double[] doubleArray70 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray70, (double) 10L);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray60, (double) 1L);
        double[] doubleArray75 = new double[] {};
        double[] doubleArray76 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray76, (double) '4');
        double[] doubleArray79 = new double[] {};
        double[] doubleArray80 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray80, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray80, (double) (short) 10);
        double[] doubleArray85 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray85, (double) 10L);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray46, doubleArray85, (double) (short) 0);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray85, 0.0d);
        double[] doubleArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray85, doubleArray92, (double) (short) -1);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2374");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray7, charArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) charArray10);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) '4');
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2376");
        long[] longArray2 = new long[] { (byte) 0 };
        long[] longArray4 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray7 = new long[] { (byte) 0 };
        long[] longArray9 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray7, longArray9);
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
        long[] longArray14 = new long[] { (byte) 0 };
        long[] longArray16 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray14, longArray16);
        long[] longArray19 = new long[] { (byte) 0 };
        long[] longArray21 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray19, longArray21);
        org.junit.Assert.assertArrayEquals(longArray14, longArray21);
        long[] longArray25 = new long[] { (byte) 0 };
        long[] longArray27 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray25, longArray27);
        long[] longArray30 = new long[] { (byte) 0 };
        long[] longArray32 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray30, longArray32);
        org.junit.Assert.assertArrayEquals(longArray25, longArray32);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray14, longArray25);
        org.junit.Assert.assertArrayEquals(longArray9, longArray25);
        long[] longArray38 = new long[] { (byte) 0 };
        long[] longArray40 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray25, longArray40);
        long[] longArray43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray40, longArray43);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2377");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 10L, (double) (short) 10);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2378");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("random", postingsEnum7, postingsEnum8, true);
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
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("tests.badapples", indexReader40, 0, postingsEnum42, postingsEnum43, true);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        kuromojiAnalysisTests11.assertTermsEquals("random", indexReader47, terms48, terms49, false);
        kuromojiAnalysisTests11.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests11.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        kuromojiAnalysisTests11.assertTermsEquals("europarl.lines.txt.gz", indexReader55, terms56, terms57, false);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("tests.maxfailures", indexReader61, fields62, fields63, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("", (java.lang.Object) postingsEnum8, (java.lang.Object) indexReader61);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 1, (double) 10);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2380");
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
        org.apache.lucene.index.NumericDocValues numericDocValues67 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", 0, numericDocValues67, numericDocValues68);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2381");
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
        kuromojiAnalysisTests3.tearDown();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) kuromojiAnalysisTests3);
        kuromojiAnalysisTests3.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests3);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2382");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10L, 100.0d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2383");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '4');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray6, (double) (short) 10);
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray11, (double) 10L);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) '4');
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray20, (double) (byte) -1);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) '4');
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray30, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray25, (double) 100);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) '4');
        double[] doubleArray42 = new double[] {};
        double[] doubleArray43 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray43, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray43, (double) (byte) -1);
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray48, (double) 2);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) '4');
        org.junit.Assert.assertArrayEquals("", doubleArray48, doubleArray54, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray25, doubleArray48, (double) ' ');
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray11, doubleArray48, (double) (-1L));
        double[] doubleArray64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray64, (double) 10);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2384");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2385");
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
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests26.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.outerRule(testRule27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests31.ruleChain;
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.outerRule(testRule32);
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain33);
        org.junit.rules.RuleChain ruleChain35 = ruleChain30.around((org.junit.rules.TestRule) ruleChain34);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain34;
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (byte) 10, (double) 5);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2387");
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
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests26.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.outerRule(testRule27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests31.ruleChain;
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.outerRule(testRule32);
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain33);
        org.junit.rules.RuleChain ruleChain35 = ruleChain30.around((org.junit.rules.TestRule) ruleChain34);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain34;
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule38 = null;
        org.junit.rules.RuleChain ruleChain39 = org.junit.rules.RuleChain.outerRule(testRule38);
        org.junit.rules.RuleChain ruleChain40 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain40);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2388");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 10L, (long) (short) 0);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2389");
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray9);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray15);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray18);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray25, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray29);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray25, shortArray38);
        org.junit.Assert.assertArrayEquals("", shortArray18, shortArray38);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray46, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray50);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray46, shortArray56);
        org.junit.Assert.assertArrayEquals("random", shortArray38, shortArray56);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray62, shortArray63);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray67, shortArray68);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray71);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray76, shortArray77);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray80);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray67, shortArray80);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray62, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray62);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests87 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule88 = kuromojiAnalysisTests87.ruleChain;
        kuromojiAnalysisTests87.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain90 = kuromojiAnalysisTests87.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) shortArray38, (java.lang.Object) ruleChain90);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2390");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 100.0f);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2391");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) ' ', (double) 100);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2392");
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
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", 3, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2393");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (-1), (double) (short) 0, 0.0d);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 100L);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2395");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (-1L));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2396");
        java.lang.Object obj1 = null;
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray3, longArray10);
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
        org.junit.Assert.assertArrayEquals(longArray10, longArray26);
        long[] longArray44 = new long[] { (byte) 0 };
        long[] longArray46 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray44, longArray46);
        long[] longArray49 = new long[] { (byte) 0 };
        long[] longArray51 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray49, longArray51);
        org.junit.Assert.assertArrayEquals("", longArray44, longArray51);
        long[] longArray56 = new long[] { (byte) 0 };
        long[] longArray58 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray56, longArray58);
        long[] longArray61 = new long[] { (byte) 0 };
        long[] longArray63 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray61, longArray63);
        org.junit.Assert.assertArrayEquals("", longArray56, longArray63);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray44, longArray63);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) longArray63);
        long[] longArray70 = new long[] { (byte) 0 };
        long[] longArray72 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray70, longArray72);
        long[] longArray75 = new long[] { (byte) 0 };
        long[] longArray77 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray75, longArray77);
        org.junit.Assert.assertArrayEquals("", longArray70, longArray77);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray63, longArray77);
        org.junit.Assert.assertArrayEquals(longArray10, longArray77);
        org.junit.Assert.assertNotEquals(obj1, (java.lang.Object) longArray10);
        long[] longArray83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray10, longArray83);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2397");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) '4', (double) ' ');
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2398");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (-1.0f), (float) (short) 100);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2399");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray2, shortArray15);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray26);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray22, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray35);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray45, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray49);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray54, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray45, shortArray58);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray65, shortArray66);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray69);
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray74, shortArray75);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray78, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray78);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray65, shortArray78);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray58, shortArray65);
        short[] shortArray85 = new short[] {};
        short[] shortArray86 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray85, shortArray86);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray65, shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray65);
        java.lang.Object obj90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray35, obj90);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2400");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (-1.0d));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2401");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 2);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2402");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) '4', 100L);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2403");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.lang.Object obj3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) genericDeclarationArraySet2, obj3);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (-1L), (long) (byte) 10);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2405");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0d, (double) (byte) 10);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2406");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests4.assertTermsEquals("tests.failfast", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests4.assertTermsEquals("", indexReader13, terms14, terms15, false);
        kuromojiAnalysisTests4.ensureCleanedUp();
        kuromojiAnalysisTests4.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests4);
        kuromojiAnalysisTests4.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests4.assertDocValuesEquals("tests.badapples", (int) (byte) 1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2407");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0.0d, (double) (short) 0, 0.0d);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2408");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray10);
        long[] longArray14 = new long[] { (byte) 0 };
        long[] longArray16 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray14, longArray16);
        long[] longArray19 = new long[] { (byte) 0 };
        long[] longArray21 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray19, longArray21);
        org.junit.Assert.assertArrayEquals(longArray14, longArray21);
        long[] longArray26 = new long[] { (byte) 0 };
        long[] longArray28 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray26, longArray28);
        long[] longArray31 = new long[] { (byte) 0 };
        long[] longArray33 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray31, longArray33);
        org.junit.Assert.assertArrayEquals(longArray26, longArray33);
        long[] longArray37 = new long[] { (byte) 0 };
        long[] longArray39 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray37, longArray39);
        long[] longArray42 = new long[] { (byte) 0 };
        long[] longArray44 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray42, longArray44);
        org.junit.Assert.assertArrayEquals(longArray37, longArray44);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray26, longArray37);
        org.junit.Assert.assertArrayEquals(longArray21, longArray37);
        org.junit.Assert.assertArrayEquals(longArray3, longArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) longArray3);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2409");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (-1), (float) 1, 0.0f);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2410");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1L), (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2411");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.weekly", indexReader7, (int) (short) 1, postingsEnum9, postingsEnum10);
        java.lang.String str12 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) 'a');
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests16.ruleChain;
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests16.tearDown();
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
        org.junit.runner.Description description50 = null;
        org.junit.runners.model.Statement statement51 = ruleChain31.apply(statement49, description50);
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain31;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests54.ruleChain;
        org.junit.rules.RuleChain ruleChain56 = org.junit.rules.RuleChain.outerRule(testRule55);
        org.junit.rules.RuleChain ruleChain57 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain56);
        org.junit.rules.RuleChain ruleChain58 = ruleChain31.around((org.junit.rules.TestRule) ruleChain57);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain31;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("random", postingsEnum61, postingsEnum62);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2412");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray11);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) serializableArray11);
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
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) serializableArray24);
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
        org.junit.Assert.assertNotNull((java.lang.Object) serializableArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) serializableArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", objArray1, (java.lang.Object[]) serializableArray42);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2413");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, false);
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests18.ruleChain;
        kuromojiAnalysisTests18.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests18.tearDown();
        kuromojiAnalysisTests18.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests18.setUp();
        kuromojiAnalysisTests18.ensureCleanedUp();
        kuromojiAnalysisTests18.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests18.assertTermsEquals("enwiki.random.lines.txt", indexReader27, terms28, terms29, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) terms29);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2414");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) 0L, (-1.0d), (double) 'a');
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2415");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 5);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2416");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10, (double) (byte) -1, 1.0d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2417");
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
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2418");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (short) -1, (float) 100, (float) (short) 0);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2419");
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
        org.junit.Assert.assertArrayEquals(longArray3, longArray26);
        long[] longArray44 = new long[] { (byte) 0 };
        long[] longArray46 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray44, longArray46);
        long[] longArray49 = new long[] { (byte) 0 };
        long[] longArray51 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray49, longArray51);
        org.junit.Assert.assertArrayEquals("", longArray44, longArray51);
        long[] longArray56 = new long[] { (byte) 0 };
        long[] longArray58 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray56, longArray58);
        long[] longArray61 = new long[] { (byte) 0 };
        long[] longArray63 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray61, longArray63);
        org.junit.Assert.assertArrayEquals("", longArray56, longArray63);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray44, longArray63);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) longArray63);
        long[] longArray70 = new long[] { (byte) 0 };
        long[] longArray72 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray70, longArray72);
        long[] longArray75 = new long[] { (byte) 0 };
        long[] longArray77 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray75, longArray77);
        org.junit.Assert.assertArrayEquals("", longArray70, longArray77);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray63, longArray77);
        org.junit.Assert.assertArrayEquals(longArray26, longArray77);
        long[] longArray85 = new long[] { (byte) 0 };
        long[] longArray87 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray85, longArray87);
        long[] longArray90 = new long[] { (byte) 0 };
        long[] longArray92 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray90, longArray92);
        org.junit.Assert.assertArrayEquals("", longArray85, longArray92);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) longArray85);
        org.junit.Assert.assertArrayEquals(longArray77, longArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) longArray77);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2420");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 3, (double) (-1L));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2421");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests8.assertTermsEquals("tests.failfast", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests8.assertDocsSkippingEquals("tests.nightly", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests8.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (short) -1, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests30.ruleChain;
        kuromojiAnalysisTests30.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests30);
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests30.failureAndSuccessEvents;
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain34;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests8.assertDocsSkippingEquals("tests.badapples", indexReader37, 0, postingsEnum39, postingsEnum40, true);
        kuromojiAnalysisTests8.ensureCheckIndexPassed();
        kuromojiAnalysisTests8.ensureCheckIndexPassed();
        kuromojiAnalysisTests8.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests8.assertDocsEnumEquals("tests.nightly", postingsEnum48, postingsEnum49, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests8);
        kuromojiAnalysisTests8.ensureCheckIndexPassed();
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) serializableArray62);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray62);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet68 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray67);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray70, (java.lang.Object[]) serializableArray72);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray67, (java.lang.Object[]) serializableArray72);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray67);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests77 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule78 = kuromojiAnalysisTests77.ruleChain;
        kuromojiAnalysisTests77.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests77.tearDown();
        kuromojiAnalysisTests77.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests77.setUp();
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) serializableArray67, (java.lang.Object) kuromojiAnalysisTests77);
        org.junit.rules.RuleChain ruleChain84 = kuromojiAnalysisTests77.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests8, (java.lang.Object) ruleChain84);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2422");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (byte) 1, (double) (byte) 1, (-1.0d));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2423");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.slow", indexReader14, terms15, terms16, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "tests.slow");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2424");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (long) (short) 0);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2425");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 100L);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2426");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = kuromojiAnalysisTests1.failureAndSuccessEvents;
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
        org.junit.rules.TestRule testRule37 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain38 = org.junit.rules.RuleChain.outerRule(testRule37);
        org.junit.rules.RuleChain ruleChain39 = ruleChain16.around(testRule37);
        org.junit.rules.RuleChain ruleChain40 = ruleChain4.around((org.junit.rules.TestRule) ruleChain16);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain4;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.tearDown();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        kuromojiAnalysisTests42.assertFieldsEquals("enwiki.random.lines.txt", indexReader45, fields46, fields47, true);
        kuromojiAnalysisTests42.setUp();
        kuromojiAnalysisTests42.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        kuromojiAnalysisTests42.assertFieldsEquals("enwiki.random.lines.txt", indexReader54, fields55, fields56, false);
        org.junit.rules.TestRule testRule59 = kuromojiAnalysisTests42.ruleChain;
        java.lang.String str60 = kuromojiAnalysisTests42.getTestName();
        org.junit.rules.RuleChain ruleChain61 = kuromojiAnalysisTests42.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain62 = ruleChain4.around((org.junit.rules.TestRule) ruleChain61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) ruleChain4);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2427");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) throttling6);
        org.junit.Assert.assertNotNull((java.lang.Object) throttling6);
        java.lang.Object obj9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) throttling6, obj9);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2428");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 100);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2429");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, (double) 0, (double) 100L);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2430");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) (short) 1, (double) ' ');
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2431");
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
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests0.assertTermsEquals("<unknown>", indexReader24, terms25, terms26, true);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2432");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", 0L, 0L);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2433");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (byte) 0);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2434");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray3, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray8, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray13, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray13, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray8, shortArray13);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray33, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray33);
        org.junit.Assert.assertArrayEquals("hi!", shortArray3, shortArray13);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray45, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray49);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray55, shortArray56);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray59);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray64, shortArray65);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray68);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray55, shortArray68);
        org.junit.Assert.assertArrayEquals("", shortArray49, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray55);
        short[] shortArray75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray55, shortArray75);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2435");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (short) 10);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, 100L);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2437");
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
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) '4');
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum46, postingsEnum47);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2438");
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
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray17, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray3, doubleArray17, (-1.0d));
        double[] doubleArray30 = new double[] { 0.0d, 10L, 10.0d, (short) 100, '4', (-1.0d) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray17, doubleArray30, (double) (byte) 0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2439");
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
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.monster", 4, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2440");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100L, (double) 100.0f);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2441");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.setUp();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.outerRule(testRule9);
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule(testRule9);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) testRule9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule9);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2442");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.slow", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2443");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 5, (float) (-1), (float) (short) -1);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2444");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader5, fields6, fields7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.monster", indexReader11, terms12, terms13, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests16.ruleChain;
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests16.tearDown();
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
        org.junit.runner.Description description50 = null;
        org.junit.runners.model.Statement statement51 = ruleChain31.apply(statement49, description50);
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain31;
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader11, (java.lang.Object) ruleChain53);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2445");
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
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader19, (int) (short) 0, postingsEnum21, postingsEnum22);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2446");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, (double) 1L, 0.0d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2447");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, 3, postingsEnum16, postingsEnum17);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2448");
        double[] doubleArray7 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray8 = new double[][] { doubleArray7 };
        double[] doubleArray15 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray16 = new double[][] { doubleArray15 };
        double[] doubleArray23 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray24 = new double[][] { doubleArray23 };
        double[] doubleArray31 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray32 = new double[][] { doubleArray31 };
        double[] doubleArray39 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray40 = new double[][] { doubleArray39 };
        double[][][] doubleArray41 = new double[][][] { doubleArray8, doubleArray16, doubleArray24, doubleArray32, doubleArray40 };
        java.util.Set<double[][]> doubleArraySet42 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray41);
        java.lang.Object obj43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) doubleArraySet42, obj43);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2449");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader14, terms15, terms16, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.monster");
        java.lang.Object obj21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) kuromojiAnalysisTests2, obj21);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2450");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) serializableArray49);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2451");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0L, (-1L));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2452");
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
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.Object obj15 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, obj15);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 2);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2453");
        java.lang.Object[] objArray1 = null;
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
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray50);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) executorServiceArray58);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet68 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray67);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet70 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray69);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray67, (java.lang.Object[]) serializableArray69);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray64, (java.lang.Object[]) serializableArray69);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet75 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray74);
        java.io.Serializable[] serializableArray77 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet78 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray77);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet80 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray79);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray77, (java.lang.Object[]) serializableArray79);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray74, (java.lang.Object[]) serializableArray79);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray64, (java.lang.Object[]) serializableArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray64, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray84);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", objArray1, (java.lang.Object[]) executorServiceArray84);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2454");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray3, longArray10);
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
        org.junit.Assert.assertArrayEquals(longArray10, longArray26);
        long[] longArray39 = new long[] { (byte) 0 };
        long[] longArray41 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray39, longArray41);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray26, longArray41);
        long[] longArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray41, longArray44);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2455");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (short) 0);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2456");
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
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2457");
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
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray24);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray34);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray34);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray29);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray47);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray55, (java.lang.Object[]) serializableArray57);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray52, (java.lang.Object[]) serializableArray57);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray52);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet66 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray63);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray63);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet76 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray75);
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet79 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray78);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray78, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray75, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray72, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableArray10);
        java.lang.Object[] objArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray10, objArray88);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2458");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) ' ', (-1L));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2459");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray4);
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
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests6.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) (short) -1, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests28.ruleChain;
        kuromojiAnalysisTests28.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests28);
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests28.failureAndSuccessEvents;
        kuromojiAnalysisTests6.failureAndSuccessEvents = ruleChain32;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests6.assertDocsSkippingEquals("tests.badapples", indexReader35, 0, postingsEnum37, postingsEnum38, true);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests6.assertTermsEquals("random", indexReader42, terms43, terms44, false);
        kuromojiAnalysisTests6.overrideTestDefaultQueryCache();
        java.lang.String str48 = kuromojiAnalysisTests6.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule51 = kuromojiAnalysisTests50.ruleChain;
        kuromojiAnalysisTests50.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests50);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        kuromojiAnalysisTests50.assertTermsEquals("random", indexReader55, terms56, terms57, false);
        org.junit.rules.RuleChain ruleChain60 = kuromojiAnalysisTests50.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement61 = null;
        org.junit.runner.Description description62 = null;
        org.junit.runners.model.Statement statement63 = ruleChain60.apply(statement61, description62);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests65 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule66 = kuromojiAnalysisTests65.ruleChain;
        kuromojiAnalysisTests65.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests65);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        kuromojiAnalysisTests65.assertTermsEquals("random", indexReader70, terms71, terms72, false);
        org.junit.rules.RuleChain ruleChain75 = kuromojiAnalysisTests65.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement76 = null;
        org.junit.runner.Description description77 = null;
        org.junit.runners.model.Statement statement78 = ruleChain75.apply(statement76, description77);
        org.junit.runner.Description description79 = null;
        org.junit.runners.model.Statement statement80 = ruleChain60.apply(statement78, description79);
        org.junit.rules.TestRule testRule81 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain82 = org.junit.rules.RuleChain.outerRule(testRule81);
        org.junit.rules.RuleChain ruleChain83 = ruleChain60.around(testRule81);
        kuromojiAnalysisTests6.failureAndSuccessEvents = ruleChain83;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) byteArray3, (java.lang.Object) kuromojiAnalysisTests6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2460");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        long[] longArray18 = new long[] { (byte) 0 };
        long[] longArray20 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray18, longArray20);
        long[] longArray23 = new long[] { (byte) 0 };
        long[] longArray25 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray23, longArray25);
        org.junit.Assert.assertArrayEquals("", longArray18, longArray25);
        long[] longArray29 = new long[] { (byte) 0 };
        long[] longArray31 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray29, longArray31);
        long[] longArray34 = new long[] { (byte) 0 };
        long[] longArray36 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray34, longArray36);
        org.junit.Assert.assertArrayEquals(longArray29, longArray36);
        long[] longArray41 = new long[] { (byte) 0 };
        long[] longArray43 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray41, longArray43);
        long[] longArray46 = new long[] { (byte) 0 };
        long[] longArray48 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray46, longArray48);
        org.junit.Assert.assertArrayEquals(longArray41, longArray48);
        long[] longArray52 = new long[] { (byte) 0 };
        long[] longArray54 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray52, longArray54);
        long[] longArray57 = new long[] { (byte) 0 };
        long[] longArray59 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray57, longArray59);
        org.junit.Assert.assertArrayEquals(longArray52, longArray59);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray41, longArray52);
        org.junit.Assert.assertArrayEquals(longArray36, longArray52);
        org.junit.Assert.assertArrayEquals(longArray18, longArray52);
        long[] longArray66 = new long[] { (byte) 0 };
        long[] longArray68 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray66, longArray68);
        long[] longArray71 = new long[] { (byte) 0 };
        long[] longArray73 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray71, longArray73);
        org.junit.Assert.assertArrayEquals(longArray66, longArray73);
        org.junit.Assert.assertArrayEquals(longArray18, longArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) longArray66);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2461");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 0, (double) (-1L));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2462");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet6 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray5);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet10 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests12.tearDown();
        kuromojiAnalysisTests12.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("tests.nightly", indexReader18, (int) ' ', postingsEnum20, postingsEnum21);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray5, (java.lang.Object) kuromojiAnalysisTests12);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests24.assertTermsEquals("tests.failfast", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests24.assertDocsSkippingEquals("tests.nightly", indexReader33, (int) (byte) -1, postingsEnum35, postingsEnum36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader40, (int) (short) -1, postingsEnum42, postingsEnum43);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule47 = kuromojiAnalysisTests46.ruleChain;
        kuromojiAnalysisTests46.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests46);
        org.junit.rules.RuleChain ruleChain50 = kuromojiAnalysisTests46.failureAndSuccessEvents;
        kuromojiAnalysisTests24.failureAndSuccessEvents = ruleChain50;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests24.assertDocsSkippingEquals("tests.badapples", indexReader53, 0, postingsEnum55, postingsEnum56, true);
        kuromojiAnalysisTests24.ensureCheckIndexPassed();
        kuromojiAnalysisTests24.ensureCheckIndexPassed();
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests12, (java.lang.Object) kuromojiAnalysisTests24);
        kuromojiAnalysisTests12.ensureCleanedUp();
        kuromojiAnalysisTests12.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) queryCachingPolicy1, (java.lang.Object) kuromojiAnalysisTests12);
        java.lang.String str66 = kuromojiAnalysisTests12.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests12.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum68, postingsEnum69);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2463");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2464");
        java.lang.Iterable[][][] iterableArray2 = new java.lang.Iterable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[][][] serializableIterableArray3 = (java.lang.Iterable<java.io.Serializable>[][][]) iterableArray2;
        java.util.Set<java.lang.Iterable<java.io.Serializable>[][]> serializableIterableArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableIterableArray3);
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (short) -1, postingsEnum23, postingsEnum24);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests27.ruleChain;
        kuromojiAnalysisTests27.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests27);
        org.junit.rules.RuleChain ruleChain31 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        kuromojiAnalysisTests5.failureAndSuccessEvents = ruleChain31;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests5.assertDocsSkippingEquals("tests.badapples", indexReader34, 0, postingsEnum36, postingsEnum37, true);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        kuromojiAnalysisTests5.assertTermsEquals("random", indexReader41, terms42, terms43, false);
        kuromojiAnalysisTests5.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass47 = kuromojiAnalysisTests5.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) serializableIterableArray3, (java.lang.Object) wildcardClass47);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2465");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 10.0f, (double) 10L, (double) 100L);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2466");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 'a');
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2467");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 100L, 0L);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2468");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100, (double) (-1L), (double) 10);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2469");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) (-1), (double) '#');
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2470");
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
        org.junit.Assert.assertArrayEquals(longArray22, longArray26);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2471");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0.0f, (float) 3, (float) 2);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2472");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray9, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray14, byteArray18);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray24, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray18);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray36, byteArray37);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray41, byteArray42);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray41, byteArray45);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray51, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray51, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray37, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray37);
        org.junit.Assert.assertArrayEquals("", byteArray4, byteArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray18);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2473");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (short) 100);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2474");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray5);
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
        org.junit.Assert.assertArrayEquals("", byteArray4, byteArray13);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests29.tearDown();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        kuromojiAnalysisTests29.assertTermsEquals("tests.failfast", indexReader32, terms33, terms34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests29.assertDocsSkippingEquals("tests.nightly", indexReader38, (int) (byte) -1, postingsEnum40, postingsEnum41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader45, (int) (short) -1, postingsEnum47, postingsEnum48);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule52 = kuromojiAnalysisTests51.ruleChain;
        kuromojiAnalysisTests51.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests51);
        org.junit.rules.RuleChain ruleChain55 = kuromojiAnalysisTests51.failureAndSuccessEvents;
        kuromojiAnalysisTests29.failureAndSuccessEvents = ruleChain55;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        kuromojiAnalysisTests29.assertDocsSkippingEquals("tests.badapples", indexReader58, 0, postingsEnum60, postingsEnum61, true);
        kuromojiAnalysisTests29.ensureCheckIndexPassed();
        kuromojiAnalysisTests29.ensureCheckIndexPassed();
        kuromojiAnalysisTests29.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests29.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) byteArray13, (java.lang.Object) kuromojiAnalysisTests29);
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        kuromojiAnalysisTests29.assertDocsEnumEquals("hi!", postingsEnum70, postingsEnum71, true);
        org.junit.rules.RuleChain ruleChain74 = kuromojiAnalysisTests29.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests76 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule77 = kuromojiAnalysisTests76.ruleChain;
        kuromojiAnalysisTests76.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests76);
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        org.apache.lucene.index.Terms terms83 = null;
        kuromojiAnalysisTests76.assertTermsEquals("random", indexReader81, terms82, terms83, false);
        org.junit.rules.RuleChain ruleChain86 = kuromojiAnalysisTests76.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.Terms terms89 = null;
        org.apache.lucene.index.Terms terms90 = null;
        kuromojiAnalysisTests76.assertTermsEquals("europarl.lines.txt.gz", indexReader88, terms89, terms90, false);
        kuromojiAnalysisTests76.resetCheckIndexStatus();
        kuromojiAnalysisTests76.ensureCheckIndexPassed();
        kuromojiAnalysisTests76.tearDown();
        kuromojiAnalysisTests76.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) ruleChain74, (java.lang.Object) kuromojiAnalysisTests76);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2475");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (-1.0f));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2476");
        char[] charArray6 = new char[] { '#', '4', ' ', '#', ' ' };
        char[] charArray12 = new char[] { '#', '4', ' ', '#', ' ' };
        char[] charArray18 = new char[] { '#', '4', ' ', '#', ' ' };
        char[] charArray24 = new char[] { '#', '4', ' ', '#', ' ' };
        char[] charArray30 = new char[] { '#', '4', ' ', '#', ' ' };
        char[][] charArray31 = new char[][] { charArray6, charArray12, charArray18, charArray24, charArray30 };
        java.util.Set<char[]> charArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(charArray31);
        java.util.List<char[]> charArrayList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, charArray31);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray42);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray52);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) serializableArray52);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) executorServiceArray57);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray62, (java.lang.Object[]) serializableArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray62, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray37, (java.lang.Object[]) executorServiceArray67);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests73 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule74 = kuromojiAnalysisTests73.ruleChain;
        kuromojiAnalysisTests73.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests73.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray67, (java.lang.Object) kuromojiAnalysisTests73);
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charArray31, (java.lang.Object[]) executorServiceArray67);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2477");
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
        java.util.Set<org.junit.rules.TestRule> testRuleSet30 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray27);
        java.util.Set<org.junit.rules.TestRule> testRuleSet31 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray27);
        java.lang.Object[] objArray32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray27, objArray32);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2478");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (-1));
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader9, fields10, fields11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, (int) 'a', postingsEnum17, postingsEnum18);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests21.assertTermsEquals("tests.failfast", indexReader24, terms25, terms26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests21.assertDocsSkippingEquals("tests.nightly", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33, false);
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures37);
        org.junit.rules.RuleChain ruleChain39 = ruleChain36.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling41 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet43 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray42);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList44 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling45 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet47 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray42, (java.lang.Object[]) throttlingArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain36, (java.lang.Object) throttlingArray46);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain36);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain36;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain36;
        org.junit.rules.RuleChain ruleChain53 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) ruleChain53, (java.lang.Object) (short) 100);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2479");
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
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) ' ');
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
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        kuromojiAnalysisTests39.assertTermsEquals("", indexReader55, terms56, terms57, true);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests39.assertDocsSkippingEquals("<unknown>", indexReader61, (int) (byte) 100, postingsEnum63, postingsEnum64, false);
        kuromojiAnalysisTests39.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule69 = kuromojiAnalysisTests39.ruleChain;
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
        org.junit.rules.RuleChain ruleChain85 = kuromojiAnalysisTests70.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain86 = kuromojiAnalysisTests70.failureAndSuccessEvents;
        kuromojiAnalysisTests39.failureAndSuccessEvents = ruleChain86;
        java.lang.Object obj88 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests39, obj88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests39);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2480");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 5);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) '#', 0L);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2482");
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
        org.junit.rules.RuleChain ruleChain41 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain38);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain38;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests43.tearDown();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        kuromojiAnalysisTests43.assertFieldsEquals("enwiki.random.lines.txt", indexReader46, fields47, fields48, true);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests43.assertDocsEnumEquals("tests.monster", postingsEnum52, postingsEnum53, true);
        kuromojiAnalysisTests43.resetCheckIndexStatus();
        kuromojiAnalysisTests43.ensureCleanedUp();
        kuromojiAnalysisTests43.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests43.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain38, (java.lang.Object) kuromojiAnalysisTests43);
        kuromojiAnalysisTests43.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests62.tearDown();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        kuromojiAnalysisTests62.assertTermsEquals("tests.failfast", indexReader65, terms66, terms67, false);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        kuromojiAnalysisTests62.assertDocsSkippingEquals("tests.nightly", indexReader71, (int) (byte) -1, postingsEnum73, postingsEnum74, false);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        kuromojiAnalysisTests62.assertTermsEquals("", indexReader78, terms79, terms80, true);
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        kuromojiAnalysisTests62.assertDocsSkippingEquals("<unknown>", indexReader84, (int) (byte) 100, postingsEnum86, postingsEnum87, false);
        kuromojiAnalysisTests62.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule92 = kuromojiAnalysisTests62.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule92);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule92;
        java.lang.Class<?> wildcardClass95 = testRule92.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests43, (java.lang.Object) testRule92);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) 1L, (float) 10L, (float) 5);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2484");
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
        double[] doubleArray50 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray51 = new double[][] { doubleArray50 };
        double[] doubleArray58 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray59 = new double[][] { doubleArray58 };
        double[] doubleArray66 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray67 = new double[][] { doubleArray66 };
        double[] doubleArray74 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray75 = new double[][] { doubleArray74 };
        double[] doubleArray82 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray83 = new double[][] { doubleArray82 };
        double[][][] doubleArray84 = new double[][][] { doubleArray51, doubleArray59, doubleArray67, doubleArray75, doubleArray83 };
        java.util.Set<double[][]> doubleArraySet85 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) doubleArray84);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2485");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray9);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) serializableArray9);
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
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) executorServiceArray4, (java.lang.Object) boolean31);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) serializableArray42);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray34, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) serializableArray71);
        java.lang.Object[] objArray80 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, objArray80);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2486");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100, 0.0d, (double) 0);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2487");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.badapples");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2488");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
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
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray6);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray3, (java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray30, (java.lang.Object[]) serializableArray32);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) serializableArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray27);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) serializableArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray46);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray56);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray51, (java.lang.Object[]) serializableArray56);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) serializableArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) serializableArray41);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2489");
        float[] floatArray1 = null;
        float[] floatArray9 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray16 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray33 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray33, 1.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray16, (float) 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2490");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) ' ', (float) 0L, (float) (byte) 0);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2491");
        double[][] doubleArray0 = new double[][] {};
        java.util.Set<double[]> doubleArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray0);
        java.lang.Object[] objArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray0, objArray2);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2492");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (short) 10);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2493");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 10.0d);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2494");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray9);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray20, charArray23);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray27, charArray30);
        org.junit.Assert.assertArrayEquals("random", charArray20, charArray27);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray27, charArray35);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray40, charArray43);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals(charArray48, charArray51);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray55, charArray58);
        org.junit.Assert.assertArrayEquals("random", charArray48, charArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray43, charArray55);
        org.junit.Assert.assertArrayEquals(charArray27, charArray43);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals(charArray65, charArray68);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray43, charArray68);
        org.junit.Assert.assertArrayEquals(charArray9, charArray68);
        char[] charArray75 = new char[] {};
        char[] charArray76 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray75, charArray76);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray78, charArray79);
        org.junit.Assert.assertArrayEquals(charArray76, charArray79);
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray82, charArray83);
        char[] charArray85 = new char[] {};
        char[] charArray86 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray85, charArray86);
        org.junit.Assert.assertArrayEquals(charArray83, charArray86);
        org.junit.Assert.assertArrayEquals("random", charArray76, charArray83);
        char[] charArray90 = new char[] {};
        char[] charArray91 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray90, charArray91);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray83, charArray91);
        org.junit.Assert.assertArrayEquals(charArray9, charArray91);
        char[] charArray95 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray9, charArray95);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2495");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) serializableArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests13.assertDocsEnumEquals("tests.monster", postingsEnum22, postingsEnum23, true);
        kuromojiAnalysisTests13.resetCheckIndexStatus();
        kuromojiAnalysisTests13.ensureCleanedUp();
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray29, (java.lang.Object[]) executorServiceArray34);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests13, (java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray46);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule52 = kuromojiAnalysisTests51.ruleChain;
        kuromojiAnalysisTests51.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests51.tearDown();
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
        kuromojiAnalysisTests51.failureAndSuccessEvents = ruleChain66;
        org.junit.rules.RuleChain ruleChain88 = kuromojiAnalysisTests51.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain88;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) executorServiceArray7, (java.lang.Object) ruleChain88);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2496");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.outerRule(testRule2);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain3);
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (short) -1, postingsEnum23, postingsEnum24);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests27.ruleChain;
        kuromojiAnalysisTests27.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests27);
        org.junit.rules.RuleChain ruleChain31 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        kuromojiAnalysisTests5.failureAndSuccessEvents = ruleChain31;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests5.assertDocsSkippingEquals("tests.badapples", indexReader34, 0, postingsEnum36, postingsEnum37, true);
        kuromojiAnalysisTests5.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule41 = kuromojiAnalysisTests5.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) ruleChain3, (java.lang.Object) kuromojiAnalysisTests5);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2497");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests32.ruleChain;
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests32.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests32, (java.lang.Object) (-1));
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests32.assertFieldsEquals("", indexReader40, fields41, fields42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests32.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader46, (int) 'a', postingsEnum48, postingsEnum49);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests32.assertDocsSkippingEquals("tests.nightly", indexReader52, 10, postingsEnum54, postingsEnum55, true);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) ruleChainArray28, (java.lang.Object) 10);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet66 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray65);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) serializableArray65);
        java.io.Serializable[] serializableArray71 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray71);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet75 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray74);
        java.io.Serializable[] serializableArray76 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet77 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray76);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray74, (java.lang.Object[]) serializableArray76);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray71, (java.lang.Object[]) serializableArray76);
        java.io.Serializable[] serializableArray81 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet82 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray81);
        java.io.Serializable[] serializableArray84 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet85 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray84);
        java.io.Serializable[] serializableArray86 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet87 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray86);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray84, (java.lang.Object[]) serializableArray86);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray81, (java.lang.Object[]) serializableArray86);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray71, (java.lang.Object[]) serializableArray81);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableArray81);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray65, (java.lang.Object[]) serializableArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray28, (java.lang.Object[]) serializableArray81);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2498");
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
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2499");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (-1.0d));
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2500");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (short) 100);
    }
}

